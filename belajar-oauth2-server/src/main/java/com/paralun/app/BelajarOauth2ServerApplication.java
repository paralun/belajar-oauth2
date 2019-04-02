package com.paralun.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class BelajarOauth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BelajarOauth2ServerApplication.class, args);
    }

}
