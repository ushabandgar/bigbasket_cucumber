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
