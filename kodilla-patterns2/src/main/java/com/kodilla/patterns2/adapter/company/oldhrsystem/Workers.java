package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"1234567890", "John", "Smith"},
            {"1234567098", "Ivone", "Nowak"},
            {"1234509876", "Jessie", "Pinkamn"},
            {"0987612345", "Walter", "White"},
            {"0978653421", "Clara", "Lanson"}
    };

    private double[] salaries = {
          4500.00,
          3700.00,
          4350.00,
          9000.00,
          6200.00
    };

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + " " + workers[n][1] + " " + workers[n][2] + " " +  salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }

}
