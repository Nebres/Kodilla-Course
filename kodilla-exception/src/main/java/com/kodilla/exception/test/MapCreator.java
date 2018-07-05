package com.kodilla.exception.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapCreator {

    private final static Random RANDOM = new Random();

    public Map<String,Boolean> initializeMapOfFlights() throws IOException {

        ClassLoader loader = getClass().getClassLoader();
        File file = new File(loader.getResource("Files/DepartureAirport.txt").getFile());
        Path path = Paths.get(file.getPath());
        Stream<String> departureAirport = Files.lines(path);
        List<String> listOfDepartureAirports = departureAirport.collect(Collectors.toList());
        Map<String, Boolean> mapOfFlights = new HashMap<>();

        for (int i = 0; i < listOfDepartureAirports.size(); i++) {
                mapOfFlights.put(listOfDepartureAirports.get(i), RANDOM.nextBoolean());
        }
        return mapOfFlights;
    }

}
