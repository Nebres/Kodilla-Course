package com.kodilla.exception.test;

public class ExceptionHandling  {

    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyIWillThrowException(0.5, 1.5);
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("Thank You");
        }
    }

}
