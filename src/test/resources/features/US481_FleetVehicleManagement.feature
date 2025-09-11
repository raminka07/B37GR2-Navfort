
Feature: As a user (Sales and Store manager), I should be able to select any vehicle from the Vehicles page


  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that once the <userType> launch on the Vehicles page, the users can see all the checkboxes
  as unchecked.
    When the user logged in as "<userType>"
    When the user sees "Fleet" to "Vehicle"
    Then the user should be able to see all the checkboxes as "unchecked"
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |