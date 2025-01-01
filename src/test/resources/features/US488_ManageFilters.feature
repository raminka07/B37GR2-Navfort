

Feature: As a user, I want to manage filters on the Marketing page.
  Background: User is already in the log in page
    Given the user is on the login page


 # US488

  Scenario Outline: Verify that Store and Sales managers see all 5 filter options as checked by default.
    Given the user logged in as "<userType>"
    When the user clicks the Campaigns link from the Marketing menu
    And the user clicks the filters mark
    Then Verify that Store and Sales managers see all 5 filter options as checked by default.

    Examples:
      |userType|
      |store manager|
      |sales manager|


  @US488
  Scenario Outline: Verify that any amount of boxes can be unchecked. (Can check multiple).
    Given the user logged in as "<userType>"
    When the user clicks the Campaigns link from the Marketing menu
    And the user clicks the filters mark
    Then Verify a single filter option can be unchecked



    Examples:
      |userType|
      |store manager|
      |sales manager|


  @US488
  Scenario Outline: Verify that any amount of boxes can be unchecked. (Can check only 1 ).
    Given the user logged in as "<userType>"
    When the user clicks the Campaigns link from the Marketing menu
    And the user clicks the filters mark
    Then  Verify multiple filter options can be unchecked
    Examples:
      |userType|
      |store manager|
      |sales manager|


  @US488
  Scenario Outline: Verify that all filter options can be unchecked.
    Given the user logged in as "<userType>"
    When the user clicks the Campaigns link from the Marketing menu
    And the user clicks the filters mark
    Then Verify all filter options can be unchecked
    Examples:
      |userType|
      |store manager|
      |sales manager|