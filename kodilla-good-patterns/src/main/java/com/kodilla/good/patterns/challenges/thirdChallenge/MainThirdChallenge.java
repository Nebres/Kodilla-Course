package com.kodilla.good.patterns.challenges.thirdChallenge;

public class MainThirdChallenge {

    public static void main(String[] args) {

        new FlightFinder(new DataBase().initMap()).chooseOperation();
    }

}