package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features/jPetStore.feature",
        glue = {"StepDefinitions"},
        monochrome=true,
        tags="@Caso5",
        plugin= {"pretty", "json:target/JSONReports/report.json"})

public class TestRunner {
}
