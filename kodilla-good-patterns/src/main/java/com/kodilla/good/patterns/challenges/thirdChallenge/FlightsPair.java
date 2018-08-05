package com.kodilla.good.patterns.challenges.thirdChallenge;

public class FlightsPair {

    private Flight flightFromVia;
    private Flight flightViaTo;

    public FlightsPair(Flight flightFromVia, Flight flightViaTo) {
        this.flightFromVia = flightFromVia;
        this.flightViaTo = flightViaTo;
    }

    public Flight getFlightFromVia() {
        return flightFromVia;
    }

    public Flight getFlightViaTo() {
        return flightViaTo;
    }

    @Override
    public String toString() {

        return String.format("[Departure: %s | Via: %s | Arrival: %s]", getFlightFromVia().getStartAirport(),
               getFlightFromVia().getEndAirport(), getFlightViaTo().getEndAirport());
    }

}


