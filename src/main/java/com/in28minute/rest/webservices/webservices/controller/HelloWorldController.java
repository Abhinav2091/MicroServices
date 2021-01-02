package com.in28minute.rest.webservices.webservices.controller;

import com.in28minute.rest.webservices.webservices.bean.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(value = "/hello-world")
    public String helloWorld() {
        return "HELLO WORLD";
    }

    @GetMapping(value = "/hello-world-bean")
    public HelloWorld helloWorldBean() {
        return new HelloWorld("HELLO WORLD");
    }

    @GetMapping(value = "/hello-world/{name}")
    public HelloWorld helloWorldBean(@PathVariable(name = "name") String name) {
        return new HelloWorld(String.format("HELLO WORLD, %s", name));
    }

    @GetMapping(value = "/hello-world/i18n")
    public ResponseEntity<Object> helloWorldBeanInternationalization
            ()
    //either get local like this
    //(@RequestHeader(name = "Accept-Language", required = false) Locale locale)
    {
        //first way
        //String response = messageSource.getMessage("good.greeting.message", null, locale);

        //alternative if you dont want to add Request header
        String response = messageSource.getMessage("good.greeting.message", null, LocaleContextHolder.getLocale());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
