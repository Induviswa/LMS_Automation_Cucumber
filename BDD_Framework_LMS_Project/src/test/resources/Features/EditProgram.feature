Feature: Edit Program Details

  Scenario Outline: User is on Program page
    Given User is logged with valid <username> and <password> on to LMS website
    When User is on Program page
    And User selects Program using checkbox
    Then Program gets selected
    Examples:
      | username | password   |
       | "User"   | "Password" |

    Scenario: Edit Feature
      Given User is on Program page
      When User clicks on <Edit> button
      Then User lands on "Program Details" form.

      Scenario Outline: Edit Program Name
        Given User lands on "Program Details" form.
        When User edits <editname> and selects the Save button
        Then User can see <editname> Name
        And Validate Program Name Updated Successfully
        Examples:
        |editname|
        |"Oracle" |

        Scenario Outline: Edit Program Description
          Given User is on Program page
          When User clicks on <Edit> button
          And User lands on "Program Details" form.
          When User edits description <editdescription> and selects the Save button
          Then User can see <editdescription> description
          And Validate Program Name Updated Successfully
          Examples:
            |editdescription|
            |"Oracle Descrtiption" |

          Scenario: Change Program Status
            Given User is on Program page
            When User clicks on <Edit> button
            And User lands on "Program Details" form.
            When User changes status and selects the Save button
            Then User can see updated Status
            And Validate Program Name Updated Successfully

            Scenario: Click Cancel
              Given User is on Program page
              When User clicks on <Edit> button
            And User lands on "Program Details" form.
              When User clicks Cancel button
              Then User can see "Program Details" form disappears
              And Close Browser