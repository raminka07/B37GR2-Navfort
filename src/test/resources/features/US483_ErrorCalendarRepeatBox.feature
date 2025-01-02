@wip
Feature: Calendar Repeat Every input box functionality
  Agile story: As a user, I should see error messages
  when I enter an invalid integer number into the calendar Repeat Every input box.

  Background: user is already logged in the page
    Given the user is on the login page

  @US483
  Scenario Outline: Repeat Every input box invalid input
    Given the user logged in as "<userType>"
    And user clicks on "Activities" tab and "Calendar Events" module
    And user clicks on Create Calendar event button
    And user checks repeat every checkbox
    And user enters invalid "<number>" in the input area
    #Then user should see "<errorMessage>" message for corresponding "<number>"
    Then user should see "<errorMessage>" message

    Examples:
      | userType      | number | errorMessage                           |
      | sales manager | 0      | The value have not to be less than 1.  |
      | store manager | -3     | The value have not to be less than 1.  |
      | Driver        | -2     | The value have not to be less than 1.  |
      | sales manager | 100    | The value have not to be more than 99. |
      | store manager | 101    | The value have not to be more than 99. |
      | Driver        | 102    | The value have not to be more than 99. |



