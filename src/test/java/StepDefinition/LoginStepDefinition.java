package StepDefinition;

import Steps.NavigationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.login.login;

import static Base.BaseUtil.Driver;

public class LoginStepDefinition {

    NavigationStep nav = new NavigationStep(Driver);
    login page = new login(Driver);

    //Entered Empty Email Address
    @When("The user has entered empty email address {string} for login")
    public void theUserHasEnteredEmptyEmailAddress(String emailAddress) {
        page.EnterEmptyEmailAddress(emailAddress);
    }

    @Then("The user should shown an error message, {string} for the empty email for login")
    public void theUserShouldShownAnErrorMessageForTheEmptyEmail(String actualEmailAddress) {
        page.EmptyEmailAddress(actualEmailAddress);
    }


    //Entered Invalid Email Format
    @When("The user has entered the invalid email address format {string} for login")
    public void theUserHasEnteredTheInvalidEmailAddressFormat(String emailAddress) {
        page.EnterInvalidEmailAddressFormat(emailAddress);
    }
    @Then("The user should shown an error message, {string} for the missing @ symbol for login")
    public void theUserShouldShownAnErrorMessageForTheMissingSymbol(String actualEmailAddress) {
        page.MissingAtSymbol(actualEmailAddress);
    }

    //Entered Existing Email Address
    @When("The user has entered an unregistered email address {string} for login")
    public void theUserHasEnteredAnUnregisteredEmailAddress(String emailAddress) {
        page.EnterUnregisteredEmailAddress(emailAddress);
    }
    @Then("The user should shown an error message, {string} for the unregistered email address for login")
    public void theUserShouldShownAnErrorMessageForTheUnregisteredEmailAddress(String actualEmailAddress) throws InterruptedException {
        page.UnregisteredEmailAddress(actualEmailAddress);
    }

    //LOGIN VIA GOOGLE

    @When("The user has clicked on Continue With Google for login")
    public void theUserHasClickedOnContinueWithGoogle() {
        page.ContinueWithGoogle();
    }

    @And("The user has logged in Google email address {string} and password {string} for login")
    public void theUserHasLoggedInGoogleEmailAddressAndPassword(String emailAddress, String password) throws InterruptedException{
        page.LoginGoogle(emailAddress, password);
    }

    @Then("The user is redirected to the Knit dashboard after login")
    public void theUserIsRedirectedToTheKnitDashboardAfterlogin() throws InterruptedException {
        page.VerifyNewLoginPageRedirectionSSO();
    }

    //LOGIN VIA FACEBOOK
    @When("The user has clicked on Continue With Facebook for login")
    public void theUserHasClickedOnContinueWithFacebook() {
        page.ContinueWithFacebook();
    }

    @And("The user has logged in Facebook email address {string} and password {string} for login")
    public void theUserHasLoggedInFacebookEmailAddressAndPassword(String emailAddress, String password) throws InterruptedException {
        page.LoginFacebook(emailAddress, password);
    }
}
