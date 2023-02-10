package StepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hrhub.dashboard.loggingTime;

import static Base.BaseUtil.Driver;

public class HRHubLoggingTimeStepDefinition {

    loggingTime log =  new loggingTime(Driver);

    @Then("The user should see the Time In 00:00")
    public void theUserShouldSeeTheTimeIn() {
        log.notYetLoggingIn();
    }

    @And("The user should see the Time Out 00:00")
    public void theUserShouldSeeTheTimeOut() {
        log.notYetLoggingOut();
    }

    @When("The user has clicked Time In")
    public void theUserHasClickedTimeIn() throws InterruptedException {
        log.timeIn();
    }

    @Then("The timer should start counting")
    public void theTimerShouldStartCounting() {
        //Not yet available
    }

    @And("The Work Status should be Working")
    public void theWorkStatusShouldBeWorking() {
        //For Review
    }

    @Then("The Time Out button is disabled")
    public void theTimeOutButtonIsDisabled() {
        log.checkIfTimeOutCtaIsDisabled();
    }

    @Then("The current time is displayed")
    public void theCurrentTimeIsDisplayed() {
        log.getStartCurrentTime();
    }

    @And("The cta label should be changed to Time Out")
    public void theCtaLabelShouldBeChangedTo() {
        log.checkTimeOutCTA();
    }

    //<----------------------------------------------------------BREAK-------------------------------------------------->
    @Then("The user should see the Time In 00:00 in the Break Time In")
    public void theUserShouldSeeTheTimeInInTheBreakTimeIn() {
        log.notYetStartingBreak();
    }

    @And("The user should see the Time Out 00:00 in the Break Time Out")
    public void theUserShouldSeeTheTimeOutInTheBreakTimeOut() {
        log.notYetEndingBreak();
    }

    @When("The user has clicked the Lunch Break button")
    public void theUserHasClickedTheLunchBreakButton() {
        log.clickStartLunchBreakCTA();
    }

    @Then("The button's label is changed to On Break")
    public void theButtonSLabelIsChangedToOnBreak() {
        //For Review
    }

    @When("The user has taken the break")
    public void theUserHasTakenTheBreak() throws InterruptedException {
        log.userIsInBreak();
    }

    @And("The user has clicked the End Lunch Break button")
    public void theUserHasClickedTheEndLunchBreakButton() {
        log.clickEndLunchBreakCTA();
    }

    @Then("The expected Lunch Break Duration is equal to the actual Lunch Break Duration")
    public void theExpectedLunchBreakDurationIsEqualToTheActualLunchBreakDuration() throws InterruptedException {
        log.verifyLunchBreakDuration();
    }

    @Then("The current day is displayed correctly")
    public void the_current_day_is_displayed_correctly() {
        log.verifyDay();
    }

    @And("The current date is displayed correctly")
    public void theCurrentDateIsDisplayedCorrectly() {
        log.verifyDate();
    }

    @Then("The displayed schedule is correct {string}")
    public void theDisplayedScheduleIsCorrect(String shiftSchedule) {
        log.verifyShiftSchedule(shiftSchedule);
    }

    @Then("The displayed Time In is correct")
    public void the_displayed_time_in_is_correct() {
        log.verifyDisplayedTimeIn();
    }

    @Then("The displayed Time Out is correct")
    public void the_displayed_time_out_is_correct() {

    }

    @When("The user has clicked Time Out")
    public void the_user_has_clicked_time_out() throws InterruptedException {
        log.timeOut();
    }
}
