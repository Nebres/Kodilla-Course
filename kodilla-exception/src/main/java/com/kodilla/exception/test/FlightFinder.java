package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {

    private final Map<String, Boolean> mapOfFlights;
    private static final String ERROR_COMMUNICATE = "There is no flight from %s Airport to %s Airport check if you get "
            + "correct departure point or contact with our call center (+48 121 12 12)";

    public FlightFinder(Map<String, Boolean> mapOfFlights) {
        this.mapOfFlights = mapOfFlights;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (!mapOfFlights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException(String.format(ERROR_COMMUNICATE, flight.getDepartureAirport(), flight.getArrivalAirport()));
        }
        System.out.println(flight.getDepartureAirport().concat(" | ")
                .concat(mapOfFlights.get(flight.getDepartureAirport()).toString()));
   }

}
