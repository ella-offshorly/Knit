package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.hrhub.employeeRecordGeneral.employeeRecordGeneral;

import java.time.Duration;

import static Base.BaseUtil.Driver;
import static org.junit.Assert.assertEquals;

public class EmployeeRecordGeneralStepDefinition {

    employeeRecordGeneral ERG = new employeeRecordGeneral(Driver);

    @Then("Each field is present and populated in Employee Record - General Page")
    public void eachFieldIsPresentAndPopulatedInEmployeeRecordGeneralPage() {
        //NAME
        ERG.verifyThName();
        ERG.verifyTlName();
        ERG.verifyTlvName();

        //BIRTHDAY
        ERG.verifyThBirthday();
        ERG.verifyTlBirthday();
        ERG.verifyTlvBirthday();

        //BIRTHPLACE
        ERG.verifyThBirthplace();
        ERG.verifyTlBirthplace();
        ERG.verifyTlvBirthplace();

        //CITIZENSHIP
        ERG.verifyThCitizenship();
        ERG.verifyTlCitizenship();
        ERG.verifyTlvCitizenship();

        //ADDITIONAL CITIZENSHIP
        ERG.verifyThAdditionalCitizenship();
        ERG.verifyTlAdditionalCitizenship();
        ERG.verifyTlvAdditionalCitizenship();

        //ADDITIONAL INFORMATION
        ERG.verifyThAdditionalInformation();
        ERG.verifyTlAdditionalInformation();
        ERG.verifyTlvAdditionalInformation();
    }

// FIRST NAME
    @When("The user has inputted a {string} space only in the First Name field")
    public void the_user_has_inputted_a_space_only_in_the_first_name_field(String space) {
        ERG.inputSpaceOnlyFirstName(space);
    }

    @Then("The user should see an error message saying Please enter First Name")
    public void the_user_should_see_an_error_message_saying_please_enter_first_name() {

    }

    @When("The user has inputted a {string} dot only in the First Name field")
    public void the_user_has_inputted_a_dot_only_in_the_first_name_field(String dot) {
        ERG.inputDotOnlyFirstName(dot);
    }

    @When("The user has inputted a {string} dash only in the First Name field")
    public void the_user_has_inputted_a_dash_only_in_the_first_name_field(String dash) {
        ERG.inputDashOnlyFirstName(dash);
    }

    @When("The user has inputted a {string} name with a space in the First Name field")
    public void the_user_has_inputted_a_name_with_a_space_in_the_first_name_field(String compoundSpace) {
        ERG.inputCompoundSpaceFirstName(compoundSpace);
    }

    @Then("The user should not see an error message")
    public void the_user_should_not_see_an_error_message() {
    }

    @When("The user has inputted a {string} name with a dot in the First Name field")
    public void the_user_has_inputted_a_name_with_a_dot_in_the_first_name_field(String compoundDot) {
        ERG.inputCompoundDotFirstName(compoundDot);
    }

    @When("The user has inputted a {string} name with a dash in the First Name field")
    public void the_user_has_inputted_a_name_with_a_dash_in_the_first_name_field(String compoundDash) {
        ERG.inputCompoundDashFirstName(compoundDash);
    }

    @When("The user has inputted a {string} name with alphanumeric \\(ASCII) characters in the First Name field")
    public void the_user_has_inputted_a_name_with_alphanumeric_ascii_characters_in_the_first_name_field(String alphaNumeric) {
        ERG.inputAlphaNumericFirstName(alphaNumeric);
    }

    @When("The user has inputted a {string} name with numeric characters  in the First Name field")
    public void the_user_has_inputted_a_name_with_numeric_characters_in_the_first_name_field(String numeric) {
        ERG.inputNumericFirstName(numeric);
    }

    @When("The user has left {string} blank the First Name field")
    public void the_user_has_left_blank_the_first_name_field(String blank) {
        ERG.inputBlankFirstName(blank);
    }

    @When("The user has inputted a {string} First Name with less than 50 characters.")
    public void the_user_has_inputted_a_name_with_less_than_characters(String lessThan50) {
        ERG.inputLessThan50FirstName(lessThan50);
    }

    @When("The user has inputted a {string} First Name with more than 50 characters.")
    public void the_user_has_inputted_a_name_with_more_than_characters(String moreThan50) {
        ERG.inputMoreThan50FirstName(moreThan50);
    }

    @Then("The typed character will no longer show in the text field.")
    public void the_typed_character_will_no_longer_show_in_the_text_field() {
    }

    @When("The user has inputted anything other than alphanumeric, a space, a dash, or a period {string} in the First Name field.")
    public void the_user_has_inputted_anything_other_than_alphanumeric_a_space_a_dash_or_a_period(String otherCharacter) {
        ERG.inputOtherCharacterFirstName(otherCharacter);
    }

    @Then("The user should see an error message saying, Please use alphabetic letters, numbers, space, dash and period only.")
    public void the_user_should_see_an_error_message_saying_please_use_alphabetic_letters_numbers_space_dash_and_period_only() {
    }

    //LAST NAME
    @When("The user has inputted a {string} space only in the Last Name field")
    public void theUserHasInputtedASpaceOnlyInTheLastNameField(String arg0) {
    }

    @Then("The user should see an error message saying Please enter Last Name")
    public void theUserShouldSeeAnErrorMessageSayingPleaseEnterLastName() {
    }

    @When("The user has inputted a {string} dot only in the Last Name field")
    public void theUserHasInputtedADotOnlyInTheLastNameField(String arg0) {
    }

    @When("The user has inputted a {string} dash only in the Last Name field")
    public void theUserHasInputtedADashOnlyInTheLastNameField(String arg0) {
    }

    @When("The user has inputted a {string} name with a space in the Last Name field")
    public void theUserHasInputtedANameWithASpaceInTheLastNameField(String arg0) {
    }

    @When("The user has inputted a {string} name with a dot in the Last Name field")
    public void theUserHasInputtedANameWithADotInTheLastNameField(String arg0) {
    }

    @When("The user has inputted a {string} name with a dash in the Last Name field")
    public void theUserHasInputtedANameWithADashInTheLastNameField(String arg0) {
    }

    @When("The user has inputted a {string} name with alphanumeric \\(ASCII) characters in the Last Name field")
    public void theUserHasInputtedANameWithAlphanumericASCIICharactersInTheLastNameField(String arg0) {
    }

    @When("The user has inputted a {string} name with numeric characters  in the Last Name field")
    public void theUserHasInputtedANameWithNumericCharactersInTheLastNameField(String arg0) {
    }

    @When("The user has left {string} blank the Last Name field")
    public void theUserHasLeftBlankTheLastNameField(String arg0) {
    }

    @When("The user has inputted a {string} Last Name with less than {int} characters.")
    public void theUserHasInputtedALastNameWithLessThanCharacters(String arg0, int arg1) {
    }

    @When("The user has inputted a {string} Last Name with more than {int} characters.")
    public void theUserHasInputtedALastNameWithMoreThanCharacters(String arg0, int arg1) {
    }

    @When("The user has inputted anything other than alphanumeric, a space, a dash, or a period {string} in the Last Name field.")
    public void theUserHasInputtedAnythingOtherThanAlphanumericASpaceADashOrAPeriodInTheLastNameField(String arg0) {
    }
}
