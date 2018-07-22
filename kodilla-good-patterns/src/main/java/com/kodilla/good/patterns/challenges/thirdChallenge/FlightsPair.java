package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Iterator;
import java.util.List;

public class FlightsPair {

    private List<Flight> flightFromVia;
    private List<Flight> flightViaTo;

    public FlightsPair(List<Flight> flightFromVia, List<Flight> flightViaTo) {
        this.flightFromVia = flightFromVia;
        this.flightViaTo = flightViaTo;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        Iterator<Flight> array1 = flightFromVia.iterator();
        Iterator<Flight> array2 = flightViaTo.iterator();

        while(array1.hasNext() && array2.hasNext()) {
            Flight temp = array1.next();
            builder.append("[Departure: ")
                    .append(temp.getStartAirport())
                    .append(" | ")
                    .append("Via: ")
                    .append(temp.getEndAirport())
                    .append(" | ")
                    .append("Arrival: ")
                    .append(array2.next().getEndAirport())
                    .append("]")
                    .append("\n");
        }
        return builder.toString();
    }

}


