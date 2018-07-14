package com.kodilla.good.patterns.challenges.thirdChallenge;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightFinder {

    private final Map<Integer, Flight> mapOfAllFlights;
    private final SearchChecker searchChecker = new SearchChecker();

    public FlightFinder(Map<Integer, Flight> mapOfAllFlights) {
        this.mapOfAllFlights = mapOfAllFlights;
    }


    public void printAirportsInUse(Map<Integer, Flight> mapOfAllFlights) {
        new InformationOfAirports().printListOfStartAirports(mapOfAllFlights);
        new InformationOfAirports().printListOfEndAirports(mapOfAllFlights);
    }

    public void scanFlightsFromAirport(String startAirport) {

        if (searchChecker.isFlightStartFromThisAirport(mapOfAllFlights, startAirport)) {

            List<Flight> flightsFormChosenAirport = mapOfAllFlights
                    .values()
                    .stream()
                    .filter(flight -> startAirport.equals(flight.getStartAirport()))
                    .collect(Collectors.toList());

            flightsFormChosenAirport
                    .stream()
                    .map(Flight::toString)
                    .forEach(System.out::println);
        } else {
            System.out.println(FlightFinderCommunicates.WRONG_AIRPORT);
        }
    }

    public void scanFlightsToAirport(String endAirport) {

        if (searchChecker.isFlightEndInThisAirport(mapOfAllFlights, endAirport)) {
            List<Flight> flightsToChosenAirport = mapOfAllFlights
                    .values()
                    .stream()
                    .filter(flight -> endAirport.equals(flight.getEndAirport()))
                    .collect(Collectors.toList());

            flightsToChosenAirport
                    .stream()
                    .map(Flight::toString)
                    .forEach(System.out::println);
        } else {
            System.out.println(FlightFinderCommunicates.WRONG_AIRPORT);
        }
    }

    public void scanFlightsToAirportWithAnotherAirport(String startAirport, String endAirport, String interAirport) {

        if (searchChecker.isFlightIsPossible(mapOfAllFlights, startAirport, endAirport, interAirport)) {

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

            flightsFormSpecifiedToSpecifiedAirport
                    .stream()
                    .map(Flight::toString)
                    .forEach(System.out::println);

            flightsWithInterlanding
                    .stream()
                    .map(Flight::toString)
                    .forEach(System.out::println);

        } else {
                System.out.println(String
                        .format(FlightFinderCommunicates.WRONG_FLIGHT_WITH_INTERLADNING,
                                startAirport, endAirport, interAirport));
        }
    }

}
