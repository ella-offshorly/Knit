package Steps;

import org.openqa.selenium.By;
import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigationStep extends BaseUtil{

    public NavigationStep(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void theUserProceedsToTheSignUpPage() {
        //Commenting this code out assuming that by setting the Test Environment in Background section, the test url is automatically pulled
       Driver.navigate().to("https://play.idealforliving.com/");

        //Clicking "Create Account" in Login Page to redirect to SignUp
       Driver.findElement(By.linkText("Create Account")).click();
    }

    public void theUserProceedsToTheMailinator() {
        //Commenting this code out assuming that by setting the Test Environment in Background section, the test url is automatically pulled
        Driver.navigate().to("https://www.mailinator.com/");

    }

    public void theUserProceedsToTheLoginPage() {
        //Commenting this code out assuming that by setting the Test Environment in Background section, the test url is automatically pulled
        Driver.navigate().to("https://play.idealforliving.com/");
    }

    //Create Project

    public void theUserProceedsToTheCreateProjectsPage(){
        Driver.findElement(By.cssSelector("[title='Projects icon']")).click();
        Driver.findElement(By.cssSelector(".LeftNav-primary li:nth-of-type(2) li:nth-of-type(1) .LeftNav-text")).click();
    }

    //Employee Record
    public void theUserProceedsToTheEmployeeRecordGeneralPage() {
        Driver.findElement(By.cssSelector("span[title='HR Hub icon']")).click();
        Driver.findElement(By.cssSelector("li:nth-of-type(9) > .LeftNav-secondary > li:nth-of-type(3) > .LeftNav-link > .LeftNav-text")).click();
    }

    public void theUserProceedsToEditEmployeeRecordGeneralPage() throws InterruptedException {
        theUserProceedsToTheEmployeeRecordGeneralPage();
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        WebElement editEmployeeRecordIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ActionButton.Btn.Btn--success.capitalize")));
        editEmployeeRecordIcon.click();
    }
    public void theUserProceedsToTheEmployeeRecordContactPage() {
        Driver.findElement(By.cssSelector("span[title='HR Hub icon']")).click();
        Driver.findElement(By.cssSelector("li:nth-of-type(9) > .LeftNav-secondary > li:nth-of-type(3) > .LeftNav-link > .LeftNav-text")).click();
        Driver.findElement(By.cssSelector(".Tab.Tab--sharp > .Tab-menu > li:nth-of-type(2) > .Tab-link")).click();
    }

    public void theUserProceedsToEditEmployeeRecordContactPage() throws InterruptedException {
        theUserProceedsToTheEmployeeRecordGeneralPage();
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        WebElement editEmployeeRecordContact = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Contact")));
        editEmployeeRecordContact.click();
    }

    public void theUserProceedsToTheEmployeeRecordEducationPage() {
        Driver.findElement(By.cssSelector("span[title='HR Hub icon']")).click();
        Driver.findElement(By.cssSelector("li:nth-of-type(9) > .LeftNav-secondary > li:nth-of-type(3) > .LeftNav-link > .LeftNav-text")).click();
        Driver.findElement(By.cssSelector(".Tab.Tab--sharp > .Tab-menu > li:nth-of-type(3) > .Tab-link .Tab-text")).click();
    }

    public void theUserProceedsToTheEmployeeRecordFamilyPage() {
        Driver.findElement(By.cssSelector("span[title='HR Hub icon']")).click();
        Driver.findElement(By.cssSelector("li:nth-of-type(9) > .LeftNav-secondary > li:nth-of-type(3) > .LeftNav-link > .LeftNav-text")).click();
        Driver.findElement(By.cssSelector(".Tab.Tab--sharp > .Tab-menu > li:nth-of-type(4) > .Tab-link .Tab-text")).click();
    }

    public void theUserProceedsToTheEmployeeRecordEmergencyPage() {
        Driver.findElement(By.cssSelector("span[title='HR Hub icon']")).click();
        Driver.findElement(By.cssSelector("li:nth-of-type(9) > .LeftNav-secondary > li:nth-of-type(3) > .LeftNav-link > .LeftNav-text")).click();
        Driver.findElement(By.cssSelector("li:nth-of-type(5) > .Tab-link > .mediaObject")).click();
    }

    public void theUserProceedsToTheEmployeeRecordMedicalPage() {
        Driver.findElement(By.cssSelector("span[title='HR Hub icon']")).click();
        Driver.findElement(By.cssSelector("li:nth-of-type(9) > .LeftNav-secondary > li:nth-of-type(3) > .LeftNav-link > .LeftNav-text")).click();
        Driver.findElement(By.cssSelector("li:nth-of-type(6) > .Tab-link > .mediaObject")).click();
    }

    //<----------------------------------------------------HR Hub: Logging Time----------------------------------------------------------->
    public void theUserProceedsToTheHrHubDashboardPage(){
        Driver.findElement(By.cssSelector("span[title='HR Hub icon']")).click();
    }

    public void theUserProceedsToMyAttendancePage(){
        Driver.findElement(By.cssSelector("li:nth-of-type(4) .middle-sm .capitalize")).click();
    }
}
