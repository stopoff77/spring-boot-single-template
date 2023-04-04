package com.example.cmmnlib.biz.demo;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotationTest {

    @Test
    public void doubleTest() {
        double d = 700000000.0123456789;

        log.debug("{}", d);
        log.debug("{}", (int)d);

        String str = String.format("%.8f", d);
        log.debug("{}", str);

        str = String.format("%.0f", d);
        log.debug("{}", str);

        DecimalFormat format = new DecimalFormat("#.##########");

        str = format.format(d);
        log.debug("{}", str);

        format = new DecimalFormat();

        str = format.format(d);
        log.debug("{}", str);

        str = new DecimalFormat("#").format(d);
        log.debug("{}", str);

        log.debug("{}", (int)d);
    }
}
