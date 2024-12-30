@vAll
Feature: main module visibility

  #AC2
  @vDriver
  Scenario: As a driver, when I am logged in I should be able to see 4 module names-
  Fleet, Customers, Activities, System

  Given the user logged in as "driver"
  Then user sees four modules: "Fleet", "Customers", "Activities", "System"

  #AC1
  @vSalesManager
  Scenario: As a Sales managers, when I am logged in I should be able to see
  8 module names

  Given the user logged in as "sales manager"
  Then user sees eight modules: "Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"

  @vStoreManager
  Scenario: As a Sales managers, when I am logged in I should be able to see
  8 module names
  Given the user logged in as "store manager"
    Then user sees eight modules: "Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"

  #steps of tests