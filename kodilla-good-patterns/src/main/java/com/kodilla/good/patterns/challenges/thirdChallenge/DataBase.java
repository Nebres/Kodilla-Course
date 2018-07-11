package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.HashMap;
import java.util.Map;

import static java.time.LocalDate.now;

public class DataBase {

    private Flight initflight1() {
        return new Flight("Szymany", "Warszawa", now().plusDays(3L), "09:00");
    }

    private Flight initflight2() {
        return new Flight("Berlin", "Londyn", now().plusDays(2L), "10:00");
    }

    private Flight initflight3() {
        return new Flight("Londyn","Berlin", now().plusDays(10L), "13:00");
    }

    private Flight initflight4() {
        return new Flight("Warszawa", "Berlin", now().plusDays(5L), "19:00");
    }

    private Flight initflight5() {
        return new Flight("Berlin", "Warszawa", now().plusDays(12L), "12:00");
    }

    private Flight initflight6() {
       return new Flight("Warszawa", "Szymany", now().plusDays(4L), "20:00");
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
