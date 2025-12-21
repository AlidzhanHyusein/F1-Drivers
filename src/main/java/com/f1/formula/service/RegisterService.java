package com.f1.formula.service;


import com.f1.formula.model.User;
import com.f1.formula.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    PasswordEncoder passwordEncoder;
    UserRepo userRepo;
    User user;

    public RegisterService(UserRepo userRepo,PasswordEncoder passwordEncoder){
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(User user){

        if(userRepo.existsByPhoneNumber(user.getPhoneNumber())){
            throw new RuntimeException("Phone number already exists");
        } else if(userRepo.existsUserByUserName(user.getUserName())){
            throw new RuntimeException("Username already exists");
        } else if(userRepo.existsByEmail(user.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return user;
    }



}
