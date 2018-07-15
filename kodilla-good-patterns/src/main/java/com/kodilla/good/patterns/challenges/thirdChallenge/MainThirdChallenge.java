package com.kodilla.good.patterns.challenges.thirdChallenge;

public class MainThirdChallenge {

    public static void main(String[] args) {

        new FlightFinder().printAirportsInUse();
        new FlightFinder().scanFlightsToAirportWithAnotherAirport("Szymany",
                "Berlin", "Warszawa");
        new FlightFinder().scanFlightsToAirportWithAnotherAirport("Szymany",
                "Warszawa", "Berlin");
        new FlightFinder().scanFlightsToAirport("Warszawa");
        new FlightFinder().scanFlightsFromAirport("Londyn");
    }

}