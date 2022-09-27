Feature: Label Text
Scenario: Verify the presence of Label Texts
Given User is on Manage user page
When User clicks A Add new user button
Then User should see the placeholders with Text As "First name","Middle name", Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","User Role",Visa status","Batch","Comments"