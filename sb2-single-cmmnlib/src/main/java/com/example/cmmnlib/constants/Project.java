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
