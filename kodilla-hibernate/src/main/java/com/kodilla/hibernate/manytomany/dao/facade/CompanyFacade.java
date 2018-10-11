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

import java.util.Collections;
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

    public ResultDto search(String searched){

        boolean isBlank = StringUtils.isBlank(searched);

        List<Employee> employeeResultList = employeeDao.retrieveEmployeeByArgSearch(searched);
        List<Company> companyResultList = companyDao.retrieveCompanyByArgSearch(searched);

        if (isBlank) {
            LOGGER.info("Search with no parameter declared");
            resultDto.setCompanyResult(Collections.emptyList());
            resultDto.setEmployeesResult(Collections.emptyList());
        }

        if (employeeResultList.size() == 0 && !isBlank) {
            LOGGER.info("No Employee find with this parameter");
        }

        if (employeeResultList.size() > 0 && !isBlank) {
            LOGGER.info("Find " + employeeResultList.size() + " matches");
            resultDto.setEmployeesResult(employeeResultList);
        }

        if (companyResultList.size() == 0 && !isBlank) {
            LOGGER.info("No Company find with this parameter");
        }

        if (companyResultList.size() > 0 && !isBlank) {
            LOGGER.info("Find " + companyResultList.size() + " matches");
            resultDto.setCompanyResult(companyResultList);
        }
        return resultDto;
    }

}