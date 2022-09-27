Feature:Delete Icon
Scenario: Verify the presence of Delete icon in manage user page
Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the delete icon at the top left corner of the user table

		
Scenario: Behaviour of Delete icon when no rows unchecked
Given User table is displayed in manage user page
When no rows is checked	
Then Delete icon at the top left corner of the user table disabled

			
Scenario: Behaviour of Delete icon when rows checked
Given User table is displayed in manage user page
When User checks the rows in user table
Then Delete icon at the top left corner of the user table enabled


		
Scenario: Behaviour of Delete icon when rows checked	
Given User checks the rows in user table
When User clicks the delete icon at the top left corner of user table
Then Confirm dialog box should be displayed with Text "Are you sure you want to delete the selected Users?" , button with text "No" , the button with text "yes"  and close(X) icon

		
Scenario: ValidatingConfirm dialog box by selecting No
Given User is in confirm dialog box after clicking delete icon	
When User clicks button with text "No"
Then Selected rows should not be deleted and dialog box should be closed


			
Scenario: Validating Confirm dialog box by selecting Yes
Given User is in confirm dialog box after clicking delete icon
When User clicks button with text "Yes"
Then Selected rows should be deleted and popup should be shown with success message "Users deleted"


Scenario: Validating Confirm dialog box by clicking close(x) icon
Given User is in confirm dialog box after clicking delete icon
When 	User clicks the close(x) icon
Then Confirm dialog box should be closed#Author: your.email@your.domain.com
