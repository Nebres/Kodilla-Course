package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.HashMap;
import java.util.Map;

public class FlightDB {

    private static Flight initFlight1() {
        return new Flight("Szymany", "Warszawa");
    }

    private static Flight initFlight2() {
        return new Flight("Berlin", "Londyn");
    }

    private static Flight initFlight3() {
        return new Flight("Londyn","Berlin");
    }

    private static Flight initFlight4() {
        return new Flight("Warszawa", "Berlin");
    }

    private static Flight initFlight5() {
        return new Flight("Berlin", "Warszawa");
    }

    private static Flight initFlight6() {
       return new Flight("Warszawa", "Szymany");
    }

    public static Map<Integer, Flight> initMap() {

        Map<Integer, Flight> flights = new HashMap<>();
        flights.put(1, initFlight1());
        flights.put(2, initFlight2());
        flights.put(3, initFlight3());
        flights.put(4, initFlight4());
        flights.put(5, initFlight5());
        flights.put(6, initFlight6());

        return flights;
    }

}
