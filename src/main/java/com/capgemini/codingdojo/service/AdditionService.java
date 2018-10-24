package com.capgemini.codingdojo.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/v1/addition")
public class AdditionService {

    // CREATE
    @RequestMapping(value = {"", "/"}, method = GET)
    public Integer addition(@RequestBody Integer add1, @RequestBody Integer add2) throws IllegalArgumentException {
        return add1 + add2;
    }


}
