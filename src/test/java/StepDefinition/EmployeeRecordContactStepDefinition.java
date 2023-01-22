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
}
