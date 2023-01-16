package StepDefinition;

import Steps.NavigationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.createProject.createProject;
import pages.login.login;

import static Base.BaseUtil.Driver;

public class CreateProjectStepDefinition {


    createProject cp = new createProject(Driver);

    //Create Project
    @And("The user has clicked Start from Scratch button")
    public void theUserHasClickedStartFromScratchButton() throws InterruptedException {
        cp.ClickCtaStartFromScratch();
    }

    @And("The user has entered a text {string} in the Project Name text field")
    public void theUserHasEnteredATextInTheProjectNameTextField(String knitProjectName) throws InterruptedException {
        cp.EnterUniqueProjectName(knitProjectName);
    }

    @Then("The user should be able to create a project with no details.")
    public void theUserShouldBeAbleToCreateAProjectWithNoDetails() throws InterruptedException {
        cp.ClickCtaCreateProject();
    }

    @And("The user has entered a description {string}")
    public void theUserHasEnteredADescription(String description) throws InterruptedException {
        cp.EnterDescription(description);
    }

    @And("The user has picked a due date {string}")
    public void theUserHasPickedADueDate(String dueDate) throws InterruptedException {
        cp.EnterDueDate(dueDate);
    }

    @And("The user has chosen a priority")
    public void theUserHasChosenAPriority() throws InterruptedException {
        cp.ChoosePriority();
    }

    @And("The user has entered a tag {string}")
    public void theUserHasEnteredATag(String tag) throws InterruptedException {
        cp.EnterTag(tag);
    }

    @Then("The user should be able to create a project with details.")
    public void theUserShouldBeAbleToCreateAProjectWithDetails() throws InterruptedException {
        cp.ClickCtaCreateProject();
    }
}
