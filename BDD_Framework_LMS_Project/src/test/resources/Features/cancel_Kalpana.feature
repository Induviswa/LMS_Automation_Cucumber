Feature: Cancel button
Scenario: Verify the presence of Cancel button in user detais window
Given User is on Manage user page
When User clicks A Add new user button
Then User should see a button with text Cancel in user details window

Scenario: Fucntionality of Cancel button
Given User is on User details window
When User clicks A cancel button
Then User details window should be closed
  And Close Browser