package com.lista.botanica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.lista.botanica.entity")
public class BotanicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BotanicaApplication.class, args);
    }

}
