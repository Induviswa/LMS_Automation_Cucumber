Feature:Edit/Delete icon in each row
Scenario: Verify the presence of Edit/Delete icon
Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the buttons with edit delete icon in each row of Edit Delete coulmn


Scenario:Fucntionality of delete button
Given User table is displayed in manage user page
When User clicks delete button
Then Confirm dialog box should be displayed with Text "Are you sure you want to delete (selected user name) ?" , button with text "No" , the button with text "yes" and close(X) icon


Scenario:Updating with Edit button
Given User table is displayed in manage user page
When User clicks Edit button
Then "User Details" dialog box should be displayed for editing
  And Close Browser