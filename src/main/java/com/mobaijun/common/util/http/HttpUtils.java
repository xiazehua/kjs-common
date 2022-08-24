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
package com.mobaijun.common.util.http;

import cn.hutool.http.GlobalHeaders;
import cn.hutool.http.Header;
import cn.hutool.http.HttpConnection;
import cn.hutool.log.Log;

/**
 * software：IntelliJ IDEA 2022.1
 * class name: HttpUtils
 * class description： http 工具类
 *
 * @author MoBaiJun 2022/7/18 10:05
 */
public class HttpUtils {

    /**
     * tools log
     */
    private static final Log log = Log.get(HttpUtils.class);

    /**
     * 获取 http 链接
     *
     * @param url url
     * @return HttpConnection
     */
    public static HttpConnection getHttpConnection(String url) {
        return HttpConnection.create(url, null).header(Header.USER_AGENT.getValue(),
                GlobalHeaders.INSTANCE.header(Header.USER_AGENT.getValue()), false);
    }
}