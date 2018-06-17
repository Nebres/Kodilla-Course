package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestingMain {

    private final static Random generator = new Random();

    public final static List<Integer> initNumbers() {
        return Arrays.asList(
                generator.nextInt(), generator.nextInt(), generator.nextInt(), generator.nextInt(), generator.nextInt(), generator.nextInt(),
                generator.nextInt(), generator.nextInt(), generator.nextInt(), generator.nextInt(), generator.nextInt());
    }

    public static void main (String[] args){

        //calculator test - task 6_2
        int add = new Calculator().runAdd(3,4);
        int substraction = new Calculator().runSubstraction(3,4);

        if (add == 7 && substraction == -1) {
            System.out.println("All ok");
        } else {
            System.out.println("error");
        }

        //collection without odd numbers - task 6_3

        List<Integer> resultList = new OddNumbersExterminator(initNumbers()).exterminateOdd();

        for (int result : resultList) {
            System.out.println(result);
        }
    }
}