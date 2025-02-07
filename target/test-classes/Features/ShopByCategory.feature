Feature: This feature file test the "SHOP BY CATEGORY" functionality

  Scenario: verify "SHOP BY CATEGORY" menu displayed on HomePage
    Given Browser is launched and maximized
    When After entering url, User is on HomePage
    Then SHOP BY CATEGORY should be displayed on HomePage

  Scenario: verify "SHOP BY CATEGORY" menu displayes all the categories and their names properly
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    Then I should see a catgories list like "Electronics", "Fashion", "Apparel" etc

  Scenario: verify "SHOP BY CATEGORY" should collapse when clicked on it after expand
    Given After entering url, User is on HomePage
    When I click on "SHOP BY CATEGORY" menu after expand
    Then I should see "SHOP BY CATEBORY" menu collapses

  Scenario: verify  "SHOP BY CATEGORY" should collapse when clicked on outside anywhere on screen
    Given After entering url, User is on HomePage
    When I click on "SHOP BY CATEGORY" menu after expand
    And I click outside the dropdwon
    Then I should see "SHOP BY CATEBORY" menu collapses

  Scenario: verify Respective Category Page should Opens After Click on it.
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then I should see Fashion category page

  Scenario: verify All the Categories Are Clickable
    Given After entering url, User is on HomePage
    When I scroll down
    When I click on SHOP BY CATEGORY menu
    And I click on all the categories one by one
    Then All the categories are clickable

  Scenario: verify navigate to specific category page on click of category
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then I should see Fashion category page

  Scenario: verify Navigation to HomePage by tapping on Home button from respective category Page
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on Home button
    Then I should navigated to home Page

  Scenario: verify Navigation to HomePage by tapping on Back button of the browser
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on Back button of the browser
    Then I should navigated to home Page

  Scenario: Verify if any of category does not have any products then should show proper message.
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "apparel" category
    Then I should see "We couldn't find anything matching your query. Try something else." message

  Scenario: verify Shop By Category section should be avaialble on Catgeory page
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then I should see Shop By Category Section on Catgeory page

  Scenario: verify "Show more +" link is present for categories with more than 5 subcategories
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    Then categoris with more than 5 subcatgories should have "Show more +" link

  Scenario: verify "Show more +" link is should not displays for categories with less than or equal to 5 subcategories
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then categoris with less than or equal to 5 subcatgories should not have "Show more +" link

  Scenario: Verify when user clicks on the "Show more +" button displays additional categories
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I click on "Show more +" link
    Then additional categories should be displayed

  Scenario: Verify when user clicks on the "Show more +" button changes button text to "Show less -"
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I get the text before click on Show more +
    And I click on "Show more +" link
    Then "Show more +" text replaces to "Show less -"

  Scenario: Verify when user clicks on the "Show less -" button collapses additional categories
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I scroll down
    And I click on "Show more +" link
    And I click on "Show less -" link
    Then additional categories should be collapased

  Scenario: Verify when user clicks on the "Show less -" button changes button text to "Show more +"
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I scroll down
    And I click on "Show more +" link
    And I click on "Show less -" link
    Then "Show less -" text replaces to "Show more +"

  Scenario: Verify on Category Page bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    Then Bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc

  Scenario: Verify that the filter section is scrollable on Category page
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    Then I check if the filter section is scrollable

  Scenario: Verify product brands are deselectable
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    And I click on checkbox of already selcted brand "Adidas T-shirt"
    Then I should see "Adidas T-shirt" brand is deselected

  Scenario: Verify mulitple brands are selectable
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the multiple brands from the brand filter
    Then I should see multiple brands are selected

  Scenario: Verify products are filtered by the selected brand
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should only see products from "Adidas T-shirt"

  Scenario: Filter products by multiple brands
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the multiple brands from the brand filter
    Then the displayed products should only belong to the selected brands

  Scenario: Verify product brands are selectable
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should see "Adidas T-shirt" brand is selected

  Scenario: Verify "Filters" section is displayed after applying a filter
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should see "Filters" section should be displayed and enabled

  Scenario: Verify "Clear" button should be available for applied filters section only once we applied filters
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should see "Clear" button should be displayed in Filters Section.

  Scenario: Verify Once you apply any Filter, "Filters" section should have applied filters only
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should see "Adidas T-shirt" as applied Filters in Filter section.

  Scenario: verify After clicking on "Clear" button in applied filter section, clear all filters
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    And I click on "Clear" button in Filter Section
    Then I should see all filters should be cleared.

  Scenario: verify After clicking on "Clear" button in applied filter section, showing original product list
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    And i get product count for applied filter
    And I click on "Clear" button in Filter Section
    Then I should see original product list.

  Scenario: verify product count after clicking on any category
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I scroll until all products are loaded
    And i get count of product for that category
    And Fashion category showing 68 count with category heading
    Then Both count should match

  Scenario: Verify if selected any subcategory then in category hierarchy that subcategory name should be added
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Women's Apparel" subcategory
    Then I should see that subcategory should be added in Category hierarchy.

  Scenario: Verify on click of "Hide Filter", all filters should get hided
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Hide Filter"
    Then I should see All Filters should get hided.

  Scenario: Verify on click of "Hide Filter", it replaces with "Show Filter"
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Hide Filter"
    Then I should see Hide Filter text replaces with "Show Filter".

  Scenario: Verify on click of "Show Filter", all filters should be shown
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Hide Filter"
    And I click on "Show Filter"
    Then I should see All Filters should be shown.

  Scenario: Verify on click of "Show Filter", it replaces with "Hide Filter"
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Hide Filter"
    And I click on "Show Filter"
    Then I should see Show Filter text replaces with "Hide Filter".

  Scenario: Verify products list should be displayed as per price filter
    Given User is on Category Page
    When User click on "Rs 101 to Rs 200" filter
    Then User should see products list of price between 101 and 200

  Scenario: Verify products list should be displayed properly if applied More Than Rs 500 filter
    Given User is on Category Page
    When User click on "More than Rs 500" filter
    Then User should see products list of price should be greater than 500

  Scenario: Verify offers products list should be displayed as per discount selected
    Given User is on Category Page
    When User click on "More than 25%" filter
    Then User should see products list of having discount More than 25%

  #bug
  Scenario: Verify offers products list should be displayed as per discount selected
    Given User is on Category Page
    When User click on "5% - 10%" filter
    Then User should see products list of having discount between 5% - 10%

  #TC: 40
  Scenario: Verify products list should be displayed as per filter if applied Size Filter
    Given User is on Category Page
    When User click on "Large" filter
    Then User should see products list of size "Large"

  #TC: 41
  Scenario: Verify products list should be displayed as per filter if applied Pack Size Filter
    Given User is on Category Page
    When User click on "24 pcs" filter
    Then User should see products list of "24 pcs"

  @today
  Scenario: Verify if selected any product rating then that rated product should be shown
    Given After entering url, User is on HomePage
    When I click on SHOP BY CATEGORY menu
    And I click on "Fruits & Vegetables" category
    And User click on 5 star rating filter
    Then User should see products list of "5" star ratings only
