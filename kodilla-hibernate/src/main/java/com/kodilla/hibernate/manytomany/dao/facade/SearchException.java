package com.kodilla.hibernate.manytomany.dao.facade;

public class SearchException extends Exception{

    public static String ERR_NULL_SEARCH = "No parameter";

    public SearchException(String message) {
        super(message);
    }

}
