package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {

    private final Map<String, Boolean> mapOfFlights;

    public FlightFinder(Map<String, Boolean> mapOfFlights) {
        this.mapOfFlights = mapOfFlights;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (!mapOfFlights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Wrong Airport Name");
        }
        System.out.println(flight.getDepartureAirport().concat(" | ").concat(mapOfFlights.get(flight.getDepartureAirport()).toString()));
   }

}
