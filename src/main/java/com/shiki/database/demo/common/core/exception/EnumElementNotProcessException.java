package com.shiki.database.demo.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * @author shiki
 * @date 2020-06-02 下午3:21
 */
@NoArgsConstructor
public class EnumElementNotProcessException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EnumElementNotProcessException(String message) {
		super(message);
	}

	public EnumElementNotProcessException(Throwable cause) {
		super(cause);
	}

	public EnumElementNotProcessException(String message, Throwable cause) {
		super(message, cause);
	}

	public EnumElementNotProcessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
