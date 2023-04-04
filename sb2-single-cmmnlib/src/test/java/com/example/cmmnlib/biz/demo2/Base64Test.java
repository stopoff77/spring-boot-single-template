package com.example.cmmnlib.biz.demo2;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Base64Test {

    @Test
    public void etcTest() throws Exception {
        String oriStr = "what";
        byte[] oriByte = oriStr.getBytes();
        String encStr = org.apache.commons.codec.binary.Base64.encodeBase64String(oriByte);

        byte[] encByte = encStr.getBytes();
        byte[] decByte = org.apache.commons.codec.binary.Base64.decodeBase64(encByte);

        String str = new String(decByte);
        log.debug("{}", str);

        encByte = java.util.Base64.getEncoder().encode(oriByte);
        decByte = org.apache.commons.codec.binary.Base64.decodeBase64(encByte);
        str = new String(decByte);
        log.debug("{}", str);
    }
}
