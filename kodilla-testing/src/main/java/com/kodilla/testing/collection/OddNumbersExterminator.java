package com.kodilla.testing.collection;

import org.assertj.core.util.VisibleForTesting;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public OddNumbersExterminator() {

    }

    public ArrayList<Integer> exterminate(ArrayList <Integer> numbers) {

        ArrayList<Integer> evenList = new ArrayList<Integer>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                    evenList.add(number);
            }
        }
        return evenList;
    }

    @VisibleForTesting
   public boolean isEven(ArrayList <Integer> tempNumbers) {

        boolean evenValidator = true;

        for(int tempNumber : tempNumbers ) {
            if (tempNumber % 2 != 0) {
            evenValidator = false;
            }
        }
        return evenValidator;
   }

}

