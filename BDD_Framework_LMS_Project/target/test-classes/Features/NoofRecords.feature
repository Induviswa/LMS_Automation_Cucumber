Feature: No of Records

  Scenario Outline: Validate that number of records (rows of data in the table) displayed
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    Then Verify that number of records (rows of data in the table) displayed on the page.
    And Close Browser
    Examples:
      |username|password|noofpages|
      |"LMS"|"LMS"| "Showing 1 to 5 of 22 entries" |