package com.example.securityweb;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.web.client.HttpClientMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.example.cmmnlib.configuration.ComponentScanConfiguration;


@EnableAutoConfiguration(exclude= {
        DataSourceAutoConfiguration.class // dataSource yml 설정시 제거
      , MybatisAutoConfiguration.class    // mybatis yml 설정시 제거
      , DataSourceTransactionManagerAutoConfiguration.class
      , JndiDataSourceAutoConfiguration.class
      , SecurityAutoConfiguration.class
      , ManagementWebSecurityAutoConfiguration.class
      , JacksonAutoConfiguration.class
      , HttpClientMetricsAutoConfiguration.class // spring-boot-actuator-autoconfigure
//      , org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration.class
})
@SpringBootApplication( scanBasePackageClasses = { ComponentScanConfiguration.class } )
public class SpringBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
