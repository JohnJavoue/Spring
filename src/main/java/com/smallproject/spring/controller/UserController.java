package com.smallproject.spring.controller;

import com.smallproject.spring.model.User;
import com.smallproject.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/create")
    public void createNewUser() {

        User user = new User();
        user.setFirstName("Paul");
        user.setLastName("Truc");
        user.setEmail("paul.true@mail.fr");
        user.setInscriptionDate(LocalDateTime.now());

        userRepository.save(user);
    }
}
