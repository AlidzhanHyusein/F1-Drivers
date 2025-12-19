package com.f1.formula.service;

import com.f1.formula.model.Login;
import com.f1.formula.model.User;
import com.f1.formula.repository.UserRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final UserRepo userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public LoginService(UserRepo userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public String login(Login request) {

        User user = userRepository.findByUserName(request.getUserName());

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Incorrect password");
        }

        return "Login successful";
    }
}
