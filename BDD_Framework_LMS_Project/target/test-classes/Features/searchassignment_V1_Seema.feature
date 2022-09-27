Feature: Search Assignment

Scenario: Validate Search Feature

Given User is logged on to the the LMS website
When User is on Manage Assignment page
Then  Text box is used for search has text as 'Search'


Scenario: Search Assignment By Name

Given User is on Manage Assignment page
When User clicks on search with <name phrase> into search box.
Then  Entries for <name phrase> are shown.
  And Close Browser