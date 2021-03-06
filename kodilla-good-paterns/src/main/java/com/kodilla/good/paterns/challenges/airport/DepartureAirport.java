package com.kodilla.good.paterns.challenges.airport;

import java.time.LocalDateTime;

public final class DepartureAirport implements Airport {
    private final String airportName;
    private final String cityName;
    private final int airportId;
    private final boolean proceedingFlights;
    private final LocalDateTime timeOfDeparture;

    public DepartureAirport(final String airportName, final String cityName, final int airportId, final boolean proceedingFlights, final int year, final int month, final int day, final int hour, final int minute) {
        this.airportName = airportName;
        this.cityName = cityName;
        this.airportId = airportId;
        this.proceedingFlights = proceedingFlights;
        this.timeOfDeparture = LocalDateTime.of(year, month, day, hour, minute);
    }

    public String getAirportName() {
        return airportName;
    }

    public String getCityName() {
        return cityName;
    }

    public int getAirportId() {
        return airportId;
    }

    public boolean isProceedingFlights() {
        return proceedingFlights;
    }

    public LocalDateTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    @Override
    public String toString() {
        return "DepartureAirport{" +
                "airportName='" + airportName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", airportId=" + airportId +
                ", proceedingFlights=" + proceedingFlights +
                ", timeOfDeparture=" + timeOfDeparture +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof DepartureAirport)) return false;
        DepartureAirport departureAirport = (DepartureAirport) o;
        return getAirportId() == departureAirport.getAirportId() && isProceedingFlights() == departureAirport.isProceedingFlights() && getAirportName().equals(departureAirport.getAirportName()) && getCityName().equals(departureAirport.getCityName());
    }

    @Override
    public int hashCode() {
        return airportId;
    }
}
