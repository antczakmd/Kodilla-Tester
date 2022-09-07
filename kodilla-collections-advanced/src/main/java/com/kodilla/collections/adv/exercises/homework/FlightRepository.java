package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    static List<Flight> flightsTable;

        public static List<Flight> getFlightsTable() {
            flightsTable = new ArrayList<>();
            flightsTable.add(new Flight("Warsaw Modlin", "Manchester"));
            flightsTable.add(new Flight("Warsaw", "Phuket"));
            flightsTable.add(new Flight("Warsaw", "Malta"));
            flightsTable.add(new Flight("Gdansk", "Liverpool"));
            flightsTable.add(new Flight("Krakow", "Budapest"));
            return flightsTable;

        }
    }
