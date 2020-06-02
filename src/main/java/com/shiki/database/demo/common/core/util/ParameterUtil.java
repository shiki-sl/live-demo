package com.shiki.database.demo.common.core.util;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * @author: shiki
 * @date: 2019/10/12 上午11:03
 * @description: 参数校验
 */
@UtilityClass
public class ParameterUtil {
    public boolean presenceParamIsEmpty(Object obj1) {
        return isNull(obj1);
    }

    public boolean presenceParamIsEmpty(Object obj1, Object obj2) {
        return isNull(obj1) || isNull(obj2);
    }

    public boolean presenceParamIsEmpty(Object obj1, Object obj2, Object obj3) {
        return isNull(obj1) || isNull(obj2) || isNull(obj3);
    }

    /**
     * 操作可迭代对象时,将它转换为object类型
     *
     * @param obj1
     * @param obj2
     * @param obj3
     * @param obj
     * @return
     */
    public boolean presenceParamIsEmpty(Object obj1, Object obj2, Object obj3, Object... obj) {
        if (isNull(obj1) || isNull(obj2) || isNull(obj3)) {
            return true;
        }
        for (Object o : obj) {
            if (isNull(o)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 存在空参数
     * <p>
     * 可以判断 Collection Map 字符串 数组
     *
     * @param o 检查参数
     * @return 是否为null
     */
    private boolean isNull(Object o) {
        if (Objects.isNull(o)) {
            return true;
        }
        if ((o instanceof Collection) && ((Collection) o).isEmpty()) {
            return true;
        }
        if ((o instanceof Map) && ((Map) o).isEmpty()) {
            return true;
        }
        if ((o instanceof String) && StringUtils.isEmpty((String) o)) {
            return true;
        }
        return false;
//        return (o instanceof Object[]) && ((Object[]) o).length == 0;
    }

    /**
     * 三目运算符
     */
    public <T> T ternaryOperator(boolean isTrue, T param1, T param2) {
        return isTrue ? param1 : param2;
    }

}
