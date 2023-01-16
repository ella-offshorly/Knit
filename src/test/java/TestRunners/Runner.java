package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Login.feature", "src/test/resources/CreateProject.feature"},
        glue = {"StepDefinition", "General"},
        tags = "@smoke",
        plugin = {"pretty"}
)
public class Runner {
}
