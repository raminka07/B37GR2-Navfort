@test
Feature: Users should be able to login and can access to Vehicle Contracts page
  B37GRP2-US478

  Background: User is already in the log in page
    Given the user is on the login page

 @AC02TC01
  Scenario Outline: Verify that Store Managers and Sales Managers can access the Vehicle Contracts page
    Given the user logged in as "<userType>"
    When user clicks on Fleet
    And user clicks on Vehicle Contracts
   Then user should be able to see URL "https://qa.navfort.com/entity/Extend_Entity_VehicleContract"
   And user should be able to see the title "All - Vehicle Contract - Entities - System - Car - Entities - System"
   Examples:
     | userType      |
     | Store manager |
     | Sales manager |


 @AC01TC02
  Scenario: Verify that Drivers can NOT access the Vehicle Contracts page and the app displays “You do not have permission to perform this action.”
    Given the user logged in as "driver"
    When user clicks on Fleet
    And user clicks on Vehicle Contracts
    Then the app displays "You do not have permission to perform this action."