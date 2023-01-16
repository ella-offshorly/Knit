package StepDefinition;

import Base.BaseUtil;
import Steps.NavigationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.signup.signUp;

import java.util.List;

//'extends' functions as a way to inherit the values from a different class
public class SignUpStepDefinition extends BaseUtil {

    //Object for Pages.signUp, StepDefinition.NavigationStepDef
    signUp page = new signUp(Driver);
    NavigationStep nav = new NavigationStep(Driver);

    @Given("The user is in the Sign Up Page")
    public void theUserIsInTheSignUpPage() {
        nav.theUserProceedsToTheSignUpPage();
    }

    @When("The user has entered the email address {string} for sign up")
    public void the_user_has_entered_the_email_address_for_signup(String currentEmailAddress) throws InterruptedException {
        page.EnterEmailAddress(currentEmailAddress);
    }

    @And("The user has clicked on Next button")
    public void the_user_has_clicked_on_next_button() {
        page.ClickCtaNext();
    }

    @When("The user has entered the password {string} for sign up")
    public void the_user_has_entered_the_password_for_signup(String passWord) throws InterruptedException {
        Thread.sleep(1000);
        page.EnterPassword(passWord);
    }

    @And("The user has agreed to the Terms of Use and Privacy Policy")
    public void theUserHasAgreedToTheTermsOfUseAndPrivacyPolicy() {
        page.ClickCbTermsAndPolicy();
    }

    @And("The user has clicked on recaptcha")
    public void theUserHasClickedOnRecaptcha() throws InterruptedException {

        //DEBUG: Finding all iframe tags on a web page
        List<WebElement> elements = Driver.findElements(By.tagName("iframe"));
        int numberOfTags = elements.size();
        System.out.println("No. of Iframes on this Web Page are: " + numberOfTags);

       //Clicking the recaptcha
       page.ClickCbRecaptcha();

    }

    @And("The user has clicked Submit button")
    public void theUserHasClickedSubmitButton() throws InterruptedException {
        Thread.sleep(5000);
        page.ClickCtaSubmit();
    }

    @Then("The user will proceed to email verification")
    public void theUserWillProceedToEmailVerification() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Email verification sent!");
    }



    //EMAIL VERIFICATION
    @When("The user has checked the email inbox using email address {string}")
    public void theUserHasCheckedTheEmailInbox(String currentEmailAddress) throws Throwable {
        currentEmailAddress = page.currentEmailAddress;
        System.out.println("Mailinator Current Email Address: " + currentEmailAddress);
        nav.theUserProceedsToTheMailinator();
        page.NavigateToMailinatorInbox();
    }

    @Then("The user should receive a verification email from Knit")
    public void theUserShouldReceiveAVerificationEmailFromKnit() throws InterruptedException {
        page.EmailVerification();
    }

    //Entered Empty Email Address
    @When("The user has entered empty email address {string} for sign up")
    public void theUserHasEnteredEmptyEmailAddressForSignup(String emailAddress) {
        page.EnterEmptyEmailAddress(emailAddress);
    }

    @Then("The user should shown an error message, {string} for the empty email")
    public void theUserShouldShownAnErrorMessageForTheEmptyEmail(String actualEmailAddress) {
        page.EmptyEmailAddress(actualEmailAddress);
    }


    //Entered Invalid Email Format
    @When("The user has entered the invalid email address format {string} for sign up")
    public void theUserHasEnteredTheInvalidEmailAddressFormatForSignup(String emailAddress) {
        page.EnterInvalidEmailAddressFormat(emailAddress);
    }
    @Then("The user should shown an error message, {string} for the missing @ symbol")
    public void theUserShouldShownAnErrorMessageForTheMissingSymbol(String actualEmailAddress) {
        page.MissingAtSymbol(actualEmailAddress);
    }

    //Entered Existing Email Address
    @When("The user has entered an existing email address {string} for sign up")
    public void the_user_has_entered_an_existing_email_address_for_sign_up(String emailAddress) {
        //currentEmailAddress = page.currentEmailAddress;
        //System.out.println("Current Email Address: " + currentEmailAddress);
        page.EnterExistingEmailAddress(emailAddress);
    }

    @Then("The user should shown an error message, {string} for the existing email address")
    public void theUserShouldShownAnErrorMessageForTheExistingEmailAddress(String actualEmailAddress) throws InterruptedException {
        page.ExistingEmailAddress(actualEmailAddress);
    }


    //SIGN UP VIA GOOGLE

    @When("The user has clicked on Continue With Google")
    public void theUserHasClickedOnContinueWithGoogle() {
        page.ContinueWithGoogle();
    }

    @And("The user has logged in Google email address {string} and password {string} for sign up")
    public void theUserHasLoggedInGoogleEmailAddressAndPassword(String emailAddress, String password) throws InterruptedException{
        page.LoginGoogle(emailAddress, password);
    }
    @Then("The user is redirected to the Knit dashboard from Google")
    public void theUserIsRedirectedToTheKnitDashboardFromGoogle() throws InterruptedException {
        page.VerifyNewGoogleSignUpPageRedirection();
    }

    @Then("The user is redirected to the Knit dashboard from Facebook")
    public void theUserIsRedirectedToTheKnitDashboardFromFacebook() throws InterruptedException {
        page.VerifyNewFacebookSignUpPageRedirection();
    }

    //SIGN UP VIA FACEBOOK
    @When("The user has clicked on Continue With Facebook")
    public void theUserHasClickedOnContinueWithFacebook() {
        page.ContinueWithFacebook();
    }

    @And("The user has logged in Facebook email address {string} and password {string} for sign up")
    public void theUserHasLoggedInFacebookEmailAddressAndPassword(String emailAddress, String password) throws InterruptedException {
        page.LoginFacebook(emailAddress, password);
    }
}
