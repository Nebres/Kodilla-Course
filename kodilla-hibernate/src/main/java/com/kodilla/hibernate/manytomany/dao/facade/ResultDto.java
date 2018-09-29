package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.Company;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ResultDto {

    private List<Company> companyResult = new ArrayList<>();
    private List<Employee> employeesResult = new ArrayList<>();

    public void setCompanyResult(List<Company> companyResult) {
        this.companyResult = companyResult;
    }

    public void setEmployeesResult(List<Employee> employeesResult) {
        this.employeesResult = employeesResult;
    }

    public List<Company> getCompanyResult() {
        return companyResult;
    }

    public List<Employee> getEmployeesResult() {
        return employeesResult;
    }

}
