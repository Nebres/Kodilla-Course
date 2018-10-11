package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.facade.CompanyFacade;
import com.kodilla.hibernate.manytomany.dao.facade.ResultDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyFacade companyFacade;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveEmployeeByLastname() {
        //Given
        Employee jhonSmith = new Employee("John", "Smith");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        lindaKovalsky.getCompanies().add(softwareMachine);
        softwareMachine.getEmployees().add(lindaKovalsky);
        jhonSmith.getCompanies().add(softwareMachine);
        jhonSmith.getCompanies().add(dataMaesters);
        softwareMachine.getEmployees().add(jhonSmith);
        dataMaesters.getEmployees().add(jhonSmith);
        String expected = "Smith";
        //When
        employeeDao.save(jhonSmith);
        List<Employee> employeeList = employeeDao.retrieveEmployeeByLastname("Smith");
        //Than
        for (Employee employee:employeeList) {
            String actual = employee.getLastname();
            Assert.assertEquals(expected, actual);
        }
        //CleanUp
        try {
            employeeDao.delete(jhonSmith);
            employeeDao.delete(lindaKovalsky);
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveCompanyByBeginning() {
        //Given
        Employee jhonSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        jhonSmith.getCompanies().add(softwareMachine);
        jhonSmith.getCompanies().add(dataMaesters);
        softwareMachine.getEmployees().add(jhonSmith);
        dataMaesters.getEmployees().add(jhonSmith);
        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        List<Company> companyList = companyDao.retrieveCompanyByBeginning("Sof");
        //Than
        for (Company company:companyList) {Assert.assertTrue(company.getName().startsWith("Sof"));}
        //CleanUp
        try {
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
            employeeDao.delete(jhonSmith);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testSearchWithParm() {
        //Using data from local DB
        //Given
        String searched = "Ma";
        //When
        ResultDto result = companyFacade.search(searched);
        //Than
        for (Company company : result.getCompanyResult()) {
            Assert.assertTrue(company.getName().contains("Ma"));
        }

        for (Employee employee : result.getEmployeesResult()) {
            Assert.assertTrue(employee.getLastname().contains("Ma"));
        }
    }

    @Test
    public void testSearchWithoutParm() {
        //Using data from local DB
        //Given
        String searched = "";
        //When
        ResultDto result = companyFacade.search(searched);
        int expectedResultSize = 0;

        //Than
        Assert.assertEquals(result.getCompanyResult().size(), expectedResultSize);
        Assert.assertEquals(result.getEmployeesResult().size(), expectedResultSize);
    }

    @Test
    public void testSearchWithNull() {
        //Using data from local DB
        //Given
        String searched = null;
        //When
        ResultDto result = companyFacade.search(searched);
        int expectedCompanyResultSize = 0;
        int expectedEmployeeResultSize = 0;
        //Than
        Assert.assertEquals(result.getCompanyResult().size(), expectedCompanyResultSize);
        Assert.assertEquals(result.getEmployeesResult().size(), expectedEmployeeResultSize);
    }
}