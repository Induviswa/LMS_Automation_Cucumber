Feature: footer
Scenario: Validate the text below the table
Given User is logged on to the the LMS website
When User is on  Manage Assignment page
Then User should see the text as "Showing 1 to 3 of 3 entries" 
Scenario: Validate the footer
Given User is logged on to the the LMS website
When User is on  Manage Assignment page
Then User should see the footer as "In total there are 3 programs"
