package pages.signup;

import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Base.BaseUtil;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class signUp extends BaseUtil{
    public signUp(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String currentEmailAddress;
    public String expectedErrorMessage;
    public String actualCurrentURL;
    public String expectedURL;

    //<------------------------------------PAGE OBJECTS: Sign Up via Email---------------------------------------->
    @FindBy(how = How.LINK_TEXT, using = "Create Account")
    public WebElement ctaCreateAccount;

    @FindBy(how = How.ID, using = "email")
    public WebElement tfEmailAddress;

    @FindBy(how = How.CLASS_NAME, using = "Btn--success")
    public WebElement ctaNext;

    @FindBy(how = How.ID, using = "password")
    public WebElement tfPassword;

    @FindBy(how = How.CLASS_NAME, using = "Checkbox-button")
    public WebElement cbTermsAndPolicy;

    @FindBy(how = How.XPATH, using = "//span[@id='recaptcha-anchor']/div[1]")
    public  WebElement helperIFrame;

    @FindBy(how = How.XPATH, using = "span#recaptcha-anchor > div:nth-of-type(1)")
    public WebElement cbRecaptcha;

    @FindBy(how = How.CSS, using = ".Form > .Btn.Btn--expanded.Btn--success")
    public WebElement ctaSubmit;

    //<--------------------------------------PAGE OBJECTS: Error Messages----------------------------------------->
    @FindBy(how = How.CSS, using = ".Field-message")
    public WebElement emBlankEmail;

    @FindBy(how = How.CSS, using = ".Field-message")
    public WebElement emMissingAtSymbol;

    @FindBy(how = How.CSS, using = ".Field-message")
    public WebElement emExistingEmailAddress;

    //<--------------------------------------PAGE OBJECTS: Mailinator----------------------------------------->
    @FindBy(how = How.CSS, using = "input#search")
    public WebElement tfMailinatorSearchInbox;

    @FindBy(how = How.CSS, using = "button[value='Search for public inbox for free']")
    public WebElement ctaMailinatorSearch;

    @FindBy(how = How.CSS, using = ".ng-scope > td:nth-of-type(3)")
    public WebElement ltEmailSubject;

    @FindBy(how = How.LINK_TEXT, using = "Click here to verify your email address.")
    public WebElement ltVerifyEmail;

    //<-------------------------------------PAGE OBJECTS: Sign Up Via Google------------------------------------>

    @FindBy(how = How.CSS, using = ".section > button:nth-of-type(1)")
    public WebElement ctaContinueWithGoogle;

    @FindBy(how = How.CSS, using = "input#identifierId")
    public WebElement tfGoogleEmailAddress;

    @FindBy(how = How.CSS, using = "#identifierNext .VfPpkd-vQzf8d")
    public WebElement ctaGoogleNext;

    @FindBy(how = How.CSS, using = "input[name='password']")
    public WebElement tfGooglePassword;

    @FindBy(how = How.CSS, using = "#passwordNext .VfPpkd-vQzf8d")
    public WebElement ctaGoogleLogin;
    //<-------------------------------------PAGE OBJECTS: Sign Up Via Facebook------------------------------------>

    @FindBy(how = How.CSS, using = ".section > button:nth-of-type(2)")
    public WebElement ctaContinueWithFacebook;

    @FindBy(how = How.ID, using = "email")
    public WebElement tfFacebookEmailAddress;

    /*@FindBy(how = How.CSS, using = "#identifierNext .VfPpkd-vQzf8d")
    public WebElement ctaGoogleNext;*/

    @FindBy(how = How.ID, using = "pass")
    public WebElement tfFacebookPassword;

    @FindBy(how = How.NAME, using = "login")
    public WebElement ctaFacebookLogin;


    //METHODS
    public void GoToSignUp(){
        ctaCreateAccount.click();
    }

    //<--------------------------------------SIGN UP VIA EMAIL: Successful Sign Up----------------------------------------->
    public void EnterEmailAddress(String emailAddress){

        //generate unique email address in the format emailAddress.datetime
        var currentDate = new Date();
        var datetime = + currentDate.getDate() + "-"
                + (currentDate.getMonth()+1)  + "-"
                + currentDate.getYear() + "-"
                + currentDate.getHours() + "-"
                + currentDate.getMinutes() + "-"
                + currentDate.getSeconds();

        currentEmailAddress = emailAddress+datetime+"@mailinator.com";
        tfEmailAddress.sendKeys((CharSequence) currentEmailAddress);
        System.out.println("Current Email Address: " + currentEmailAddress);
    }

    public void ClickCtaNext(){
        ctaNext.click();
    }

    public void EnterPassword(String passWord) throws InterruptedException {
        Thread.sleep(3500);
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        //generate unique password in the format pw.datetime
        var currentDate = new Date();
        var datetime = + currentDate.getDate() + "-"
                + (currentDate.getMonth()+1)  + "-"
                + currentDate.getYear() + "-"
                + currentDate.getHours() + "-"
                + currentDate.getMinutes() + "-"
                + currentDate.getSeconds();

        tfPassword.sendKeys((CharSequence) passWord+datetime);
        System.out.println("Password: " + passWord+datetime);
    }

    public void ClickCbTermsAndPolicy(){
        cbTermsAndPolicy.click();
    }

    public void ClickCbRecaptcha() throws InterruptedException {

        //Switching to iframe 0
        Driver.switchTo().frame(0);
        //Clicking the recaptcha
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10000));
        cbRecaptcha = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span#recaptcha-anchor > div:nth-of-type(1)")));
        cbRecaptcha.click();
        Thread.sleep(10000);

        //Switch back to main web page
        Driver.switchTo().defaultContent();
    }

    public void ClickCtaSubmit(){
        ctaSubmit.click();
    }

    //TO DO: Think of ways to call CreateAccount() passing two params as well in gherkin but still reusable
    /*public void CreateAccount(String emailAddress, String passWord) throws InterruptedException {
        EnterEmailAddress(emailAddress);
        ClickCtaNext();
        EnterPassword(passWord);
        ClickCbTermsAndPolicy();
        ClickCbRecaptcha();
        ClickCtaSubmit();
    }*/

    //Refactor this. Should come from NavigationDefinition?
    //Navigating to mailinator inbox for the auto-generated email address
    public void NavigateToMailinatorInbox() throws InterruptedException {
        tfMailinatorSearchInbox.sendKeys(currentEmailAddress);
        ctaMailinatorSearch.click();
        Thread.sleep(5000);
    }

    //<-------------------------------------START: Email Verification--------------------------------------------->
    public void EmailVerification() throws InterruptedException {
        ltEmailSubject.click();
        Thread.sleep(3000);

        //DEBUG: Finding all iframe tags on a web page
        List<WebElement> elements = Driver.findElements(By.tagName("iframe"));
        int numberOfTags = elements.size();
        System.out.println("No. of Iframes on Mailinator are: " + numberOfTags);

        //Switching to iframe 0
        Driver.switchTo().frame(0);

        ltVerifyEmail.click();
        Thread.sleep(3000);

        //Switch back to main web page
        Driver.switchTo().defaultContent();
    }

    //<--------------------------------------SIGN UP VIA EMAIL: Unsuccessful Sign Up----------------------------------------->
    public void EmptyEmailAddress(String actualErrorMessage) {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        emBlankEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Field-message")));
        actualErrorMessage = emBlankEmail.getText();
        expectedErrorMessage = "Please enter your email.";
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    public void MissingAtSymbol(String actualErrorMessage){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        emMissingAtSymbol = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Field-message")));
        actualErrorMessage = emMissingAtSymbol.getText();
        expectedErrorMessage = "Please enter a valid email.";
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    public void ExistingEmailAddress(String actualErrorMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        emExistingEmailAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Field-message")));
        actualErrorMessage = emExistingEmailAddress.getText();
        expectedErrorMessage = "This email is already taken. Login.";
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    public void EnterEmptyEmailAddress(String emailAddress){
        tfEmailAddress.sendKeys((CharSequence) emailAddress);
        System.out.println("Current Email Address: " + emailAddress);
    }

    public void EnterInvalidEmailAddressFormat(String emailAddress){
        tfEmailAddress.sendKeys((CharSequence) emailAddress);
        System.out.println("Current Email Address: " + emailAddress);
    }

    public void EnterExistingEmailAddress(String emailAddress){
        tfEmailAddress.sendKeys(emailAddress);
    }
    //<--------------------------------------SIGN UP VIA GOOGLE: Successful Sign Up----------------------------------------->

    public void ContinueWithGoogle(){
        ctaContinueWithGoogle.click();
    }

    //Switching to Google Login Window
    public void SwitchToGoogleWindow(){
        //GetParentWindow();
        //Getting all windows
        Set<String> allWindows =  Driver.getWindowHandles();

        //Getting all elements inside the set
        Iterator<String> iterator = allWindows.iterator();

        String parentWindow = iterator.next(); //Knit
        System.out.println(parentWindow);
        String childWindow = iterator.next(); //Google window
        System.out.println(childWindow);

        Driver.switchTo().window(childWindow);
    }

    //Getting the Current Window: Knit
    public void GetParentWindow(){
        //Getting all windows
        Set<String> allWindows =  Driver.getWindowHandles();

        //Getting all elements inside the set
        Iterator<String> iterator = allWindows.iterator();

        String parentWindow = iterator.next(); //Knit
        System.out.println(parentWindow);
        /*String childWindow = iterator.next(); // Google or Facebook window
        System.out.println(childWindow);*/

        Driver.switchTo().window(parentWindow);
    }
    public void EnterGoogleEmailAddress(String emailAddress){
        SwitchToGoogleWindow();
        tfGoogleEmailAddress.sendKeys((CharSequence) emailAddress);
        System.out.println("Google Email Address: " + emailAddress);
        ctaGoogleNext.click();
    }

    public void EnterGooglePassword(String password) throws InterruptedException {
        Thread.sleep(2000);
        SwitchToGoogleWindow();
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfGooglePassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='password']")));
        tfGooglePassword.sendKeys((CharSequence) password);
    }

    public void ClickGoogleLogin() throws InterruptedException {
        Thread.sleep(1000);
        ctaGoogleLogin.click();
    }

    public void LoginGoogle(String emailAddress, String password) throws InterruptedException {
        EnterGoogleEmailAddress(emailAddress);
        EnterGooglePassword(password);
        ClickGoogleLogin();
        Thread.sleep(8000); //For Login 2FA
    }
    public void VerifyNewGoogleSignUpPageRedirection() throws InterruptedException {
        GetParentWindow();
        Thread.sleep(10000); // Waiting for Knit Dashboard to load
        actualCurrentURL = Driver.getCurrentUrl();
        System.out.println("Current URL: " + actualCurrentURL);
        //TO DO: Refactor this to a page to list all the expected URLs
        expectedURL = "https://play.idealforliving.com/"; //Confirm if the redirection is at / or /dashboard
        assertEquals(expectedURL, actualCurrentURL);
    }

    //<--------------------------------------SIGN UP VIA FACEBOOK: Successful Sign Up----------------------------------------->

    public void ContinueWithFacebook(){
        ctaContinueWithFacebook.click();
    }

    //Switching to Facebook Login Window
    public void SwitchToFacebookWindow(){
        //Getting all windows
        Set<String> allWindows =  Driver.getWindowHandles();

        //Getting all elements inside the set
        Iterator<String> iterator = allWindows.iterator();

        String parentWindow = iterator.next(); //Knit
        System.out.println(parentWindow);
        String childWindow = iterator.next(); //Google window
        System.out.println(childWindow);

        Driver.switchTo().window(childWindow);
    }

    public void VerifyNewFacebookSignUpPageRedirection() throws InterruptedException {
        GetParentWindow();
        Thread.sleep(10000); // Waiting for Knit Dashboard to load
        actualCurrentURL = Driver.getCurrentUrl();
        System.out.println("Current URL: " + actualCurrentURL);
        //TO DO: Refactor this to a page to list all the expected URLs
        expectedURL = "https://play.idealforliving.com/"; //Confirm if the redirection is at / or /dashboard
        assertEquals(expectedURL, actualCurrentURL);
    }
    public void EnterFacebookEmailAddress(String emailAddress){
        SwitchToFacebookWindow();
        tfFacebookEmailAddress.sendKeys((CharSequence) emailAddress);
        System.out.println("Facebook Email Address: " + emailAddress);
    }

    public void EnterFacebookPassword(String password) throws InterruptedException {
        Thread.sleep(2000);
        SwitchToFacebookWindow();
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfFacebookPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
        tfFacebookPassword.sendKeys((CharSequence) password);
    }

    public void ClickFacebookLogin() throws InterruptedException {
        Thread.sleep(1000);
        ctaFacebookLogin.click();
    }

    public void LoginFacebook(String emailAddress, String password) throws InterruptedException {
        EnterFacebookEmailAddress(emailAddress);
        EnterFacebookPassword(password);
        ClickFacebookLogin();
        Thread.sleep(5000); //For Login 2FA
    }
}
