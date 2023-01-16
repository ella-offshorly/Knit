package StepDefinition;

import io.cucumber.java.en.Then;
import pages.hrhub.employeeRecordMedical.employeeRecordMedical;

import static Base.BaseUtil.Driver;

public class EmployeeRecordMedicalStepDefinition {

    employeeRecordMedical ERG = new employeeRecordMedical(Driver);

    @Then("Each field is present and populated in Employee Record - Medical Page")
    public void eachFieldIsPresentAndPopulatedInEmployeeRecordMedicalPage() {
        //HIGH SCHOOL
        ERG.verifyThMedicalProfile();
        ERG.verifyTlMedicalProfile();
        ERG.verifyTlvMedicalProfile();
    }
}
