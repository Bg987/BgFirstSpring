package com.example.BgFirstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class FirstSpringAppBg {
    public static void main(String[] args){
        SpringApplication.run(FirstSpringAppBg.class);
        System.out.println("hello spring");
    }
}
