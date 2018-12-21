package com.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

/**
 * @SpringBootApplication   来标志一个主程序类,说明这是一个Spring Boot应用
 */

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        //Spring Boot启动起来
               SpringApplication.run(HelloWorldApplication.class,args);
    }
}
