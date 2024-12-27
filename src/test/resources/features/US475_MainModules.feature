Feature: main module visibility

  @visibility
  Scenario: As a driver, when I am logged in I should be able to see 4 module names-
  Fleet, Customers, Activities, System

  Given the user logged in as "driver"
  Then user sees 4 modules: "Fleet", "Customers", "Activities", "System"



  #steps of tests