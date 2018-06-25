package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public OddNumbersExterminator() {

    }

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> evenList = new ArrayList<Integer>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                    evenList.add(number);
            }
        }
        return evenList;
    }

}

