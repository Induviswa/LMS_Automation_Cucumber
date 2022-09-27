Feature: Number of records 

Scenario: Validate that number of records (rows of data in the table) displayed 
Given User is logged on to LMS websitE
When  User is on Batch pagE
Then Verify that number of records (rows of data in the table) displayed on the page are 5
  And Close Browser