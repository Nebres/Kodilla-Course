package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestingMain {

    private final static Random generator = new Random();
    private final static int MAX_LOOP_REPEAT = 50;

    public final static ArrayList<Integer> initNumbers() {

        ArrayList<Integer> initList = new ArrayList<Integer>();

        for ( int i = 0; i < generator.nextInt(MAX_LOOP_REPEAT); i++) {
            initList.add(generator.nextInt());
        }
    return initList;
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

        List<Integer> resultList = new OddNumbersExterminator().exterminate(initNumbers());

        for (int result : resultList) {
            System.out.println(result);
        }
    }

}