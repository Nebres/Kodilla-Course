package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.kodilla.good.patterns.challenges.thirdChallenge.InformationOfAirports.printListOfEndAirports;
import static com.kodilla.good.patterns.challenges.thirdChallenge.InformationOfAirports.printListOfStartAirports;

public class FlightFinder {

    private final Map<Integer, Flight> mapOfFlights;

    public FlightFinder(Map<Integer, Flight> mapOfFlights) {
        this.mapOfFlights = mapOfFlights;
    }

    public void printAirportsInUse() {
        printListOfStartAirports(mapOfFlights);
        printListOfEndAirports(mapOfFlights);
    }

    private boolean isListContainsFlights(List<Flight> airportsList) {
        return airportsList.size() > 0;
    }

    public void findFrom(String startAirport) {

        List<Flight> startAirports = mapOfFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport().equals(startAirport))
                .collect(Collectors.toList());

        if (isListContainsFlights(startAirports)) {
            startAirports.forEach(System.out::println);
        } else {
            System.out.println(FlightFinderCommunicates.WRONG_AIRPORT);
        }
    }

    public void findTo(String endAirport) {

        List<Flight> endAirports = mapOfFlights
                        .values()
                        .stream()
                        .filter(flight -> flight.getEndAirport().equals(endAirport))
                        .collect(Collectors.toList());

        if (isListContainsFlights(endAirports)) {
            endAirports.forEach(System.out::println);
        } else {
            System.out.println(FlightFinderCommunicates.WRONG_AIRPORT);
        }
    }

    public void findFromToVia(String startAirport, String endAirport, String interAirport) {

        List<Flight> interlandingAirports = mapOfFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport().equals(startAirport)
                        && flight.getEndAirport().equals(interAirport))
                .collect(Collectors.toList());

        List<Flight> endAirports = mapOfFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport().equals(interAirport)
                        && flight.getEndAirport().equals(endAirport))
                .collect(Collectors.toList());

        if (isListContainsFlights(interlandingAirports) && isListContainsFlights(endAirports)) {
            interlandingAirports.forEach(System.out::println);
            endAirports.forEach(System.out::println);
        } else {
            System.out.println(String
                    .format(FlightFinderCommunicates.WRONG_FLIGHT_WITH_INTERLADNING,
                            startAirport, endAirport, interAirport));
        }
    }

}
