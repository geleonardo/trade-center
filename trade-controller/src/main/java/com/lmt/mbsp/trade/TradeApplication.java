package com.lmt.mbsp.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.lmt.mbsp.trade.adapter"})
@SpringBootApplication
@ComponentScan({"com.lmt.mbsp.trade", "com.lmt.framework"})
@EnableSwagger2
public class TradeApplication extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TradeApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(TradeApplication.class);
    }
}
