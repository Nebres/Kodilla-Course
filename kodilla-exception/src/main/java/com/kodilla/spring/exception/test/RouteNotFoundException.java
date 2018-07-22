package com.kodilla.spring.exception.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(String message) {
        super(message);
    }
}
