package com.aws.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        for (int i=0; i<10; i++)
            System.out.println("#########***############");

        SpringApplication.run(Application.class, args);
    }
}
