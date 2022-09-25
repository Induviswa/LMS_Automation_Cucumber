Feature: Delete Program

  Scenario Outline: Select Programe
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    And User selects Program using checkbox
    Then Program gets selected
    Examples:
      | username | password   |
      | "User"   | "Password" |

  Scenario: Delete Feature
    Given User is on Program page
    When User clicks on "Delete" button
    Then User lands on Confirm Deletion form.

    Scenario: Click Yes
      When Click Yes
      Then User can see Successful Program Deleted message

      Scenario: Click No
        Given User is on Program page
        When User clicks on "Delete" button
        Then User lands on Confirm Deletion form.
        When Click No
        Then User can see Successful Program Deleted message
        And Close Browser