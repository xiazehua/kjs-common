package com.mobaijun.common.test.collection;

import com.mobaijun.common.util.PrintUtil;
import com.mobaijun.common.util.collection.CollectionUtil;

/**
 * software：IntelliJ IDEA 2022.2.3
 * class name: CollectionUtilsTest
 * class description: 集合工具类
 *
 * @author MoBaiJun 2022/11/22 15:19
 */
public class CollectionUtilsTest {
    public static void main(String[] args) {
        PrintUtil.println(CollectionUtil.isEmpty(CollectionUtil.newArrayList()));
        PrintUtil.println(CollectionUtil.isEmpty(CollectionUtil.newHashMap()));
    }
}
