package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {

    private final Map<Integer, Flight> mapOfFlights;

    public FlightFinder(Map<Integer, Flight> mapOfFlights) {
        this.mapOfFlights = mapOfFlights;
    }

    public List<Flight>  findFrom(String startAirport) {

        return mapOfFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport()!= null)
                .filter(flight -> flight.getStartAirport().equals(startAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findTo(String endAirport) {

        return mapOfFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport()!= null)
                .filter(flight -> flight.getEndAirport().equals(endAirport))
                .collect(Collectors.toList());
    }

    public List<FlightsPair> findFromToVia(String startAirport, String endAirport, String interAirport) {

        List<Flight> interlandingAirports = mapOfFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport()!= null)
                .filter(flight -> flight.getStartAirport().equals(startAirport)
                        && flight.getEndAirport().equals(interAirport))
                .collect(Collectors.toList());

        List<Flight> endAirports = mapOfFlights
                .values()
                .stream()
                .filter(flight -> flight.getStartAirport()!= null)
                .filter(flight -> flight.getStartAirport().equals(interAirport)
                        && flight.getEndAirport().equals(endAirport))
                .collect(Collectors.toList());

        List<FlightsPair> flightsPairs = new ArrayList<>();

        if (interlandingAirports.size() > 0
                && endAirports.size() > 0
                && interlandingAirports.size() == endAirports.size()) {
            for (int i = 0; i < interlandingAirports.size(); i++) {
                flightsPairs.add(new FlightsPair(interlandingAirports.get(i), endAirports.get(i)));
            }
        }

        return flightsPairs;
    }

    public void printSimplySearch(List<Flight> flights) {
        flights.forEach(System.out::println);
    }

    public void printAdvanceSearch(List<FlightsPair> flightsPairs) {
        flightsPairs.forEach(System.out::println);
    }

}