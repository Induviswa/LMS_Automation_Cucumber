Feature: Multiple Assignment Deletion

Scenario: Select multiple Assignment 
Given User is on Assignment page
When User selects more than one Assignment using checkbox
Then Assignments get selected
Scenario: Delete Feature
#Given User is on Assignment page
When User clicks on <Delete> button on top left corner
Then User lands on 'Confirm Deletion' message.
Scenario: Click Yes
Given User is on Confirm Deletion form
When User clicks <Yes> button
Then User can see 'Successful Assignment Deleted' message
Scenario: Click No
Given User is on Confirm Deletion form
When User clicks <No> button
Then User can see Confirm Deletion form disappears

