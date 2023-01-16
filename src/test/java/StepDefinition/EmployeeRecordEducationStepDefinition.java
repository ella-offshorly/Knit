package StepDefinition;

import io.cucumber.java.en.Then;
import pages.hrhub.employeeRecordEducation.employeeRecordEducation;
import static Base.BaseUtil.Driver;

public class EmployeeRecordEducationStepDefinition {

    employeeRecordEducation ERG = new employeeRecordEducation(Driver);

    @Then("Each field is present and populated in Employee Record - Education Page")
    public void eachFieldIsPresentAndPopulatedInEmployeeRecordEducationPage() {
        ERG.verifyThHighSchool();
        ERG.verifyTlHighSchool();
        ERG.verifyTlvHighSchool();

        //ADDITIONAL COLLEGE
        ERG.verifyThAdditionalCollege();
        ERG.verifyTlAdditionalCollege();
        ERG.verifyTlvAdditionalCollege();
    }
}
