package com.mobaijun.common.util;

import java.util.Collection;
import java.util.Map;

/**
 * Software：IntelliJ IDEA 2021.3.2
 * Author: https://www.mobaijun.com
 * Date: 2022/2/25 17:37
 * ClassName:PrintUtil
 * 类描述： 打印工具类
 * https://blog.51cto.com/u_15080022/3462878
 * 解决【java: 非法字符: '\ufeff'】非法问题
 *
 * @author mobai
 */
public class PrintUtils {

    /**
     * 不换行输出
     */
    public static void print(Object obj) {
        if (ObjectUtils.isEmpty(obj)) {
            return;
        }
        System.out.print(obj);
    }

    /**
     * 换行打印输出
     */
    public static void println(Object obj) {
        if (ObjectUtils.isEmpty(obj)) {
            return;
        }
        System.out.print(obj);
    }

    /**
     * 单列集合打印
     */
    public static void println(Collection<Object> collection) {
        if (CollectionUtils.isEmpty(collection)) {
            return;
        }
        collection.forEach(System.out::println);
    }

    /**
     * 打印空格
     */
    public static void print() {
        System.out.println();
    }

    /**
     * 格式化输出
     */
    public static void printf(String format, Object obj) {
        if (ObjectUtils.isEmpty(obj)) {
            return;
        }
        System.out.printf(format, obj);
    }

    /**
     * println String map key and value
     */
    public static void println(Map<String, String> map) {
        if (map.size() == 0) {
            return;
        }
        map.entrySet().forEach(System.out::println);
    }

    /**
     * println String map values
     */
    public static void mapValue(Map<String, String> map) {
        if (map.size() == 0) {
            return;
        }
        map.values().forEach(System.out::println);
    }

    /**
     * println String map key
     */
    public static void mapKey(Map<String, String> map) {
        if (map.size() == 0) {
            return;
        }
        map.keySet().forEach(System.out::println);
    }
}
