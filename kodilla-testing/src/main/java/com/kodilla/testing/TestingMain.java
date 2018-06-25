package com.kodilla.testing;


import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Random;

public class TestingMain {

    private final static Random generator = new Random();

    public final static ArrayList<Integer> initNumbers() {

        ArrayList<Integer> initList = new ArrayList<Integer>();

        for ( int i = 0; i < generator.nextInt(); i++) {
            initList.add(generator.nextInt());
        }
    return initList;
    }

    public static void main (String[] args){

        new OddNumbersExterminator().exterminate(initNumbers());
    }

}

