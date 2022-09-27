Feature: Validating the text fields on the Registration page
  Scenario: User fills the First Name field
    Given User is on the Registeration Page
    When User fills the First Name in Alphabets only
    Then The First Name will be displayed
  Scenario: User fills the Last Name field
    Given User is on the Registeration Page
    When User fills the Last Name in Alphabets only
    Then The Last Name will be displayed
  Scenario: User fills the Address field
    Given User is on the Registeration Page
    When User fills the Address in Alphabets only
    Then The Address will be displayed
  Scenario: User fills the Street Name field
    Given User is on the Registeration Page
    When User fills the Street name Field using Alpha Numerics and or Symbols
    Then The Street Name will be displayed
  Scenario: User fills the House Number field
    Given User is on the Registeration Page
    When User fills the House Number Field using Alpha Numerics and or Symbols
    Then The House Number will be displayed
  Scenario: User fills the Zip field
    Given User is on the Registeration Page
    When User fills the 5 digit Zip code using Numbers only
    Then The Zip code will be displayed
  Scenario: User fills the City Name field
    Given User is on the Registeration Page
    When User fills the City Name in Alphabets only
    Then The City Name will be displayed
  Scenario: User fills the State field
    Given User is on the Registeration Page
    When User selects the respective State Name from the DropBox
    Then The State Name will be displayed
  Scenario: User fills the Phone Number
    Given User is on the Registeration Page
    When User fills the valid 10 digit Mobile number in Numerics
    Then The Mobile Number will be displayed
  Scenario: User selects the Birth Date
    Given User is on the Registeration Page
    When User Selects the Date of Birth from the Calender
    Then Birth Date will be Displayed
  Scenario: User fills UserName
    Given User is on the Registeration Page
    When User fills the valid unique UserName
    Then UserName will be displayed
  Scenario: User fills Password
    Given User is on the Registeration Page
    When User fills the valid Password with 1 Upper case, 1 Numeric and 1 special charecter and 8 charecters
    Then User Password will be displayed
  Scenario: Validating the Sign Up form with all fields empty
    Given User is on the Registeration Page
    When User enters submit button with all fields empty
    Then User should get a message"Please fill all fields above"
  Scenario: Validating the First Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid First Name
    Then User should get a message"Please fill valid First Name "
  Scenario: Validating the Last Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid Last Name
    Then User should get a message"Please fill valid Last Name "
  Scenario: Validating the Address field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid Address
    Then User should get a message"Please fill valid Address "
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid Street Name
    Then User should get a message"Please fill valid Street Name "
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid House Number
    Then User should get a message"Please fill valid House Number "
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid Zip
    Then User should get a message"Please fill valid Zip"
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid City
    Then User should get a message"Please fill valid City"
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button without selecting  State
    Then User should get a message"Please select State "
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid Phone Number
    Then User should get a message"Please fill valid Phone Number "
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button without selecting BirthDate
    Then User should get a message"Please select BirthDate "
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid UserName
    Then User should get a message"Please fill valid UserName "
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User clicks Sign Up button with invalid Password
    Then User should get a message"Please fill valid Password "
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User USer clicks Sign Up button with existing User name
    Then User should see the message "Username already exist"
  Scenario: Validating the Street Name field on Registeration Page
    Given User is on the Registeration Page
    When User User enters all Field value and click "Sign Up" button.
    Then User should get a message"Registeration successful"