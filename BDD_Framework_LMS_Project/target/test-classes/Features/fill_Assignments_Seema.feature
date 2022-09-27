Feature:
Scenario: Verify submit withoutfilling
#Given User is on Assignment Page
When User Click on Submit
Then User can see need to fill required fields
Scenario: Veriy Submit with data
#Given User is on Assignment Page
When User enter reguired details and submit
Then User can see Submit Assignment Sucessfully
