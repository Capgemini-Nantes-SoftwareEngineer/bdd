package com.capgemini.codingdojo.features;

import com.capgemini.codingdojo.CodingDojoBDDApplication;
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
public class DivisionStepdefs {
    @Autowired
    private DivisionService divisionService;

    private Double num;
    private Double den;
    private Double result;
    private boolean exception =false;


    @Before
    public void beforeScenario() {

    }

    @Given("^numerateur : (\\d+) et denominateur : (\\d+)$")
    public void divisionContexte(Double num, Double den) throws Throwable {
        this.num = num;
        this.den = den;
    }

    @Given("^numerateur : (\\d+)$")
    public void divisionContexteNum(Double num) throws Throwable {
        this.num = num;
    }

    @Given("^denominateur : (\\d+)$")
    public void divisionContexteDen(Double den) throws Throwable {
        this.den = den;
    }


    @Etantdonné( "^numérateur : (\\d+) et dénominateur : (\\d+)$")
    public void divisionContexteFr(Double num, Double den) throws Throwable {
        this.num = num;
        this.den = den;
    }


    @When("^divise$")
    public void divisionAction() throws Throwable {
        try {
            this.result = divisionService.division(num, den);
        } catch(IllegalArgumentException e) {
            exception = true;
        }
    }

    @Lorsque("^diviser$")
    public void divisionActionFr() throws Throwable {
        try {
            this.result = divisionService.division(num, den);
        } catch(IllegalArgumentException e) {
            exception = true;
        }
    }

    @Then("^resultat attendu : (\\d+)$")
    public void divisionTest(Double expected) throws Throwable {
        boolean condition = expected.equals(result);
        Assert.assertTrue(condition);
    }

    @Alors("^résultat attendu : (\\d+)$")
    public void divisionTestFR(Double expected) throws Throwable {
        boolean condition = expected.equals(result);
        Assert.assertTrue(condition);
    }

    @Then("^resultat attendu exception")
    public void divisionTest() throws Throwable {
        Assert.assertTrue(exception);
    }
}
