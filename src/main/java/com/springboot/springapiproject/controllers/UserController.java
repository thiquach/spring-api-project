package com.springboot.springapiproject.controllers;

import com.springboot.springapiproject.entities.Users;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/users")
    public List<Users> getUsers() {
        return userRepository.findAll();
    }
}