package com.f1.formula.repository;

import com.f1.formula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUserName(String userName);
    boolean existsUserByUserName (String userName);
    boolean existsByEmail(String email);
    boolean existsByPhoneNumber(Integer phoneNumber);
}
