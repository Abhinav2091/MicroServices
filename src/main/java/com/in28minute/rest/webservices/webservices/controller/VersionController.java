package com.in28minute.rest.webservices.webservices.controller;

import com.in28minute.rest.webservices.webservices.bean.Name;
import com.in28minute.rest.webservices.webservices.bean.PersonV1;
import com.in28minute.rest.webservices.webservices.bean.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    /*
    approach one starts
     known as URI type versioning
     */

    @GetMapping(value = "/v1/person")
    public PersonV1 version1() {
        return new PersonV1("Abhinav Sharma");
    }

    @GetMapping(value = "/v2/person")
    public PersonV2 version2() {
        return new PersonV2(new Name("Abhinav", "Sharma"));
    }

    /*
    approach one ends
     */

    /*
    approach two with params starts
     known as PARAM REQUEST type versioning
     */

    @GetMapping(value = "/person/params", params = "version=1")
    public PersonV1 paramV1() {
        return new PersonV1("Abhinav Sharma");
    }

    @GetMapping(value = "/person/params", params = "version=2")
    public PersonV2 paramV2() {
        return new PersonV2(new Name("Abhinav", "Sharma"));
    }

    /*
    approach two ends
     */


      /*
    approach three with headers starts
     known as HEADER type versioning
     */

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 headerV1() {
        return new PersonV1("Abhinav Sharma");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 headerV2() {
        return new PersonV2(new Name("Abhinav", "Sharma"));
    }

    /*
    approach three ends
     */

      /*
    approach Four with produces starts
    known as MIME type versioning (MEDIA TYPE VERSIONING)
     */

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonV1 producesV1() {
        return new PersonV1("Abhinav Sharma");
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonV2 producesV2() {
        return new PersonV2(new Name("Abhinav", "Sharma"));
    }

    /*
    approach Four ends
     */

}
