package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Map;

public class MainThirdChallenge {

    public static void main(String[] args) {

        Map<Integer, Flight> mapOfFlights = new FlightDB().initMap();

        new FlightFinder(mapOfFlights).printAirportsInUse(mapOfFlights);
        new FlightFinder(mapOfFlights).scanFlightsToAirportWithAnotherAirport("Szymany",
                "Berlin", "Warszawa");
        new FlightFinder(mapOfFlights).scanFlightsToAirportWithAnotherAirport("Szymany",
                "Warszawa", "Berlin");
        new FlightFinder(mapOfFlights).scanFlightsToAirport("Warszawa");
        new FlightFinder(mapOfFlights).scanFlightsFromAirport("Londyn");
    }

}