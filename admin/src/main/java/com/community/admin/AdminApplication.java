package com.community.admin;

import org.broadleafcommerce.common.config.EnableBroadleafAdminAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

    @Configuration
    @EnableBroadleafAdminAutoConfiguration
    public static class BroadleafFrameworkConfiguration {
    }

}

