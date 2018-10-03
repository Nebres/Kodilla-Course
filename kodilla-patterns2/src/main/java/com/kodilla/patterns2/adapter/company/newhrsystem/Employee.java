package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {

    private String peselId;
    private String name;
    private String lastname;
    private BigDecimal baseSalary;

    public Employee(String peselId, String name, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.name = name;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getPeselId(), employee.getPeselId()) &&
                Objects.equals(getName(), employee.getName()) &&
                Objects.equals(getLastname(), employee.getLastname()) &&
                Objects.equals(getBaseSalary(), employee.getBaseSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPeselId(), getName(), getLastname(), getBaseSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

}
