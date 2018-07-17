package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.List;
import java.util.Map;

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

    public void findFrom(String startAirport) {

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

    public void findTo(String endAirport) {

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

    public void findFromToVia(String startAirport, String endAirport, String interAirport) {

        if (SearchChecker.isFlightPossible(startAirport, endAirport, interAirport).size() > 0) {

            List<Flight> flightsFormSpecifiedToSpecifiedAirport =
                    SearchChecker.isPossibleFlightFromTo(startAirport, interAirport);

            List<Flight> flightsWithInterlanding = SearchChecker
                    .isFlightPossible(startAirport, endAirport, interAirport);

            flightsFormSpecifiedToSpecifiedAirport.forEach(System.out::println);
            flightsWithInterlanding.forEach(System.out::println);

        } else {
                System.out.println(String
                        .format(FlightFinderCommunicates.WRONG_FLIGHT_WITH_INTERLADNING,
                                startAirport, endAirport, interAirport));
        }
    }

}
