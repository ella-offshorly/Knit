Feature: HR Hub - Logging Time

  #<---------------------------------------------------------TIME IN & TIME OUT------------------------------------------------------>
  Scenario Outline: To verify that the fields are blank if the user has not yet logged in for the day
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    Then The user should see the Time In 00:00
    And The user should see the Time Out 00:00
    Examples:
      | emailAddress                             | password               |
      | testKnit25-1-123-21-25-29@mailinator.com | knit@25-1-123-21-25-34 |

  Scenario Outline: To verify the timer will start counting after clicking "Time In" and the label will change to "Time Out"
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    When The user has clicked Time In
   # Then The timer should start counting --> Not yet available
   # And The Work Status should be Working --> For Review
    And The cta label should be changed to Time Out
    Examples:
      | emailAddress                             | password               |
      | testKnit25-1-123-21-25-29@mailinator.com | knit@25-1-123-21-25-34 |

 # Scenario: Debug current time --> DEBUGGER
 #   Then The current time is displayed

#Prerequisite: User has a fixed shift, user has clicked "Time In", early out was not approved, the current time has not yet reached the scheduled Time Out
  Scenario Outline: To verify that the "Time Out" button is greyed out and that nothing happens when it is clicked
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    Then The Time Out button is disabled
    Examples:
      | emailAddress                             | password               |
      | testKnit25-1-123-21-25-29@mailinator.com | knit@25-1-123-21-25-34 |

  #<---------------------------------------------------------BREAKS------------------------------------------------------>
#@TO DO: Scenarios for Coffee Breaks. Only Lunch Break is manually tested.

  Scenario Outline: To verify that the Break fields are blank if the user has not yet clicked break for the day
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    Then The user should see the Time In 00:00 in the Break Time In
    And The user should see the Time Out 00:00 in the Break Time Out
    Examples:
      | emailAddress                             | password               |
      | testKnit25-1-123-21-25-29@mailinator.com | knit@25-1-123-21-25-34 |

  #Prerequisite: Time in has been clicked for the day, Time Out has not yet been clicked, Lunch break button has been clicked, Lunch break is running
  Scenario Outline: To verify that clicking on the Lunch break button will end the Lunch break
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    When The user has clicked the Lunch Break button
    #Then The button's label is changed to On Break --> For Review
    When The user has taken the break
    And The user has clicked the End Lunch Break button
    Examples:
      | emailAddress                             | password               |
      | testKnit25-1-123-21-25-29@mailinator.com | knit@25-1-123-21-25-34 |

  #Prerequisite: Time in has been clicked for the day, Time Out has not yet been clicked, Lunch break Start and End is done.
  Scenario Outline: To verify that expected Lunch Break Duration is equal to actual Lunch Break Duration
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    Then The expected Lunch Break Duration is equal to the actual Lunch Break Duration
    Examples:
      | emailAddress                             | password               |
      | testKnit25-1-123-21-25-29@mailinator.com | knit@25-1-123-21-25-34 |

  #@TO DO: Scenario for the progress bar of Lunch Break --> Not yet available

  #<---------------------------------------------------------Verifying Attendance Table------------------------------------------------------------->
  Scenario Outline: To verify that expected Lunch Break Duration is equal to actual Lunch Break Duration
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in My Attendance Page
    #@TO DO: This is not done yet
    Examples:
      | emailAddress                             | password               |
      | testKnit25-1-123-21-25-29@mailinator.com | knit@25-1-123-21-25-34 |

  Scenario Outline: To verify that the current day and date is displayed in the table
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in My Attendance Page
    Then The current day is displayed correctly
    And The current date is displayed correctly
    Examples:
      | emailAddress                             | password               |
      | testKnit25-1-123-21-25-29@mailinator.com | knit@25-1-123-21-25-34 |

    #Pre-requisite: The user has a fixed schedule
  Scenario Outline: To verify that the displayed schedule is correct
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in My Attendance Page
    Then The displayed schedule is correct "<shiftSchedule>"
    Examples:
      | emailAddress                             | password               | shiftSchedule   |
      | testKnit25-1-123-21-25-29@mailinator.com | knit@25-1-123-21-25-34 | 23:00PM-08:00AM |

  Scenario Outline: To verify that the displayed Time In is correct
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    When The user has clicked Time In
    Given The user is in My Attendance Page
    Then The displayed Time In is correct
    Examples:
      | emailAddress                            | password              |
      | testKnit7-2-123-22-32-22@mailinator.com | knit@7-2-123-22-32-27 |

  #Pre-requisite: The user has already timed in for the day, and the current time has already past the shift schedule
  Scenario Outline: To verify that the displayed Time Out is correct
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    When The user has clicked Time Out
    Given The user is in My Attendance Page
    Then The displayed Time Out is correct
    Examples:
      | emailAddress                           | password             |
      | testKnit7-2-123-22-9-32@mailinator.com | knit@7-2-123-22-9-36 |

  #Pre-requisite: The user has a fixed schedule and has logged in late
  Scenario Outline: To verify that the displayed Late is correct in the Attendance Table
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    When The user has clicked Time In
    Given The user is in My Attendance Page
    Then The displayed Late is correct
    Examples:
      | emailAddress                           | password             | shiftTimeIn |
      | testKnit7-2-123-22-9-32@mailinator.com | knit@7-2-123-22-9-36 | 23:00PM     |

  #Pre-requisite: The user has a fixed schedule and has time out late. User now has excess work hours.
  Scenario Outline: To verify that the displayed Late is correct in the Attendance Table
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    When The user has clicked Time Out
    Given The user is in My Attendance Page
    Then The displayed Excess is correct
    Examples:
      | emailAddress                           | password             | shiftTimeOut |
      | testKnit7-2-123-22-9-32@mailinator.com | knit@7-2-123-22-9-36 | 08:00AM      |

  #Pre-requisite: The user has a fixed schedule and has time out early. User now has deficit work hours.
  Scenario Outline: To verify that the displayed Late is correct in the Attendance Table
    Given The user is in the Login Page
    When The user has entered the email address "<emailAddress>" for login
    And The user has clicked on Next button for login
    And The user has entered the password "<password>" for login
    And The user has clicked Submit button
    Then The user will proceed to Knit Dashboard after login
    Given The user is in the HR Hub - Dashboard
    When The user has clicked Time Out
    Given The user is in My Attendance Page
    Then The displayed Deficit is correct
    Examples:
      | emailAddress                           | password             | shiftTimeOut |
      | testKnit7-2-123-22-9-32@mailinator.com | knit@7-2-123-22-9-36 | 08:00AM      |

  #Status

#   Scenario: Debug current day --> DEBUGGER
#    Then The current day is displayed correctly
#     And The current date is displayed correctly

#  Scenario: Debug attendance time format --> DEBUGGER
#    Then The displayed Time In is correct

##Prerequisite: User has a fixed shift, user has clicked "Time In", the current time has reached the scheduled Time Out
#  Scenario: To verify that button labels and fields will change once "Time Out" is clicked --> FOR REVIEW
#    Given The user is in the HR Hub - Dashboard
#    Then The Time Out button is disabled