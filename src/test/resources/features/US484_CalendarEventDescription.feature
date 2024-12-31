
@NavfortCalenderDescription
Feature: Create a calendar event with a description
  As a user, I want to type into the Description field when I create a calendar event.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Typing a message into the Description field
    Given the user logged in as "<userType>"
    When the user hover over "Activities" and selects "Calendar Events" from the dropdown
    And the user clicks on the "Create Calendar Event" button
    And the user types "<message>" into the text area
    Then the Description field display "<message>"

    Examples:
      | userType      | message            |
      | driver        | Meeting with team  |
      | sales manager | Project discussion |
      | store manager | Follow-up meeting  |