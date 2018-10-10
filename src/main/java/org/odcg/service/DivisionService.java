package org.odcg.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/api/v1/division")
public class DivisionService {


    // CREATE
    @RequestMapping(value = {"", "/"}, method = GET)
    public Double division(@RequestBody Double num, @RequestBody Double den) throws IllegalArgumentException {
        if ( Double.valueOf(0).equals(den)) {
            throw new IllegalArgumentException("pas encore trouvé comment divisé par zéro");
        }
        return num/den;
    }


}
