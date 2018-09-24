package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiFacade {

    @Autowired
    Context context;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiFacade.class);

    ApiFacade() {
    }

    public List<Employee> employeeContextSearch(Context searched) throws ApiExpections {
        if (searched.getContext() == null) {
            LOGGER.error(ApiExpections.ERR_NULL_SEARCH);
            throw new ApiExpections(ApiExpections.ERR_NULL_SEARCH);
        }
        List<Employee> result = employeeDao.retrieveEmployeeByContextSearch(searched.getContext());
        try {
            if (result.size() == 0) {
                LOGGER.info("No match");
            } else {
                for (Employee employee : result) {
                    LOGGER.info("Employee: " + employee.getLastname());
                }
            }
        } finally {
            return result;
        }
    }

    public List<Company> companyContextSearch(Context searched) throws ApiExpections {

        if (searched.getContext() == null) {
            LOGGER.error(ApiExpections.ERR_NULL_SEARCH);
            throw new ApiExpections(ApiExpections.ERR_NULL_SEARCH);
        }
        List<Company> result = companyDao.retrieveCompanyByContextSearch(searched.getContext());
        try {
            if (result.size() == 0) {
                LOGGER.info("No match");
            } else {
                for (Company company : result) {
                    LOGGER.info("Company: " + company.getName());
                }
            }
        } finally {
            return result;
        }
    }

}