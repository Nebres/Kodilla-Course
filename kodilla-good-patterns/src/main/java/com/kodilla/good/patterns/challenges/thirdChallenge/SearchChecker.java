package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchChecker {

    public boolean isFlightStartFromThisAirport(Map<Integer, Flight> mapOfAllFlights, String startAirport) {

        return mapOfAllFlights
                .values()
                .stream()
                .anyMatch(flight -> flight.getStartAirport().equals(startAirport));

    }

    public boolean isFlightEndInThisAirport(Map<Integer, Flight> mapOfAllFlights, String endAirport) {

        return mapOfAllFlights
                .values()
                .stream()
                .anyMatch(flight -> flight.getEndAirport().equals(endAirport));
    }

    public boolean isFlightIsPossible (Map<Integer, Flight> mapOfAllFlights, String startAirport,
                                       String endAirport, String interAirport) {

        List<Flight> flightsFormSpecifiedToSpecifiedAirport = mapOfAllFlights
                .values()
                .stream()
                .filter(flight -> startAirport.equals(flight.getStartAirport())
                        && interAirport.equals(flight.getEndAirport()))
                .collect(Collectors.toList());

        List<Flight> flightsWithInterlanding = mapOfAllFlights
                .values()
                .stream()
                .filter(flight -> endAirport.equals(flight.getEndAirport())
                        && interAirport.equals(flight.getStartAirport()))
                .collect(Collectors.toList());

        return flightsFormSpecifiedToSpecifiedAirport.size() > 0 && flightsWithInterlanding.size() > 0;
    }

}
