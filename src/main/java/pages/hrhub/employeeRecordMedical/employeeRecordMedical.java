package pages.hrhub.employeeRecordMedical;

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

public class employeeRecordMedical extends BaseUtil {

    public String actualTh, actualTl, actualTlv, actualTf;
    public String expectedTh, expectedTl, expectedTlv, expectedTf;

public employeeRecordMedical(WebDriver driver){
    PageFactory.initElements(driver, this);
}

//Legend
    //th: Text Headers
    //tl: Text Label
    //tlv: Text Label Value
    //tf: Text Field
    //cta: Button

//Headers
@FindBy(how = How.CSS, using = ".capitalize.fs-lg.fw-semi-bold.primary-font")
    public WebElement thMedicalProfile;

//Health Clearance
@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlHealthClearance1;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvHealthClearance1;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlEffectiveDate;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvEffectiveDate;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlNotify;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")
    public  WebElement tlvNotify;

//Verify Medical Profile Section
    public void verifyThMedicalProfile(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thMedicalProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(1)")));
        actualTh = thMedicalProfile.getText();
        expectedTh = "Medical Profile:";
        assertEquals(expectedTh, actualTh);
    }
    public void verifyTlMedicalProfile() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlHealthClearance1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlHealthClearance1.getText();
        expectedTl = "Health Clearance 1";
        assertEquals(expectedTl, actualTl);

        tlEffectiveDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlEffectiveDate.getText();
        expectedTl = "Effective Date";
        assertEquals(expectedTl, actualTl);

        tlNotify = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlNotify.getText();
        expectedTl = "Notify";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvMedicalProfile() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvHealthClearance1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvHealthClearance1.getText();
        expectedTlv = "Passed";
        assertEquals(expectedTlv, actualTlv);

        tlvEffectiveDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvEffectiveDate.getText();
        expectedTlv = "2022-12-14";
        assertEquals(expectedTlv, actualTlv);

        tlvNotify = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvNotify.getText();
        expectedTlv = "N/A";
        assertEquals(expectedTlv, actualTlv);
    }
}
