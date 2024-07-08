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
package com.mobaijun.common.exception;

import com.mobaijun.common.exception.service.ResultCode;
import java.text.MessageFormat;
import lombok.Getter;

/**
 * Description: [通用业务异常]
 * Author: [mobaijun]
 * Date: [2024/7/5 15:13]
 * IntelliJ IDEA Version: [IntelliJ IDEA 2023.1.4]
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 异常信息
     */
    private final String message;

    /**
     * 异常状态码
     */
    private final int code;

    public BusinessException(ResultCode resultCode) {
        super(resultCode.getMessage());
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    /**
     * 用于需要format返回结果的异常
     */
    public BusinessException(ResultCode resultCode, Object... args) {
        this(resultCode.getCode(), MessageFormat.format(resultCode.getMessage(), args));
    }

    public BusinessException(ResultCode resultCode, Throwable e) {
        super(resultCode.getMessage(), e);
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    /**
     * 用于需要format返回结果的异常
     */
    public BusinessException(ResultCode resultCode, Throwable e, Object... args) {
        this(resultCode.getCode(), MessageFormat.format(resultCode.getMessage(), args), e);
    }

    public BusinessException(int code, String message) {
        super(message);
        this.message = message;
        this.code = code;
    }

    public BusinessException(int code, String message, Throwable e) {
        super(message, e);
        this.message = message;
        this.code = code;
    }
}
