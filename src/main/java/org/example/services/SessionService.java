package org.example.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import org.example.dao.JobsDAO;

import java.io.Serializable;

@SessionScoped
public class SessionService implements Serializable {

    private int count;


    public int getCount() {
        return ++count;
    }

}