package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Objects;

public final class Flight {

    private final String startAirport;
    private final String endAirport;

    public Flight(String startAirport, String endAirport) {
        this.startAirport = startAirport;
        this.endAirport = endAirport;
    }

    public String getEndAirport() {
        return endAirport;
    }

    public String getStartAirport() {
        return startAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) return false;
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getEndAirport(), flight.getEndAirport()) &&
                Objects.equals(getStartAirport(), flight.getStartAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEndAirport(), getStartAirport());
    }

    @Override
    public String toString() {
        return String.format("[Departure: %s | Arrival: %s]", startAirport, endAirport);
    }

}
