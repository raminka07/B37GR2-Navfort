@pinbar
Feature: As a user, I want to learn how to use the pinbar.


  Background: User is already in the log in page
    Given the user is on the login page

    #AC01TC01
  @AC01TC01
  Scenario Outline:Verify that users see the text "How To Use Pinbar" and the instructional message after clicking
  the "Learn how to use this space" link on the homepage.
    Given the user logged in as "<userType>"
    When when user click the “Learn how to use this space” link
    Then users see the "<text>"
    Then users see the instructional "<message>"
    Examples:
      | userType      | text              | message                                                                                    |
      | driver        | How To Use Pinbar | Use the pin icon on the right top corner of page to create fast access link in the pinbar. |
      | store manager | How To Use Pinbar | Use the pin icon on the right top corner of page to create fast access link in the pinbar. |
      | sales manager | How To Use Pinbar | Use the pin icon on the right top corner of page to create fast access link in the pinbar. |


 #AC02TC01
  @img
  Scenario Outline: : Verify that  users see an image on the page.
    Given the user logged in as "<userType>"
    When when user click the “Learn how to use this space” link
    Then verify the image "<source>".

    Examples:
      | userType      | source                                            |
      | driver        | /bundles/oronavigation/images/pinbar-location.jpg |
      | store manager | /bundles/oronavigation/images/pinbar-location.jpg |
      | sales manager | /bundles/oronavigation/images/pinbar-location.jpg |
