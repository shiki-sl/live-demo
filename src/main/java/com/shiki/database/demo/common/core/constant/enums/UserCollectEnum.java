package com.shiki.database.demo.common.core.constant.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shiki.database.demo.common.core.exception.EnumTypeNotFindException;

/**
 * @author shiki
 * @date 2020-05-28 上午10:48
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum UserCollectEnum {
    /**
     * 用户关注
     */
    LIVE("关注主播", 0),
    COLLECT("关注栏目", 1);
    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;

    UserCollectEnum(String msg, int code) {
        this.code = code;
        this.msg = msg;
    }

    private static UserCollectEnum[] userCollectEnums = {LIVE, COLLECT};

    /**
     * 根据value返回枚举类型,主要在switch中使用
     */
    public static UserCollectEnum getTypeByValueStatus(int value) {
        for (UserCollectEnum status : userCollectEnums) {
            if (status.code == value) {
                return status;
            }
        }
        throw new EnumTypeNotFindException("UserCollectEnum:没有value:"+value+"对应的枚举类型");
    }


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
