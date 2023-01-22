package pages.hrhub.employeeRecordGeneral;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class employeeRecordGeneral extends BaseUtil {

    public String actualTh, actualTl, actualTlv, actualTf, actualErrorMessage;
    public String expectedTh, expectedTl, expectedTlv, expectedTf, expectedErrorMessage;

public employeeRecordGeneral(WebDriver driver){
    PageFactory.initElements(driver, this);
}

//Legend
    //th: Text Headers
    //tl: Text Label
    //tlv: Text Label Value
    //tf: Text Field
    //dd: DropDown
    //pick: Calendar
    //cta: Button

//Edit
@FindBy(how = How.CSS, using = ".ActionButton.Btn.Btn--success.capitalize")
public WebElement editGeneral;

//Headers
@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(1)")
    public WebElement thName;

@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(2)")
    public WebElement thBirthday;

@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(3)")
    public WebElement thBirthplace;

@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(4)")
    public WebElement thCitizenship;

@FindBy(how = How.CSS, using = ".Field-message")
public WebElement errMsgCitizenship;

@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(5)")
    public WebElement thAdditionalCitizenship;

@FindBy(how = How.CSS, using = ".is-absolute.is-scrollable-y > h3:nth-of-type(6)")
    public WebElement thAdditionalInformation;

//<-----------------------------------------------------Name--------------------------------------------------->
@FindBy(how = How.CSS, using = "input#firstName")
    public WebElement tfFirstName;

@FindBy(how = How.CSS, using = "div:nth-of-type(1) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgFirstName;

@FindBy(how = How.CSS, using = "input#lastName")
    public WebElement tfLastName;
@FindBy(how = How.CSS, using = "div:nth-of-type(2) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgLastName;
@FindBy(how = How.CSS, using = "input#middleName")
    public WebElement tfMiddleName;
@FindBy(how = How.CSS, using = "div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgMiddleName;
@FindBy(how = How.CSS, using = "input#suffix")
    public WebElement tfSuffix;
@FindBy(how = How.CSS, using = "div:nth-of-type(4) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgSuffix;

@FindBy(how = How.CSS, using = "div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlFirstName;

@FindBy(how = How.CSS, using = "div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvFirstName;

@FindBy(how = How.CSS, using = "div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlMiddleName;

@FindBy(how = How.CSS, using = "div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvMiddleName;

@FindBy(how = How.CSS, using = "div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlLastName;

@FindBy(how = How.CSS, using = "div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvLastName;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlSuffix;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public  WebElement tlvSuffix;

//<-----------------------------------------------------Birthday--------------------------------------------------->
@FindBy(how = How.CSS, using = "input#birthdate")
    public WebElement pickBirthdate;

@FindBy(how = How.CSS, using = ".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlBirthday;

@FindBy(how = How.CSS, using = "div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlAge;

@FindBy(how = How.CSS, using = "div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvBirthday;

@FindBy(how = How.CSS, using = "div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvAge;

//<-----------------------------------------------------Birthplace--------------------------------------------------->
@FindBy(how = How.CSS, using = "input#town")
    public WebElement tfTown;
@FindBy(how = How.CSS, using = "div:nth-of-type(1) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgTown;

@FindBy(how = How.CSS, using = ".Drop.Drop--expanded  input")
    public WebElement tfCountry;

@FindBy(how = How.CSS, using = "[class='col-md-4']:nth-of-type(2) .Field-message")
    public WebElement errMsgCountry;

@FindBy(how = How.LINK_TEXT, using = "United States")
public WebElement tlvCountryUS;

@FindBy(how = How.CSS, using = "div#state  .Drop-header.Drop-toggle.is-clickable")
public WebElement ddState;

@FindBy(how = How.CSS, using = ".Callout.Callout--attention-dark.Callout--noPadding.EditEmployeeForm > .EditEmployeeForm-section > .EditEmployeeForm-content.noGutters.row.row-range-12 > div:nth-of-type(2) > .Field.Field-is-invalid > .Field-control > .Field-message")
public WebElement errMsgState;

@FindBy(how = How.CSS, using = "input#city")
    public WebElement tfCity;
@FindBy(how = How.CSS, using = "div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgCity;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")
public WebElement tlCity;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlTown;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlCountry;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlvCity;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvTown;

@FindBy(how = How.CSS, using = ".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvCountry;

//<-----------------------------------------------------Citizenship--------------------------------------------------->
@FindBy(how = How.CSS, using = "input#citizenship")
public WebElement tfCitizenship;

@FindBy(how = How.CSS, using = "input#citizenshipExpDate")
public WebElement pickExpiryDate;

@FindBy(how = How.CSS, using = "div:nth-of-type(4) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .capitalize.fs-xs.fw-normal.primary-font")
public WebElement tlCitizenshipName;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .capitalize")
    public WebElement tlExpiryDate;

@FindBy(how = How.CSS, using = "div:nth-of-type(4) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvCitizenshipName;

@FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .fw-bold")
    public WebElement tlvExpiryDate;

//Additional Citizenship

    @FindBy(how = How.CSS, using = "input[name='additionalCitizenship1']")
    public WebElement tfAdditionalCitizenship1;

    @FindBy(how = How.CSS, using = "input[name='additionalCitizenshipExpDate1']")
    public WebElement pickExpiryDate1;

    @FindBy(how = How.CSS, using = "div:nth-of-type(4) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgAdditionalCitizenship1;

    @FindBy(how = How.CSS, using = "input[name='additionalCitizenship2']")
    public WebElement tfAdditionalCitizenship2;

    @FindBy(how = How.CSS, using = "input[name='additionalCitizenshipExpDate2']")
    public WebElement pickExpiryDate2;

    @FindBy(how = How.CSS, using = "div:nth-of-type(4) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgAdditionalCitizenship2;

    @FindBy(how = How.CSS, using = "input[name='additionalCitizenship3']")
    public WebElement tfAdditionalCitizenship3;

    @FindBy(how = How.CSS, using = "input[name='additionalCitizenshipExpDate3']")
    public WebElement pickExpiryDate3;

    @FindBy(how = How.CSS, using = "div:nth-of-type(4) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgAdditionalCitizenship3;
    @FindBy(how = How.CSS, using = "div:nth-of-type(5) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlAdditionalCitizenshipName;

    @FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(10) [class='col-md-6 DataInfoText-container'] .capitalize")
    public WebElement tlAdditionalExpiryDate;

    @FindBy(how = How.CSS, using = "div:nth-of-type(5) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvAdditionalCitizenshipName;

    @FindBy(how = How.CSS, using = "[class] .DataInfo:nth-child(10) [class='col-md-6 DataInfoText-container'] .fw-bold")
    public WebElement tlvAdditionalExpiryDate;

//Additional Information
@FindBy(how = How.CSS, using = "div:nth-of-type(13) > .Field > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")
public WebElement ddCivilStatus;

    @FindBy(how = How.CSS, using = "div:nth-of-type(14) > .Field > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")
    public WebElement ddSex;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(3) [type]")
    public WebElement ddVSexF;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(2) [type]")
    public WebElement ddVSexM;

    @FindBy(how = How.CSS, using = ".EditEmployeeForm-content.noGutters.row.row-range-12 > div:nth-of-type(12)")
    public WebElement outsideForm;

    @FindBy(how = How.CSS, using = "div:nth-of-type(14) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgSex;

    @FindBy(how = How.CSS, using = "div:nth-of-type(15) > .Field > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")
    public WebElement ddGender;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(1) .capitalize")
    public WebElement ddGenderMale;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(2) .capitalize")
    public WebElement ddGenderFemale;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(3) .capitalize")
    public WebElement ddGenderLesbian;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(4) .capitalize")
    public WebElement ddGenderGay;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(5) .capitalize")
    public WebElement ddGenderBisexual;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(6) .capitalize")
    public WebElement ddGenderTransgender;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(7) .capitalize")
    public WebElement ddGenderQuestioning;

    @FindBy(how = How.CSS, using = "div:nth-of-type(15) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgGender;

    @FindBy(how = How.CSS, using = "input#nationality")
    public WebElement tfNationality;

    @FindBy(how = How.CSS, using = "div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgNationality;
    @FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlSex;

    @FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlCivilStatus;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(1) .capitalize")
    public WebElement ddCivilStatusSingle;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(2) .capitalize")
    public WebElement ddCivilStatusMarried;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(3) .capitalize")
    public WebElement ddCivilStatusDivorced;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(4) .capitalize")
    public WebElement ddCivilStatusWidowed;

    @FindBy(how = How.CSS, using = "body > [data-drop-short] li:nth-of-type(5) .capitalize")
    public WebElement ddCivilStatusSeparated;

    @FindBy(how = How.CSS, using = "div:nth-of-type(13) > .Field.Field-is-invalid > .Field-control > .Field-message")
    public WebElement errMsgCivilStatus;

    @FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")
    public WebElement tlNationality;

    @FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvSex;

    @FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvCivilStatus;

    @FindBy(how = How.CSS, using = ".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")
    public WebElement tlvNationality;

//<---------------------------------------------EDIT GENERAL---------------------------------------------------------------------->
//<---------------------------------------------FIRST NAME---------------------------------------------------------------------->
    public void inputSpaceOnlyFirstName(String space) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#firstName")));
        tfFirstName.clear();
        tfFirstName.sendKeys(space);
    }

    public void inputDotOnlyFirstName(String dot) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfFirstName.clear();
        tfFirstName.sendKeys(dot);
    }

    public void inputDashOnlyFirstName(String dash) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfFirstName.click();
        tfFirstName.sendKeys(dash);
    }

    public void inputCompoundSpaceFirstName(String compoundSpace){
        tfFirstName.clear();
        tfFirstName.sendKeys(compoundSpace);
    }

    public void inputCompoundDotFirstName(String compoundDot){
        tfFirstName.clear();
        tfFirstName.sendKeys(compoundDot);
    }

    public void inputCompoundDashFirstName(String compoundDash){
        tfFirstName.clear();
        tfFirstName.sendKeys(compoundDash);
    }

    public void inputAlphaNumericFirstName(String alphaNumeric){
        tfFirstName.clear();
        tfFirstName.sendKeys(alphaNumeric);
    }

    public void inputNumericFirstName(String numeric){
        tfFirstName.clear();
        tfFirstName.sendKeys(numeric);
    }

    public void inputBlankFirstName(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfFirstName.clear();
        tfFirstName.sendKeys(blank);
    }

    public void inputLessThan50FirstName(String lessThan50){
        tfFirstName.clear();
        tfFirstName.sendKeys(lessThan50);
    }

    public void inputMoreThan50FirstName(String moreThan50){
        tfFirstName.clear();
        tfFirstName.sendKeys(moreThan50);
    }
    public void inputOtherCharacterFirstName(String otherCharacter){
        tfFirstName.clear();
        tfFirstName.sendKeys(otherCharacter);
    }

    public void errMsgOtherCharacterFirstName(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgFirstName.getText();
        expectedErrorMessage = "Please use alphabetic letters, numbers, space, dash and period only";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void errMsgFirstName(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgFirstName.getText();
        expectedErrorMessage = "Please enter First Name.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void noErrMsgFirstName(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        //@TO DO: Assertion in checking if the error message is not displayed. Create another method for the noErrMsgOtherCharacterFirstName too.
        /*boolean isTheErrorMessageDisplayed = errMsgFirstName.isDisplayed();
        if(isTheErrorMessageDisplayed=true){

        }*/
    }

//<---------------------------------------------LAST NAME---------------------------------------------------------------------->
    public void inputSpaceOnlyLastName(String space){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#lastName")));
        tfLastName.clear();
        tfLastName.sendKeys(space);
    }

    public void errMsgLastName(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgLastName.getText();
        expectedErrorMessage = "Please enter Last Name.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputDotOnlyLastName(String dot){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfLastName.clear();
        tfLastName.sendKeys(dot);

    }

    public void inputDashOnlyLastName(String dash){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfLastName.clear();
        tfLastName.sendKeys(dash);

    }

    public void inputCompoundSpaceLastName(String compoundSpace){
        tfLastName.clear();
        tfLastName.sendKeys(compoundSpace);
    }

    public void inputCompoundDotLastName(String compoundDot){
        tfLastName.clear();
        tfLastName.sendKeys(compoundDot);
    }

    public void inputCompoundDashLastName(String compoundDash){
        tfLastName.clear();
        tfLastName.sendKeys(compoundDash);
    }

    public void inputAlphaNumericLastName(String alphaNumeric){
        tfLastName.clear();
        tfLastName.sendKeys(alphaNumeric);
    }

    public void inputNumericLastName(String numeric){
        tfLastName.clear();
        tfLastName.sendKeys(numeric);
    }

    public void inputBlankLastName(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfLastName.clear();
        tfLastName.sendKeys(blank);

    }

    public void inputLessThan50LastName(String lessThan50){
        tfLastName.clear();
        tfLastName.sendKeys(lessThan50);
    }

    public void inputMoreThan50LastName(String moreThan50){
        tfLastName.clear();
        tfLastName.sendKeys(moreThan50);
    }
    public void inputOtherCharacterLastName(String otherCharacter){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfLastName.clear();
        tfLastName.sendKeys(otherCharacter);
    }

    public void errMsgOtherCharacterLastName(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgLastName.getText();
        expectedErrorMessage = "Please use alphabetic letters, numbers, space, dash and period only";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    //<---------------------------------------------MIDDLE NAME---------------------------------------------------------------------->
    public void inputSpaceOnlyMiddleName(String space){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfMiddleName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#middleName")));
        tfMiddleName.clear();
        tfMiddleName.sendKeys(space);
    }

    public void errMsgMiddleName(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgMiddleName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgMiddleName.getText();
        expectedErrorMessage = "Please enter Middle Name.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputDotOnlyMiddleName(String dot){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfMiddleName.clear();
        tfMiddleName.sendKeys(dot);
    }

    public void inputDashOnlyMiddleName(String dash){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfMiddleName.clear();
        tfMiddleName.sendKeys(dash);
    }

    public void inputCompoundSpaceMiddleName(String compoundSpace){
        tfMiddleName.clear();
        tfMiddleName.sendKeys(compoundSpace);
    }

    public void inputCompoundDotMiddleName(String compoundDot){
        tfMiddleName.clear();
        tfMiddleName.sendKeys(compoundDot);
    }

    public void inputCompoundDashMiddleName(String compoundDash){
        tfMiddleName.clear();
        tfMiddleName.sendKeys(compoundDash);
    }

    public void inputAlphaNumericMiddleName(String alphaNumeric){
        tfMiddleName.clear();
        tfMiddleName.sendKeys(alphaNumeric);
    }

    public void inputNumericMiddleName(String numeric){
        tfMiddleName.clear();
        tfMiddleName.sendKeys(numeric);
    }

    public void inputBlankMiddleName(String blank){
        tfMiddleName.clear();
        tfMiddleName.sendKeys(blank);
    }

    public void inputLessThan50MiddleName(String lessThan50){
        tfMiddleName.clear();
        tfMiddleName.sendKeys(lessThan50);
    }

    public void inputMoreThan50MiddleName(String moreThan50){
        tfMiddleName.clear();
        tfMiddleName.sendKeys(moreThan50);
    }
    public void inputOtherCharacterMiddleName(String otherCharacter){
        tfMiddleName.clear();
        tfMiddleName.sendKeys(otherCharacter);
    }

    public void errMsgOtherCharacterMiddleName(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgMiddleName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgMiddleName.getText();
        expectedErrorMessage = "Please use alphabetic letters, numbers, space, dash and period only";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    //<----------------------------------------------------SUFFIX-------------------------------------------------------------------------------->
    public void inputBlankSuffix(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfSuffix.clear();
        tfSuffix.sendKeys(blank);
        errMsgSuffix = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(4) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgSuffix.getText();
        expectedErrorMessage = "Please enter Suffix Name.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputLessThan4Suffix(String lessThan4){
        tfSuffix.clear();
        tfSuffix.sendKeys(lessThan4);
    }

    public void inputMoreThan4Suffix(String moreThan4) {
        tfSuffix.clear();
        tfSuffix.sendKeys(moreThan4);
    }
    public void inputOtherCharacterSuffix(String otherCharacter){
        tfSuffix.clear();
        tfSuffix.sendKeys(otherCharacter);
    }
    public void errMsgOtherCharacterSuffix(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgSuffix = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(4) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgSuffix.getText();
        expectedErrorMessage = "Please use alphabetic letters, numbers, space, dash and period only";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    //<----------------------------------------------------BIRTHDAY-------------------------------------------------------------------------------->
    public void chooseAPastDateInTheCalendarPicker() throws InterruptedException {
        Thread.sleep(20000);
    }
    public void chooseAFutureDateInTheCalendarPicker(String sampleDate) throws InterruptedException {
        Thread.sleep(20000);
    }
    public void chooseADateBefore01011923InTheCalendarPicker(String sampleDate) throws InterruptedException {
        Thread.sleep(20000);
    }
    public void checkDatesBefore01011923IfDisabled() throws InterruptedException {
        Thread.sleep(20000);
    }

    public void checkBirthdateFieldValue(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvBirthday = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvBirthday.getText();
        expectedTl = tlvBirthday.getText(); //@TO DO: Refactor this soon once the calendar picker allows manual inputs
        assertEquals(expectedTl, actualTl);
    }
    public void checkAgeFieldValue(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvAge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvAge.getText();
        expectedTl = tlvAge.getText(); //@TO DO: Refactor this soon once the timezone requirements and logic is clear in computing the age. Ask the dev of the formula.
        assertEquals(expectedTl, actualTl);
    }

    public void checkIfAgeFieldIsDisabled(){
        Boolean ageField =Driver.findElement(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")).isEnabled();
        assertFalse(ageField);
    }
    //<----------------------------------------------------CITY-------------------------------------------------------------------------------->
    public void inputSpaceOnlyCity(String space){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#city")));
        tfCity.clear();
        tfCity.sendKeys(space);
        errMsgCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgCity.getText();
        expectedErrorMessage = "Please enter City.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputDotOnlyCity(String dot){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCity.clear();
        tfCity.sendKeys(dot);
        errMsgCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgCity.getText();
        expectedErrorMessage = "Please enter City.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputDashOnlyCity(String dash){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCity.clear();
        tfCity.sendKeys(dash);
        errMsgCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgCity.getText();
        expectedErrorMessage = "Please enter City.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputAlphaNumericCity(String alphaNumeric){
        tfCity.clear();
        tfCity.sendKeys(alphaNumeric);
    }

    public void inputNumericCity(String numeric){
        tfCity.clear();
        tfCity.sendKeys(numeric);
    }

    public void inputBlankCity(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCity.clear();
        tfCity.sendKeys(blank);
        errMsgCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgCity.getText();
        expectedErrorMessage = "Please enter City.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputLessThan60City(String lessThan60){
        tfCity.clear();
        tfCity.sendKeys(lessThan60);
    }

    public void inputMoreThan60City(String moreThan60){
        tfCity.clear();
        tfCity.sendKeys(moreThan60);
    }

    public void inputValidCity(String valid){
        tfCity.clear();
        tfCity.sendKeys(valid);
    }

    public void checkIfCountryFieldIsPreFilled(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")));

        Boolean countryField = tlvCountry.getText().isEmpty();
        assertFalse(countryField);
    }

    //<----------------------------------------------------TOWN-------------------------------------------------------------------------------->
    public void inputSpaceOnlyTown(String space){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfTown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        tfTown.clear();
        tfTown.sendKeys(space);
        errMsgTown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        actualErrorMessage = errMsgTown.getText();
        expectedErrorMessage = "Please enter Town.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputDotOnlyTown(String dot){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfTown.clear();
        tfTown.sendKeys(dot);
        errMsgTown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        actualErrorMessage = errMsgTown.getText();
        expectedErrorMessage = "Please enter Town.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputDashOnlyTown(String dash){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfTown.clear();
        tfTown.sendKeys(dash);
        errMsgTown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        actualErrorMessage = errMsgTown.getText();
        expectedErrorMessage = "Please enter Town.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputAlphaNumericTown(String alphaNumeric){
        tfTown.clear();
        tfTown.sendKeys(alphaNumeric);
    }

    public void inputNumericTown(String numeric){
        tfTown.clear();
        tfTown.sendKeys(numeric);
    }

    public void inputBlankTown(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfTown.clear();
        tfTown.sendKeys(blank);
        errMsgTown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        actualErrorMessage = errMsgTown.getText();
        expectedErrorMessage = "Please enter Town.";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    public void inputLessThan60Town(String lessThan60){
        tfTown.clear();
        tfTown.sendKeys(lessThan60);
    }

    public void inputMoreThan60Town(String moreThan60){
        tfTown.clear();
        tfTown.sendKeys(moreThan60);
    }

    public void inputValidTown(String valid){
        tfTown.clear();
        tfTown.sendKeys(valid);
    }
    //<----------------------------------------------------STATE-------------------------------------------------------------------------------->
    public void chooseUSForCountryField(String country){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Drop.Drop--expanded  input")));
        tfCountry.click();
        tfCountry.clear();
        tfCountry.sendKeys(country);
        tfCountry.clear();
        tlvCountryUS = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("United States")));
        tlvCountryUS.click();
    }
    public void checkStateFieldIfDisplayed(){
        Boolean stateField = Driver.findElement(By.cssSelector("div#state  .Drop-header.Drop-toggle.is-clickable")).isDisplayed();
        assertTrue(stateField);
    }
    public void checkStateFieldIfBlank(){
        Boolean stateField = tlvCountryUS.getText().isBlank();
        assertTrue(stateField);
    }
    public void verifyErrMsgForState(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgState = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--attention-dark.Callout--noPadding.EditEmployeeForm > .EditEmployeeForm-section > .EditEmployeeForm-content.noGutters.row.row-range-12 > div:nth-of-type(2) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgState.getText();
        expectedErrorMessage = "Please enter State.";
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    public void checkIfAllStateIsPresent(){

        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ddState = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#state  .Drop-header.Drop-toggle.is-clickable")));

        //Getting all values inside the State Dropdown
       /* Select select = new Select(Driver.findElement(By.cssSelector("div#state  .Drop-header.Drop-toggle.is-clickable")));
        List <WebElement> op = select.getOptions();
        int size = op.size();
        for(int i =0; i<size ; i++){
            String options = op.get(i).getText();
        }*/
        //Declaring Array with Equal Size to the List

        List<WebElement> op= Driver.findElements(By.cssSelector("div#state  .Drop-header.Drop-toggle.is-clickable"));
        int size = op.size();
        String[]ddStateList = new String [size];
        for(int i =0; i<size ; i++){
            String stateValues = op.get(Integer.parseInt(ddStateList[i])).getText();
        }

        //Expected State List
        String[] ddStateArray = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};

        //Comparing the retrieved list with the expected state list
        assertArrayEquals(ddStateList, ddStateArray);
    }

    //<---------------------------------------------------Country-------------------------------------------------------------->

    public void clickCountryDropdown(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Drop.Drop--expanded  input")));
    }
    public void checkIfAllCountryIsPresent(){

        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));

        //Getting all values inside the State Dropdown
       /* Select select = new Select(Driver.findElement(By.cssSelector("div#state  .Drop-header.Drop-toggle.is-clickable")));
        List <WebElement> op = select.getOptions();
        int size = op.size();
        for(int i =0; i<size ; i++){
            String options = op.get(i).getText();
        }*/
        //Declaring Array with Equal Size to the List

        List<WebElement> op= Driver.findElements(By.cssSelector(""));
        int size = op.size();
        String[]ddCountryList = new String [size];
        for(int i =0; i<size ; i++){
            String stateValues = op.get(Integer.parseInt(ddCountryList[i])).getText();
        }

        //Expected State List
        String[] ddCountryArray = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};

        //Comparing the retrieved list with the expected state list
        assertArrayEquals(ddCountryArray, ddCountryList);
    }

    public void inputBlankCountry(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Drop.Drop--expanded  input")));
        tfCountry.sendKeys(blank);
    }
    public void verifyErrMsgForCountry(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='col-md-4']:nth-of-type(2) .Field-message")));
        actualErrorMessage = errMsgState.getText();
        expectedErrorMessage = "Please enter Country.";
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

//<-----------------------------------------------Additional Information: Sex------------------------------------------------->

    public void inputValidSex(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ddSex = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(14) > .Field > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")));
        ddSex.click();
        ddVSexF = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > [data-drop-short] li:nth-of-type(3) [type]")));
        ddVSexF.click();
        ddVSexM = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > [data-drop-short] li:nth-of-type(2) [type]")));
        ddVSexM.click();
    }

    public void inputBlankSex(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ddSex = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(14) > .Field > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")));
        ddSex.click();
        outsideForm.click();
    }

    public void verifyErrMsgSex(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgSex = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(14) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgSex.getText();
        expectedErrorMessage = "Please enter your sex";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    //<-----------------------------------------------Additional Information: Gender------------------------------------------------->

    public void inputValidGender(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ddGender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(15) > .Field > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")));
        ddGender.click();
        ddGenderMale.click();
        ddGenderFemale.click();
        ddGenderLesbian.click();
        ddGenderGay.click();
        ddGenderBisexual.click();
        ddGenderTransgender.click();
        ddGenderQuestioning.click();
    }
    public void inputBlankGender(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ddGender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(15) > .Field > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")));
        ddGender.click();
        outsideForm.click();
    }

    public void verifyErrMsgGender(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgGender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(15) > .Field > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")));
        actualErrorMessage = errMsgGender.getText();
        expectedErrorMessage = "Please enter your gender";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    //<-----------------------------------------------Additional Information: Civil Status------------------------------------------------->

    public void inputValidCivilStatus(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ddCivilStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(13) > .Field.Field-is-invalid > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")));
        ddCivilStatus.click();
        ddCivilStatusSingle.click();
        ddCivilStatusMarried.click();
        ddCivilStatusDivorced.click();
        ddCivilStatusWidowed.click();
        ddCivilStatusSeparated.click();
    }
    public void inputBlankCivilStatus(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ddCivilStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(13) > .Field.Field-is-invalid > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")));
        ddCivilStatus.click();
        outsideForm.click();
    }

    public void verifyErrMsgCivilStatus(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgCivilStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(13) > .Field.Field-is-invalid > .Field-control > .Select > .Drop > .Drop-header.Drop-toggle.is-clickable")));
        actualErrorMessage = errMsgCivilStatus.getText();
        expectedErrorMessage = "Please enter your civil status";
        assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    //<-----------------------------------------------Additional Information: Nationality------------------------------------------------->

    public void inputValidNationality(String validNationality){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfNationality = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#nationality")));
        tfNationality.sendKeys(validNationality);
    }

    public void inputBlankNationality(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfNationality = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#nationality")));
        tfNationality.sendKeys(blank);
    }
    public void verifyErrMsgNationality(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgNationality = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(3) > .Field.Field-is-invalid > .Field-control > .Field-message")));
        actualErrorMessage = errMsgNationality.getText();
        expectedErrorMessage = "Please select Nationality.";
    }
    //<-----------------------------------------------Additional Information: Citizenship------------------------------------------------->
    public void inputValidCitizenship(String validCitizenship){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCitizenship = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#citizenship")));
        tfCitizenship.sendKeys(validCitizenship);
    }

    public void inputBlankCitizenship(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfCitizenship = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#citizenship")));
        tfCitizenship.sendKeys(blank);
    }
    public void verifyErrMsgCitizenship(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgCitizenship = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        actualErrorMessage = errMsgCitizenship.getText();
        expectedErrorMessage = "Please enter Citizenship.";
    }

    //<-----------------------------------------------Additional Information: Expiry Date------------------------------------------------->
    //@TO DO: Add the necessary validations for the expiry date once the calendar picker is interactable
    public void inputValidExpiryDate() throws InterruptedException {
        Thread.sleep(5000);
    }
    //<-----------------------------------------------Additional Information: Additional Citizenship 1------------------------------------------------->
    public void inputValidAdditionalCitizenship1(String validCitizenship){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfAdditionalCitizenship1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#citizenship")));
        tfAdditionalCitizenship1.sendKeys(validCitizenship);
    }

    public void inputBlankAdditionalCitizenship1(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfAdditionalCitizenship1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#citizenship")));
        tfAdditionalCitizenship1.sendKeys(blank);
    }
    public void verifyErrMsgAdditionalCitizenship1(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgAdditionalCitizenship1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        actualErrorMessage = errMsgAdditionalCitizenship1.getText();
        expectedErrorMessage = "Please enter Additional citizenship";
    }

    //<-----------------------------------------------Additional Information: Expiry Date 1------------------------------------------------->
    //@TO DO: Add the necessary validations for the expiry date once the calendar picker is interactable
    public void inputValidExpiryDate1() throws InterruptedException {
        Thread.sleep(5000);
    }

    //<-----------------------------------------------Additional Information: Additional Citizenship 2------------------------------------------------->
    public void inputValidAdditionalCitizenship2(String validCitizenship){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfAdditionalCitizenship2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#citizenship")));
        tfAdditionalCitizenship2.sendKeys(validCitizenship);
    }

    public void inputBlankAdditionalCitizenship2(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfAdditionalCitizenship2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#citizenship")));
        tfAdditionalCitizenship2.sendKeys(blank);
    }
    public void verifyErrMsgAdditionalCitizenship2(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgAdditionalCitizenship2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        actualErrorMessage = errMsgAdditionalCitizenship2.getText();
        expectedErrorMessage = "Please enter Additional citizenship";
    }

    //<-----------------------------------------------Additional Information: Expiry Date 2------------------------------------------------->
    //@TO DO: Add the necessary validations for the expiry date once the calendar picker is interactable
    public void inputValidExpiryDate2() throws InterruptedException {
        Thread.sleep(5000);
    }

    //<-----------------------------------------------Additional Information: Additional Citizenship 3------------------------------------------------->
    public void inputValidAdditionalCitizenship3(String validCitizenship){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfAdditionalCitizenship3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#citizenship")));
        tfAdditionalCitizenship3.sendKeys(validCitizenship);
    }

    public void inputBlankAdditionalCitizenship3(String blank){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tfAdditionalCitizenship3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#citizenship")));
        tfAdditionalCitizenship3.sendKeys(blank);
    }
    public void verifyErrMsgAdditionalCitizenship3(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        errMsgAdditionalCitizenship3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        actualErrorMessage = errMsgAdditionalCitizenship3.getText();
        expectedErrorMessage = "Please enter Additional citizenship";
    }

    //<-----------------------------------------------Additional Information: Expiry Date 2------------------------------------------------->
    //@TO DO: Add the necessary validations for the expiry date once the calendar picker is interactable
    public void inputValidExpiryDate3() throws InterruptedException {
        Thread.sleep(5000);
    }
//Verify Name Section
    public void verifyThName(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(1)")));
        actualTh = thName.getText();
        expectedTh = "Name:";
        assertEquals(expectedTh, actualTh);
    }
    public void verifyTlName() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlFirstName.getText();
        expectedTl = "First Name";
        assertEquals(expectedTl, actualTl);

        tlMiddleName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlMiddleName.getText();
        expectedTl = "Middle Name:";
        assertEquals(expectedTl, actualTl);

        tlLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlLastName.getText();
        expectedTl = "Last Name:";
        assertEquals(expectedTl, actualTl);

        tlSuffix = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlSuffix.getText();
        expectedTl = "Suffix:";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvName() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvFirstName.getText();
        expectedTlv = "Marinela";
        assertEquals(expectedTlv, actualTlv);

        tlMiddleName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvMiddleName.getText();
        expectedTlv = "TestOne";
        assertEquals(expectedTlv, actualTlv);

        tlvLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvLastName.getText();
        expectedTlv = "One";
        assertEquals(expectedTlv, actualTlv);

        tlvSuffix = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTlv = tlvSuffix.getText();
        expectedTlv = "I";
        assertEquals(expectedTlv, actualTlv);
    }

//Verify Birthday Section
    public void verifyThBirthday(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thBirthday = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(2)")));
        actualTh = thBirthday.getText();
        expectedTh = "Birthday:";
        assertEquals(expectedTh, actualTh);
    }

    public void verifyTlBirthday() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlBirthday = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(4) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlBirthday.getText();
        expectedTl = "Birthday";
        assertEquals(expectedTl, actualTl);

        tlAge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlAge.getText();
        expectedTl = "Age";
        assertEquals(expectedTl, actualTl);
    }

 /*   public void verifyTlvBirthday() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvBirthday = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvBirthday.getText();
        expectedTl = "1996-11-13";
        assertEquals(expectedTl, actualTl);

        tlvAge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvAge.getText();
        expectedTl = "26";
        assertEquals(expectedTl, actualTl);
    }
*/
//Verify Birthplace Section
    public void verifyThBirthplace(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thBirthplace = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(3)")));
        actualTh = thBirthplace.getText();
        expectedTh = "Birthplace:";
        assertEquals(expectedTh, actualTh);
    }

    public void verifyTlBirthplace() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlCity.getText();
        expectedTl = "City";
        assertEquals(expectedTl, actualTl);

        tlTown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlTown.getText();
        expectedTl = "Town";
        assertEquals(expectedTl, actualTl);

        tlCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlCountry.getText();
        expectedTl = "Country";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvBirthplace() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlvCity.getText();
        expectedTl = "Lipa";
        assertEquals(expectedTl, actualTl);

        tlvTown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvTown.getText();
        expectedTl = "Tambo";
        assertEquals(expectedTl, actualTl);

        tlvCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--neutral.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvCountry.getText();
        expectedTl = "Philippines";
        assertEquals(expectedTl, actualTl);
    }

//Verify Citizenship Section
    public void verifyThCitizenship(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thCitizenship = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(2)")));
        actualTh = thCitizenship.getText();
        expectedTh = "Citizenship:";
        assertEquals(expectedTh, actualTh);
    }

    public void verifyTlCitizenship() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlCitizenshipName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(4) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlCitizenshipName.getText();
        expectedTl = "Name";
        assertEquals(expectedTl, actualTl);

        tlExpiryDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .capitalize")));
        actualTl = tlExpiryDate.getText();
        expectedTl = "Expiry Date";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvCitizenship() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvCitizenshipName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(4) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvCitizenshipName.getText();
        expectedTl = "Filipino";
        assertEquals(expectedTl, actualTl);

        tlvExpiryDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(8) [class='col-md-6 DataInfoText-container'] .fw-bold")));
        actualTl = tlvExpiryDate.getText();
        expectedTl = "2023-12-14";
        assertEquals(expectedTl, actualTl);
    }

//Verify Additional Citizenship Section
    public void verifyThAdditionalCitizenship(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thAdditionalCitizenship = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        actualTh = thAdditionalCitizenship.getText();
        expectedTh = "Additional Citizenship (1):";
        assertEquals(expectedTh, actualTh);
    }

    public void verifyTlAdditionalCitizenship() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlAdditionalCitizenshipName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(5) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlAdditionalCitizenshipName.getText();
        expectedTl = "Name";
        assertEquals(expectedTl, actualTl);

        tlAdditionalExpiryDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(10) [class='col-md-6 DataInfoText-container'] .capitalize")));
        actualTl = tlAdditionalExpiryDate.getText();
        expectedTl = "Expiry Date";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvAdditionalCitizenship() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvAdditionalCitizenshipName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(5) > .DataInfo-container.row.row-range-12.start-sm > .DataInfoText-container.capitalize.col-md-6 .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvAdditionalCitizenshipName.getText();
        expectedTl = "American";
        assertEquals(expectedTl, actualTl);

        tlvAdditionalExpiryDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class] .DataInfo:nth-child(10) [class='col-md-6 DataInfoText-container'] .fw-bold")));
        actualTl = tlvAdditionalExpiryDate.getText();
        expectedTl = "2023-12-14";
        assertEquals(expectedTl, actualTl);
    }

//Verify Additional Section
    public void verifyThAdditionalInformation(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        thAdditionalInformation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".is-absolute.is-scrollable-y > h3:nth-of-type(6)")));
        actualTh = thAdditionalInformation.getText();
        expectedTh = "Additional Information:";
        assertEquals(expectedTh, actualTh);
    }

    public void verifyTlAdditionalInformation() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlSex = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlSex.getText();
        expectedTl = "Sex";
        assertEquals(expectedTl, actualTl);

        tlCivilStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlCivilStatus.getText();
        expectedTl = "Civil Status";
        assertEquals(expectedTl, actualTl);

        tlNationality = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .capitalize.fs-xs.fw-normal.primary-font")));
        actualTl = tlNationality.getText();
        expectedTl = "Nationality";
        assertEquals(expectedTl, actualTl);
    }

    public void verifyTlvAdditionalInformation() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvSex = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(1) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvSex.getText();
        expectedTl = "Female";
        assertEquals(expectedTl, actualTl);

        tlvCivilStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(2) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvCivilStatus.getText();
        expectedTl = "Single";
        assertEquals(expectedTl, actualTl);

        tlvNationality = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Callout.Callout--secondary.DataInfo > .DataInfo-container.row.row-range-12.start-sm > div:nth-of-type(3) .fs-lg.fw-bold.is-ellipsed.primary-font")));
        actualTl = tlvNationality.getText();
        expectedTl = "Filipino";
        assertEquals(expectedTl, actualTl);
    }
}
