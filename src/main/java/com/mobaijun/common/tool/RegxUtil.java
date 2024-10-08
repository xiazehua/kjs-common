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
package com.mobaijun.common.tool;

import com.mobaijun.common.constant.RegexpConstant;
import com.mobaijun.common.constant.StringConstant;
import com.mobaijun.common.text.StringUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * software：IntelliJ IDEA 2022.1<br>
 * class name: RegxUtil<br>
 * class description：正则工具类<br>
 *
 * @author MoBaiJun 2022/5/18 10:08
 */
public class RegxUtil {

    /**
     * 校验用户名
     *
     * @param username 用户名
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsername(String username) {
        return Pattern.matches(RegexpConstant.REGEX_USERNAME, username);
    }

    /**
     * 校验密码
     *
     * @param password 密码
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isPassword(String password) {
        return Pattern.matches(RegexpConstant.REGEX_PASSWORD, password);
    }

    /**
     * 校验手机号
     *
     * @param mobile 手机号
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(RegexpConstant.REGEX_MOBILE, mobile);
    }

    /**
     * 校验邮箱
     *
     * @param email 邮箱
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(RegexpConstant.REGEX_EMAIL, email);
    }

    /**
     * 校验汉字
     *
     * @param chinese 汉字
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese) {
        return Pattern.matches(RegexpConstant.REGEX_CHINESE, chinese);
    }

    /**
     * 校验身份证
     *
     * @param idCard 身份证
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIdCard(String idCard) {
        return Pattern.matches(RegexpConstant.REGEX_ID_CARD, idCard);
    }

    /**
     * 校验IP地址
     *
     * @param ipAddress ip地址
     * @return true or false
     */
    public static boolean isIpAddress(String ipAddress) {
        return Pattern.matches(RegexpConstant.REGEX_IP_ADDR, ipAddress);
    }

    /**
     * 校验mac地址
     *
     * @param mac mac
     * @return true or false
     */
    public static boolean isMac(String mac) {
        return Pattern.matches(RegexpConstant.REGEX_MAC, mac);
    }

    /**
     * 编译传入正则表达式和字符串去匹配,忽略大小写
     */
    public static boolean match(String regex, String beTestString) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(beTestString);
        return matcher.matches();
    }

    /**
     * 编译传入正则表达式在字符串中寻找，如果匹配到则为true
     */
    public static boolean find(String regex, String beTestString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(beTestString);
        return matcher.find();
    }

    /**
     * 编译传入正则表达式在字符串中寻找，如果找到返回第一个结果<br/>
     * 找不到返回null
     */
    public static String findResult(String regex, String beFoundString) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(beFoundString);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    /**
     * 隐藏手机号中间4位
     */
    public static String encodePhone(String phone) {
        if (StringUtil.isEmpty(phone)) {
            return StringConstant.EMPTY_STRING;
        }
        if (match(RegexpConstant.REGEX_PHONE, phone)) {
            String begin = phone.substring(0, 3);
            String end = phone.substring(7);
            return begin + "****" + end;
        }
        return phone;
    }
}