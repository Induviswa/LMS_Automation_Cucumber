Feature: LoginPage

Scenario: Validating the Login functionality with valid username and password
Given User is on the Login Page
When User entering valid username "User" and password "password"
Then User clicks on Loginbutton 
And User should Land on Home Page
And Close Browser
