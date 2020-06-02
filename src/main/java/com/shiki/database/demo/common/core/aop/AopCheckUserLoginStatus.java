package com.shiki.database.demo.common.core.aop;

import com.shiki.database.demo.common.core.constant.AspectConstant;
import com.shiki.database.demo.common.core.constant.enums.CheckLoginTypeEnum;
import com.shiki.database.demo.common.core.exception.EnumElementNotProcessException;
import com.shiki.database.demo.common.core.util.R;
import com.shiki.database.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author shiki
 * @description 基于Aspect的controller层日志拦截，解决get请求体无法打印日志的情况下
 * @date 2019/8/21 16:18
 */
@Aspect
@Slf4j
@Component
@Order(AspectConstant.USER_AOP)
@AllArgsConstructor
public class AopCheckUserLoginStatus {

    @Value("user.key")
    private String key;

    @Value("user.check-type")
    private CheckLoginTypeEnum checkLoginTypeEnum;

    /**
     * 匹配controller中包含user并且参数在首位的所有方法
     * 同时由于是方法中只能包含一个变长数组的缘故,只做处理将user参数作为首位或末位的方法
     */
    @Pointcut(value = "execution(* com.shiki.database.demo.controller.*.*(..))&&(args(user,..))")
    public void userStatus(User user) {
    }

    @Around("userStatus(com.shiki.database.demo.entity.User)")
    public Object userStatusHandler(ProceedingJoinPoint joinPoint) throws Throwable {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String[] parameterNames = methodSignature.getParameterNames();
        Object[] paramValues = joinPoint.getArgs();

        User user = null;
        switch (checkLoginTypeEnum) {
            case SESSION:
                user = bySessionGetUser();
                break;
            case JWT:
                user = byJWTGetUser();
                break;
            case REDIS:
                user = byRedisGetUser();
                break;
            default:
                throw new EnumElementNotProcessException(CheckLoginTypeEnum.class.getName()+"中元素"+checkLoginTypeEnum+"无法处理");
        }
        log.info("user={}", user);
        if (user == null || user.getId() == null) {
            return R.builder().msg("用户未登录").build();
        } else {
            for (int i = 0; i < parameterNames.length && StringUtils.equalsIgnoreCase("user", parameterNames[i]); i++) {
                paramValues[i] = user;
            }
        }

        return joinPoint.proceed(paramValues);
    }

    private User byRedisGetUser() {
        return null;
    }

    private User byJWTGetUser() {
        return null;
    }

    private User bySessionGetUser() {
        User user;
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        return user;
    }

}
