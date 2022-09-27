Feature: Results in Ascending order

Scenario: Verify that the results are displayed in Ascending order of Assignment name
Given User is on Assignment Page
When User clicks onthe Ascending arrow (down ) near to the Assignment name 
Then  User can see the results in Ascending order of Assignment name
Scenario: Verify that the results are displayed in Ascending order of Assignment Description
#Given User is on Assignment Page
When  User clicks onthe Ascending arrow (down ) near to the Assignment Description
Then User can see the results in Ascending order of Assignment Description
  And Close Browser


