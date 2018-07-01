package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Davide by 0");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3.0, 1.0);

        try {
            double testedResult = firstChallenge.divide(3.0, 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            System.out.println("Never Divine by 0");
        }

        System.out.println(result);
    }

}