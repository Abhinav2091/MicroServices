package com.in28minute.rest.webservices.webservices.serviceImpl;

import com.in28minute.rest.webservices.webservices.bean.Post;
import com.in28minute.rest.webservices.webservices.bean.User;
import com.in28minute.rest.webservices.webservices.dao.UserRepository;
import com.in28minute.rest.webservices.webservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository UserRepository;

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Abhinav", new Date()));
        userList.add(new User(2, "Aju", new Date()));
        return userList;
    }

    @Override
    public User saveUser() {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return UserRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return UserRepository.findById(id);
    }

    @Override
    public List<Post> getPosts(int id) {
        User user = UserRepository.findById(id);
        return user.getPost();
    }

}
