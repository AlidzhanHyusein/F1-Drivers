package com.f1.formula.service;


import com.f1.formula.model.Driver;
import com.f1.formula.repository.F1DriversRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class F1Service {

    private final F1DriversRepo f1Repo;

    public F1Service(F1DriversRepo f1Repo){
        this.f1Repo = f1Repo;
    }

    public List<Driver> getAllDrivers() {
        return f1Repo.findAll();
    }
}
