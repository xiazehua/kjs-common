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
package com.mobaijun.common.enums.sys;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Description: [菜单类型枚举]
 * Author: [mobaijun]
 * Date: [2024/7/8 15:07]
 * IntelliJ IDEA Version: [IntelliJ IDEA 2023.1.4]
 */
@Getter
@RequiredArgsConstructor
public enum MenuType {

    /**
     * 左侧菜单
     */
    LEFT_MENU("0", "left"),

    /**
     * 顶部菜单
     */
    TOP_MENU("2", "top"),

    /**
     * 按钮
     */
    BUTTON("1", "button");

    /**
     * 类型
     */
    private final String type;

    /**
     * 描述
     */
    private final String description;
}
