package com.shiki.database.demo.common.core.aop;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.json.JSONUtil;
import com.shiki.database.demo.common.core.constant.AspectConstant;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.Serializable;

import static java.lang.System.currentTimeMillis;

/**
 * @author shiki
 * @date 2020-05-30 下午11:45
 */
@Aspect
@Slf4j
@Component
@Order(AspectConstant.LOG_AOP)
public class AopLogControllerMethod {
    /**
     * 切入点表达式 匹配controller层中所有的方法,排除上传文件
     */
    @Pointcut("execution(* com.shiki.database.demo.controller.*.*(..)) " +
            "&& !execution(* com.shiki.database.demo.controller.*.*upload*(..))")
    public void log() {
    }

    @Around("log()")
    public Object logHandler(ProceedingJoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest req = attributes.getRequest();
        StringBuffer url = req.getRequestURL();
        log.info("请求url:{}", url);
        String method = req.getMethod();
        log.info("HTTP_METHOD:{}", method);
        log.info("IP:{}", req.getRemoteAddr());

        Signature signature = joinPoint.getSignature();
//		aop代理类的名字
        String classPath = signature.getDeclaringTypeName();
        log.info("类:{}", classPath);
        String methodName = signature.getName();
        log.info("方法:{}", methodName);
        String suffix = classPath.replace("com.shiki.database.demo.", "");
        log.info("模块:{}", suffix.substring(0, suffix.indexOf(".")));
        MethodSignature methodSignature = (MethodSignature) signature;
// 入参
        StringBuilder params = new StringBuilder("\r\n");
//		上传文件不打印参数信息
        // 获取方法参数名称
        Class<?>[] parameterTypes = methodSignature.getParameterTypes();
        String[] parameterNames = methodSignature.getParameterNames();
        Object[] paramValues = joinPoint.getArgs();

        for (int i = 0; i < parameterTypes.length; i++) {
//            参数为ServletRequest和ServletResponse以及他们的子类型丢弃.不记入日志(它们也没有实现Serializable接口)
            if (Serializable.class.isAssignableFrom(parameterTypes[i])) {
                params.append(parameterNames[i]).append("=").append(JSONUtil.toJsonStr(paramValues[i])).append("\r\n");
            }
        }
        log.info("参数列表:{}", params);

        long costTime = currentTimeMillis();
        Object result = null;
        try {
            // 执行controller方法
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            String stackTrace = ExceptionUtil.stacktraceToString(throwable);
            String exception = throwable.getClass() + ":" + throwable.getMessage();
            log.error("方法异常throwable:{}", stackTrace);
            log.error("方法异常exception:{}", exception);
            throw throwable;
        } finally {
            costTime = currentTimeMillis() - costTime;
            log.info(classPath + "." + methodName + "方法执行完毕,请求url为{},耗时:{}ms", url, costTime);
        }
        // 存入数据库或日志文件
        return result;
    }
}
