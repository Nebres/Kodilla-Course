package com.kodilla.spring;

import com.kodilla.spring.calculator.Calculator;
import com.kodilla.spring.calculator.Display;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringRunner.class, args);
    }

}
