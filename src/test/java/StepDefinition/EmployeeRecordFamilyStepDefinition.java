package StepDefinition;

import io.cucumber.java.en.Then;
import pages.hrhub.employeeRecordFamily.employeeRecordFamily;

import static Base.BaseUtil.Driver;

public class EmployeeRecordFamilyStepDefinition {

    employeeRecordFamily ERG = new employeeRecordFamily(Driver);

    @Then("Each field is present and populated in Employee Record - Family Page")
    public void eachFieldIsPresentAndPopulatedInEmployeeRecordFamilyPage() {
        //HIGH SCHOOL
        ERG.verifyThMothersName();
        ERG.verifyTlMothersName();
        ERG.verifyTlvMothersName();
    }
}
