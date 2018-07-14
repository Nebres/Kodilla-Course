package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.HashMap;
import java.util.Map;

public class FlightDB {

    private Flight initflight1() {
        return new Flight("Szymany", "Warszawa");
    }

    private Flight initflight2() {
        return new Flight("Berlin", "Londyn");
    }

    private Flight initflight3() {
        return new Flight("Londyn","Berlin");
    }

    private Flight initflight4() {
        return new Flight("Warszawa", "Berlin");
    }

    private Flight initflight5() {
        return new Flight("Berlin", "Warszawa");
    }

    private Flight initflight6() {
       return new Flight("Warszawa", "Szymany");
    }

    public Map<Integer, Flight> initMap() {

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
