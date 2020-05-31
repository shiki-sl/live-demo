package com.shiki.database.demo.common.core.constant;

/**
 * @author 孙磊
 * @description Aspect切面执行顺序配置 越小优先级越高
 * @date 2019/8/29 10:43
 */
public interface AspectConstant {
	/**
	 * 防重验证切面
	 */
	 int SAME_URL_AOP = 1;
	/**
	 * 用户合法性切面
	 */
	 int USER_AOP = 100;
	/**
	 * 用户足迹切面
	 */
	int USER_FOOT_AOP = 101;
	/**
	 * 日志切面
	 */
	 int LOG_AOP = Integer.MAX_VALUE;
}
