package com.in28minute.rest.webservices.webservices.service;

import com.in28minute.rest.webservices.webservices.bean.Post;
import com.in28minute.rest.webservices.webservices.bean.User;

import java.util.List;


public interface UserService {

    public List<User> findAll();

    public User saveUser();

    public List<User> getUsers();
    public User getUser(int id);
    public List<Post> getPosts(int id);
}
