package com.f1.formula.controller;


import com.f1.formula.model.Driver;
import com.f1.formula.service.F1Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
@RestController
public class F1Controller {
    private final F1Service driverService;

    public F1Controller(F1Service driverService){
        this.driverService = driverService;
    }

    @GetMapping("/drivers")
    public List<Driver> getAllDrivers(){
        return driverService.getAllDrivers();
    }
}
