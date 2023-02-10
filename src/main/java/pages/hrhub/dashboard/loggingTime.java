package pages.hrhub.dashboard;

import Base.BaseUtil;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

import static Base.BaseUtil.Driver;
import static org.junit.Assert.*;

public class loggingTime extends BaseUtil{

    public loggingTime(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    String actualTimeIn, actualBreakTimeIn, actualBreakTimeOut, actualCTA, actualTimeOut, actualTlv;
    String expectedTimeIn, expectedBreakTimeIn, expectedBreakTimeOut,expectedStartCurrentTime, expectedEndCurrentTime, expectedCTA, expectedTimeOut, expectedCurrentDay, expectedCurrentDate, expectedTlv;

    //<----------------------------------------PAGE OBJECTS: Time In & Time Out-------------------------------------------->
    @FindBy(how = How.CSS, using = "div:nth-of-type(1) > .fs.fw-bold.primary-font.text-light")
    public WebElement timeIn;

    @FindBy(how = How.CSS, using = "div:nth-of-type(2) > .fs.fw-bold.primary-font.text-light")
    public WebElement timeOut;

    @FindBy(how = How.CSS, using = "div:nth-of-type(3) > .fs.fw-bold.primary-font.text-light")
    public WebElement counterDuration;

    @FindBy(how = How.CSS, using = ".Btn.Btn--secondary.is-full-width")
    public WebElement ctaTimeIn;

    @FindBy(how = How.XPATH, using = "//div[@id='Knit']//div[@class='Callout Callout--ghost Callout--noPadding content-fill']/div/div[@class='col-sm-grow-1 content-fill']/div/div//div[@class='UserBanner is-margin-bottom-xl']/div[@class='EmployeeTimer']/div[1]//button[@class='Btn Btn--neutral is-full-width']")
    public WebElement ctaTimeOut;
    //<-------------------------------------------------PAGE OBJECTS: Breaks------------------------------------------------------------>
    @FindBy(how = How.CSS, using = "div:nth-of-type(1) > .col-sm-6 > .nowrap.row > div:nth-of-type(1) > .fs.fw-bold.primary-font.text-light")
    public WebElement tlvBreakTimeIn;

    @FindBy(how = How.CSS, using = "div:nth-of-type(1) > .col-sm-6 > .nowrap.row > div:nth-of-type(2) > .fs.fw-bold.primary-font.text-light")
    public WebElement tlvBreakTimeOut;

    @FindBy(how = How.CSS, using = "div:nth-of-type(1) > .col-sm-6 > .nowrap.row > div:nth-of-type(3) > .fs.fw-bold.primary-font.text-light")
    public WebElement tlvBreakDuration;

    @FindBy(how = How.CSS, using = "div:nth-of-type(1) > div:nth-of-type(3) > .Btn.Btn--secondary.is-full-width")
    public WebElement ctaStartLunchBreakCTA;

    @FindBy(how = How.CSS, using = "div:nth-of-type(1) > div:nth-of-type(3) > .Btn.Btn--secondary.is-full-width")
    public WebElement ctaEndLunchBreakCTA;

    //<-------------------------------------------------PAGE OBJECTS: Attendance Table-------------------------------------------------->
//    @FindBy(how = How.CSS, using = "")
//    public WebElement

    @FindBy(how = How.CSS, using = "tr:nth-of-type(1) > .cell-formattedDay > .fs.fw-normal.primary-font")
    public WebElement tlvDay;

    @FindBy(how = How.CSS, using = "tr:nth-of-type(1) .cell-formattedDate .primary-font")
    public WebElement tlvDate;

    @FindBy(how = How.CSS, using = "tr:nth-of-type(1) > .cell-formattedShiftTime > .fs.fw-normal.primary-font")
    public WebElement tlvShiftSchedule;

    @FindBy(how = How.CSS, using = "tr:nth-of-type(1) > .cell-formattedWorkTime > .fs.fw-normal.primary-font")
    public WebElement tlvTimeIn;

    @FindBy(how = How.CSS, using = "tr:nth-of-type(1) > .cell-formattedWorkTime > .fs.fw-normal.primary-font")
    public WebElement tlvTimeOut;

    @FindBy(how = How.CSS, using = "tr:nth-of-type(1) > .cell-formattedLate > .fs.fw-normal.primary-font")
    public WebElement tlvLate;

    //<-------------------------------------------------METHOD: Time In and Time Out---------------------------------------------------->
    public void getStartCurrentTime(){
        DateFormat formatDate = new SimpleDateFormat("HH:mm");
        Date systemDate = new Date();
        String currentTime = formatDate.format(systemDate);
        String formattedTime = LocalTime.parse(currentTime, DateTimeFormatter.ofPattern("HH:mm")).format(DateTimeFormatter.ofPattern("hh:mm a")).toUpperCase();

        expectedStartCurrentTime = formattedTime;
        System.out.println("Current Time: " + formattedTime);
    }

    public void notYetLoggingIn(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        timeIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .fs.fw-bold.primary-font.text-light")));
        actualTimeIn = timeIn.getText();
        expectedTimeIn = "00:00";
        assertEquals(actualTimeIn, expectedTimeIn);
    }

    public void notYetLoggingOut(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        timeOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .fs.fw-bold.primary-font.text-light")));
        actualTimeOut = timeOut.getText();
        expectedTimeOut = "00:00";
        assertEquals(actualTimeOut, expectedTimeOut);
    }

    public void timeIn() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaTimeIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Btn.Btn--secondary.is-full-width")));
        getStartCurrentTime();
        ctaTimeIn.click();
        Thread.sleep(3000);

        timeIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .fs.fw-bold.primary-font.text-light")));
        actualTimeIn = timeIn.getText();
        System.out.println("Actual Time In: "+actualTimeIn);
        expectedTimeIn = expectedStartCurrentTime;
        System.out.println("Expected Time In: "+expectedTimeIn);
        assertEquals(actualTimeIn, expectedTimeIn);
    }

    public void timeOut() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaTimeOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//div[@id='Knit']//div[@class='Callout Callout--ghost Callout--noPadding content-fill']/div/div[@class='col-sm-grow-1 content-fill']/div/div//div[@class='UserBanner is-margin-bottom-xl']/div[@class='EmployeeTimer']/div[1]//button[@class='Btn Btn--neutral is-full-width']")));
        getStartCurrentTime();
        ctaTimeOut.click();
        Thread.sleep(3000);

        timeOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(2) > .fs.fw-bold.primary-font.text-light")));
        actualTimeOut = timeOut.getText();
        System.out.println("Actual Time In: "+actualTimeOut);
        expectedTimeOut = expectedStartCurrentTime;
        System.out.println("Expected Time In: "+expectedTimeOut);
        assertEquals(actualTimeOut, expectedTimeOut);
    }
    public void checkTimeOutCTA(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaTimeOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Knit']//div[@class='Callout Callout--ghost Callout--noPadding content-fill']/div/div[@class='col-sm-grow-1 content-fill']/div/div//div[@class='UserBanner is-margin-bottom-xl']/div[@class='EmployeeTimer']/div[1]//button[@class='Btn Btn--neutral is-full-width']")));
        actualCTA = ctaTimeOut.getText();
        expectedCTA = "Time Out";
        assertEquals(actualCTA, expectedCTA);
    }

    public void checkIfTimeOutCtaIsDisabled(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaTimeOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Knit']//div[@class='Callout Callout--ghost Callout--noPadding content-fill']/div/div[@class='col-sm-grow-1 content-fill']/div/div//div[@class='UserBanner is-margin-bottom-xl']/div[@class='EmployeeTimer']/div[1]//button[@class='Btn Btn--neutral is-full-width']")));
        Boolean boolCtaTimeOut = ctaTimeOut.isEnabled();
        assertFalse(boolCtaTimeOut);
    }
    //<---------------------------------------------------METHOD: Breaks---------------------------------------------->
    public void notYetStartingBreak(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvBreakTimeIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .col-sm-6 > .nowrap.row > div:nth-of-type(1) > .fs.fw-bold.primary-font.text-light")));
        actualBreakTimeIn = tlvBreakTimeIn.getText();
        expectedBreakTimeIn = "00:00";
        assertEquals(actualBreakTimeIn, expectedBreakTimeIn);
    }

    public void notYetEndingBreak(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        tlvBreakTimeOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .col-sm-6 > .nowrap.row > div:nth-of-type(2) > .fs.fw-bold.primary-font.text-light")));
        actualBreakTimeOut = tlvBreakTimeOut.getText();
        expectedBreakTimeOut = "00:00";
        assertEquals(actualBreakTimeOut, expectedBreakTimeOut);
    }

    public void clickStartLunchBreakCTA(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaStartLunchBreakCTA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > div:nth-of-type(3) > .Btn.Btn--secondary.is-full-width")));
        ctaStartLunchBreakCTA.click();
    }

    //@TO DO: Create method verifyOnBreakLabel()

    public void userIsInBreak() throws InterruptedException {
        Thread.sleep(100000);
    }

    public void clickEndLunchBreakCTA(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5000));
        ctaEndLunchBreakCTA = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > div:nth-of-type(3) > .Btn.Btn--secondary.is-full-width")));
        ctaEndLunchBreakCTA.click();
    }

    public void verifyLunchBreakDuration() throws InterruptedException {
        clickStartLunchBreakCTA();
        getStartCurrentTime();

        //Converting Expected Break Time In String Value to Time variable
        LocalTime timeVarExpectedBreakTimeIn = LocalTime.parse(expectedStartCurrentTime);

        //Verifying Actual Lunch Break Time In vs Expected Lunch Break Time In
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
        tlvBreakTimeIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .col-sm-6 > .nowrap.row > div:nth-of-type(1) > .fs.fw-bold.primary-font.text-light")));
        actualBreakTimeIn = tlvBreakTimeIn.getText();
        System.out.println("Actual Break Time In: "+actualBreakTimeIn);
        expectedBreakTimeIn = expectedStartCurrentTime;
        assertEquals(actualBreakTimeIn, expectedBreakTimeIn);

        //Converting Actual Break Time In String Value to Time variable
        LocalTime timeVarActualBreakTimeIn = LocalTime.parse(actualBreakTimeIn);

        userIsInBreak();
        clickEndLunchBreakCTA();
        getStartCurrentTime();

        //Converting Expected Break Time Out String Value to Time variable
        LocalTime timeVarExpectedBreakTimeOut = LocalTime.parse(expectedStartCurrentTime);

        //Verifying Actual Lunch Break Time Out vs Expected Lunch Break Time Out
        tlvBreakTimeOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div:nth-of-type(1) > .col-sm-6 > .nowrap.row > div:nth-of-type(2) > .fs.fw-bold.primary-font.text-light")));
        actualBreakTimeOut = tlvBreakTimeOut.getText();
        System.out.println("Actual Break Time Out: "+actualBreakTimeOut);
        expectedBreakTimeOut = expectedStartCurrentTime;
        System.out.println("Expected Break Time Out: "+expectedBreakTimeOut);
        assertEquals(actualBreakTimeOut, expectedBreakTimeOut);

        //Converting Actual Break Time Out String Value to Time variable
        LocalTime timeVarActualBreakTimeOut = LocalTime.parse(actualBreakTimeOut);

        //Computing the Expected Duration
       final Duration expectedBreakDuration;
       expectedBreakDuration = Duration.between(timeVarExpectedBreakTimeIn, timeVarExpectedBreakTimeOut).abs();

        //Computing the Actual Duration
        final Duration actualBreakDuration;
        actualBreakDuration = Duration.between(timeVarActualBreakTimeIn, timeVarActualBreakTimeOut).abs();

       //Verifying Actual Lunch Time Duration to Expected Duration;
        assertEquals(actualBreakDuration, expectedBreakDuration);
    }
//<-------------------------------------------------METHOD: Attendance Table---------------------------------------------------->
    //Getting current local day in EEE format
    public void getCurrentDay(){
        DateFormat formatDay = new SimpleDateFormat("EEE");
        String currentDay = formatDay.format(new Date());
        expectedCurrentDay = currentDay;
        System.out.println("Expected Day: " + expectedCurrentDay);
    }

    //Getting current date in LLL dd, yyyy format
    public void getCurrentDate(){
        DateFormat formatDate = new SimpleDateFormat("LLL dd, yyyy");
        String currentDate = formatDate.format(new Date());
        expectedCurrentDate = currentDate;
        System.out.println("Expected Date: " + expectedCurrentDate);
    }

    public void verifyDay(){
        getCurrentDay();
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(60));
        tlvDay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tr:nth-of-type(1) > .cell-formattedDay > .fs.fw-normal.primary-font")));
        actualTlv = tlvDay.getText();
        System.out.println("Actual Day: " + actualTlv);
        expectedTlv = expectedCurrentDay;
        assertEquals(actualTlv, expectedTlv);
    }

    public void verifyDate(){
        getCurrentDate();
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(60));
        tlvDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tr:nth-of-type(1) .cell-formattedDate .primary-font")));
        actualTlv = tlvDate.getText();
        System.out.println("Actual Date: " + actualTlv);
        expectedTlv = expectedCurrentDate;
        assertEquals(actualTlv, expectedTlv);
    }

    public void verifyShiftSchedule(String shiftSchedule){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(60));
        tlvShiftSchedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tr:nth-of-type(1) > .cell-formattedShiftTime > .fs.fw-normal.primary-font")));
        actualTlv = tlvShiftSchedule.getText();
        System.out.println("Actual Shift Schedule: " + actualTlv);
        expectedTlv = shiftSchedule;
        assertEquals(actualTlv, expectedTlv);
    }

    public void verifyDisplayedTimeIn(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(60));
        tlvTimeIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tr:nth-of-type(1) > .cell-formattedWorkTime > .fs.fw-normal.primary-font")));
        actualTlv = tlvTimeIn.getText();
        System.out.println("Actual Time In: " + actualTlv);

        //formatting expectedTimeIn to HH:mmA to match the Attendance Table time format
        DateFormat formatTime = new SimpleDateFormat("HH:mmA");
        expectedTimeIn = formatTime.format(new Date());
        System.out.println("Expected Time In: " + expectedTimeIn);
        expectedTlv = expectedTimeIn;
        assertTrue(actualTlv.contains(expectedTlv));

       /* //Format Debugger
        DateFormat formatTime = new SimpleDateFormat("HH:mm a");
        String timeNow = formatTime.format(new Date());
        System.out.println("Expected Time In: " + timeNow);*/
    }

    public void verifyDisplayedTimeOut(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(60));
        tlvTimeOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tr:nth-of-type(1) > .cell-formattedWorkTime > .fs.fw-normal.primary-font")));
        actualTlv = tlvTimeOut.getText();
        System.out.println("Actual Time Out: " + actualTlv);

        //formatting expectedTimeIn to HH:mmA to match the Attendance Table time format
        DateFormat formatTime = new SimpleDateFormat("HH:mmA");
        expectedTimeOut = formatTime.format(new Date());
        System.out.println("Expected Time Out: " + expectedTimeOut);
        expectedTlv = expectedTimeOut;
        assertTrue(actualTlv.contains(expectedTlv));
    }
}
