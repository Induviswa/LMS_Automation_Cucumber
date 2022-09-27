Feature: Search Batch

Scenario:  Search by Batch Name

Given User is on Batch page3
When user clicks on search box with Batch Name entered in it
Then  records of that  "Batch Name" are displayed
  And Close Browser