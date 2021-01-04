/*
package com.in28minute.rest.webservices.webservices.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.in28minute.rest.webservices.webservices.bean.SomeBean;
import com.in28minute.rest.webservices.webservices.bean.User;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public SomeBean somebean() {
        return new SomeBean("Val1", "Val2", "Val3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> somebeans() {
        return Arrays.asList(new SomeBean("Val1", "Val2", "Val3"), new SomeBean("Val12", "Val22", "Val33"));
    }

    @GetMapping("/dynamic-filtering")
    public MappingJacksonValue dynamicFiltering() {
        User user = new User(1, "AJU", new Date());

        return getMappingJacksonValue(user);
    }

    @GetMapping("/dynamic-filtering-list")
    public MappingJacksonValue dynamicFilteringList() {
        List<User> userList = Arrays.asList(new User(1, "AJU", new Date()), new User(2, "Abhinav", new Date()));

        return getMappingJacksonValue(userList);

    }

    private MappingJacksonValue getMappingJacksonValue(Object user) {
        //do Dynamic filtering
        MappingJacksonValue mapping = new MappingJacksonValue(user);
        //configure the filters
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "id");
        FilterProvider filters = new SimpleFilterProvider().addFilter("dynamicFilter", filter);
        mapping.setFilters(filters);
        return mapping;
    }
}
*/
