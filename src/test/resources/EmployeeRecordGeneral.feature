Feature: Employee Record - General
  This feature deals with the General Information of an employee inside the Employee Record Page.

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

#  Scenario: To verify that the default and empty photo is displayed as a greyed out headshot with 1x1 caption. --> BLOCKED: The current default photo does not match the business requirement.
#    Given The user is in the Employee Record - General Page
#    When The user checks the employee photo
#    Then The default and empty photo is displayed as a greyed out headshot with 1x1 caption

#  Scenario: To verify that an empty photo is displayed as a greyed out headshot with 1x1 caption once the previous photo is removed.--> BLOCKED: The FE won't allow editing the default photo as of the moment
#    Given The user is in the Employee Record - General Page
#    And The user has successfully uploaded an employee photo
#    When The user removes the employee photo
#    Then The default and empty photo is displayed as a greyed out headshot with 1x1 caption

#  Scenario: To verify that the user has uploaded the right format and size. --> BLOCKED: The FE won't allow editing the default photo as of the moment
#    Given The user is in the Employee Record - General Page
#    When The user has uploaded a .jpg photo in 1x1 size
#    Then The photo should be accepted
#    When The user has uploaded a .jpg photo in 2x2
#    Then The user should shown a recommended resized or cropped photo in the placeholder
#    When The user has uploaded a .png photo in 1x1 size
#    Then The photo should be accepted
#    When The user has uploaded a .png photo in 2x2
#    Then The user should shown a recommended resized or cropped photo in the placeholder

#  Scenario: To verify that the photo is not mandatory. --> BLOCKED: The FE won't allow editing and this can only be verified once Save button is clickable.
#    Given The user is in the Employee Record - General Page
#    When The user does not upload an employee photo
#    Then There is no error telling the user that the photo is mandatory

#----------------------------------------------Inputting and editing details on General Tab ---------------------------------------------------------#
  Scenario Outline: To verify that the user has inputted an accepted first name.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the Employee Record - Edit General Page
    When The user has inputted a "<space>" space only in the First Name field
    Then The user should see an error message saying Please enter First Name
    When The user has inputted a "<dot>" dot only in the First Name field
    Then The user should see an error message saying Please enter First Name
    When The user has inputted a "<dash>" dash only in the First Name field
    Then The user should see an error message saying Please enter First Name
    When The user has inputted a "<compoundSpace>" name with a space in the First Name field
    Then The user should not see an error message
    When The user has inputted a "<compoundDot>" name with a dot in the First Name field
    Then The user should not see an error message
    When The user has inputted a "<compoundDash>" name with a dash in the First Name field
    Then The user should not see an error message
    When The user has inputted a "<alphaNumeric>" name with alphanumeric (ASCII) characters in the First Name field
    Then The user should not see an error message
    When The user has inputted a "<numeric>" name with numeric characters  in the First Name field
    Then The user should not see an error message
    When The user has left "<blank>" blank the First Name field
    Then The user should see an error message saying Please enter First Name
    When The user has inputted a "<lessThan50>" First Name with less than 50 characters.
    Then The user should not see an error message
    When The user has inputted a "<moreThan50>" First Name with more than 50 characters.
    Then The typed character will no longer show in the text field.
    When The user has inputted anything other than alphanumeric, a space, a dash, or a period "<otherCharacter>" in the First Name field.
    Then The user should see an error message saying, Please use alphabetic letters, numbers, space, dash and period only.
    Examples:
      | emailAddress            | password   | space | dot | dash | compoundSpace | compoundDot | compoundDash | alphaNumeric | numeric | blank | lessThan50                                                                                         | moreThan50                                           | otherCharacter |
      | testella.four@gmail.com | Welcome@08 |       | .   | -    | Test Ella     | Test.Ella   | Test-Ella    | TestElla123  | 123     |       | zYVRwt4xwcwpRbbPZPBvAqbP3WHKeZIWG9PZ0IuziE5EWpRjfzYVRwt4xwcwpRbbPZPBvAqbP3WHKeZIWG9PZ0IuziE5EWpRjf | zYVRwt4xwcwpRbbPZPBvAqbP3WHKeZIWG9PZ0IuziE5EWpRjfu52 | /              |

  Scenario Outline: To verify that the user has inputted an accepted last name.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the Employee Record - Edit General Page
    When The user has inputted a "<space>" space only in the Last Name field
    Then The user should see an error message saying Please enter Last Name
    When The user has inputted a "<dot>" dot only in the Last Name field
    Then The user should see an error message saying Please enter Last Name
    When The user has inputted a "<dash>" dash only in the Last Name field
    Then The user should see an error message saying Please enter Last Name
    When The user has inputted a "<compoundSpace>" name with a space in the Last Name field
    Then The user should not see an error message
    When The user has inputted a "<compoundDot>" name with a dot in the Last Name field
    Then The user should not see an error message
    When The user has inputted a "<compoundDash>" name with a dash in the Last Name field
    Then The user should not see an error message
    When The user has inputted a "<alphaNumeric>" name with alphanumeric (ASCII) characters in the Last Name field
    Then The user should not see an error message
    When The user has inputted a "<numeric>" name with numeric characters  in the Last Name field
    Then The user should not see an error message
    When The user has left "<blank>" blank the Last Name field
    Then The user should see an error message saying Please enter Last Name
    When The user has inputted a "<lessThan50>" Last Name with less than 50 characters.
    Then The user should not see an error message
    When The user has inputted a "<moreThan50>" Last Name with more than 50 characters.
    Then The typed character will no longer show in the text field.
    When The user has inputted anything other than alphanumeric, a space, a dash, or a period "<otherCharacter>" in the Last Name field.
    Then The user should see an error message saying, Please use alphabetic letters, numbers, space, dash and period only.
    Examples:
      | emailAddress            | password   | space | dot | dash | compoundSpace | compoundDot | compoundDash | alphaNumeric | numeric | blank | lessThan50                                                                                         | moreThan50                                           | otherCharacter |
      | testella.four@gmail.com | Welcome@08 |       | .   | -    | Test Ella     | Test.Ella   | Test-Ella    | TestElla123  | 123     |       | zYVRwt4xwcwpRbbPZPBvAqbP3WHKeZIWG9PZ0IuziE5EWpRjfzYVRwt4xwcwpRbbPZPBvAqbP3WHKeZIWG9PZ0IuziE5EWpRjf | zYVRwt4xwcwpRbbPZPBvAqbP3WHKeZIWG9PZ0IuziE5EWpRjfu52 | /              |

  Scenario Outline: To verify that the user has inputted an accepted middle name.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the Employee Record - Edit General Page
    When The user has inputted a "<space>" space only in the Middle Name field
    Then The user should see an error message saying Please enter Middle Name
    When The user has inputted a "<dot>" dot only in the Middle Name field
    Then The user should see an error message saying Please enter Middle Name
    When The user has inputted a "<dash>" dash only in the Middle Name field
    Then The user should see an error message saying Please enter Middle Name
    When The user has inputted a "<compoundSpace>" name with a space in the Middle Name field
    Then The user should not see an error message
    When The user has inputted a "<compoundDot>" name with a dot in the Middle Name field
    Then The user should not see an error message
    When The user has inputted a "<compoundDash>" name with a dash in the Middle Name field
    Then The user should not see an error message
    When The user has inputted a "<alphaNumeric>" name with alphanumeric (ASCII) characters in the Middle Name field
    Then The user should not see an error message
    When The user has inputted a "<numeric>" name with numeric characters  in the Middle Name field
    Then The user should not see an error message
    When The user has left "<blank>" blank the Middle Name field
    Then The user should see an error message saying Please enter Middle Name
    When The user has inputted a "<lessThan50>" Middle Name with less than 50 characters.
    Then The user should not see an error message
    When The user has inputted a "<moreThan50>" Middle Name with more than 50 characters.
    Then The typed character will no longer show in the text field.
    When The user has inputted anything other than alphanumeric, a space, a dash, or a period "<otherCharacter>" in the Middle Name field.
    Then The user should see an error message saying, Please use alphabetic letters, numbers, space, dash and period only.
    Examples:
      | emailAddress            | password   | space | dot | dash | compoundSpace | compoundDot | compoundDash | alphaNumeric | numeric | blank | lessThan50                                                                                         | moreThan50                                           | otherCharacter |
      | testella.four@gmail.com | Welcome@08 |       | .   | -    | Test Ella     | Test.Ella   | Test-Ella    | TestElla123  | 123     |       | zYVRwt4xwcwpRbbPZPBvAqbP3WHKeZIWG9PZ0IuziE5EWpRjfzYVRwt4xwcwpRbbPZPBvAqbP3WHKeZIWG9PZ0IuziE5EWpRjf | zYVRwt4xwcwpRbbPZPBvAqbP3WHKeZIWG9PZ0IuziE5EWpRjfu52 | /              |

  Scenario Outline: To verify that the user has inputted an accepted suffix.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the Employee Record - Edit General Page
    When The user has left "<blank>" blank the Suffix field
    Then The user should see an error message saying Please enter Suffix
    When The user has inputted a "<lessThan4>" Suffix with less than 4 characters.
    Then The user should not see an error message
    When The user has inputted a "<moreThan4>" Suffix with more than 4 characters.
    Then The typed character will no longer show in the text field.
    When The user has inputted anything other than alphanumeric, a space, a dash, or a period "<otherCharacter>" in the Suffix field.
    Then The user should see an error message saying, Please use alphabetic letters, numbers, space, dash and period only.
    Examples:
      | emailAddress            | password   | lessThan4 | moreThan4 | otherCharacter |
      | testella.four@gmail.com | Welcome@08 | xyz       | asdfg     | /              |

#  Scenario Outline: To verify that the user has manually inputted an accepted birthdate. --> BLOCKED
#    Given The user is in the Login Page
#    When The user has entered the email address "<emailAddress>" for login
#    And The user has clicked on Next button for login
#    And The user has entered the password "<password>" for login
#    And The user has clicked Submit button
#    Then The user will proceed to Knit Dashboard after login
#    Given The user is in the Employee Record - Edit General Page
#    When The user has left "<blank>" blank the Birthday field
#    Then The user should see an error message saying Please enter complete birthdate.
#    When The user has typed in a past date in MM/DD/YYYY format
#    Then The date should automatically be formatted to the standard MM/DD/YYYY.
#    When The user has manually typed in a future date in MM/DD/YYYY format
#    Then The user should see an error message saying, Date occurs in the future. Please use a past date.
#    When The user has manually typed in a past date in DD/MM/YYYY.
#    Then The date should automatically be formatted to the standard MM/DD/YYYY.
#    When The user has manually typed in a past date in YYYY/MM/DD.
#    Then The date should automatically be formatted to the standard MM/DD/YYYY.
#    When The user has manually typed in a past date in MM/DD/YY format.
#    Then The date should automatically be formatted to the standard MM/DD/YYYY.
#    When The user has manually typed in a past date with less than 14 characters.
#    Then The user should see an error message saying, Please enter complete birthdate.


  Scenario Outline: To verify that the user has inputted an accepted birthdate using the calendar picker.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the Employee Record - Edit General Page
#    When The user has clicked the calendar picker then leave the field blank. --> BLOCKED
#    Then The user should see an error message saying, Please enter complete birthdate. --> BLOCKED
    When The user has chosen a past date in the calendar
    Then The birthday should be accepted
    When The user has chosen a future date in the calendar
    Then The user should see an error message saying, Please enter complete birthdate.
    When The user tries pick a date before "<sampleDate>"
    Then The dates before "<sampleDate>" are greyed out and are disabled from being clicked.
    Examples:
      | emailAddress            | password   | sampleDate |
      | testella.four@gmail.com | Welcome@08 | 01/01/1923 |

  Scenario Outline: To verify that the user's age is automatically calculated as of the current date.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the Employee Record - Edit General Page
    When The user has checked the Birthdate field value
    Then The calculated age is correct according to the birthdate and timezone selected.
    And The Age field is not editable.
    Examples:
      | emailAddress            | password   |
      | testella.four@gmail.com | Welcome@08 |

  Scenario Outline: To verify that the user has inputted an accepted city.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the Employee Record - Edit General Page
    When The user has inputted a "<space>" space only in the City field
    Then The user should see not see an error message
    When The user has inputted a "<dot>" dot only in the City field
    Then The user should see an error message saying Please enter City
    When The user has inputted a "<dash>" dash only in the City field
    Then The user should see not see an error message
    When The user has inputted a "<alphaNumeric>" name with alphanumeric (ASCII) characters in the City field
    Then The user should not see an error message
    When The user has inputted a "<numeric>" name with numeric characters  in the City field
    Then The user should not see an error message
    When The user has left "<blank>" blank the City field
    Then The user should see an error message saying Please enter City
    When The user has inputted a "<lessThan60>" City with less than 60 characters.
    Then The user should not see an error message
    When The user has inputted a "<moreThan60>" City with more than 60 characters.
    Then The typed character will no longer show in the text field.
    Examples:
      | emailAddress            | password   | space | dot | dash | alphaNumeric | numeric | blank | lessThan60 | moreThan60                                                    |
      | testella.four@gmail.com | Welcome@08 |       | .   | -    | TestCity123  | 123     |       | Lipa       | 2ME8Z2Rsc8bCJhlERjHqd1EnOvgN3lxxMmSqgUJ9emtjH5RiH5YqbfBgmI6wR |

  Scenario Outline: To verify that the country is automatically pre-filled based on the city entered.
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the Employee Record - Edit General Page
    When The user has inputted a "<lessThan60>" City with less than 60 characters.
    Then The country is automatically pre-filled based on the city entered.
    Examples:
      | emailAddress            | password   | lessThan60 |
      | testella.four@gmail.com | Welcome@08 | Lipa       |

#------------------Verifying text labels are present. FE checking for the meantime since adding/editing employee info is in the BE-------------
  Scenario: To verify that all fields are present once the employee data is setup in the backend thru Django.
    Given The user is in the Employee Record - General Page
    Then Each field is present and populated in Employee Record - General Page
