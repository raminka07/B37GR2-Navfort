
Feature: Users should be able to login
  US481GR24 VEHICLE CONTRACTS
  Users should be able to login and can access to Vehicle Contracts page

  Background: User is already in the log in page
    Given the user is on the login page

  @Store/sales-mangers
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When user clicks on Fleet
    And user clicks on Vehicle Contracts
    Then user should be able to see URL "https://qa.navfort.com/entity/Extend_Entity_VehicleContract"
    And user should be able to see the title "All - Vehicle Contract - Entities - System - Car - Entities - System"
    Examples:
      | userType      |
      | Store manager |
      | Sales manager |

# Feature:access to Vehicle Contracts page
# @storemanger
# Scenario: Verify that Store managers can access the Vehicle Contracts page.
    #Given store manager is on the homepage using username "storemanager52" and password "UserUser123"
    #When user clicks on Fleet
    #And user clicks on Vehicle Contracts
    #Then user should be able to see URL "https://qa.navfort.com/entity/Extend_Entity_VehicleContract"
    #And user should be able to see the title "All - Vehicle Contract - Entities - System - Car - Entities - System"


  @Driver
  Scenario: Verify that Drivers can NOT access the Vehicle Contracts page and the app displays “You do not have permission to perform this action.”
    #Given Drivers is on the homepage using username "user1" and password "UserUser123"
    Given the user logged in as "driver"
    When user clicks on Fleet
    And user clicks on Vehicle Contracts
    #Then user should see the forbidden page and clicks on click button to go back
    Then the app displays "You do not have permission to perform this action."