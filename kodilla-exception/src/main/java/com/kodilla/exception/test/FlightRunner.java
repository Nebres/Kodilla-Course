package com.kodilla.exception.test;

import java.io.IOException;
import java.util.Map;

public class FlightRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Chopin", "Heathrow" );
        Flight flight2 = new Flight("Charles de Gaulle", "Chopin");

        try {
            Map<String, Boolean> flightMap = new MapCreator().initializeMapOfFlights();
            try {
                new FlightFinder(flightMap).findFlight(flight);
            } catch (RouteNotFoundException r) {
                r.printStackTrace();
            }
            try {
                new FlightFinder(flightMap).findFlight(flight2);
            } catch (RouteNotFoundException r) {
                r.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
