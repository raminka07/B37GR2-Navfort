@wip
Feature: Filter Customers' info on the Accounts page
  Agile story: As a user, i want to filter customers' info on the Account page

  @US486
  Scenario Outline: Filter Customers' info on the Accounts page
    Given the user logged in as "<userType>"
    When user clicks on "Customers" tab and "Accounts" module
    And user clicks on filter icon
    Then user should see following filter items
      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |
    Examples:
      | userType      |
      | store manager |
      | sales manager |
