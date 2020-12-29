package com.in28minute.rest.webservices.webservices.controller;

import com.in28minute.rest.webservices.webservices.bean.User;
import com.in28minute.rest.webservices.webservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<User> getUsers()
    {
        return userService.findAll();
    }
}
