package com.smallproject.spring.controller;

import com.smallproject.spring.model.User;
import com.smallproject.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/user")
    public String index() {

        User user = new User();
        user.setFirstName("Paul");
        user.setLastName("Truc");

        userRepository.save(user);

        return "Greetings from Spring Boot!";
    }
}
