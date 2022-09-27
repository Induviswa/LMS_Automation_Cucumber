Feature: Heading
Scenario: Validate the heading

Given User is logged on to the the LMS website
When User is on Manage Assignment page
Then  User should see the heading with text "Manage Assignment" on the page
  And Close Browser