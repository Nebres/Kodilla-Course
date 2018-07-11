package com.kodilla.good.patterns.challenges.firstChallenge;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainRunner {

    private static final String SEPARATOR = " ! ";

    public static void main(String[] args){

       Map<String, List<String>> listMap = new MovieStore().getMovies();

       String result = listMap.values()
               .stream()
               .flatMap(Collection::stream)
               .collect(Collectors.joining(SEPARATOR));

       System.out.println(result);
    }

}