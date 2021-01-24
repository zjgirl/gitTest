package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    // this is for prod config
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
