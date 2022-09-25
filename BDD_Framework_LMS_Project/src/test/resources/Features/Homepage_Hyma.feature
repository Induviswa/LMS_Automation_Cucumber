Feature: Menu Bar - Buttons
  Scenario: Verifying the Program button visibility
    Given User is on the Login Page
    When User entering valid username "username" and password "password"
    Then User clicks on Loginbutton
    When User landed on the Home page after logging into the LMS website"actualheading"
    Then User should see a button with text "Program" on the menu bar
  Scenario: Verifying the Batch button visibility
    Then User should see a button with text "Batch" on the menu bar
  Scenario: Verifying the User button visibility
    Then User should see a button with text "User" on the menu bar
  Scenario: Verifying the Assignment button visibility
    Then User should see a button with text "Assignment" on the menu bar
  Scenario: Verifying the Attendance button visibility
    Then User should see a button with text "Attendance" on the menu bar
  Scenario: Verifying the Logout button visibility
    Then User should see a button with text "Logout" on the menu bar
    And Close Browser