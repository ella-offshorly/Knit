package pages.hrhub.employeeRecordContact;

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

import static org.junit.Assert.assertEquals;

public class employeeRecordContact extends BaseUtil {

    public String actualTh, actualTl, actualTlv, actualTf, actualErrorMessage;
    public String expectedTh, expectedTl, expectedTlv, expectedTf, expectedErrorMessage;

public employeeRecordContact(WebDriver driver){
    PageFactory.initElements(driver, this);
}

//Legend
    //th: Text Headers
    //tl: Text Label
    //tlv: Text Label Value
    //tf: Text Field
    //cta: Button

//Headers
@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(1)")
    public WebElement thCurrentAddress;

@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(2)")
    public WebElement thPhoneNumber;

@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(3)")
    public WebElement thEmailAddress;

@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(4)")
    public WebElement thSocialMedia;

//Current Address
@FindBy(how = How.CSS, using = ".DataInfoText-container.col-md-8 .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlNoStreet;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .capitalize")
    public  WebElement tlvNoStreet;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .capitalize")
    public WebElement tlCity;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .fw-bold")
    public  WebElement tlvCity;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-6 DataInfoText-container']:nth-of-type(3) .capitalize")
    public WebElement tlCountry;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-6 DataInfoText-container']:nth-of-type(3) .fw-bold")
    public  WebElement tlvCountry;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-6 DataInfoText-container']:nth-of-type(4) .capitalize")
    public WebElement tlZipcode;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-6 DataInfoText-container']:nth-of-type(4) .fw-bold")
    public  WebElement tlvZipcode;

//Phone Number
@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlMobilePhoneNumber;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvMobilePhoneNumber;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlHomePhoneNumber;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvHomePhoneNumber;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlWorkPhoneNumber;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvWorkPhoneNumber;

//Email Address
@FindBy(how = How.CSS, using = ".Callout.Callout--primary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")
public WebElement tlWorkEmail;

@FindBy(how = How.CSS, using = ".Callout.Callout--primary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvWorkEmail;

@FindBy(how = How.CSS, using = ".Callout.Callout--primary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlPersonalEmail;

@FindBy(how = How.CSS, using = ".Callout.Callout--primary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvPersonalEmail;

//Social Media
@FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")
public WebElement tlSkype;

@FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvSkype;

@FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlFacebook;

@FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvFacebook;

@FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlInstagram;

@FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvInstagram;

@FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlLinkedIn;

@FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvLinkedIn;

@FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlTwitter;

@FindBy(how = How.CSS, using = "div:nth-of-type(5) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvTwitter;

//<-----------------------------------------------Page Objects: Current Address---------------------------------------->
    @FindBy(how = How.CSS, using = "input#currentHouseNumber")
    public WebElement tfCurrentHouseNumber;

    @FindBy(how = How.CSS, using = ".Field-message")
    public WebElement errMsgCurrentHouseNumber;

    @FindBy(how = How.CSS, using = "input#currentStreet")
    public WebElement tfCurrentStreet;

    @FindBy(how = How.CSS, using = "input#town")
    public WebElement tfCurremtTown;

    @FindBy(how = How.CSS, using = "input#currentCity")
    public WebElement tfCurrentCity;

    @FindBy(how = How.CSS, using = ".Callout.Callout--noPadding.Callout--primary.EditEmployeeForm > .EditEmployeeForm-section > .EditEmployeeForm-content.noGutters.row.row-range-12 > div:nth-of-type(5) > .Field > .Field-control > .Drop.Drop--expanded  input")
    public WebElement tfCurrentCountry;

    @FindBy(how = How.CSS, using = "input#currentZipCode")
    public WebElement tfCurrentZipcode;

    //<-----------------------------------------------Page Objects: Permanent Address---------------------------------------->
    @FindBy(how = How.CSS, using = "input#permanentHouseNumber")
    public WebElement tfPermanentHouseNumber;

    @FindBy(how = How.CSS, using = "input#permanentStreet")
    public WebElement tfPermanentStreet;

    @FindBy(how = How.CSS, using = "input#permanentTown")
    public WebElement tfPermanentTown;

    @FindBy(how = How.CSS, using = "input#permanentCity")
    public WebElement tfPermanentCity;

    @FindBy(how = How.CSS, using = ".Callout.Callout--attention.Callout--noPadding.EditEmployeeForm > .EditEmployeeForm-section > .EditEmployeeForm-content.noGutters.row.row-range-12 > div:nth-of-type(5) > .Field > .Field-control > .Drop.Drop--expanded  input")
    public WebElement tfPermanentCountry;

    @FindBy(how = How.CSS, using = "input#permanentZipCode")
    public WebElement tfPermanentZipcode;

    //<-----------------------------------------------Page Objects: Phone Number---------------------------------------->
    @FindBy(how = How.CSS, using = "input#mobile")
    public WebElement tfMobile;

    //<-----------------------------------------------Page Objects: Other Contact Numbers---------------------------------------->
    @FindBy(how = How.CSS, using = "input#workPhone")
    public WebElement tfWorkNumber;

    @FindBy(how = How.CSS, using = "input#home")
    public WebElement tfHomeNumber;

    //<-----------------------------------------------Page Objects: Email Address---------------------------------------->
    @FindBy(how = How.CSS, using = "input#emailWork")
    public WebElement tfWorkEmail;

    @FindBy(how = How.CSS, using = "input#emailPersonal")
    public WebElement tfPersonalEmail;

    //<-----------------------------------------------Page Objects: Social Media---------------------------------------->
    @FindBy(how = How.CSS, using = "input#skype")
    public WebElement tfSkype;

    @FindBy(how = How.CSS, using = "input#facebook")
    public WebElement tfFacebook;

    @FindBy(how = How.CSS, using = "input#instagram")
    public WebElement tfInstagram;

    @FindBy(how = How.CSS, using = "input#linkedIn")
    public WebElement tfLinkedIn;

    @FindBy(how = How.CSS, using = "input#twitter")
    public WebElement tfTwitter;

    //<-----------------------------------------------Methods: Current Address------------------------------------------------------>
    public void inputBlankHouseNumber(String blank) {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCurrentHouseNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        tfCurrentHouseNumber.sendKeys(blank);
    }
    public void verifyErrMsgCurrentHouseNumber(){
        actualErrorMessage = errMsgCurrentHouseNumber.getText();
        expectedErrorMessage = "Please enter House Number";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    //<----------------------------------------------Methods: Permanent Address--------------------------------------------------->
//Verify Current Address Section
    public void verifyThCurrentAddress(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thCurrentAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(1)")));
        actualTh = thCurrentAddress.getText();
        expectedTh = "Current Address:";
        assertEquals(expectedTh, actualTh);
    }
    public void verifyTlCurrentAddress() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlNoStreet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlNoStreet.getText();
        expectedTl = "No Street";
        assertEquals(expectedTl, actualTl);

        tlCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlCity.getText();
        expectedTl = "City";
        assertEquals(expectedTl, actualTl);

        tlCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlCountry.getText();
        expectedTl = "Country";
        assertEquals(expectedTl, actualTl);

        tlZipcode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlZipcode.getText();
        expectedTl = "Zip Code";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvCurrentAddress() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvNoStreet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvNoStreet.getText();
        expectedTlv = "Cerritos";
        assertEquals(expectedTlv, actualTlv);

        tlvCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvCity.getText();
        expectedTlv = "Lipa";
        assertEquals(expectedTlv, actualTlv);

        tlvCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvCountry.getText();
        expectedTlv = "Philippines";
        assertEquals(expectedTlv, actualTlv);

        tlvZipcode = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvZipcode.getText();
        expectedTlv = "4217";
        assertEquals(expectedTlv, actualTlv);
    }

//Verify Phone Number Section
    public void verifyThPhoneNumber(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thPhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(2)")));
        actualTh = thPhoneNumber.getText();
        expectedTh = "Phone Number:";
        assertEquals(expectedTh, actualTh);
    }

    public void verifyTlPhoneNumber() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlMobilePhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlMobilePhoneNumber.getText();
        expectedTl = "Mobile Phone Number";
        assertEquals(expectedTl, actualTl);

        tlHomePhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlHomePhoneNumber.getText();
        expectedTl = "Home Phone Number";
        assertEquals(expectedTl, actualTl);

        tlWorkPhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlWorkPhoneNumber.getText();
        expectedTl = "Work Phone Number";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvPhoneNumber() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvMobilePhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvMobilePhoneNumber.getText();
        expectedTl = "09694465787";
        assertEquals(expectedTl, actualTl);

        tlvHomePhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvHomePhoneNumber.getText();
        expectedTl = "0437571234";
        assertEquals(expectedTl, actualTl);

        tlvWorkPhoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvWorkPhoneNumber.getText();
        expectedTl = "09694465787";
        assertEquals(expectedTl, actualTl);
    }

//Verify Email Address Section
    public void verifyThEmailAddress(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thEmailAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(3)")));
        actualTh = thEmailAddress.getText();
        expectedTh = "Email Address:";
        assertEquals(expectedTh, actualTh);
    }

    public void verifyTlEmailAddress() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlWorkEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlWorkEmail.getText();
        expectedTl = "Work Email";
        assertEquals(expectedTl, actualTl);

        tlPersonalEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlPersonalEmail.getText();
        expectedTl = "Personal Email";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvEmailAddress() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvWorkEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlvWorkEmail.getText();
        expectedTl = "testella.four@gmail.com";
        assertEquals(expectedTl, actualTl);

        tlvPersonalEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvPersonalEmail.getText();
        expectedTl = "testella.four@gmail.com";
        assertEquals(expectedTl, actualTl);
    }

//Verify Social Media Section
    public void verifyThSocialMedia(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thSocialMedia = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(2)")));
        actualTh = thSocialMedia.getText();
        expectedTh = "Social Media:";
        assertEquals(expectedTh, actualTh);
    }

    public void verifyTlSocialMedia() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlSkype = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(4) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlSkype.getText();
        expectedTl = "Skype";
        assertEquals(expectedTl, actualTl);

        tlFacebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .capitalize")));
        actualTl = tlFacebook.getText();
        expectedTl = "Facebook";
        assertEquals(expectedTl, actualTl);

        tlInstagram = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .capitalize")));
        actualTl = tlInstagram.getText();
        expectedTl = "Instagram";
        assertEquals(expectedTl, actualTl);

        tlLinkedIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .capitalize")));
        actualTl = tlLinkedIn.getText();
        expectedTl = "Linkedin";
        assertEquals(expectedTl, actualTl);

        tlTwitter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .capitalize")));
        actualTl = tlTwitter.getText();
        expectedTl = "Twitter";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvSocialMedia() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvSkype = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(4) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvSkype.getText();
        expectedTl = "N/A";
        assertEquals(expectedTl, actualTl);

        tlvFacebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .fw-bold")));
        actualTl = tlvFacebook.getText();
        expectedTl = "N/A";
        assertEquals(expectedTl, actualTl);

        tlvInstagram = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .fw-bold")));
        actualTl = tlvInstagram.getText();
        expectedTl = "N/A";
        assertEquals(expectedTl, actualTl);

        tlvLinkedIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .fw-bold")));
        actualTl = tlvLinkedIn.getText();
        expectedTl = "N/A";
        assertEquals(expectedTl, actualTl);

        tlvTwitter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .fw-bold")));
        actualTl = tlvTwitter.getText();
        expectedTl = "N/A";
        assertEquals(expectedTl, actualTl);
    }
}
