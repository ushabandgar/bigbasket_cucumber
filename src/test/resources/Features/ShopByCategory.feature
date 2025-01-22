Feature: This feature file test the SHOP BY CATEGORY functionality

Scenario: verify "SHOP BY CATEGORY" menu displayed on HomePage

Given Browser is launched
When After entering url, User is on HomePage
Then SHOP BY CATEGORY should be displayed on HomePage


Scenario: verify "SHOP BY CATEGORY" menu displayes all the categories and their names properly

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
Then I should see a catgories list like "Electronics", "Fashion", "Apparel" etc


Scenario: verify "SHOP BY CATEGORY" should collapse when clicked on it after expand

Given After entering url, User is on HomePage
When I click on "SHOP BY CATEBORY" menu after expand
Then I should see "SHOP BY CATEBORY" menu collapses


Scenario: verify  "SHOP BY CATEGORY" should collapse when clicked on outside anywhere on screen

Given After entering url, User is on HomePage
When I click on "SHOP BY CATEBORY" menu after expand
And I click outside the dropdwon
Then I should see "SHOP BY CATEBORY" menu collapses


Scenario: verify Respective Category Page should Opens After Click on it.

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fashion" category
Then I should see Fashion category page

Scenario: verify Navigation to HomePage by tapping on Home button from respective category Page  

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fashion" category
And I click on Home button
Then I should navigated to home Page 

Scenario: verify Navigation to HomePage by tapping on Back button of the browser  

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fashion" category
And I click on Back button of the browser
Then I should navigated to home Page

Scenario: Verify if any of category does not have any products then should show proper message.

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "apparel" category
Then I should see "We couldn't find anything matching your query. Try something else." message
 