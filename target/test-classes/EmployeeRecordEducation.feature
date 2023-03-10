Feature: Employee Record - Contact
  This feature deals with the Contact Information of an employee inside the Employee Record Page.

  #----------------------------------------------Login-------------------------------------------
  # TO DO: 1. Login will be replaced by Sign Up. 2. Adding test cases for manually  inputting the user information in the HR Hub. 3. Then from there will have to verify the details by comparing actual vs expected.
  Scenario Outline: To verify that once a valid email and password is entered, the user will proceed to Knit Dashboard
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Examples:
      | emailAddress            | password   |
      | testella.four@gmail.com | Welcome@08 |

    #Commenting this scenario as the current default photo does not match the business requirement.
#  Scenario: To verify that the default and empty photo is displayed as a greyed out headshot with 1x1 caption.
#    Given The user is in the Employee Record - General Page
#    When The user checks the employee photo
#    Then The default and empty photo is displayed as a greyed out headshot with 1x1 caption

    #Commenting this scenario as the FE won't allow editing the default photo as of the moment
#  Scenario: To verify that an empty photo is displayed as a greyed out headshot with 1x1 caption once the previous photo is removed.
#    Given The user is in the Employee Record - General Page
#    And The user has successfully uploaded an employee photo
#    When The user removes the employee photo
#    Then The default and empty photo is displayed as a greyed out headshot with 1x1 caption

  #Commenting this scenario as the FE won't allow editing the default photo as of the moment
#  Scenario: To verify that the user has uploaded the right format and size.
#    Given The user is in the Employee Record - General Page
#    When The user has uploaded a .jpg photo in 1x1 size
#    Then The photo should be accepted
#    When The user has uploaded a .jpg photo in 2x2
#    Then The user should shown a recommended resized or cropped photo in the placeholder
#    When The user has uploaded a .png photo in 1x1 size
#    Then The photo should be accepted
#    When The user has uploaded a .png photo in 2x2
#    Then The user should shown a recommended resized or cropped photo in the placeholder

  #Commenting this scenario as the FE won't allow editing and this can only be verified once Save button is clickable.
#  Scenario: To verify that the photo is not mandatory.
#    Given The user is in the Employee Record - General Page
#    When The user does not upload an employee photo
#    Then There is no error telling the user that the photo is mandatory

 #------------------Veriying text labels are present. FE checking for the meantime since adding/editing employee info is in the BE-------------
  Scenario: To verify that all fields are present once the employee data is setup in the backend thru Django.
    Given The user is in the Employee Record - Education Page
    Then Each field is present and populated in Employee Record - Education Page
