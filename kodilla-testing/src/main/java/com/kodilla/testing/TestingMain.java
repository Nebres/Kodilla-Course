package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        int add = new Calculator().runAdd(3,4);
        int substraction = new Calculator().runSubstraction(3,4);

        if (add == 7 && substraction == -1) {
            System.out.println("All ok");
        } else {
            System.out.println("error");
        }

    }
}