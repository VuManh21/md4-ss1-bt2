package com.example.md4bt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"controller", "service", "model"}
)
public class Md4Bt2Application {

    public static void main(String[] args) {
        SpringApplication.run(Md4Bt2Application.class, args);
    }
}
