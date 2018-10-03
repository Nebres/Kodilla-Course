package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.adapter.company.SalaryAdapter;
import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;

public class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {
        //When
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //Given
        double expected = 27750.00;
        double actual = salaryAdapter.totalSalary(workers.getWorkers(), workers.getSalaries());
        //Then
        System.out.println(actual);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
