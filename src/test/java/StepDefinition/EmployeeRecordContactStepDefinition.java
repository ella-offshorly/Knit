package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.hrhub.employeeRecordContact.employeeRecordContact;

import static Base.BaseUtil.Driver;

public class EmployeeRecordContactStepDefinition {

    employeeRecordContact erc = new employeeRecordContact(Driver);

    @Then("Each field is present and populated in Employee Record - Contact Page")
    public void eachFieldIsPresentAndPopulatedInEmployeeRecordContactPage() {
        //CURRENT ADDRESS
        erc.verifyThCurrentAddress();
        erc.verifyTlCurrentAddress();
        erc.verifyTlvCurrentAddress();

        //PHONE NUMBER
        erc.verifyThPhoneNumber();
        erc.verifyTlPhoneNumber();
        erc.verifyTlvPhoneNumber();

        //EMAIL ADDRESS
        erc.verifyThEmailAddress();
        erc.verifyTlEmailAddress();
        erc.verifyTlvEmailAddress();

        //SOCIAL MEDIA
        erc.verifyThSocialMedia();
        erc.verifyTlSocialMedia();
        erc.verifyTlvSocialMedia();
    }

    //<-----------------------------------------------------Current Address: House Number------------------------------------------>
    @When("The user has left the No. field blank {string}")
    public void theUserHasLeftTheNoFieldBlank(String blank) {
        erc.inputBlankHouseNumber(blank);
    }

    @Then("The user should see an error message for the No. field saying, Please enter House Number")
    public void theUserShouldSeeAnErrorMessageForTheNoFieldSayingPleaseEnterHouseNumber() {
        erc.verifyErrMsgCurrentHouseNumber();
    }

    @When("The user has inputted less than 10 characters {string}")
    public void theUserHasInputtedLessThanCharacters(String lessThan10) {
        erc.inputLessThan10HouseNumber(lessThan10);
    }

    @When("The user has inputted more than 10 characters {string}")
    public void theUserHasInputtedMoreThanCharacters(String moreThan10) {
        erc.inputMoreThan10HouseNumber(moreThan10);
    }

    @When("The user has inputted alphanumeric characters {string}")
    public void theUserHasInputtedAlphanumericCharacters(String alphaNumeric) {
        erc.inputAlphaNumericHouseNumber(alphaNumeric);
    }

    @When("The user has inputted anything other than alphanumeric, a space, a dash, or a period {string} in the House Number field")
    public void theUserHasInputtedAnythingOtherThanAlphanumericASpaceADashOrAPeriodInTheHouseNumberField(String otherCharacter) {
        erc.inputOtherCharacterHouseNumber(otherCharacter);
    }

    @Then("The user should see an error message for the House Number field saying, Please use alphabetic letters, numbers, space, dash and period only.")
    public void theUserShouldSeeAnErrorMessageForTheHouseNumberFieldSayingPleaseUseAlphabeticLettersNumbersSpaceDashAndPeriodOnly() {
        erc.verifyErrMsgHouseNumber();
    }
}
