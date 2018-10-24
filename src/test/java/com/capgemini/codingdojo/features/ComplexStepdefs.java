package com.capgemini.codingdojo.features;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.capgemini.codingdojo.CodingDojoBDDApplication;
import com.capgemini.codingdojo.service.ComplexeService;
import com.capgemini.codingdojo.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


//@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes = CodingDojoBDDApplication.class)
public class ComplexStepdefs {

    @Autowired
    private ComplexeService complexeService;
    private SimpleService simpleServiceSpy;
    private String result;


    @Before
    public void beforeScenario() {
        MockitoAnnotations.initMocks(this);
        this.simpleServiceSpy = Mockito.spy(SimpleService.class);
        complexeService.setSimpleService(simpleServiceSpy);
    }

    @Given("^mock prefixe : (\\[a-z]+) $")
    public void complexeMockPrefixe(String prefixe) throws Throwable {
        Mockito.when(simpleServiceSpy.prefixe()).thenReturn(prefixe);
    }

    @Given("^mock suffixe : (\\[a-z]+) $")
    public void complexeMockSuffixe(String suffixe) throws Throwable {
        Mockito.when(simpleServiceSpy.suffixe()).thenReturn(suffixe);
    }

    @When("^complexe : (\\[a-z]+) ")
    public void complexe(String milieu) throws Throwable {
        this.result = complexeService.value1(milieu);
    }

    @Then("^resultat attendu : (\\[a-z]+)$")
    public void complexeCheckResult(String expected) throws Throwable {
        boolean condition = expected.equals(result);
        Assert.assertTrue(condition);
    }


}
