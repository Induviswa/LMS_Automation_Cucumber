Feature: Multiple Program Deletion
  Scenario Outline: Validate Multiple Program Deletion
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    And User selects more than one Program using checkbox
    Then User should see the Delete button on the top left hand side as Enabled
    Examples:
      | username | password   |
      | "User"   | "Password" |

    #Scenario: Delete Multiple Program
    #  Given User clicks on Multiple delete button
    #  Then User lands on Confirm Deletion form.
    #  When Click Yes
    #  Then User can see Successful Program Deleted message

      Scenario: Cancel Delete Multiple Program
        Given User clicks on Multiple delete button
        Then User lands on Confirm Deletion form.
        When Click No
        And Close Browser