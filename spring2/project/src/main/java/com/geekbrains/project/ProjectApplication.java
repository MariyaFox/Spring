package com.geekbrains.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class ProjectApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }
}