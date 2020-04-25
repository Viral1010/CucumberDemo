package testRunner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Program Files (x86)\\Jenkins\\workspace\\Xray_Testing\\Features\\temp.feature",
        glue="stepDefinition",
        plugin = { "pretty", "json:target/Cucumber.json" },
        monochrome = true
)

public class TestRunner {
}
