package com.in28minute.rest.webservices.webservices.controller;

import com.in28minute.rest.webservices.webservices.bean.User;
import com.in28minute.rest.webservices.webservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userService.findAll();
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") int id) {

        User user = new User(1, "Abhinav", new Date());
        // Use HATEOAS here
        //let say retrieve the url for user
        //and it is not hard coded we will do it using that method

        // creating a resource with user object
        EntityModel<User> resources = EntityModel.of(user);

        //creating a link that we need to send with resource
        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getUsers());

        //adding those links in resource with key name
        resources.add(linkTo.withRel("all-users"));

        return new ResponseEntity<Object>(resources, null, HttpStatus.OK);

    }

    @PostMapping(value = "/users")
    public ResponseEntity<Object> addUser(@Valid @RequestBody User user) throws UserPrincipalNotFoundException {
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(user.getId()).toUri();
        // returning status 201 for created
        return ResponseEntity.created(location).build();

    }
}
