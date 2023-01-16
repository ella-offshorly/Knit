package pages.createProject;

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

public class createProject extends BaseUtil {

    public String knitProjectName;
    public createProject(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "[data-target] .img-fluid")
    public WebElement ctaStartFromScratch;

    @FindBy(how = How.CSS, using = "[placeholder='Enter Project Name']")
    public WebElement tfProjectName;

    @FindBy(how = How.CSS, using = "[type='submit']")
    public WebElement ctaCreateProject;

    @FindBy(how = How.CSS, using = ".TypeBtn.TypeBtn--icon")
    public WebElement ctaAddMoreDetails;

    @FindBy(how = How.CSS, using = "textarea#description")
    public WebElement tfDescription;

    @FindBy(how = How.CSS, using = ".Input.Input--addon > input#name")
    public WebElement tfDueDate;

    @FindBy(how = How.XPATH, using = "//div[@id='app']/div/div[@class='container-fluid container-leftOffset content-fill']/div[@class='Callout Callout--ghost Callout--glassy MainContent content-fill']/div/div[@class='col-sm-grow-1 content-fill']/div[2]/div[@class='Modal Modal--center']//div[@class='Modal-body content-fill is-scrollable-y']/div/div[1]//form[@class='Form ProjectCreateForm']/div[@class='Field priorityField']/div[@class='Field-control']/div/div[3]/div[@class='Radio Radio--widget']/label")
    public WebElement ctaPriority;

    @FindBy(how = How.CSS, using = ".ti-new-tag-input.ti-valid")
    public WebElement tfTag;

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


    //Create Project
    public void ClickCtaStartFromScratch() throws InterruptedException {
        Thread.sleep(3500);
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaStartFromScratch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-target] .img-fluid")));
        ctaStartFromScratch.click();
    }

    public void EnterUniqueProjectName(String projectName) throws InterruptedException {

        //generate unique project name in the format testKnitProject.datetime
        var currentDate = new Date();
        var datetime = + currentDate.getDate() + "-"
                + (currentDate.getMonth()+1)  + "-"
                + currentDate.getYear() + "-"
                + currentDate.getHours() + "-"
                + currentDate.getMinutes() + "-"
                + currentDate.getSeconds();

        knitProjectName = projectName+datetime;
        System.out.println("Current Project Name: " + knitProjectName);
        Thread.sleep(3500);
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfProjectName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder='Enter Project Name']")));
        tfProjectName.sendKeys(knitProjectName);

    }

    public void ClickCtaAddMoreDetails() throws InterruptedException {
        Thread.sleep(3500);
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaAddMoreDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".TypeBtn.TypeBtn--icon")));
        ctaAddMoreDetails.click();
    }

    public void EnterDescription(String description) throws InterruptedException {
        Thread.sleep(3500);
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("textarea#description")));
        tfDescription.sendKeys(description);
    }

    public void EnterDueDate(String dueDate) throws InterruptedException {
        Thread.sleep(3500);
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfDueDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Input.Input--addon > input#name")));
        tfDueDate.sendKeys(dueDate);
    }

    public void ChoosePriority() throws InterruptedException {
        Thread.sleep(3500);
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaPriority = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='app']/div/div[@class='container-fluid container-leftOffset content-fill']/div[@class='Callout Callout--ghost Callout--glassy MainContent content-fill']/div/div[@class='col-sm-grow-1 content-fill']/div[2]/div[@class='Modal Modal--center']//div[@class='Modal-body content-fill is-scrollable-y']/div/div[1]//form[@class='Form ProjectCreateForm']/div[@class='Field priorityField']/div[@class='Field-control']/div/div[3]/div[@class='Radio Radio--widget']/label")));
        ctaPriority.click();
    }

    public void EnterTag(String tag) throws InterruptedException {
        Thread.sleep(3500);
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfTag = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ti-new-tag-input.ti-valid")));
        tfTag.sendKeys(tag);
    }

    public void ClickCtaCreateProject() throws InterruptedException {
        Thread.sleep(3500);
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaCreateProject = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='submit']")));
        ctaCreateProject.click();
    }
}
