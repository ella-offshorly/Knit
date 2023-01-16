package pages.login;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class login extends BaseUtil{

        public login(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
        public String currentEmailAddress;
        public String expectedErrorMessage;
        public String actualCurrentURL;
        public String expectedURL;

        //<------------------------------------PAGE OBJECTS: Login via Email---------------------------------------->
        @FindBy(how = How.LINK_TEXT, using = "Login")
        public WebElement ctaLogin;

        @FindBy(how = How.ID, using = "email")
        public WebElement tfEmailAddress;

        @FindBy(how = How.CLASS_NAME, using = "Btn--success")
        public WebElement ctaNext;

        @FindBy(how = How.ID, using = "password")
        public WebElement tfPassword;
        @FindBy(how = How.CSS, using = ".Form > .Btn.Btn--expanded.Btn--success")
        public WebElement ctaSubmit;

        //<--------------------------------------PAGE OBJECTS: Error Messages----------------------------------------->
        @FindBy(how = How.CSS, using = ".Field-message")
        public WebElement emBlankEmail;

        @FindBy(how = How.CSS, using = ".Field-message")
        public WebElement emMissingAtSymbol;

        @FindBy(how = How.CSS, using = ".Field-message")
        public WebElement emUnregisteredEmailAddress;


        //<-------------------------------------PAGE OBJECTS: Login Via Google------------------------------------>

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
        //<-------------------------------------PAGE OBJECTS: Login Via Facebook------------------------------------>

        @FindBy(how = How.CSS, using = ".section > button:nth-of-type(2)")
        public WebElement ctaContinueWithFacebook;

        @FindBy(how = How.ID, using = "email")
        public WebElement tfFacebookEmailAddress;

        @FindBy(how = How.ID, using = "pass")
        public WebElement tfFacebookPassword;

        @FindBy(how = How.NAME, using = "login")
        public WebElement ctaFacebookLogin;


        //METHODS
        //<--------------------------------------LOGIN VIA EMAIL: Successful Login----------------------------------------->
        public void EnterEmailAddress(String emailAddress) throws InterruptedException {
            Thread.sleep(3500);
            WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
            tfEmailAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            tfEmailAddress.sendKeys((CharSequence) emailAddress);
            System.out.println("Current Email Address: " + emailAddress);
        }

        public void ClickCtaNext(){
            ctaNext.click();
        }

        public void EnterPassword(String passWord) throws InterruptedException {
            Thread.sleep(3500);
            WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
            tfPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            tfPassword.sendKeys((CharSequence) passWord);
        }

        public void ClickCtaSubmit(){
            ctaSubmit.click();
        }


        //<--------------------------------------LOGIN VIA EMAIL: Unsuccessful Login----------------------------------------->
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

        public void UnregisteredEmailAddress(String actualErrorMessage) throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
            emUnregisteredEmailAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Field-message")));
            actualErrorMessage = emUnregisteredEmailAddress.getText();
            expectedErrorMessage = "We couldn't find this username. Sign up now.";
            assertEquals(expectedErrorMessage, actualErrorMessage);
        }

        public void EnterEmptyEmailAddress(String emailAddress){
            tfEmailAddress.sendKeys((CharSequence) emailAddress);
            System.out.println("Current Email Address: " + emailAddress);
        }

        public void EnterInvalidEmailAddressFormat(String emailAddress){
            WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
            tfEmailAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            tfEmailAddress.sendKeys((CharSequence) emailAddress);
            System.out.println("Current Email Address: " + emailAddress);
        }

        public void EnterUnregisteredEmailAddress(String emailAddress){
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
        //<--------------------------------------LOGIN VIA GOOGLE: Successful Login----------------------------------------->

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
            /*String childWindow = iterator.next(); //Google window
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
        public void VerifyNewLoginPageRedirectionSSO() throws InterruptedException {
            GetParentWindow();
            Thread.sleep(10000); // Waiting for Knit Dashboard to load
            actualCurrentURL = Driver.getCurrentUrl();
            System.out.println("Current URL: " + actualCurrentURL);
            //TO DO: Refactor this to a page to list all the expected URLs
            expectedURL = "https://play.idealforliving.com/"; //Confirm if the redirection is at / or /dashboard
            assertEquals(expectedURL, actualCurrentURL);
        }
        public void VerifyNewLoginPageRedirection() throws InterruptedException {
        Thread.sleep(10000); // Waiting for Knit Dashboard to load
        actualCurrentURL = Driver.getCurrentUrl();
        System.out.println("Current URL: " + actualCurrentURL);
        //TO DO: Refactor this to a page to list all the expected URLs
        expectedURL = "https://play.idealforliving.com/"; //Confirm if the redirection is at / or /dashboard
        assertEquals(expectedURL, actualCurrentURL);
    }

        //<--------------------------------------LOGIN VIA FACEBOOK: Successful Login----------------------------------------->

        public void ContinueWithFacebook(){
            ctaContinueWithFacebook.click();
        }

        //Switching to Google Login Window
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
