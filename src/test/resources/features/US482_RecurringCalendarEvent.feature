@nick
Feature: Recurring calendar event.
  Agile story: As a user, I want to create a recurring (repetitive) calendar event

  Background: User is already in the login page
    Given the user is on the login page

  @US482TC01AC01
  Scenario Outline: Verify that users see the number “1” by default in the Repeat Every input option.
    Given the user logged in as "<userType>"
    And user clicks on "Activities" tab and "Calendar Events" module.
    And user clicks on Create Calendar event button.
    And user checks repeat checkbox
    Then user should see the number “1” by default in the Repeat Every input option

    Examples:
      | userType      |
      | sales manager |
      | store manager |
      | Driver        |

  @US482TC01AC02
  Scenario Outline: Verify that users see the error message “This value should not be blank.”
  when the Calendar event Repeat Every field is cleared (delete the number 1).

    Given the user logged in as "<userType>"
    And user clicks on "Activities" tab and "Calendar Events" module.
    And user clicks on Create Calendar event button.
    And user checks repeat checkbox
    And user cleared the Repeat Every field
    Then user see the error message “This value should not be blank.”

    Examples:
      | userType      |
      | sales manager |
      | store manager |
      | Driver        |






