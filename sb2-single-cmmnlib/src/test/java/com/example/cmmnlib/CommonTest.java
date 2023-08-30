package com.example.cmmnlib;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.cmmnlib.configuration.ComponentScanConfiguration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@org.springframework.test.context.ActiveProfiles("test")
//@org.junit.jupiter.api.extension.ExtendWith(org.springframework.test.context.junit.jupiter.SpringExtension.class)
@SpringBootTest(classes=ComponentScanConfiguration.class)
public class CommonTest {

    @BeforeEach
    public void beforeEach() {
        log.info("[START]##########################################################################################################################");
    }
    @AfterEach
    public void afterEach() {
        log.info("[END]############################################################################################################################");
    }
}
