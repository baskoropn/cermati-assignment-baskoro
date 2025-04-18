package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "summary",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions"
)

public class TestRunner {
}
