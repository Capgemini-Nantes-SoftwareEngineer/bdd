package org.odcg;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = {"classpath:features/"},
        glue = {"cucumber.api.spring", "org.odcg.features"},
        format = {"html:target/cucumber", "json:target/cucumber.json"}
)
public class RunTest {
}
