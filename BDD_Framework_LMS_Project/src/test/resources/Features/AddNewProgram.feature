Feature: Add New Program
  Scenario Outline: Validate Add New Program
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    And User clicks A New Program button
    Then User lands on "Program Details" form.
    Examples:
      | username | password   |
      | "User"   | "Password" |

    Scenario: Empty form submission
      Given Empty form submission
      When User clicks Save button without entering data
      Then User gets message Name is required

      Scenario Outline: Enter Program Name
        Given User enters <Name> in Program name text box
        And User enters <Description> in Program Description in text box
        And User selects <status> using radiobutton
        When User clicks Save button
        Then User can see Successful Program Deleted message
        Examples:
          | Name            | Description         |status        |
          | "TestPrograme25"| "TestDescription23" |"Inactive"       |

  Scenario Outline: Enter Program Name
    Given User clicks A New Program button
    And User lands on "Program Details" form.
    And User enters <Name> in Program name text box
    And User enters <Description> in Program Description in text box
    And User selects <status> using radiobutton
    When User clicks Cancel button
    And Close Browser
    Examples:
      | Name            | Description         |status        |
      | "TestPrograme25"| "TestDescription23" |"Inactive"       |