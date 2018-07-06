package com.kodilla.exception.test;

import java.io.IOException;
import java.util.Map;

public class FlightRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Chopin", "Heathrow");
        Flight flight2 = new Flight("Charles de Gaulle", "Chopin");

        try {
            Map<String, Boolean> flightMap = new MapCreator().initializeMapOfFlights();
            new FlightFinder(flightMap).findFlight(flight);
            new FlightFinder(flightMap).findFlight(flight2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RouteNotFoundException r) {
            r.printStackTrace();
        }
    }

}
