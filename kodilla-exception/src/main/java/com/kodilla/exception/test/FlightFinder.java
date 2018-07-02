package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FlightFinder {

   private final static Random RANDOM = new Random();

   public Map findFlight(Flight flight) {

       Map<String, Boolean> flightMap = new HashMap<>();
       flightMap.put(flight.getArrivalAirport(),RANDOM.nextBoolean());
       return flightMap;
   }

   public boolean isPossibleToGetIntoSpecifiedAirport(Map<String,Boolean> flightMap, String airportName)  throws RouteNotFoundException {
       if (!flightMap.containsKey(airportName)) {
           throw new RouteNotFoundException("Wrong Airport Name");}

          return flightMap.get(airportName);
   }

}
