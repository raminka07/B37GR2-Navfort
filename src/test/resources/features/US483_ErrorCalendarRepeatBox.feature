
@wipRamina
Feature: Calendar Repeat Every input box functionality
  Agile story: As a user, I should see error messages
  when I enter an invalid integer number into the calendar Repeat Every input box.

  Background: user is already logged in the page
    Given the user is on the login page


  Scenario Outline: Repeat Every input box negative input
    Given the user logged in as "<userType>"
    And user clicks on "Activities" tab and "Calendar Events" module
    And user clicks on Create Calendar event button
    And user checks repeat every checkbox
    And user enters invalid "<number>" in the input area
    Then user should see "The value have not to be less than 1." message for negative value
    Examples:
      | userType      | number |
      | sales manager | -1     |
      | store manager | -3     |

  Scenario Outline: Repeat Every input box more than 99 input
    Given the user logged in as "<userType>"
    And user clicks on "Activities" tab and "Calendar Events" module
    And user clicks on Create Calendar event button
    And user checks repeat every checkbox
    And user enters invalid "<number>" in the input area
    Then user should see "The value have not to be more than 99." message for more than value
    Examples:
      | userType      | number |
      | sales manager | 100    |
      | store manager | 101    |



