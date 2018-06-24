package com.kodilla.testing.collection;

import org.assertj.core.util.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public OddNumbersExterminator() {

    }

    public ArrayList<Integer> exterminate(List<Integer> numbers) {

        ArrayList<Integer> evenList = new ArrayList<Integer>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                    evenList.add(number);
            }
        }
        return evenList;
    }

}

