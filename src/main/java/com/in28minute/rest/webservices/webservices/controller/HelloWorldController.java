package com.in28minute.rest.webservices.webservices.controller;

import com.in28minute.rest.webservices.webservices.bean.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello-world")
    public String helloWorld()
    {
        return "HELLO WORLD";
    }

    @GetMapping(value = "/hello-world-bean")
    public HelloWorld helloWorldBean()
    {
        return new HelloWorld("HELLO WORLD");
    }

    @GetMapping(value = "/hello-world/{name}")
    public HelloWorld helloWorldBean(@PathVariable(name = "name") String name)
    {
        return new HelloWorld(String.format("HELLO WORLD, %s",name));
    }
}
