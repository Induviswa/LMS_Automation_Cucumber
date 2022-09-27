Feature: Edit batch

Scenario: Edit Feature
Given User is on Batch page4
When User clicks on Edit button
Then User lands on Batch Details form.

Scenario: Edit Batch Name
Given User is on Batch details page1
When User edits Name 
Then User can see edited Name

Scenario: Edit  Batch Description
Given User is on Batch details page1
When user edits description
Then User can see edited descricption

Scenario: Edit program name
Given User is on Batch details page
When user edits program name
Then  user can see edited program name


Scenario: change status
Given User is on Batch details page
When user changes status
Then User can see an updated Status

Scenario: Edit No of classes
Given User is on Batch details page
When user edits No of classes
Then user can see updated No of classes

Scenario: Click Cancel
Given User is on Batch details page
When user clicks cancel button
Then User can see Batch Details are not updated 

Scenario: click save
Given User is on Batch details page
When user clicks a save button
Then User can see 'Successful Batch Updated' alert

Scenario: Verify Edited Batch details
Given User is on Batch page
When User searches with newly updated "Batch Name"
Then User verifies that the details are correctly updated.
  And Close Browser

