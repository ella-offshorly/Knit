Feature: Create Project
  This feature deals with creating a project from scratch with and without details.

@smoke
  Scenario Outline: To verify that once the user has entered text in the Project Name text field, the user will be able to create a project with no details.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    When The user is in the Create Projects Page
    When The user has clicked Start from Scratch button
    And The user has entered a text "<projectName>" in the Project Name text field
    Then The user should be able to create a project with no details.
    Examples:
      | emailAddress         | password   | projectName |
      | ella+3@offshorly.com | Welcome@08 | knitProject |


  Scenario Outline: To verify that once the user has entered text in the Project Name text field and added more details, the user will be able to create a project with details.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    When The user is in the Create Projects Page
    And The user has clicked Start from Scratch button
    And The user has entered a text "<projectName>" in the Project Name text field
    When The user has clicked Add More Details
    And The user has entered a description "<description>"
    And The user has picked a due date "<dueDate>"
    And The user has chosen a priority
    And The user has entered a tag "<tag>"
    Then The user should be able to create a project with details.
    Examples:
      | emailAddress         | password   | projectName | description              | dueDate  | tag     |
      | ella+3@offshorly.com | Welcome@08 | knitProject | this is test description | 11/13/23 | testTag |
