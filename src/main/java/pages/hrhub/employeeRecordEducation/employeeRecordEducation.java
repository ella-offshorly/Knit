package pages.hrhub.employeeRecordEducation;

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

public class employeeRecordEducation extends BaseUtil {

    public String actualTh, actualTl, actualTlv, actualTf;
    public String expectedTh, expectedTl, expectedTlv, expectedTf;

public employeeRecordEducation(WebDriver driver){
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
    public WebElement thHighSchool;

@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(2)")
    public WebElement thAdditionalCollege;

//High School
@FindBy(how = How.CSS, using = ".DataInfoText-container.col-md-8 .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlHsInstitution;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .capitalize")
    public  WebElement tlvHsInstitution;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .capitalize")
    public WebElement tlHsYearGraduated;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .fw-bold")
    public  WebElement tlvHsYearGraduated;

//Additional College
@FindBy(how = How.CSS, using = ".DataInfoText-container.col-md-8 .capitalize.fs-xs.fw-normal.primary-font")
public WebElement tlAcInstitution;

    @FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .capitalize")
    public  WebElement tlvAcInstitution;

    @FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .capitalize")
    public WebElement tlAcYearGraduated;

    @FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .fw-bold")
    public  WebElement tlvAcYearGraduated;

    @FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .capitalize")
    public WebElement tlAcCourse;

    @FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(2) [class='col-md-4 DataInfoText-container'] .fw-bold")
    public  WebElement tlvAcCourse;

//Verify High School Section
    public void verifyThHighSchool(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thHighSchool = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(1)")));
        actualTh = thHighSchool.getText();
        expectedTh = "High School:";
        assertEquals(expectedTh, actualTh);
    }
    public void verifyTlHighSchool() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlHsInstitution = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlHsInstitution.getText();
        expectedTl = "Institution";
        assertEquals(expectedTl, actualTl);

        tlHsYearGraduated = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlHsYearGraduated.getText();
        expectedTl = "Year Graduated";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvHighSchool() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvHsInstitution = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvHsInstitution.getText();
        expectedTlv = "N/A";
        assertEquals(expectedTlv, actualTlv);

        tlvHsYearGraduated = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvHsYearGraduated.getText();
        expectedTlv = "N/A";
        assertEquals(expectedTlv, actualTlv);
    }

//Verify Additional College Section
    public void verifyThAdditionalCollege(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thAdditionalCollege = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(2)")));
        actualTh = thAdditionalCollege.getText();
        expectedTh = "Additional College:";
        assertEquals(expectedTh, actualTh);
    }

    public void verifyTlAdditionalCollege() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlAcInstitution = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlAcInstitution.getText();
        expectedTl = "Institution";
        assertEquals(expectedTl, actualTl);

        tlAcYearGraduated = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlAcYearGraduated.getText();
        expectedTl = "Year Graduated";
        assertEquals(expectedTl, actualTl);

        tlAcCourse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlAcCourse.getText();
        expectedTl = "Course";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvAdditionalCollege() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvAcInstitution = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvAcInstitution.getText();
        expectedTl = "DLSL";
        assertEquals(expectedTl, actualTl);

        tlvAcYearGraduated = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvAcYearGraduated.getText();
        expectedTl = "2017-06-14";
        assertEquals(expectedTl, actualTl);

        tlvAcCourse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvAcCourse.getText();
        expectedTl = "BS Computer Science";
        assertEquals(expectedTl, actualTl);
    }
}
