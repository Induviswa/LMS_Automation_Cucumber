Feature: Submit button
Scenario: Verify the presence of Submit button in user detais window
Given User is on Manage user page
When User clicks A Add new user button
Then User should see a button with text Submit in user details window
  And Close Browser