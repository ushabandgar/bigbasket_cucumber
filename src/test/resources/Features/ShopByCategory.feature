Feature: This feature file test the "SHOP BY CATEGORY" functionality


  Scenario: verify "SHOP BY CATEGORY" menu displayed on HomePage
    Then SHOP BY CATEGORY should be displayed on HomePage


  Scenario: verify "SHOP BY CATEGORY" menu displayes all the categories and their names properly
    When I click on SHOP BY CATEGORY menu
    Then I should see a catgories list like "Electronics", "Fashion", "Apparel" etc

  Scenario: verify "SHOP BY CATEGORY" should collapse when clicked on it after expand 
    When I click on "SHOP BY CATEGORY" menu after expand
    Then I should see "SHOP BY CATEBORY" menu collapses

  Scenario: verify  "SHOP BY CATEGORY" should collapse when clicked on outside anywhere on screen
    
    When I click on "SHOP BY CATEGORY" menu after expand
    And I click outside the dropdwon
    Then I should see "SHOP BY CATEBORY" menu collapses

  Scenario: verify Respective Category Page should Opens After Click on it.
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then I should see Fashion category page


  Scenario: verify All the Categories Are Clickable
    
    When I scroll down
    When I click on SHOP BY CATEGORY menu
    And I click on all the categories one by one
    Then All the categories are clickable

  Scenario: verify navigate to specific category page on click of category
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then I should see Fashion category page

  Scenario: verify Navigation to HomePage by tapping on Home button from respective category Page
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on Home button
    Then I should navigated to home Page

  Scenario: verify Navigation to HomePage by tapping on Back button of the browser
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on Back button of the browser
    Then I should navigated to home Page

  Scenario: Verify if any of category does not have any products then should show proper message.
    
    When I click on SHOP BY CATEGORY menu
    And I click on "apparel" category
    Then I should see "We couldn't find anything matching your query. Try something else." message

  Scenario: verify Shop By Category section should be avaialble on Catgeory page
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then I should see Shop By Category Section on Catgeory page

  Scenario: verify "Show more +" link is present for categories with more than 5 subcategories
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    Then categoris with more than 5 subcatgories should have "Show more +" link


  Scenario: verify "Show more +" link is should not displays for categories with less than or equal to 5 subcategories
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then categoris with less than or equal to 5 subcatgories should not have "Show more +" link

  Scenario: Verify when user clicks on the "Show more +" button displays additional categories
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I click on "Show more +" link
    Then additional categories should be displayed

  Scenario: Verify when user clicks on the "Show more +" button changes button text to "Show less -"
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I get the text before click on Show more +
    And I click on "Show more +" link
    Then "Show more +" text replaces to "Show less -"

  Scenario: Verify when user clicks on the "Show less -" button collapses additional categories
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I scroll down
    And I click on "Show more +" link
    And I click on "Show less -" link
    Then additional categories should be collapased

  Scenario: Verify when user clicks on the "Show less -" button changes button text to "Show more +"
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I scroll down
    And I click on "Show more +" link
    And I click on "Show less -" link
    Then "Show less -" text replaces to "Show more +"

  Scenario: Verify on Category Page bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    Then Bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc

  Scenario: Verify that the filter section is scrollable on Category page
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    Then I check if the filter section is scrollable

  Scenario: Verify product brands are deselectable
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    And I click on checkbox of already selcted brand "Adidas T-shirt"
    Then I should see "Adidas T-shirt" brand is deselected

  Scenario: Verify mulitple brands are selectable
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the multiple brands from the brand filter
    Then I should see multiple brands are selected

  Scenario: Verify products are filtered by the selected brand
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should only see products from "Adidas T-shirt"

  Scenario: Filter products by multiple brands
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the multiple brands from the brand filter
    Then the displayed products should only belong to the selected brands

  Scenario: Verify product brands are selectable
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should see "Adidas T-shirt" brand is selected

  Scenario: Verify "Filters" section is displayed after applying a filter
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should see "Filters" section should be displayed and enabled

  Scenario: Verify "Clear" button should be available for applied filters section only once we applied filters
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should see "Clear" button should be displayed in Filters Section.

  Scenario: Verify Once you apply any Filter, "Filters" section should have applied filters only
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    Then I should see "Adidas T-shirt" as applied Filters in Filter section.

  Scenario: verify After clicking on "Clear" button in applied filter section, clear all filters
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    And I click on "Clear" button in Filter Section
    Then I should see all filters should be cleared.

  Scenario: verify After clicking on "Clear" button in applied filter section, showing original product list
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    When I select the brand "Adidas T-shirt" from the brand filter
    And i get product count for applied filter
    And I click on "Clear" button in Filter Section
    Then I should see original product list.

  Scenario: verify product count after clicking on any category
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I scroll until all products are loaded
    And i get count of product for that category
    And Fashion category showing 68 count with category heading
    Then Both count should match

  Scenario: Verify if selected any subcategory then in category hierarchy that subcategory name should be added
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Women's Apparel" subcategory
    Then I should see that subcategory should be added in Category hierarchy.

  Scenario: Verify on click of "Hide Filter", all filters should get hided
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Hide Filter"
    Then I should see All Filters should get hided.

  Scenario: Verify on click of "Hide Filter", it replaces with "Show Filter"
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Hide Filter"
    Then I should see Hide Filter text replaces with "Show Filter".

  Scenario: Verify on click of "Show Filter", all filters should be shown
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Hide Filter"
    And I click on "Show Filter"
    Then I should see All Filters should be shown.

  Scenario: Verify on click of "Show Filter", it replaces with "Hide Filter"
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then I should see Shop By Category Section on Catgeory page

  Scenario: verify "Show more +" link is present for categories with more than 5 subcategories
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    Then categoris with more than 5 subcatgories should have "Show more +" link

  Scenario: verify "Show more +" link is should not displays for categories with less than or equal to 5 subcategories
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then categoris with less than or equal to 5 subcatgories should not have "Show more +" link

  Scenario: Verify when user clicks on the "Show more +" button displays additional categories
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I click on "Show more +" link
    Then additional categories should be displayed
    
      Scenario: Verify when user clicks on the "Show more +" button changes button text to "Show less -"
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I get the text before click on Show more +
    And I click on "Show more +" link
    Then "Show more +" text replaces to "Show less -"

  Scenario: Verify when user clicks on the "Show less -" button collapses additional categories
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I scroll down
    And I click on "Show more +" link
    Then I click on Show less - link additional categories should be collpased

  Scenario: Verify when user clicks on the "Show less -" button changes button text to "Show more +"
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    And I scroll down
    And I click on "Show more +" link
    And I click on "Show less -" link
    Then "Show less -" text replaces to "Show more +"

  Scenario: Verify on Category Page bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    Then Bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc

  Scenario: Verify that the filter section is scrollable on Category page
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fruits & vegetables" category
    When I check if the filter section is scrollable

  Scenario: Verify on click of "Show Filter", it replaces with "Hide Filter"
    
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

  Scenario: Verify products list should be displayed as per filter if applied Size Filter
    Given User is on Category Page
    When User click on "Large" filter
    Then User should see products list of size "Large"

  Scenario: Verify products list should be displayed as per filter if applied Pack Size Filter
    Given User is on Category Page
    When User click on "24 pcs" filter
    Then User should see products list of "24 pcs"
    
  Scenario: Verify if selected any product rating then that rated product should be shown
    
    When I click on SHOP BY CATEGORY menu
    And I click on "Fruits & Vegetables" category
    And User click on 5 star rating filter
    Then User should see products list of "5" star ratings only

  Scenario: Verify product List if selected any child category
    
    When I click on SHOP BY CATEGORY menu
    And User mouse hover on "Fruits & Vegetables" category
    And User mouse hover on "Fresh Fruits" subcategory
    And then hover on "Mangoes" and click on it
    Then User should see product list of having "Mango" only

  Scenario: Verify that Relevance button is displayed on category page
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    Then "Relevance" filter button should be displayed

  Scenario: Verify that Relevance button is displayed on category page
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Relevance" button
    Then User should see the sorting options available

  #bug
  
  Scenario: Verify that Relevance option sorts products by Price - Low to High
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Relevance" button
    And I click on "Price - Low to High" relevance option
    Then User should see product list sorting from low to high price

  Scenario: Verify that Relevance option sorts products by Price - Low to High
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Relevance" button
    And I click on "Price - High to Low" relevance option
    Then User should see product list sorting from high to low price
    
    Scenario: Verify that on click of Save For Later opening login popup
    
    When I click on SHOP BY CATEGORY menu
    And I click on "fashion" category
    And I click on "Save For Later" icon
    Then I should see opening login or signup popup
