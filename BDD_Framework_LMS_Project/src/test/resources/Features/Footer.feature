Feature: Footer

  Scenario Outline: Validate the text below the table
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    Then User should see the text as noofpages below the table
    Examples:
      |username|password|
      |"LMS"|"LMS"|

  Scenario Outline: Validate the footer
    #Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    Then User should see the footer as totalpages programs
    And Close Browser
    Examples:
      |username|password|
      |"LMS"|"LMS"|