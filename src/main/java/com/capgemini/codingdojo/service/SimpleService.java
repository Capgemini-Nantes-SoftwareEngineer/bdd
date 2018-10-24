package com.capgemini.codingdojo.service;

import org.springframework.stereotype.Component;

@Component
public class SimpleService {


    public String prefixe() {
        return "pre";
    }

    public String suffixe() {
        return "post";
    }
}
