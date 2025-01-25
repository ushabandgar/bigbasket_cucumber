Feature: Product Detail Page functionality

  Scenario: when User searches "Product", the URL will change on the same tab
    Given The user is on the homepage
    When The user searches for "Product"
    Then The URL should change on the same tab


  Scenario: When User clicks on "Product", then the Product Page URL changes
    Given The user is on the homepage
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The product page URL should changed
#
  #Scenario: When User clicks on "Product", then the Product Page Title  changes
    #Given The user is on the homepage
    #When The user searches for "Product"
    #When The user clicks on the "Product"
    #Then The product page Title should changed
#
  #Scenario: When User Click On "Product" Then Product Url Loaded Fully
    #Given The user is on the homepage
    #When The user searches for "Product"
    #When The user clicks on the "Product"
    #Then The Product url should loaded Fully
#
  #Scenario: Verify when User clicks on "Product", the same "Product Title" is displayed on the Product Detail Page
    #Given The user is on the homepage
    #When The user searches for "Product"
    #Then Check the product title
    #When The user clicks on the "Product"
    #Then The product title on the product detail page should be the same as the product title on the homepage
#
  #Scenario: Verify when User clicks on "Product", the same "Product Price" is displayed on the Product Detail Page
    #Given The user is on the homepage
    #When The user searches for "Product"
    #Then Check the product Price
    #When The user clicks on the "Product"
    #Then The product Price on the product detail page should be the same as the product price on the homepage
#
#
  #Scenario: verify Product "Image" Display Properly On Product Detail Page
    #Given The user is on the homepage
    #When The user searches for "Product"
    #When The user clicks on the "Product"
    #Then The product image on the Product Detail Page should be displayed properly
#
  #Scenario: Verify Hover Feature Works When User "Hovers" On Product Image
    #Given The user is on the homepage
    #When The user searches for "Product"
    #When The user clicks on the "Product"
    #And The Hover effect should be Work on product Image
#
  #Scenario: verify "multiple images" gallary for a product detail page are clickable
    #Given The user is on the homepage
    #When The user searches for "Product"
    #When The user clicks on the "Product"
    #And The user should be able click on gallary images
#
  #Scenario: verify "Gallary Images" of Product Are in High Quality
    #Given The user is on the homepage
    #When The user searches for "Product"
    #When The user clicks on the "Product"
    #Then Product Gallary images should be in High Quality
#
  #Scenario: verify The "Price Formatting" Follow The Standard Currency Symbol Like ₹
    #Given The user is on the homepage
    #When The user searches for "Product"
    #When The user clicks on the "Product"
    #Then The price should be displayed with the ₹ currency symbol
#
  #
  #Scenario: verify Product Price Change While Selecting "Pack Size"
    #Given The user is on the homepage
    #When The user searches for "Product"
    #When The user clicks on the "Product"
    #Then Product PackSize For 500ml Product Price Will Change

  Scenario: Verify When User Click On "Product" Then Product Url Title Changed
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product detail page
    Then Verify that after clicking the product, Product Url Title Changed

  Scenario: verify When User Click On "Product" Then Product Page URl changed
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product detail page
    Then Verify that after clicking the product, Product Page URl Changed

  Scenario: verify When User Click On "Product" Then Product Url Loaded Fully
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product detail page
    Then Verify that after clicking the product, Product url loaded Fully

  Scenario: verify When User Click On "Product" Should Display Same "Product Title" On Product Detail Page
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    Then Get Actual Product Text
    And Click on the product
    Then Switch window on Product detail page
    Then Get Expected Product Text
    Then Verify Actual and Expected product Text should be same

  Scenario: verify When User Click On "Product" Should Display Same "Product Price" On Product Detail Page
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    Then Get Actual Product Price
    And Click on the product
    Then Switch window on Product detail page
    Then Get Expected Product Price
    Then Verify Actual and Expected product Price should be same

  Scenario: verify Product "Image" Display Properly On Product Detail Page
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product detail page
    Then Verify Product Image display properly

  Scenario: verify Hover Feature Works When User "Hovers" On Product Image
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product detail page
    Then Hover on Image
    Then Verify Hover functionality works

  Scenario: verify "Multiple Images" For Product Are Clikable
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product detail page
    Then verify click Fuctionality On Product Image Gallary One by One

  Scenario: verify "Gallary Images" of Product Are High Quality
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product detail page
    Then verify click Fuctionality On Product Image Gallary One by One
    And verify Gallary ImageQuality

  Scenario: verify The "Price Formatting" Follow The Standard Currency Symbol Like ₹
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product detail page
    Then Get Expected Product Price
    And veriy Price Contain Currency Symbol Like ₹

  Scenario: verify Product Price Change While Selecting "Pack Size"
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product detail page
    And verify After click On Product PackSize For 500ml Product Price Will Change
    
    
  Scenario: Ignore for testing
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
   
