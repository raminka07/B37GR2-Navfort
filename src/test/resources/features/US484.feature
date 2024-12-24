@NavfortCalenderDescription
Feature: Create a calendar event with a description
  As a user, I want to type into the Description field when I create a calendar event.



  Scenario Outline: Typing a message into the Description field
    Given the user logs in with username "<username>" and password "<password>"
    And the user hover over "Activities" and selects "Calendar Events" from the dropdown
    When the user clicks on the "Create Calendar Event" button
    And the user types "<message>" into the text area
    Then the Description field display "<message>"

    Examples:
      | username        | password    | message            |
      | user1           | UserUser123 | Meeting with team  |
      | salesmanager101 | UserUser123 | Project discussion |
      | storemanager85  | UserUser123 | Follow-up meeting  |