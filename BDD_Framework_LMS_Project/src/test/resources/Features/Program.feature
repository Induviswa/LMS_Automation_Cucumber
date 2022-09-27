Feature: Program Heading

  Scenario Outline: Validate the heading
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    Then User should see a the heading with text headingval on the page
    And Close Browser
    Examples:
      | username | password   |
      | "User"   | "Password" |