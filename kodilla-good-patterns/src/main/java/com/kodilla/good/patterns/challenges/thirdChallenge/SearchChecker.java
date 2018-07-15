package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchChecker {

    private static Map<Integer, Flight> mapOfAllFlights = FlightDB.initMap();

    public static List<Flight> isFlightStartFromThisAirport(String startAirport) {

        return mapOfAllFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport().equals(startAirport))
                .collect(Collectors.toList());
    }

    public static List<Flight> isFlightEndInThisAirport(String endAirport) {

        return mapOfAllFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport().equals(endAirport))
                .collect(Collectors.toList());
    }

    public static List<Flight> isFlightFromSpecifiedToSpecifiedAirportIsPossible(String startAirport, String endAirport) {

        return mapOfAllFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport().equals(startAirport)
                        && flight.getEndAirport().equals(endAirport))
                .collect(Collectors.toList());
    }

    public static List<Flight> isFlightIsPossible (String startAirport, String endAirport, String interAirport) {

        List<Flight> flightsWithInterlanding = new ArrayList<>();

        if (isFlightFromSpecifiedToSpecifiedAirportIsPossible(startAirport, interAirport).size() > 0) {
             flightsWithInterlanding = mapOfAllFlights
                    .values()
                    .stream()
                    .filter(flight -> endAirport.equals(flight.getEndAirport())
                            && interAirport.equals(flight.getStartAirport()))
                    .collect(Collectors.toList());

             return flightsWithInterlanding;
        } else {
            return flightsWithInterlanding;
        }
    }

}
