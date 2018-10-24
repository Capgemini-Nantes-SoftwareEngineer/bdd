package com.capgemini.codingdojo.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.capgemini.codingdojo.CodingDojoBDDApplication;
import com.capgemini.codingdojo.service.HellfestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = CodingDojoBDDApplication.class)
public class SikuliStepdefs {
    @Autowired
    private HellfestService hellfestService;


    @Given("Apres une attente de 4 mois et mon email email@domain.tld et ma CB")
    public void hellfestContext() throws Throwable {
        System.out.println("hellfest-when");
    }

    @When("^j'achete un pass (\\d+) jours$")
    public void hellfestBuyTicket(Integer nbJour) throws Throwable {
        System.out.println("hellfest-then");
    }

    @Then("^je veux recevoir un email avec mon pass electronique$")
    public void hellfestConfirmationEmail() throws Throwable {
        System.out.println("hellfest-when");
    }
}
