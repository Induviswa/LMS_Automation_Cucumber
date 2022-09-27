Feature: LoginPage
  Scenario: Validating the Login functionality with invalid password field
    Given User is on the Login Page
    When User clicks the Login button after entering invalid password"Test"
    Then User should receive the message "Invalid username and password Please try again"
  #Scenario: Validating the Login functionality with invalid username field
    #Given  User is on the Login Page
    #When User clicks the Login button after entering invalid username"Module"
    #Then User should receive the message "Invalid username and password Please try again"
  Scenario: Validating the Login functionality with valid username and password
    Given User entering valid username "username" and password "password"
    When User clicks on Loginbutton
    Then User should Land on Home Page
    And Close Browser