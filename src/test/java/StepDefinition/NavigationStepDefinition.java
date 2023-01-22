package StepDefinition;

import Steps.NavigationStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static Base.BaseUtil.Driver;

public class NavigationStepDefinition {

    NavigationStep nav = new NavigationStep(Driver);

    @When("The user navigates on the Sign Up Page")
    public void theUserNavigatesOnTheSignUpPage () {

        nav.theUserProceedsToTheSignUpPage();
    }

    @Given("The user is in the Employee Record - General Page")
    public void the_user_is_in_the_employee_record_general_page() {
        nav.theUserProceedsToTheEmployeeRecordGeneralPage();
    }

    @Given("The user is in the Employee Record - Contact Page")
    public void theUserIsInTheEmployeeRecordContactPage() {
        nav.theUserProceedsToTheEmployeeRecordContactPage();
    }

    @Given("The user is in the Employee Record - Education Page")
    public void theUserIsInTheEmployeeRecordEducationPage() {
        nav.theUserProceedsToTheEmployeeRecordEducationPage();
    }

    @Given("The user is in the Employee Record - Family Page")
    public void theUserIsInTheEmployeeRecordFamilyPage() {
        nav.theUserProceedsToTheEmployeeRecordFamilyPage();
    }

    @Given("The user is in the Employee Record - Medical Page")
    public void theUserIsInTheEmployeeRecordMedicalPage() {
        nav.theUserProceedsToTheEmployeeRecordMedicalPage();
    }

    @Given("The user is in the Employee Record - Edit General Page")
    public void the_user_is_in_the_employee_record_edit_general_page() throws InterruptedException {
        nav.theUserProceedsToEditEmployeeRecordGeneralPage();
    }


    @Given("The user is in the Employee Record - Edit Contact Page")
    public void theUserIsInTheEmployeeRecordEditContactPage() throws InterruptedException {
        nav.theUserProceedsToEditEmployeeRecordContactPage();
    }
}
