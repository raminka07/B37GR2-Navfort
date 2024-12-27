
Feature: Users should be able to login
  US481GR21 LOGIN
  As a user: I should be able to login with correct credentials to the different Accounts. and dashboard
  accounts are: driver, sales manager, store manager

  @storemanager
    Scenario: login as store manager
      Given user is on the login page
      When user enters the store manager information
      Then user should be able to see 8 modules

  @salesmanager
  Scenario: login as sales manager
    Given user is on the login page
    When user enters the sales manager information
    Then user should be able to see 8 modules


  @driver
  Scenario: login as driver
    Given user is on the login page
    When user enters the driver information
    Then user should be able to see "4" modules