package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.List;

import static com.kodilla.good.patterns.challenges.thirdChallenge.InformationOfAirports.printListOfEndAirports;
import static com.kodilla.good.patterns.challenges.thirdChallenge.InformationOfAirports.printListOfStartAirports;

public class FlightFinder {

    public void printAirportsInUse() {
        printListOfStartAirports(FlightDB.initMap());
        printListOfEndAirports(FlightDB.initMap());
    }

    public void scanFlightsFromAirport(String startAirport) {

        if (SearchChecker.isFlightStartFromThisAirport(startAirport).size() > 0) {

            List<Flight> flightsFormChosenAirport = SearchChecker
                    .isFlightStartFromThisAirport(startAirport);

            flightsFormChosenAirport
                    .stream()
                    .map(Flight::toString)
                    .forEach(System.out::println);
        } else {
            System.out.println(FlightFinderCommunicates.WRONG_AIRPORT);
        }
    }

    public void scanFlightsToAirport(String endAirport) {

        if (SearchChecker.isFlightEndInThisAirport(endAirport).size() > 0) {

            List<Flight> flightsFormChosenAirport = SearchChecker
                    .isFlightEndInThisAirport(endAirport);

            flightsFormChosenAirport
                    .stream()
                    .map(Flight::toString)
                    .forEach(System.out::println);

        } else {
            System.out.println(FlightFinderCommunicates.WRONG_AIRPORT);
        }
    }

    public void scanFlightsToAirportWithAnotherAirport(String startAirport, String endAirport, String interAirport) {

        if (SearchChecker.isFlightIsPossible(startAirport, endAirport, interAirport).size() > 0) {

            List<Flight> flightsFormSpecifiedToSpecifiedAirport =
                    SearchChecker.isFlightFromSpecifiedToSpecifiedAirportIsPossible(startAirport, interAirport);

            List<Flight> flightsWithInterlanding = SearchChecker
                    .isFlightIsPossible(startAirport, endAirport, interAirport);

            flightsFormSpecifiedToSpecifiedAirport.forEach(System.out::println);
            flightsWithInterlanding.forEach(System.out::println);

        } else {
                System.out.println(String
                        .format(FlightFinderCommunicates.WRONG_FLIGHT_WITH_INTERLADNING,
                                startAirport, endAirport, interAirport));
        }
    }

}
