
Feature: As a user, I want to learn how to use the pinbar

  US477 PINBAR

  Background: User is already in the log in page
    Given the user is on the login page



  Scenario Outline:Verify that users see the text "How To Use Pinbar" and the instructional message after clicking
  the "Learn how to use this space" link on the homepage.
    Given the user logged in as "<userType>"
    When  user click the “Learn how to use this space” link
    Then user see the text "How To Use Pinbar"
    And user see the instructional message
    Examples:
      |userType|
      |driver|
      |store manager|
      |sales manager|


  @img
  Scenario Outline: : Verify that  users see an image on the page.
    Given the user logged in as "<userType>"
    When  user click the “Learn how to use this space” link
    Then verify the image source.

    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |