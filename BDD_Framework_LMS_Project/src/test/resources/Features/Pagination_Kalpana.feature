Feature:Pagination
    Scenario: Verify the presense of pagination
    Given User is on any page after Login
    Then User should see the pagination controls below data table
    
     Scenario: Verify the pagination control with less rows
    Given User is on Manage user page
    When Manage user table has less less than or equal to 5 rows
    Then Pagination control should be disabled
    
    Scenario: Verify the pagination control with more than 5 rows
    Given User is on Manage user page
    When Manage user table has more than rows
    Then Pagination control should be enabled 
    
 Scenario: Verify pagination next link after last record of user table
    Given last page of User records are displayed
    When Use cliks next link of pagination
    Then previous page should be dosplayed
    
   Scenario: Verify pagination Previous link
Given User table is disolayed in manage user page
When User cliks previous link of pagination
Then previous page should be displayed	

Scenario: Verify pagination previous link in first page of user table	
Given First page of user table is displayed
When User cliks previous link of pagination
Then Previous link of pagination should be disabled	
	
Scenario:Verify button with << icon
Given ser table is displayed in manage user page
When User clicks << icon in pagination
Then User should see the First page of the table

Scenario: Verify button with >> icon
Given User table is displayed in manage user page
When User clicks >> icon in pagination
Then User should see the last page of the table

Scenario:Verifiy the entry details below data table
Given User is logged on to the LMS website
When User lands on Manage User page
Then User should see the text  "Showing 1 to 4 of 4 entries" beow the user table.