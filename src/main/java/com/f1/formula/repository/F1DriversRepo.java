package com.f1.formula.repository;

import com.f1.formula.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface F1DriversRepo extends JpaRepository<Driver,Integer> {

}
