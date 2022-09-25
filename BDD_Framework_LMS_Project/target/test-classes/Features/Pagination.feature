Feature: Pagination

  Scenario Outline: Verify previous link on the first page
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on first page of Manage Program
    Then Verify that previous link is disabled
    Examples:
      | username | password   | headingval       |
      | "User"   | "Password" | "Manage Program" |

    Scenario: Verify next link
      Given User is on the first page number
      When User clicks navigate > button
      Then User navigated to second page number

    Scenario: Verify previous link
      Given User is on second page
      When User clicks navigate < button
      Then User navigated to first page number

      Scenario: Verify next link on the last page
        Given User is on the first page number
        When User clicks lastpage button
        Then Verify that next link is disabled
        And Close Browser