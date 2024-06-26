/*
 * Copyright (C) 2022 [www.mobaijun.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mobaijun.common.collection;

import com.mobaijun.common.tool.Console;
import java.util.List;
import org.junit.Test;

/**
 * Description: [StreamUtilTest测试类]
 * Author: [mobaijun]
 * Date: [2023/12/29 8:56]
 * IntelliJ IDEA Version: [IntelliJ IDEA 2023.1.4]
 */
public class StreamUtilTest {


    /**
     * Test for map.
     */
    @Test
    public void testMap() {
        // Perform the method call
    }

    /**
     * Test for filter.
     */
    @Test
    public void testFilter() {
        // Perform the method call
    }

    /**
     * Test for sorted.
     */
    @Test
    public void testSorted() {
        // Perform the method call
    }

    /**
     * Test for distinct.
     */
    @Test
    public void testDistinct() {
        // Perform the method call
    }

    /**
     * Test for distinctByKey.
     */
    @Test
    public void testDistinctByKey() {
        // Perform the method call
    }

    /**
     * Test for anyMatch.
     */
    @Test
    public void testAnyMatch() {
        // Perform the method call
    }

    /**
     * Test for join.
     */
    @Test
    public void testJoin() {
        // Perform the method call
        String result = StreamUtil.join(List.of("data"), "join");

        // Print the result using your Console
        Console.println(result);
    }

    /**
     * Test for singletonList.
     */
    @Test
    public void testSingletonList() {
        // Perform the method call
    }

    /**
     * Test for toList.
     */
    @Test
    public void testToList() {
        // Perform the method call
    }

    /**
     * Test for addAll.
     */
    @Test
    public void testAddAll() {
        // Perform the method call
    }

    /**
     * Test for addAll.
     */
    @Test
    public void testAddAll2() {

    }

    /**
     * Test for setToList.
     */
    @Test
    public void testSetToList() {

    }

    /**
     * Test for emptyList.
     */
    @Test
    public void testEmptyList() {
        // Perform the method call

    }

    /**
     * Test for emptyMap.
     */
    @Test
    public void testEmptyMap() {
        // Perform the method call

    }

    /**
     * Test for emptySet.
     */
    @Test
    public void testEmptySet() {
        // Perform the method call

    }

    /**
     * Test for strToLong.
     */
    @Test
    public void testStrToLong() {
        // Perform the method call
        List<Long> result = StreamUtil.strToLong(List.of("list"));

        // Print the result using your Console
        Console.println(result);
    }

    /**
     * Test for toString.
     */
    @Test
    public void testToString() {
        // Perform the method call

    }

    /**
     * Test for doubleToString.
     */
    @Test
    public void testDoubleToString() {
        // Perform the method call
        List<Double> result = StreamUtil.doubleToString(List.of("list"));

        // Print the result using your Console
        Console.println(result);
    }

    /**
     * Test for stringToInteger.
     */
    @Test
    public void testStringToInteger() {
        // Perform the method call
        List<Integer> result = StreamUtil.stringToInteger(List.of("list"));

        // Print the result using your Console
        Console.println(result);
    }

}