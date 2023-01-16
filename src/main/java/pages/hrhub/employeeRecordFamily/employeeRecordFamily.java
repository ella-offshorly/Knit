package pages.hrhub.employeeRecordFamily;

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

public class employeeRecordFamily extends BaseUtil {

    public String actualTh, actualTl, actualTlv, actualTf;
    public String expectedTh, expectedTl, expectedTlv, expectedTf;

public employeeRecordFamily(WebDriver driver){
    PageFactory.initElements(driver, this);
}

//Legend
    //th: Text Headers
    //tl: Text Label
    //tlv: Text Label Value
    //tf: Text Field
    //cta: Button

//Headers
@FindBy(how = How.CSS, using = ".capitalize.heading-3")
    public WebElement thMothersName;

//Name
@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlFirstName;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvFirstName;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlMiddleName;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvMiddleName;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlLastName;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvLastName;

@FindBy(how = How.CSS, using = "div:nth-of-type(4) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlSuffix;

@FindBy(how = How.CSS, using = "div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvSuffix;

//Gender
@FindBy(how = How.CSS, using = "div:nth-of-type(5) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlGender;

@FindBy(how = How.CSS, using = "div:nth-of-type(5) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvGender;

//Date of Birth
@FindBy(how = How.CSS, using = "div:nth-of-type(6) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlDateOfBirth;

@FindBy(how = How.CSS, using = "div:nth-of-type(6) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvDateOfBirth;

//Age
@FindBy(how = How.CSS, using = "div:nth-of-type(7) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlAge;

@FindBy(how = How.CSS, using = "div:nth-of-type(7) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvAge;

//Phone Number
@FindBy(how = How.CSS, using = "div:nth-of-type(8) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlPhoneNumber;

@FindBy(how = How.CSS, using = "div:nth-of-type(8) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvPhoneNumber;

//Verify Mother's Name Section
    public void verifyThMothersName(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thMothersName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(1)")));
        actualTh = thMothersName.getText();
        expectedTh = "Parents (Mother’s Name):";
        assertEquals(expectedTh, actualTh);
    }
    public void verifyTlMothersName() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlFirstName.getText();
        expectedTl = "First Name";
        assertEquals(expectedTl, actualTl);

        tlMiddleName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlMiddleName.getText();
        expectedTl = "Middle Name";
        assertEquals(expectedTl, actualTl);

        tlLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlLastName.getText();
        expectedTl = "Last Name";
        assertEquals(expectedTl, actualTl);

        tlSuffix = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlSuffix.getText();
        expectedTl = "Suffix";
        assertEquals(expectedTl, actualTl);

        tlGender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlGender.getText();
        expectedTl = "Gender";
        assertEquals(expectedTl, actualTl);

        tlDateOfBirth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlDateOfBirth.getText();
        expectedTl = "Date Of Birth";
        assertEquals(expectedTl, actualTl);

        tlAge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlAge.getText();
        expectedTl = "Age";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvMothersName() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvFirstName.getText();
        expectedTlv = "Magdalena";
        assertEquals(expectedTlv, actualTlv);

        tlvMiddleName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvMiddleName.getText();
        expectedTlv = "Abalos";
        assertEquals(expectedTlv, actualTlv);

        tlvLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvLastName.getText();
        expectedTlv = "Manimtim";
        assertEquals(expectedTlv, actualTlv);

        tlvSuffix = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvSuffix.getText();
        expectedTlv = "Manimtim";
        assertEquals(expectedTlv, actualTlv);

        tlvGender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvGender.getText();
        expectedTlv = "Female";
        assertEquals(expectedTlv, actualTlv);

        tlvDateOfBirth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvDateOfBirth.getText();
        expectedTlv = "1971-07-06";
        assertEquals(expectedTlv, actualTlv);

        tlvAge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvAge.getText();
        expectedTlv = "51";
        assertEquals(expectedTlv, actualTlv);
    }
}
