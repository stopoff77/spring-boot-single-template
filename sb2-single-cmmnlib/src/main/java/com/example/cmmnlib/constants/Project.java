/*
 * Copyright 2020 장동선.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.example.cmmnlib.constants;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Project {

    // FIXME CHECK-package 확인 (공통 설정)
    public static final String BASE_PKG   = "com.example";
    public static final String BASE_PKG_2 = "com.sample";

    /** context root path */
    public static final String CONTEXT_ROOT_PATH = "/";

    /** context path */
    public static final String CONTEXT_PATH = CONTEXT_ROOT_PATH;

    /** 줄바꿈 */
    public static final String NEW_LINE = "\n";

    /** TAB */
    public static final String TAB = "\t";

    /** default charset */
    public static final Charset UTF_8 = StandardCharsets.UTF_8;
//    public static final String UTF_8 = UTF_8_CHARSET.name(); //"UTF-8";

    /** local_date_format for jackson */
    public static final String JACKSON_LOCAL_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
}
