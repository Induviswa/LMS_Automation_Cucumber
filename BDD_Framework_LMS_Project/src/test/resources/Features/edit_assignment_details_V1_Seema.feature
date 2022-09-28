Feature: Edit Assignment Details

Scenario: Select Assignment 
Given User is on Assignment page
When User selects Assignment using checkbox
Then  Assignment gets selected
When User clicks on a <Edit> button
Then User lands on Assignment Details form.
When User edit Name
Then User can see updated Name
When User edit Description
Then User can see updated Description
When User edit Grade
Then User can see updated Grade
When User edits Due Date
Then User can see updated Due Date
 When User clicks <Save> button
 Then User can see 'Successful Assignment Updated' message

 Scenario: Click Cancel
  Given User is on Assignment Details form
  When User selects Assignment using checkbox
  Then  Assignment gets selected
  When User clicks on a <Edit> button
  Then User lands on Assignment Details form.
  When User clicks <Cancel> button
  Then User can see Assignment Details form disappears
  And Close Browser
 

