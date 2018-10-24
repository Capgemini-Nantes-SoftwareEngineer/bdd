package com.capgemini.codingdojo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/v1/complex")
public class ComplexeService {

    @Autowired
    private
    SimpleService simpleService;

    // CREATE
    @RequestMapping(value = {"", "/value1"}, method = GET)
    public String value1(@RequestBody String val) {
        return getSimpleService().prefixe() + val + getSimpleService().suffixe();
    }


    public SimpleService getSimpleService() {
        return simpleService;
    }

    public void setSimpleService(SimpleService simpleService) {
        this.simpleService = simpleService;
    }
}
