package com.kodilla.exception.test;

public class ExceptionHandling  {

    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();

        try {
           String result = challenge.probablyIWillThrowException(0.9, 1.5);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Thank You");
        }
    }

}
