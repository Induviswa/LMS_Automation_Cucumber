Feature: Page heading
 Scenario: Verify the Manage user page heading
    Given User is on any page after Login
    When User is on the Manage use page after clicking User Tab
    Then Use should see the page heading as "Manage User"
