Feature: This feature file test the SHOP BY CATEGORY functionality

Scenario: verify "SHOP BY CATEGORY" menu displayed on HomePage

Given Browser is launched
When After entering url, User is on HomePage
Then SHOP BY CATEGORY should be displayed on HomePage
And close the browser

Scenario: verify "SHOP BY CATEGORY" menu displayes all the categories and their names properly

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
Then I should see a catgories list like "Electronics", "Fashion", "Apparel" etc
And close the browser

Scenario: verify "SHOP BY CATEGORY" should collapse when clicked on it after expand

Given After entering url, User is on HomePage
When I click on "SHOP BY CATEBORY" menu after expand
Then I should see "SHOP BY CATEBORY" menu collapses
And close the browser

Scenario: verify verify "SHOP BY CATEGORY" should collapse when clicked on outside anywhere on screen

Given After entering url, User is on HomePage
When I click on "SHOP BY CATEBORY" menu after expand
And I click outside the dropdwon
Then I should see "SHOP BY CATEBORY" menu collapses
And close the browser