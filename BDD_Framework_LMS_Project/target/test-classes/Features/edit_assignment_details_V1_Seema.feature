Feature: Edit Assignment Details

Scenario: Select Assignment 
Given User is on Assignment page
When User selects Assignment using checkbox
Then  Assignment gets selected

 Scenario: Edit Feature
Given User is on Assignment page
When User clicks on a <Edit> button
Then User lands on Assignment Details form.
 
 Scenario: Edit Assignment Name
Given User is on Assignment Details form 
When User edit Name
Then User can see updated Name
 Scenario: Edit Assignment Description
Given User is on Assignment Details form 
When User edit Description
Then User can see updated Description
Scenario: Edit Assignment Grade
Given User is on Assignment Details form 
When User edit Grade
Then User can see updated Grade
Scenario: Edit Assignment Due Date
Given User is on Assignment Details form 
When User edits Due Date
Then User can see updated Due Date
 Scenario: Click Cancel
 Given User is on Assignment Details form
 When User clicks <Cancel> button
 Then User can see Assignment Details form disappears
 Scenario: Click Save
 Given User is on Assignment Details form
 When User clicks <Save> button
 Then User can see 'Successful Assignment Updated' message
 

