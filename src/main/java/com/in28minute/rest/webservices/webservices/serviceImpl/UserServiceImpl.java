package com.in28minute.rest.webservices.webservices.serviceImpl;

import com.in28minute.rest.webservices.webservices.bean.User;
import com.in28minute.rest.webservices.webservices.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Abhinav",new Date()));
        userList.add(new User(2,"Aju",new Date()));
        return userList;
    }

    @Override
    public User saveUser() {
        return null;
    }
}
