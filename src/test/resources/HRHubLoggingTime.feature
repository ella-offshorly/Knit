Feature: HR Hub - Logging Time

  Scenario: To verify that the fields are blank if the user has not yet logged in for the day
    Given The user is in the HR Hub - Dashboard
    Then The user should see the Time In 00:00
    And The user should see the Time Out 00:00

  Scenario Outline: To verify the timer will start counting after clicking "Time In" and the label will change to "Time Out"
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    When The user has clicked Time In
    Then The timer should start counting
    And The Work Status should be Working
    Examples:
      | emailAddress                            | password              |
      | testKnit26-1-123-23-3-19@mailinator.com | knit@26-1-123-23-3-24 |

  Scenario: Debug current time
    Then The current time is displayed

#Prerequisite: User has a fixed shift, user has clicked "Time In", early out was not approved, the current time has not yet reached the scheduled Time Out
  Scenario: To verify that the "Time Out" button is greyed out and that nothing happens when it is clicked
    Given The user is in the HR Hub - Dashboard
    Then The Time Out button is disabled

##Prerequisite: User has a fixed shift, user has clicked "Time In", the current time has reached the scheduled Time Out
#  Scenario: To verify that button labels and fields will change once "Time Out" is clicked --> FOR REVIEW
#    Given The user is in the HR Hub - Dashboard
#    Then The Time Out button is disabled