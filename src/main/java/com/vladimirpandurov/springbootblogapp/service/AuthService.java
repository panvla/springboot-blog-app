package com.vladimirpandurov.springbootblogapp.service;

import com.vladimirpandurov.springbootblogapp.dto.RegisterRequest;
import com.vladimirpandurov.springbootblogapp.model.User;
import com.vladimirpandurov.springbootblogapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void signup(RegisterRequest registerRequest){
        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }

}
