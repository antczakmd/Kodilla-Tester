package com.kodilla.mockito.homework;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherAlertService {

    private Map<Location, List<Person>> allTheLocations = new HashMap<>();

    public void addLocation(Location location) {
        System.out.println("Adding location " + location);
        allTheLocations.put(location, new ArrayList<Person>());
    }

    public void removeLocation(Location location) {
        allTheLocations.remove(location);
    }

    public void addSubscriber(Person person, Location location) {
        if (!allTheLocations.containsKey(location)) {
            System.out.println("Location not found. Adding location to the system.");
            this.addLocation(location);
        } else {
            System.out.println("Location found.");
        }
        allTheLocations.get(location).add(person);

    }

    public void removeSubscriberFromLocation(Person person, Location location) {
        if (this.allTheLocations.containsKey(location)) {
            this.allTheLocations.get(location).remove(person);
        }
    }

    public void removeSubscriberFromAllLocations(Person person) {
        for (Map.Entry<Location, List<Person>> entry : allTheLocations.entrySet()) {
                entry.getValue().remove(person);
        }
        System.out.println("Removing subscriber " + person + " from all followed locations.");
    }

    public void sendNotificationToLocation(WeatherNotification weatherNotification, Location location) {
        if (this.allTheLocations.containsKey(location)) {
            this.allTheLocations.get(location).forEach(person -> person.receive(weatherNotification));
        }
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        this.allTheLocations.values().stream()
                .flatMap(persons -> persons.stream())
                .collect(Collectors.toSet())
                .forEach(person -> person.receive(weatherNotification));
    }
}
