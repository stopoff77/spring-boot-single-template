package com.example.cmmnlib;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpringBootGlobalCommonApplicationTests {
    @Autowired
    private StandardPBEStringEncryptor encryptor;

    @Test
    public void contextLoads() {
        System.out.println("?? : " + encryptor);
        log.debug("?? : {}", encryptor);
    }

}
