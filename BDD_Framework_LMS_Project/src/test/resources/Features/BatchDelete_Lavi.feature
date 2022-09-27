
Feature: Delete Multiple Batch
  
  Scenario: Select Batch
    Given User is on Batch page6
    When selects more than one Batch using checkbox
    Then User verifies that the details are correctly updated.
   
     Scenario: Delete  multiple batches 
    Given User is on Batch page
    When  User clicks on Delete button
         Then User lands on a Confirm Deletion form.
    
          Scenario: Click Yes
     Given user is on Batch Confirm Deletion page
     When User clicks Yes button
      Then User can see 'Successful BatchDeleted' message
    
      Scenario: Verify deleted batches
    Given User is on Batch page
    When User Searches for "Deleted Batch names"
    Then There should be zero results.
    
         Scenario: click no
    Given User is on Batch Confirm Deletion Page6
    When User clicks No button
    Then User can see Batch is not deleted.