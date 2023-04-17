package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features/registrarse.feature",
        glue = {"StepDefinitions"},
        monochrome=true,
        tags="@Caso2",
        plugin= {"pretty", "json:target/JSONReports/report.json"})

public class TestRunner {
}
