/*
 * Copyright (C) 2022 www.mobaijun.com
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
package com.mobaijun.common.util.enums;

import cn.hutool.core.lang.func.Func1;
import cn.hutool.core.lang.func.LambdaUtil;
import cn.hutool.core.util.EnumUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.ReflectUtil;

/**
 * software：IntelliJ IDEA 2022.2.3<br>
 * class name: EnumsUtils<br>
 * class description: 增强枚举工具类
 *
 * @author MoBaiJun 2022/11/23 21:01
 */
public class EnumsUtil extends EnumUtil {

    /**
     * 通过 某字段对应值 获取 枚举，获取不到时为 {@code defaultEnum}
     *
     * @param condition   条件字段
     * @param value       条件字段值
     * @param defaultEnum 条件找不到则返回结果使用这个
     * @return 对应枚举 ，获取不到时为 {@code null}
     */
    public static <E extends Enum<E>, C> E getBy(Func1<E, C> condition, C value, E defaultEnum) {
        return ObjectUtil.defaultIfNull(getBy(condition, value), defaultEnum);
    }

    /**
     * 判断某个字段值是否存在枚举中
     *
     * @param condition 条件字段
     * @param value     枚举属性值
     * @return 是否存在
     */
    public static <E extends Enum<E>, C> boolean contains(Func1<E, C> condition, C value) {
        return getBy(condition, value) != null;
    }

    /**
     * 判断目标枚举（targetEnum）的某个字段（condition）的值是否是入参value
     *
     * @param targetEnum 目标枚举
     * @param condition  条件字段
     * @param value      枚举属性值
     * @return 是否存在
     */
    @SuppressWarnings("unchecked")
    public static <E extends Enum<E>, C> boolean contains(E targetEnum, Func1<E, C> condition, C value) {
        if (ObjectUtil.isAllNotEmpty(targetEnum, condition)) {
            C targetEnumFieldValue = (C) ReflectUtil.getFieldValue(targetEnum, LambdaUtil.getFieldName(condition));
            return ObjectUtil.equal(targetEnumFieldValue, value);
        }
        return false;
    }
}