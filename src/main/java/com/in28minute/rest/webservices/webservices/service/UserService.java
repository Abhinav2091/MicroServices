package com.in28minute.rest.webservices.webservices.service;

import com.in28minute.rest.webservices.webservices.bean.User;

import java.util.List;


public interface UserService {

    public List<User> findAll();

    public User saveUser();
}
