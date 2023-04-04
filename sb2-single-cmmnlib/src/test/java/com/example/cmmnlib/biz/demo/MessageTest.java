package com.example.cmmnlib.biz.demo;

import java.text.MessageFormat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void messageFormatTest() {
        String messageFormat = "param={0}.value={1}";

        String message = MessageFormat.format(messageFormat, "what", "the");

        logger.debug("{}", message);

        String format = "what {}";
        String value = "??";

        logger.debug(format, value);
    }
}
