Feature: Multiple Assignment Deletion

Scenario: Select multiple Assignment 
Given User is on Assignment page
When User selects more than one Assignment using checkbox
Then Assignments get selected
When User clicks on <Delete> button on top left corner
Then User lands on Confirm Deletion message.
When User clicks <No> button
  Then User can see Confirm Deletion form disappears
  And Close Browser

Scenario: Click No
  Given User is on Assignment page
  When User selects more than one Assignment using checkbox
  Then Assignments get selected
  When User clicks on <Delete> button on top left corner
  Then User lands on Confirm Deletion message.
  When User clicks <Yes> button
  Then User can see 'Successful Assignment Deleted' message
  And Close Browser

