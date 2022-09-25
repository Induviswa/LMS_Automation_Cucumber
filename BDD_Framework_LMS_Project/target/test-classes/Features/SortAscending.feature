Feature: Sort in Ascending order

  Scenario Outline: Verify that the results are displayed in Ascending order of Program name
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    Then User clicks on the Ascending arrow near to the Program name
    Examples:
      | username | password   |
      | "User"   | "Password" |

    Scenario: Verify that the results are displayed in Ascending order of Program Description
      Then User clicks onthe Ascending arrow near to the Program Description

  Scenario: Verify that the results are displayed in Ascending order of Program Status
    Then User clicks onthe Ascending arrow near to the Program Status
    And Close Browser