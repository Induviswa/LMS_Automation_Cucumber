Feature:  Add new assignment
Scenario: validate add new assignment
Given User is on Assignment page
When User clicks A New Assignment button
Then user can see Assignment details form

Scenario: Empty form submission
#Given User is on Assignment page
When User clicks a Save button without entering data
Then  User gets as a message 'Name is required'

Scenario: Enter Assignment Name
#Given User is on Assignment page
When user enters Assignment name
Then User can see the 'Name' entered
Scenario: Enter Assignment Description
#Given User is on Assignment page
When user enters Assignment description
Then User can see the 'Description' entered
Scenario: Enter assignment grade
#Given User is on Assignment page
When user enters assignment grade 
Then user can see 'Grade' entered
Scenario: Enter assignment due date
#Given User is on Assignment page
When user enters assignment due date
Then user can see "Assignment due date'
Scenario: Click Save
#Given User is on Assignment page
When User clicks the Save button
Then User gets as a message 'Successful assignment created'
Scenario: Click Cancel
#Given User is on Assignment page
When User clicks as a Cancel button
Then User can see assignment Details form disappears
