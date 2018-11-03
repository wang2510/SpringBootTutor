package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *An informative annotation type used to indicate that an interface type
 *declaration is intended to be a functional interface as defined by the
 *Java Language Specification. Conceptually, a functional interface has exactly
 *one abstract method. Since default methods have an implementation,
 *they are not abstract.
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
