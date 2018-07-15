package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class InformationOfAirports {

   public void printListOfStartAirports(Map<Integer, Flight> mapOfAllFlights) {

       Set<String> startAirports = mapOfAllFlights.values()
               .stream()
               .map(Flight::getStartAirport)
               .collect(Collectors.toSet());

       System.out.println(FlightFinderCommunicates.LIST_OF_START_AIRPORT);
       startAirports.forEach(System.out::println);
   }

   public void printListOfEndAirports(Map<Integer, Flight> mapOfAllFlights) {

        Set<String> endAirports = mapOfAllFlights.values()
                .stream()
                .map(Flight::getEndAirport)
                .collect(Collectors.toSet());

        System.out.println(FlightFinderCommunicates.LIST_OF_END_AIRPORT);
        endAirports.forEach(System.out::println);

   }

}
