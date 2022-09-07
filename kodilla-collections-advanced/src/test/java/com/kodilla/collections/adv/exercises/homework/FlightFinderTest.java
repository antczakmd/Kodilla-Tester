package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void doesAddTheRightFlights() {
        //when
        FlightRepository.getFlightsTable();
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Warsaw Modlin", "Manchester"));
        expectedFlights.add(new Flight("Gdansk", "Phuket"));
        expectedFlights.add(new Flight("Warsaw", "Phuket"));
        expectedFlights.add(new Flight("Gdansk", "Liverpool"));
        expectedFlights.add(new Flight("Krakow", "Budapest"));
        assertEquals(expectedFlights, FlightRepository.getFlightsTable());
    }

    @Test
    public void doesFindDepartures() {
        //when
        List<Flight> result = FlightFinder.findFlightFrom("Gdansk");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Gdansk", "Phuket"));
        expectedFlights.add(new Flight("Gdansk", "Liverpool"));
        assertEquals(expectedFlights, FlightFinder.findFlightFrom("Gdansk"));
    }
    @Test
    public void doesFindArrivals() {
        //when
        List<Flight> result = FlightFinder.findFlightTo("Phuket");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Gdansk", "Phuket"));
        expectedFlights.add(new Flight("Warsaw", "Phuket"));
        assertEquals(expectedFlights, FlightFinder.findFlightTo("Phuket"));
    }

}