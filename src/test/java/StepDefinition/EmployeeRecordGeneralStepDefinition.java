package StepDefinition;

import io.cucumber.java.en.And;
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

    employeeRecordGeneral erg = new employeeRecordGeneral(Driver);

    @Then("Each field is present and populated in Employee Record - General Page")
    public void eachFieldIsPresentAndPopulatedInEmployeeRecordGeneralPage() {
        //NAME
        erg.verifyThName();
        erg.verifyTlName();
        erg.verifyTlvName();

        //BIRTHDAY
        erg.verifyThBirthday();
        erg.verifyTlBirthday();
        //erg.verifyTlvBirthday(); --> Only applies to manual inputs. Refactor this once the field  allows manual inputs.

        //BIRTHPLACE
        erg.verifyThBirthplace();
        erg.verifyTlBirthplace();
        erg.verifyTlvBirthplace();

        //CITIZENSHIP
        erg.verifyThCitizenship();
        erg.verifyTlCitizenship();
        erg.verifyTlvCitizenship();

        //ADDITIONAL CITIZENSHIP
        erg.verifyThAdditionalCitizenship();
        erg.verifyTlAdditionalCitizenship();
        erg.verifyTlvAdditionalCitizenship();

        //ADDITIONAL INFORMATION
        erg.verifyThAdditionalInformation();
        erg.verifyTlAdditionalInformation();
        erg.verifyTlvAdditionalInformation();
    }

    //<-----------------------------------------------------------------------------First Name------------------------------------------------------------------------------>
    @When("The user has inputted a {string} space only in the First Name field")
    public void the_user_has_inputted_a_space_only_in_the_first_name_field(String space) {
        erg.inputSpaceOnlyFirstName(space);
    }

    @Then("The user should see an error message saying Please enter First Name")
    public void the_user_should_see_an_error_message_saying_please_enter_first_name() {

    }

    @When("The user has inputted a {string} dot only in the First Name field")
    public void the_user_has_inputted_a_dot_only_in_the_first_name_field(String dot) {
        erg.inputDotOnlyFirstName(dot);
    }

    @When("The user has inputted a {string} dash only in the First Name field")
    public void the_user_has_inputted_a_dash_only_in_the_first_name_field(String dash) {
        erg.inputDashOnlyFirstName(dash);
    }

    @When("The user has inputted a {string} name with a space in the First Name field")
    public void the_user_has_inputted_a_name_with_a_space_in_the_first_name_field(String compoundSpace) {
        erg.inputCompoundSpaceFirstName(compoundSpace);
    }

    @Then("The user should not see an error message")
    public void the_user_should_not_see_an_error_message() {
    }

    @When("The user has inputted a {string} name with a dot in the First Name field")
    public void the_user_has_inputted_a_name_with_a_dot_in_the_first_name_field(String compoundDot) {
        erg.inputCompoundDotFirstName(compoundDot);
    }

    @When("The user has inputted a {string} name with a dash in the First Name field")
    public void the_user_has_inputted_a_name_with_a_dash_in_the_first_name_field(String compoundDash) {
        erg.inputCompoundDashFirstName(compoundDash);
    }

    @When("The user has inputted a {string} name with alphanumeric \\(ASCII) characters in the First Name field")
    public void the_user_has_inputted_a_name_with_alphanumeric_ascii_characters_in_the_first_name_field(String alphaNumeric) {
        erg.inputAlphaNumericFirstName(alphaNumeric);
    }

    @When("The user has inputted a {string} name with numeric characters  in the First Name field")
    public void the_user_has_inputted_a_name_with_numeric_characters_in_the_first_name_field(String numeric) {
        erg.inputNumericFirstName(numeric);
    }

    @When("The user has left {string} blank the First Name field")
    public void the_user_has_left_blank_the_first_name_field(String blank) {
        erg.inputBlankFirstName(blank);
    }

    @When("The user has inputted a {string} First Name with less than 50 characters.")
    public void the_user_has_inputted_a_name_with_less_than_characters(String lessThan50) {
        erg.inputLessThan50FirstName(lessThan50);
    }

    @When("The user has inputted a {string} First Name with more than 50 characters.")
    public void the_user_has_inputted_a_name_with_more_than_characters(String moreThan50) {
        erg.inputMoreThan50FirstName(moreThan50);
    }

    @Then("The typed character will no longer show in the text field.")
    public void the_typed_character_will_no_longer_show_in_the_text_field() {
    }

    @When("The user has inputted anything other than alphanumeric, a space, a dash, or a period {string} in the First Name field.")
    public void the_user_has_inputted_anything_other_than_alphanumeric_a_space_a_dash_or_a_period(String otherCharacter) {
        erg.inputOtherCharacterFirstName(otherCharacter);
    }

    @Then("The user should see an error message saying, Please use alphabetic letters, numbers, space, dash and period only.")
    public void the_user_should_see_an_error_message_saying_please_use_alphabetic_letters_numbers_space_dash_and_period_only() {
    }

    //<-----------------------------------------------------------------------------Last Name------------------------------------------------------------------------------>
    @When("The user has inputted a {string} space only in the Last Name field")
    public void theUserHasInputtedASpaceOnlyInTheLastNameField(String space) {
        erg.inputSpaceOnlyLastName(space);
    }

    @Then("The user should see an error message saying Please enter Last Name")
    public void theUserShouldSeeAnErrorMessageSayingPleaseEnterLastName() {
    }

    @When("The user has inputted a {string} dot only in the Last Name field")
    public void theUserHasInputtedADotOnlyInTheLastNameField(String dot) {
        erg.inputDotOnlyLastName(dot);
    }

    @When("The user has inputted a {string} dash only in the Last Name field")
    public void theUserHasInputtedADashOnlyInTheLastNameField(String dash) {
        erg.inputDashOnlyLastName(dash);
    }

    @When("The user has inputted a {string} name with a space in the Last Name field")
    public void theUserHasInputtedANameWithASpaceInTheLastNameField(String compoundSpace) {
        erg.inputCompoundSpaceLastName(compoundSpace);
    }

    @When("The user has inputted a {string} name with a dot in the Last Name field")
    public void theUserHasInputtedANameWithADotInTheLastNameField(String compoundDot) {
        erg.inputCompoundDotLastName(compoundDot);
    }

    @When("The user has inputted a {string} name with a dash in the Last Name field")
    public void theUserHasInputtedANameWithADashInTheLastNameField(String compoundDash) {
        erg.inputCompoundDashLastName(compoundDash);
    }

    @When("The user has inputted a {string} name with alphanumeric \\(ASCII) characters in the Last Name field")
    public void theUserHasInputtedANameWithAlphanumericASCIICharactersInTheLastNameField(String alphaNumeric) {
        erg.inputAlphaNumericLastName(alphaNumeric);
    }

    @When("The user has inputted a {string} name with numeric characters  in the Last Name field")
    public void theUserHasInputtedANameWithNumericCharactersInTheLastNameField(String numeric) {
        erg.inputNumericLastName(numeric);
    }

    @When("The user has left {string} blank the Last Name field")
    public void theUserHasLeftBlankTheLastNameField(String blank) {
        erg.inputBlankLastName(blank);
    }

    @When("The user has inputted a {string} Last Name with less than 50 characters.")
    public void theUserHasInputtedALastNameWithLessThanCharacters(String lessThan50) {
        erg.inputLessThan50LastName(lessThan50);
    }

    @When("The user has inputted a {string} Last Name with more than 50 characters.")
    public void theUserHasInputtedALastNameWithMoreThanCharacters(String moreThan50) {
        erg.inputMoreThan50LastName(moreThan50);
    }

    @When("The user has inputted anything other than alphanumeric, a space, a dash, or a period {string} in the Last Name field.")
    public void theUserHasInputtedAnythingOtherThanAlphanumericASpaceADashOrAPeriodInTheLastNameField(String arg0) {
    }

    //<-----------------------------------------------------------------------------Middle Name------------------------------------------------------------------------------>
    @When("The user has inputted a {string} space only in the Middle Name field")
    public void theUserHasInputtedASpaceOnlyInTheMiddleNameField(String space) {
        erg.inputSpaceOnlyMiddleName(space);
    }

    @Then("The user should see an error message saying Please enter Middle Name")
    public void theUserShouldSeeAnErrorMessageSayingPleaseEnterMiddleName() {
    }

    @When("The user has inputted a {string} dot only in the Middle Name field")
    public void theUserHasInputtedADotOnlyInTheMiddleNameField(String dot) {
        erg.inputDotOnlyMiddleName(dot);
    }

    @When("The user has inputted a {string} dash only in the Middle Name field")
    public void theUserHasInputtedADashOnlyInTheMiddleNameField(String dash) {
        erg.inputDashOnlyMiddleName(dash);
    }

    @When("The user has inputted a {string} name with a space in the Middle Name field")
    public void theUserHasInputtedANameWithASpaceInTheMiddleNameField(String compoundSpace) {
        erg.inputCompoundSpaceLastName(compoundSpace);
    }

    @When("The user has inputted a {string} name with a dot in the Middle Name field")
    public void theUserHasInputtedANameWithADotInTheMiddleNameField(String compoundDot) {
        erg.inputCompoundDotMiddleName(compoundDot);
    }

    @When("The user has inputted a {string} name with a dash in the Middle Name field")
    public void theUserHasInputtedANameWithADashInTheMiddleNameField(String compoundDash) {
        erg.inputCompoundDashMiddleName(compoundDash);
    }

    @When("The user has inputted a {string} name with alphanumeric \\(ASCII) characters in the Middle Name field")
    public void theUserHasInputtedANameWithAlphanumericASCIICharactersInTheMiddleNameField(String alphaNumeric) {
        erg.inputAlphaNumericMiddleName(alphaNumeric);
    }

    @When("The user has inputted a {string} name with numeric characters  in the Middle Name field")
    public void theUserHasInputtedANameWithNumericCharactersInTheMiddleNameField(String numeric) {
        erg.inputNumericMiddleName(numeric);
    }

    @When("The user has left {string} blank the Middle Name field")
    public void theUserHasLeftBlankTheMiddleNameField(String blank) {
        erg.inputBlankMiddleName(blank);
    }

    @When("The user has inputted a {string} Middle Name with less than 50 characters.")
    public void theUserHasInputtedAMiddleNameWithLessThanCharacters(String lessThan50) {
        erg.inputLessThan50MiddleName(lessThan50);
    }

    @When("The user has inputted a {string} Middle Name with more than 50 characters.")
    public void theUserHasInputtedAMiddleNameWithMoreThanCharacters(String moreThan50) {
        erg.inputMoreThan50MiddleName(moreThan50);
    }

    @When("The user has inputted anything other than alphanumeric, a space, a dash, or a period {string} in the Middle Name field.")
    public void theUserHasInputtedAnythingOtherThanAlphanumericASpaceADashOrAPeriodInTheMiddleNameField(String arg0) {
    }

//<-----------------------------------------------------------------------------Suffix------------------------------------------------------------------------------>
    @When("The user has left {string} blank the Suffix field")
    public void theUserHasLeftBlankTheSuffixField(String blank) {
        erg.inputBlankSuffix(blank);
    }

    @Then("The user should see an error message saying Please enter Suffix")
    public void theUserShouldSeeAnErrorMessageSayingPleaseEnterSuffix() {
    }

    @When("The user has inputted a {string} Suffix with less than 4 characters.")
    public void theUserHasInputtedASuffixWithLessThanCharacters(String lessThan4) {
        erg.inputLessThan4Suffix(lessThan4);
    }

    @When("The user has inputted a {string} Suffix with more than 4 characters.")
    public void theUserHasInputtedASuffixWithMoreThanCharacters(String moreThan4) {
        erg.inputMoreThan4Suffix(moreThan4);
    }

    @When("The user has inputted anything other than alphanumeric, a space, a dash, or a period {string} in the Suffix field.")
    public void theUserHasInputtedAnythingOtherThanAlphanumericASpaceADashOrAPeriodInTheSuffixField(String arg0) {
    }
    //<-----------------------------------------------------------------------------Birthday------------------------------------------------------------------------------>
    @When("The user has chosen a past date in the calendar")
    public void theUserHasChosenAPastDateInTheCalendar() throws InterruptedException {
        erg.chooseAPastDateInTheCalendarPicker();
    }

    @Then("The birthday should be accepted")
    public void theBirthdayShouldBeAccepted() {
    }

    @When("The user has chosen a future date in the calendar")
    public void theUserHasChosenAFutureDateInTheCalendar(String sampleDate) throws InterruptedException {
        erg.chooseAFutureDateInTheCalendarPicker(sampleDate);
    }

    @Then("The user should see an error message saying, Please enter complete birthdate.")
    public void theUserShouldSeeAnErrorMessageSayingPleaseEnterCompleteBirthdate() {
    }

    @When("The user tries pick a date before {string}")
    public void theUserTriesPickADateBefore(String sampleDate) throws InterruptedException {
        erg.chooseADateBefore01011923InTheCalendarPicker(sampleDate);
    }

    @Then("The dates before {string} are greyed out and are disabled from being clicked.")
    public void theDatesBeforeAreGreyedOutAndAreDisabledFromBeingClicked() throws InterruptedException {
        erg.checkDatesBefore01011923IfDisabled();
    }

    @When("The user has checked the Birthdate field value")
    public void theUserHasCheckedTheBirthdateFieldValue() {
        erg.checkBirthdateFieldValue();
    }

    @Then("The calculated age is correct according to the birthdate and timezone selected.")
    public void theCalculatedAgeIsCorrectAccordingToTheBirthdateAndTimezoneSelected() {
        erg.checkAgeFieldValue();
    }

    @And("The Age field is not editable.")
    public void theAgeFieldIsNotEditable() {
        erg.checkIfAgeFieldIsDisabled();
    }
    //<-----------------------------------------------------------------------------City------------------------------------------------------------------------------>
    @When("The user has inputted a {string} space only in the City field")
    public void theUserHasInputtedASpaceOnlyInTheCityField(String space) {
        erg.inputSpaceOnlyCity(space);
    }

    @Then("The user should see not see an error message")
    public void theUserShouldSeeNotSeeAnErrorMessage() {
    }

    @When("The user has inputted a {string} dot only in the City field")
    public void theUserHasInputtedADotOnlyInTheCityField(String dot) {
        erg.inputDotOnlyCity(dot);

    }

    @Then("The user should see an error message saying Please enter City")
    public void theUserShouldSeeAnErrorMessageSayingPleaseEnterCity() {
    }

    @When("The user has inputted a {string} dash only in the City field")
    public void theUserHasInputtedADashOnlyInTheCityField(String dash) {
        erg.inputDashOnlyCity(dash);
    }

    @When("The user has inputted a {string} name with alphanumeric \\(ASCII) characters in the City field")
    public void theUserHasInputtedANameWithAlphanumericASCIICharactersInTheCityField(String alphaNumeric) {
        erg.inputAlphaNumericCity(alphaNumeric);
    }

    @When("The user has inputted a {string} name with numeric characters  in the City field")
    public void theUserHasInputtedANameWithNumericCharactersInTheCityField(String numeric) {
        erg.inputNumericCity(numeric);
    }
    @When("The user has left {string} blank the City field")
    public void theUserHasLeftBlankTheCityField(String blank) {
        erg.inputBlankCity(blank);
    }

    @When("The user has inputted a {string} City with less than 60 characters.")
    public void theUserHasInputtedACityWithLessThanCharacters(String lessThan60) {
        erg.inputLessThan60City(lessThan60);
    }

    @When("The user has inputted a {string} City with more than 60 characters.")
    public void theUserHasInputtedACityWithMoreThanCharacters(String moreThan60) {
        erg.inputMoreThan60City(moreThan60);
    }

    @When("The user has inputted a {string} valid City")
    public void theUserHasInputtedACity(String valid) {
        erg.inputValidCity(valid);
    }

    @Then("The country is automatically pre-filled based on the city entered.")
    public void theCountryIsAutomaticallyPreFilledBasedOnTheCityEntered() {
        erg.checkIfCountryFieldIsPreFilled();
    }
    //<-----------------------------------------------------------------------------Town------------------------------------------------------------------------------>
    @When("The user has inputted a {string} space only in the Town field")
    public void theUserHasInputtedASpaceOnlyInTheTownField(String space) {
        erg.inputSpaceOnlyTown(space);
    }

    @When("The user has inputted a {string} dot only in the Town field")
    public void theUserHasInputtedADotOnlyInTheTownField(String dot) {
        erg.inputDotOnlyTown(dot);
    }

    @Then("The user should see an error message saying Please enter Town")
    public void theUserShouldSeeAnErrorMessageSayingPleaseEnterTown() {
    }

    @When("The user has inputted a {string} dash only in the Town field")
    public void theUserHasInputtedADashOnlyInTheTownField(String dash) {
        erg.inputDashOnlyTown(dash);
    }

    @When("The user has inputted a {string} name with alphanumeric \\(ASCII) characters in the Town field")
    public void theUserHasInputtedANameWithAlphanumericASCIICharactersInTheTownField(String alphaNumeric) {
        erg.inputAlphaNumericTown(alphaNumeric);
    }

    @When("The user has inputted a {string} name with numeric characters  in the Town field")
    public void theUserHasInputtedANameWithNumericCharactersInTheTownField(String numeric) {
        erg.inputNumericTown(numeric);
    }

    @When("The user has left {string} blank the Town field")
    public void theUserHasLeftBlankTheTownField(String blank) {
        erg.inputBlankTown(blank);
    }

    @When("The user has inputted a {string} Town with less than 60 characters.")
    public void theUserHasInputtedATownWithLessThanCharacters(String lessThan60) {
        erg.inputLessThan60Town(lessThan60);
    }

    @When("The user has inputted a {string} Town with more than 60 characters.")
    public void theUserHasInputtedATownWithMoreThanCharacters(String moreThan60) {
        erg.inputMoreThan60Town(moreThan60);
    }

    @When("The user has inputted a {string} valid Town")
    public void theUserHasInputtedAValidTown(String valid) {
        erg.inputValidTown(valid);
    }

    @Then("The country is automatically pre-filled based on the town entered.")
    public void theCountryIsAutomaticallyPreFilledBasedOnTheTownEntered() {
        erg.checkIfCountryFieldIsPreFilled();
    }

    @When("The user has chosen {string} US in the Country field")
    public void the_user_has_chosen_us_in_the_country_field(String country) {
        erg.chooseUSForCountryField(country);
    }

    @Then("The State field should be present")
    public void theStateFieldShouldBePresent() {
        erg.checkStateFieldIfDisplayed();
    }

    @When("The user has left the State field blank")
    public void theUserHasLeftTheStateFieldBlank() {
        erg.checkStateFieldIfBlank();
    }

    @Then("The user should see an error message saying, Please enter State.")
    public void theUserShouldSeeAnErrorMessageSayingPleaseEnterState() {
        erg.verifyErrMsgForState();
    }

    @Then("The user should see the complete list of options for the state dropdown.")
    public void theUserShouldSeeTheCompleteListOfOptionsForTheStateDropdown() {
        erg.checkIfAllStateIsPresent();
    }
}
