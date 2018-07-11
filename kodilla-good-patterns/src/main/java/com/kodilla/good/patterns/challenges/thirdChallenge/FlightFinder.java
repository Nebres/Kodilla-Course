package com.kodilla.good.patterns.challenges.thirdChallenge;


import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.*;

public class FlightFinder implements Communications {

    private static final Scanner SCANNER = new Scanner(System.in);
    private final Map<Integer, Flight> mapOfAllFlights;

    public FlightFinder(Map<Integer, Flight> mapOfAllFlights) {
        this.mapOfAllFlights = mapOfAllFlights;
    }

    private Set<String> createSetOfStartAirport() {

      return mapOfAllFlights.values()
                .stream()
                .map(flight -> flight.getStartAirport())
                .collect(Collectors.toSet());
    }

    private Set<String> createSetOfSEndAirport() {
        return mapOfAllFlights.values()
                .stream()
                .map(flight -> flight.getEndAirport())
                .collect(Collectors.toSet());
    }

    private void scanFlightsFromAirport() {

        System.out.println(LIST_OF_START_AIRPORT);
        Set<String> startAirports = createSetOfStartAirport();
        for (String airport: startAirports) {
            System.out.println(airport);
        }

        System.out.println(START_AIRPORT);
        String startAirport = SCANNER.next();

        if (startAirports.contains(startAirport)) {
            List<Flight> flightsFormChosenAirport = mapOfAllFlights
                    .values()
                    .stream()
                    .filter(flight -> startAirport.equals(flight.getStartAirport()))
                    .collect(Collectors.toList());

            flightsFormChosenAirport
                    .stream()
                    .map(result -> result.toString())
                    .forEach(System.out::println);
        } else {
            System.out.println(WRONG_AIRPORT);
            scanFlightsFromAirport();
        }
    }

    private void scanFlightsToAirport() {

        System.out.println(LIST_OF_END_AIRPORT);
        Set<String> endAirports = createSetOfSEndAirport();
        for (String airport: endAirports) {
            System.out.println(airport);
        }

        System.out.println(END_AIRPORT);
        String endAirport = SCANNER.next();

        if (endAirports.contains(endAirport)) {
            List<Flight> flightsToChosenAirport = mapOfAllFlights
                    .values()
                    .stream()
                    .filter(flight -> endAirport.equals(flight.getEndAirport()))
                    .collect(Collectors.toList());

            flightsToChosenAirport
                    .stream()
                    .map(result -> result.toString())
                    .forEach(System.out::println);
        } else {
            System.out.println(WRONG_AIRPORT);
            scanFlightsToAirport();
        }
    }

    private void scanFlightsToAirportWithAnotherAirport() {

        System.out.println(LIST_OF_START_AIRPORT);
        Set<String> startAirports = createSetOfStartAirport();
        for (String airport: startAirports) {
            System.out.println(airport);
        }

        System.out.println(START_AIRPORT);
        String startAirport = SCANNER.next();

        System.out.println(LIST_OF_END_AIRPORT);
        Set<String> endAirports = createSetOfSEndAirport();
        for (String airport: endAirports) {
            System.out.println(airport);
        }

        System.out.println(END_AIRPORT);
        String endAirport = SCANNER.next();

        System.out.println(INTERLANDING_AIRPORT);
        String interAirport = SCANNER.next();

        if (startAirports.contains(startAirport) && endAirports.contains(endAirport)
                && endAirports.contains(interAirport)) {

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

            if (flightsFormSpecifiedToSpecifiedAirport.size() > 0 && flightsWithInterlanding.size() > 0) {

                flightsFormSpecifiedToSpecifiedAirport
                        .stream()
                        .map(result -> result.toString())
                        .forEach(System.out::println);

                flightsWithInterlanding
                        .stream()
                        .map(result -> result.toString())
                        .forEach(System.out::println);
            } else {
                System.out.println(String.format(WRONG_FLIGHT_WITH_INTERLADNING, startAirport, endAirport, interAirport));
            }
        } else {
            System.out.println(WRONG_AIRPORT);
            scanFlightsToAirportWithAnotherAirport();
        }
    }

    public void chooseOperation() {

        System.out.println(MENU);
        int chosenNumber = SCANNER.nextInt();

        if (chosenNumber == 1) {
            scanFlightsFromAirport();
        } else if (chosenNumber == 2 ) {
            scanFlightsToAirport();
        } else if (chosenNumber == 3) {

            scanFlightsToAirportWithAnotherAirport();
        } else {
            System.out.println(WRONG_NUMBER);
            chooseOperation();
        }
    }
    
}
