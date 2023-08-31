package com.example.securityweb.biz.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS) // @org.springframework.web.context.annotation.SessionScope
public class SessionScopeTest implements InitializingBean, DisposableBean {

    private int testInt = 0;


    public SessionScopeTest() {
        log.debug("SessionScopeTest default constructor");
    }

    public int getInt() {
        testInt++;
        return testInt;
    }

    @Override
    public void destroy() throws Exception {
        log.debug("ScopeTest[destroy]");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.debug("ScopeTest[afterPropertiesSet]");
    }

}
