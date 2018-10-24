package com.capgemini.codingdojo.service;

import com.capgemini.codingdojo.domain.TicketData;
import com.capgemini.codingdojo.repository.HellfestTicketDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/v1/hellfest")
public class HellfestService {

    private static final String BDD_USER_AGENT = "hellfest";
    private final RestOperations restTemplate;
    private final HellfestTicketDataRepository hellfestTicketDataRepository;

    @Autowired
    public HellfestService(                              RestOperations restTemplate,
                           HellfestTicketDataRepository hellfestTicketDataRepository) {
        this.hellfestTicketDataRepository = hellfestTicketDataRepository;
        this.restTemplate = restTemplate;
    }

    // CREATE
    @RequestMapping(value = {"", "/"}, method = POST)
    @Transactional
    public TicketData save(@RequestBody String name) {
        TicketData ticketData = new TicketData();
        ticketData.setName(name);
        return hellfestTicketDataRepository.save(ticketData);
    }

    // READ ALL
    @Transactional(readOnly = true)
    @RequestMapping(value = {"", "/"}, method = GET)
    public List<TicketData> findAll() {
        return hellfestTicketDataRepository.findAll();
    }



}
