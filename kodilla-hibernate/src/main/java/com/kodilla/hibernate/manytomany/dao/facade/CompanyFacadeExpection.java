package com.kodilla.hibernate.manytomany.dao.facade;

public class CompanyFacadeExpection extends Exception{

    public static String ERR_NULL_SEARCH = "No parameter";

    public CompanyFacadeExpection(String message) {
        super(message);
    }

}
