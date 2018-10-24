package com.capgemini.codingdojo.features;

import com.capgemini.codingdojo.CodingDojoBDDApplication;
import com.capgemini.codingdojo.service.AdditionService;
import com.capgemini.codingdojo.service.DivisionService;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Etantdonné;
import cucumber.api.java.fr.Lorsque;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = CodingDojoBDDApplication.class)
public class AddtitionStepdefs {

    @Autowired
    private AdditionService additionService;

    private Integer add1;
    private Integer add2;
    private Integer result;


    @Given("^first parameter (\\d+)$")
    public void add1(Integer add1) throws Throwable {
        this.add1 = add1;
    }

    @Given("^second parameter (\\d+)$")
    public void add2(Integer add2) throws Throwable {
        this.add2 = add2;
    }

    @When("^addition")
    public void addition() throws Throwable {
        this.result = additionService.addition(add1, add2);
    }

    @Given("^I should have (\\d+)$")
    public void resultat(Integer expected) throws Throwable {
        Assert.assertTrue( expected.equals(this.result));
    }


}
