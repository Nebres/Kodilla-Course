package com.kodilla.hibernate.manytomany.dao.facade;

public class CompanyFacadeException extends Exception{

    public static String ERR_NULL_SEARCH = "No parameter";

    public CompanyFacadeException(String message) {
        super(message);
    }

}
