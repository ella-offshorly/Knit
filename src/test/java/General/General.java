package General;

import Steps.NavigationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.createProject.createProject;
import pages.login.login;

import static Base.BaseUtil.Driver;

public class General {

    NavigationStep nav = new NavigationStep(Driver);
    login page = new login(Driver);
    createProject cp = new createProject(Driver);

    @Given("The user is in the Login Page")
    public void the_user_is_in_the_login_page() {
        nav.theUserProceedsToTheLoginPage();
    }

    @When("The user has entered the email address {string} for login")
    public void the_user_has_entered_the_email_address_for_login(String currentEmailAddress) throws InterruptedException {
        page.EnterEmailAddress(currentEmailAddress);
    }

    @When("The user has clicked on Next button for login")
    public void the_user_has_clicked_on_next_button_for_login() {
        page.ClickCtaNext();
    }

    @When("The user has entered the password {string} for login")
    public void the_user_has_entered_the_password_for_login(String passWord) throws InterruptedException {
        Thread.sleep(1000);
        page.EnterPassword(passWord);
    }
    @Then("The user will proceed to Knit Dashboard after login")
    public void theUserWillProceedToKnitDashboard() throws InterruptedException {
        page.VerifyNewLoginPageRedirection();
    }

    @When("The user is in the Create Projects Page")
    public void theUserIsInTheCreateProjectsPage() {
        nav.theUserProceedsToTheCreateProjectsPage();
    }

    @When("The user has clicked Add More Details")
    public void the_user_has_clicked_add_more_details() throws InterruptedException {
        cp.ClickCtaAddMoreDetails();
    }
}
