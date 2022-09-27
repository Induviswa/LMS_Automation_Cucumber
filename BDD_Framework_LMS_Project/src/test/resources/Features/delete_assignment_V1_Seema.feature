Feature: Delete Assignment 
Scenario: Delete Feature 
Given User is on Assignment page
When User clicks on <Delete> button after selecting an assignment
Then  User lands on the Confirm Deletion form.

Scenario: Click Yes
Given User is on Confirm Deletion form
When  User clicks <Yes> button
Then User can see a 'Successful Assignment Deleted' message
Scenario: Click No
Given User is on Confirm Deletion form
When   User clicks <No> button
Then  User can see Confirm Deletion form disappears
  And Close Browser