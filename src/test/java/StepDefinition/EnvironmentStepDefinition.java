package StepDefinition;

import Steps.EnvironmentStep;
import io.cucumber.java.en.Given;

public class EnvironmentStepDefinition {
    private EnvironmentStep environmentStep;

    public EnvironmentStepDefinition(EnvironmentStep environmentStep) {
        this.environmentStep = environmentStep;
    }

    @Given("The user is in the test environment")
    public void theUserIsInTheTestEnvironment () throws Throwable {
        environmentStep.theUserProceedsToTheTestEnvironment();
    }

    @Given("The user is in the sign up page")
    public void theUserIsInTheSignUpPage () throws Throwable {
        environmentStep.theUserProceedsToSignUpPage();
    }
}
