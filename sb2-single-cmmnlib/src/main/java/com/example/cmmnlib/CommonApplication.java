package com.example.cmmnlib;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.web.client.HttpClientMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

import com.example.cmmnlib.constants.Common;

//spring-boot에서 root-context와 child-context 구분은 의미 없음
@ComponentScan(
    basePackages = {Common.BASE_PKG, Common.BASE_PKG_2}
//  , excludeFilters = @ComponentScan.Filter(classes = {Controller.class, RestController.class})
)
@ConfigurationPropertiesScan(basePackages = {Common.BASE_PKG, Common.BASE_PKG_2}) // @ConfigurationProperties Scan 설정
@ServletComponentScan       (basePackages = {Common.BASE_PKG, Common.BASE_PKG_2}) // @WebFilter, @WebListener, @WebServlet annotation 사용하기 위한 annotation
@EnableAutoConfiguration(exclude= {
      DataSourceAutoConfiguration.class // dataSource yml 설정시 제거
    , MybatisAutoConfiguration.class    // mybatis yml 설정시 제거
    , DataSourceTransactionManagerAutoConfiguration.class
    , JndiDataSourceAutoConfiguration.class
    , SecurityAutoConfiguration.class
    , ManagementWebSecurityAutoConfiguration.class
    , JacksonAutoConfiguration.class
    , HttpClientMetricsAutoConfiguration.class // spring-boot-actuator-autoconfigure
//    , org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration.class
})
@SpringBootApplication
public class CommonApplication {

}
