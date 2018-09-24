package com.kodilla.hibernate.manytomany.dao.facade;

public class ApiExpections extends Exception{

    public static String ERR_NULL_SEARCH = "No parameter";

    public ApiExpections(String message) {
        super(message);
    }

}
