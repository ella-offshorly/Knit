Feature: Login
  This feature deals with user login.

#  Background: Set up test environment
#    Given The user is in the test environment
#    When The user navigates on the Sign Up Page

 #Using "Examples" table will hold multiple data for testing. If the tester is writing a Scenario Outline, he should have an Example table.
 #The scenario will be running in loop until the last datum is used.

 #<-----------------------------------------LOGIN VIA EMAIL: Successful Login------------------------------------------>

  Scenario Outline: To verify that once a valid email and password is entered, the user will proceed to Knit Dashboard
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Examples:
      | emailAddress         | password   |
      | ella+3@offshorly.com | Welcome@08 |



 #<-----------------------------------------LOGIN VIA EMAIL: Unsuccessful Login------------------------------------------>
  Scenario Outline: To verify that the email text field does not consider a blank entry.
    Given The user is in the Login Page
    When The user has entered empty email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    Then The user should shown an error message, "Please enter your email" for the empty email for login
    Examples:
      | emailAddress |
      |              |

  Scenario Outline: To verify that the email field does not consider an entry that is missing the '@' symbol for login
    Given The user is in the Login Page
    When The user has entered the invalid email address format "<emailAddress>" for login
    And The user has clicked on Next button for login
    Then The user should shown an error message, "Please enter a valid email" for the missing @ symbol for login
    Examples:
      | emailAddress        |
      | ella+3offshorly.com |

  Scenario Outline: To verify that the email field does not consider an email address that has not been registered in Knit
    Given The user is in the Login Page
    When The user has entered an unregistered email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    Then The user should shown an error message, "We couldn't find this username. Sign up now." for the unregistered email address for login
    Examples:
      | emailAddress |
      | unregistered |


    #<-----------------------------------------LOGIN VIA GOOGLE: Successful Login------------------------------------------>
  @smoke
  Scenario Outline: To verify that the user can login using a valid gmail account
    Given The user is in the Login Page
    When The user has clicked on Continue With Google for login
    And The user has logged in Google email address "<emailAddress>" and password "<password>" for login
    Then The user is redirected to the Knit dashboard after login
    Examples:
      | emailAddress       | password       |
      | ella@offshorly.com | Ailurophile@13 |

     #<-----------------------------------------LOGIN VIA FACEBOOK: Successful Login------------------------------------------>
  Scenario Outline: To verify that the user can login using a valid facebook account
    Given The user is in the Login Page
    When The user has clicked on Continue With Facebook for login
    And The user has logged in Facebook email address "<emailAddress>" and password "<password>" for login
    Then The user is redirected to the Knit dashboard after login
    Examples:
      | emailAddress           | password       |
      | testella.one@gmail.com | Ailurophile@13 |