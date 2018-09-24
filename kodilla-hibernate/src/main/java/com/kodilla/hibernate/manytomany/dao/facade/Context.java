package com.kodilla.hibernate.manytomany.dao.facade;

import org.springframework.stereotype.Component;

@Component
public class Context {

    private String context;

    public Context(){}

    public Context(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

}
