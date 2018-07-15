package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.HashMap;
import java.util.Map;

public class FlightDB {

    private static Flight initflight1() {
        return new Flight("Szymany", "Warszawa");
    }

    private static Flight initflight2() {
        return new Flight("Berlin", "Londyn");
    }

    private static Flight initflight3() {
        return new Flight("Londyn","Berlin");
    }

    private static Flight initflight4() {
        return new Flight("Warszawa", "Berlin");
    }

    private static Flight initflight5() {
        return new Flight("Berlin", "Warszawa");
    }

    private static Flight initflight6() {
       return new Flight("Warszawa", "Szymany");
    }

    public static Map<Integer, Flight> initMap() {

        Map<Integer, Flight> flights = new HashMap<>();
        flights.put(1, initflight1());
        flights.put(2, initflight2());
        flights.put(3, initflight3());
        flights.put(4, initflight4());
        flights.put(5, initflight5());
        flights.put(6, initflight6());

        return flights;
    }

}
