package StepDefinition;

import io.cucumber.java.en.Then;
import pages.hrhub.employeeRecordContact.employeeRecordContact;

import static Base.BaseUtil.Driver;

public class EmployeeRecordContactStepDefinition {

    employeeRecordContact ERG = new employeeRecordContact(Driver);

    @Then("Each field is present and populated in Employee Record - Contact Page")
    public void eachFieldIsPresentAndPopulatedInEmployeeRecordContactPage() {
        //CURRENT ADDRESS
        ERG.verifyThCurrentAddress();
        ERG.verifyTlCurrentAddress();
        ERG.verifyTlvCurrentAddress();

        //PHONE NUMBER
        ERG.verifyThPhoneNumber();
        ERG.verifyTlPhoneNumber();
        ERG.verifyTlvPhoneNumber();

        //EMAIL ADDRESS
        ERG.verifyThEmailAddress();
        ERG.verifyTlEmailAddress();
        ERG.verifyTlvEmailAddress();

        //SOCIAL MEDIA
        ERG.verifyThSocialMedia();
        ERG.verifyTlSocialMedia();
        ERG.verifyTlvSocialMedia();
    }
}
