Feature:Table header
Scenario:Verify Table header
Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the table header



Scenario: Verify the functionality of sort icon present in table header
Given User table is displayed in manage user page
When 	User clicks sort icon in table header
Then Table rows should be sorted
		

Scenario: Check box in table header
Given User table is displayed in manage user page
When User checks empty checkbox in header
Then Check box in all the rows of user table should be checked


Scenario:Check box in table header
Given User table is displayed in manage user page
When User unchecks checkbox in header
Then Check box in all the rows of user table should be unchecked
  And Close Browser