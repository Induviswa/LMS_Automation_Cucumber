
Feature: Delete Batch
 
Scenario: delete feature
    Given user is on Batch page
    When user clicks delete  button for any batch
   Then user will get confirm deletion popup

 Scenario: Click Yes
    Given user is on Batch Confirm Deletion page7
    When User clicks Yes button7
   Then User can see 'Successful BatchDeleted' message7
   
    Scenario: Verify deleted batch
    Given user is on Batch page8    
    When User Searches for "Deleted Batch name"7
   Then There should be zero results.7
   
    Scenario: click no
        Given User is on Batch Confirm Deletion Page 7
    When User clicks No button7
   Then User can see Batch is not deleted7