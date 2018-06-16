package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private final List<Integer> numberList;

    public OddNumbersExterminator(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public List<Integer> exterminateOdd() {

        List<Integer> evenList = new ArrayList<Integer>();

        for (int number : numberList) {
            System.out.println(number);
            if (number % 2 == 0) {
                    evenList.add(number);
            }
        }
        System.out.println("\n");
        return evenList;
    }

}
