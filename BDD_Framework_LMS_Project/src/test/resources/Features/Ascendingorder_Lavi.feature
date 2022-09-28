Feature: Results in Ascending order

Scenario: Verify that the results are displayed in Ascending order of Batch name
Given User is on Batch page1
When User clicks on the Ascending arrow (down ) near to the Batch name 
Then User can see the results in Ascending order of Batch name

Scenario: Verify that the results are displayed in Ascending order of batch Description
Given User is on Batch page
When User clicks on the Ascending arrow (down ) near to the Batch Description 
Then User can see the results in Ascending order of Batch Description

Scenario: Verify that the results are displayed in Ascending order of batch Status
Given User is on Batch page
When User clicks on the Ascending arrow (down ) near to the Batch Status 
Then  User can see the results in Ascending order of Batch Status

Scenario: Verify that the results are displayed in Ascending order No of Classes
Given User is on Batch page
When User clicks on the Ascending arrow (down ) near to the No Of Classes
Then User can see the results in Ascending order of No of Classes

Scenario: Verify that the results are displayed in Ascending order of Program Name
Given User is on Batch page
When User clicks on the Ascending arrow (down ) near to the Program Name
Then  User can see the results in Ascending order of Program Name
  And Close Browser
