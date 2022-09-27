Feature: Cancel(x) icon
Scenario: Verify the presence of Cancel(x) icon in user detais window
Given User is on Manage user page
When User clicks A Add new user button
Then User should see a cancel(x) in user details window

Scenario: Fucntionality of Cancel(x) icon
Given User is on User details window
When User clicks A cancel(X) icon
Then User details window should be closed
