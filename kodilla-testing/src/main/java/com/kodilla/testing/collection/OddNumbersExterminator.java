package com.kodilla.testing.collection;

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

   public int checkList(ArrayList <Integer> tempNumbers) {

        int checksum = 0;

        for(int tempNumber : tempNumbers ) {
            checksum += tempNumber;
        }
        return checksum;
   }

}

