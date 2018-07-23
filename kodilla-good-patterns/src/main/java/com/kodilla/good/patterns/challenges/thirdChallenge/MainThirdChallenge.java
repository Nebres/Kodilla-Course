package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.List;
import java.util.Map;

public class MainThirdChallenge {

    public static void main(String[] args) {

        Map<Integer, Flight> mapOfFlights = FlightDB.init();
        FlightFinder finder = new FlightFinder(mapOfFlights);
        List<Flight> simpleSearch = finder.findFrom("Londyn");
        List<Flight> simpleSearch2 = finder.findTo("Warszawa");
        List<FlightsPair> advanceSearch = finder.findFromToVia("Szymany","Berlin", "Warszawa");
        List<FlightsPair> advanceSearch2 = finder.findFromToVia("Szymany","Warszawa", "Berlin");

        finder.printSimplySearch(simpleSearch);
        finder.printSimplySearch(simpleSearch2);
        finder.printAdvanceSearch(advanceSearch);
        finder.printAdvanceSearch(advanceSearch2);
    }

}