package ThirdChallenge;

import java.time.LocalDate;
import java.util.Objects;

public final class Flight {

    private final String endAirport;
    private final String startAirport;
    private final LocalDate flightDate;
    private final String startTime;

    public Flight(String startAirport, String endAirport, LocalDate flightDate, String startTime ) {
        this.endAirport = endAirport;
        this.startAirport = startAirport;
        this.startTime = startTime;
        this.flightDate = flightDate;
    }

    public String getEndAirport() {
        return endAirport;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public String getStartAirport() {
        return startAirport;
    }

    public String getStartTime() {
        return startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) return false;
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getEndAirport(), flight.getEndAirport()) &&
                Objects.equals(getStartAirport(), flight.getStartAirport()) &&
                Objects.equals(getFlightDate(), flight.getFlightDate()) &&
                Objects.equals(getStartTime(), flight.getStartTime());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getEndAirport(), getStartAirport(), getFlightDate(), getStartTime());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startAirport='" + startAirport + '\'' +
                ", endAirport='" + endAirport + '\'' +
                ", flightDate=" + flightDate +
                ", startTime='" + startTime + '\'' +
                '}';
    }

}
