Feature: This feature file test the "SHOP BY CATEGORY" functionality

Scenario: verify "SHOP BY CATEGORY" menu displayed on HomePage

Given Browser is launched and maximized
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

Scenario: verify All the Categories Are Clickable

Given After entering url, User is on HomePage
When I scroll down 
When I click on SHOP BY CATEBORY menu
And I click on all the categories one by one
Then All the categories are clickable


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
 
Scenario: verify Shop By Category section should be avaialble on Catgeory page  

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fashion" category
Then I should see Shop By Category Section on Catgeory page

Scenario: verify "Show more +" link is present for categories with more than 5 subcategories

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fruits & vegetables" category
Then categoris with more than 5 subcatgories should have "Show more +" link

Scenario: verify "Show more +" link is should not displays for categories with less than or equal to 5 subcategories

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fashion" category
Then categoris with less than or equal to 5 subcatgories should not have "Show more +" link

Scenario: Verify when user clicks on the "Show more +" button displays additional categories

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fruits & vegetables" category
And I click on "Show more +" link
Then additional categories should be displayed


Scenario: Verify when user clicks on the "Show more +" button changes button text to "Show less -"

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fruits & vegetables" category
And I get the text before click on Show more +
And I click on "Show more +" link
Then "Show more +" text replaces to "Show less -"


Scenario: Verify when user clicks on the "Show less -" button collapses additional categories

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fruits & vegetables" category
And I scroll down
And I click on "Show more +" link 
Then I click on Show less - link additional categories should be collpased


Scenario: Verify when user clicks on the "Show less -" button changes button text to "Show more +"

Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fruits & vegetables" category
And I scroll down
And I click on "Show more +" link 
And I click on "Show less -" link 
Then "Show less -" text replaces to "Show more +" 

----------------In progress----
@today
Scenario: Verify on Category Page bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc
Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fruits & vegetables" category
Then Bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc


Scenario: Verify that the filter section is scrollable on Category page
Given After entering url, User is on HomePage
When I click on SHOP BY CATEBORY menu
And I click on "fruits & vegetables" category
When I check if the filter section is scrollable
Then I should be able to scroll the filter section