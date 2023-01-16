Feature: SignUp
  This feature deals with user sign up or registration.

#  Background: Set up test environment
#    Given The user is in the test environment
#    When The user navigates on the Sign Up Page

 #Using "Examples" table will hold multiple data for testing. If the tester is writing a Scenario Outline, he should have an Example table.
 #The scenario will be running in loop until the last datum is used.

 #<-----------------------------------------SIGN UP VIA EMAIL: Successful Sign Up------------------------------------------>

  Scenario Outline: To verify that once a valid email and password is entered, the user will proceed to email verification
    Given The user is in the Sign Up Page
    When The user has entered the email address "<emailAddress>" for sign up
    And The user has clicked on Next button
    And The user has entered the password "<password>" for sign up
    And The user has agreed to the Terms of Use and Privacy Policy
    And The user has clicked on recaptcha
    And The user has clicked Submit button
    Then The user will proceed to email verification
    Examples:
      | emailAddress | password |
      | testKnit     | knit@    |


  Scenario Outline: To verify if the user receives an email verification through their email address after account creation
    Given The user is in the Sign Up Page
    When The user has entered the email address "<emailAddress>" for sign up
    And The user has clicked on Next button
    And The user has entered the password "<password>" for sign up
    And The user has agreed to the Terms of Use and Privacy Policy
    And The user has clicked on recaptcha
    And The user has clicked Submit button
    And The user will proceed to email verification
    When The user has checked the email inbox using email address "<emailAddress>"
    Then The user should receive a verification email from Knit
    Examples:
      | emailAddress | password |
      | testKnit     | knit@    |

    #<-----------------------------------------SIGN UP VIA EMAIL: Unsuccessful Sign Up------------------------------------------>

  Scenario Outline: To verify that the email field does not consider an email address that has already been registered in Knit
    Given The user is in the Sign Up Page
    When The user has entered an existing email address "<emailAddress>" for sign up
    And The user has clicked on Next button
    Then The user should shown an error message, "This e-mail is already taken. Login." for the existing email address
    Examples:
      | emailAddress         |
      | ella+3@offshorly.com |

  Scenario Outline: To verify that the email text field does not consider a blank entry.
    Given The user is in the Sign Up Page
    When The user has entered empty email address "<emailAddress>" for sign up
    And The user has clicked on Next button
    Then The user should shown an error message, "Please enter your email" for the empty email
    Examples:
      | emailAddress |
      |              |

  Scenario Outline: To verify that the email field does not consider an entry that is missing the '@' symbol
    Given The user is in the Sign Up Page
    When The user has entered the invalid email address format "<emailAddress>" for sign up
    And The user has clicked on Next button
    Then The user should shown an error message, "Please enter a valid email" for the missing @ symbol
    Examples:
      | emailAddress      |
      | testKnitgmail.com |



    #<-----------------------------------------SIGN UP VIA GOOGLE: Successful Sign Up------------------------------------------>
  Scenario Outline: To verify that the user can sign up using a valid gmail account
    Given The user is in the Sign Up Page
    When The user has clicked on Continue With Google
    And The user has logged in Google email address "<emailAddress>" and password "<password>" for sign up
    Then The user is redirected to the Knit dashboard from Google
    Examples:
      | emailAddress       | password       |
      | ella@offshorly.com | Ailurophile@13 |

     #<-----------------------------------------SIGN UP VIA FACEBOOK: Successful Sign Up------------------------------------------>
  Scenario Outline: To verify that the user can sign up using a valid facebook account
    Given The user is in the Sign Up Page
    When The user has clicked on Continue With Facebook
    And The user has logged in Facebook email address "<emailAddress>" and password "<password>" for sign up
    Then The user is redirected to the Knit dashboard from Facebook
    Examples:
      | emailAddress           | password       |
      | testella.one@gmail.com | Ailurophile@13 |