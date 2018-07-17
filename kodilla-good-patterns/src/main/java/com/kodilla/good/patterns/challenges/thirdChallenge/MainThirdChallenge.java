package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Map;

public class MainThirdChallenge {

    public static void main(String[] args) {

        Map<Integer, Flight> mapOfFlights = FlightDB.initMap();
        FlightFinder finder = new FlightFinder(mapOfFlights);

        finder.printAirportsInUse();
        finder.findFromToVia("Szymany","Berlin", "Warszawa");
        finder.findFromToVia("Szymany","Warszawa", "Berlin");
        finder.findTo("Warszawa");
        finder.findFrom("Londyn");
    }

}