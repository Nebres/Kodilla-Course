package com.kodilla.exception.test;

import java.util.Map;

public class FlightRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Chopin Airport", "Heathrow Airport" );

        Map<String, Boolean> flightMap = new FlightFinder().findFlight(flight);

       try {
           boolean result = new FlightFinder().isPossibleToGetIntoSpecifiedAirport(flightMap, "xzzzx");
           System.out.println(result);
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

}
