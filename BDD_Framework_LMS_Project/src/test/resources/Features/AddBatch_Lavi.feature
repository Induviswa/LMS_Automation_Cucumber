Feature: Add Batch

Scenario: validate add new batch
Given User is on New Batch page
When User clicks A New Batch button
Then user can see Batch details form

Scenario: Empty form submission
Given User is on Batch details page
When User clicks Save a button without entering data
Then User gets a message 'Name is required'

Scenario: Click Cancel
Given User is on Batch details page
When User clicks a Cancel button
Then User can see Batch Details form disappears

Scenario: Enter Batch Name
Given User is on Batch details page
When user enters name in text box
Then User can see a 'Name' entered

Scenario: Enter Batch Description
Given User is on Batch details page
When User enters Description in text box
Then User can see a 'Description' entered

Scenario: Enter Program name
Given  User is on Batch details page
When User selects Program name
Then User can see 'Program Name' selected

Scenario: Select Status
Given  User is on Batch details page
When User selects Status using radiobutton
Then User can see 'Active/Inactive' status selected

Scenario: Enter No of classes
Given  User is on Batch details page
When  User clicks a Save button
Then User gets message 'Successful batch created'

Scenario: Click Save
Given User is on Batch details page
When User clicks a Save button
Then User gets message 'Successful batch created'

Scenario: Verify Added Batch is created
Given  Verify Added Batch is created
When User searches with newly created "Batch Name"
Then  records of the newly created  "Batch Name" is displayed

