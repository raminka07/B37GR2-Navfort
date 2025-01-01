
Feature: Users should be able to login and can access to Vehicle Contracts page

  US478

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that Store Managers and Sales Managers can access the Vehicle Contracts page
    Given the user logged in as "<userType>"
    When user navigates to Fleet and clicks on Vehicle Contracts
    #And user clicks on Vehicle Contracts
    Then user should be able to see URL "https://qa.navfort.com/entity/Extend_Entity_VehicleContract"
    And user should be able to see the title "All - Vehicle Contract - Entities - System - Car - Entities - System"
    Examples:
      | userType      |
      | Store manager |
      | Sales manager |


  Scenario: Verify that Drivers can NOT access the Vehicle Contracts page and the app displays “You do not have permission to perform this action.”
    Given the user logged in as "driver"
    When user navigates to Fleet and clicks on Vehicle Contracts
    Then the app displays "You do not have permission to perform this action."