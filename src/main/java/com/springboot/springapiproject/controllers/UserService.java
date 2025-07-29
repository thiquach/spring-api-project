package com.springboot.springapiproject.controllers;

import com.springboot.springapiproject.entities.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<Users> getUsers() {
        return List.of(new Users(
                1L,
                "user 1",
                "user1@domain.com",
                "123123",
                null,
                null,
                null
        ));
    }
}