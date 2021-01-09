package com.cs.cos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApp.class, args);
    }

}
