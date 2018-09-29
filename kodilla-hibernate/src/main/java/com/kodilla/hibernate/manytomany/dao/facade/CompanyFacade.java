package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    @Autowired
    ResultDto resultDto;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    CompanyFacade() {
    }

    public ResultDto search(String parm) throws CompanyFacadeExpection {
        if (StringUtils.isBlank(parm)) {
            LOGGER.error(CompanyFacadeExpection.ERR_NULL_SEARCH);
            throw new CompanyFacadeExpection(CompanyFacadeExpection.ERR_NULL_SEARCH);
        }

        List<Employee> employeeResultList = employeeDao.retrieveEmployeeByParmSearch(parm);
        List<Company> companyResultList = companyDao.retrieveCompanyByParmSearch(parm);

        try {
            if (employeeResultList.size() == 0) {
                LOGGER.info("No Employee find with this parameter");
            } else {
                for (Employee employee : employeeResultList) {
                    LOGGER.info("Employee: " + employee.getLastname());
                }
            }
        }finally {
            resultDto.setEmployeesResult(employeeResultList);
        }

        try {
            if (companyResultList.size() == 0) {
                LOGGER.info("No Company find with this parameter");
            } else {
                for (Company company : companyResultList) {
                    LOGGER.info("Company: " + company.getName());
                }
            }
        }finally {
            resultDto.setCompanyResult(companyResultList);
        }
        return resultDto;
    }


}