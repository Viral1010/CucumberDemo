package testRunner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Features/temp.feature",
        glue="stepDefinition",
        plugin = { "pretty", "json:target/Cucumber.json" },
        monochrome = true
)

public class TestRunner {
}
