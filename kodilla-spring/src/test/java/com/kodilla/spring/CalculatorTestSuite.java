package com.kodilla.spring;

import com.kodilla.spring.calculator.Calculator;
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
    public void TestDisplayAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double expected = 1.00;
        //When
        double actual = calculator.add(0.50,0.50);
        //Than
        Assert.assertEquals(expected, actual, 1e-2);
    }

    @Test
    public void TestDisplaySub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double expected = 0.00;
        //When
        double actual = calculator.sub(0.50,0.50);
        Assert.assertEquals(expected, actual, 1e-2);
    }

    @Test
    public void TestDisplayMul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double expected = 0.25;
        //When
        double actual = calculator.mul(0.50,0.50);
        Assert.assertEquals(expected, actual, 1e-2);
    }

    @Test
    public void TestDisplayDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double expected = 1.00;
        //When
        double actual = calculator.div(0.50,0.50);
        Assert.assertEquals(expected, actual, 1e-2);
    }

}
