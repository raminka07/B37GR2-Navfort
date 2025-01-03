Feature: View Car Odometer Info
  Agile story: As a user, I want to view car odometer info on the Vehicles Odometer page.

  Background: User is already in the log in page
    Given user is on the login page


  Scenario Outline: Login with Sales and store manager
    When user enter the username "<username>" and password "<password>"
    And the user hover over "Fleet" and selects "Vehicle Odometer" from the dropdown
    Then I should see the error message: "You do not have permission to perform this action."

    Examples:
      | username        | password    |
      | salesmanager109 | UserUser123 |
      | storemanager75  | UserUser123 |



  Scenario: Drivers see the default page as 1 on the Vehicle Odometer
    When driver enter the username "user7" and password "UserUser123"
    And the user hover over "Fleet" and selects "Vehicle Odometer" from the dropdown
    Then the default page number should be "1"

  Scenario: Drivers see the View Per Page as 25 by default on the Vehicle Odometer
    When driver enter the username "user7" and password "UserUser123"
    And the user hover over "Fleet" and selects "Vehicle Odometer" from the dropdown
    Then the default View Per Page should be "25"

