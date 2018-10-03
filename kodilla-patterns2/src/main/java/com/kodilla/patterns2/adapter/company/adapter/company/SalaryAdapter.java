package com.kodilla.patterns2.adapter.company.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator {

    @Override
    public double totalSalary(String[][] workers, double[] salaries) {

        List<Employee> employees = new ArrayList<>();
        for (int k = 0; k < salaries.length; k++) {
            employees.add(new Employee(
                    workers[k][0],
                    workers[k][1],
                    workers[k][2],
                    new BigDecimal(salaries[k])
            ));
        }
        return calculateSalaries(employees).doubleValue();



    }

}
