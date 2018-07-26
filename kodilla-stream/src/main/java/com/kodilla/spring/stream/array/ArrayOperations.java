package com.kodilla.spring.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(s -> numbers[s])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .map(s -> numbers[s])
                .average()
                .getAsDouble();
    }

}