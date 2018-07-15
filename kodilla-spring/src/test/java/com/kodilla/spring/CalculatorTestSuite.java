package com.kodilla.spring;

import com.kodilla.spring.calculator.Calculator;
import com.kodilla.spring.calculator.Display;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {



    @Test
    public void TestDisplay() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.add(0.50,0.50);
        calculator.div(0.50,0.50);
        calculator.sub(0.50,0.50);
        calculator.mul(0.50,0.50);
    }

}
