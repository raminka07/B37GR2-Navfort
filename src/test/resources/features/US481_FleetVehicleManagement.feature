
  Feature: Fleet Vehicle Management
    User is a login page
    Background:
      Given the user is on the vehicles page

    @fleet
      Scenario: Verify checkboxes are unchecked by default
       # Given the user is on the vehicles page
        Then all checkboxes should be unchecked

      Scenario: verify selecting the first checkbox selects all cars
       # Given the user is on the vehicles page
        When the user selects the first checkbox
        Then all cars should be selected

       Scenario: Verify users can select any car
        # Given the user is on the vehicles page
         When the user selects a specific car with index 3
         Then only the checkbox for the selected car should be checked
