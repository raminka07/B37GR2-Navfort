@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @VMtest
  Scenario Outline: User should be able to view columns on the Vehicles model page
    Given the user logged in as "<userType>"
    Given the user relocated the Fleet dropdown
     And the user navigates the Vehicles Model page
    Then the user should see the fallowing vehicle models:
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

    Examples:
      | userType      |
      | Store manager |
      | Sales manager |

  @VMtest
  Scenario: User should be able to view columns on the Vehicles model page
    Given the user logged in as "driver"
      Given the user relocated the Fleet dropdown
      And the user navigates the Vehicles Model page
    Then you should get a message "You do not have permission to perform this action."


