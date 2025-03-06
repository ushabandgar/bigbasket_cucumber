Feature: "Product Detail Page" functionality

  Scenario: verify User searches "Product", the URL will change on the same tab
    When The user searches for "Product"
    Then The URL should change on the same tab

  Scenario: verify User clicks on "Product", then the Product Page URL changes
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The product page URL should changed

  Scenario: verify User clicks on "Product", then the Product Page Title  changes
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The product page Title should changed

  Scenario: verify User Click On "Product" Then Product Url Loaded Fully
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The Product url should loaded Fully

  Scenario: Verify when User clicks on "Product", the same "Product Title" is displayed on the Product Detail Page
    When The user searches for "Product"
    Then Check the product title
    When The user clicks on the "Product"
    Then The product title on the product detail page should be the same as the product title on the homepage

  Scenario: Verify when User clicks on "Product", the same "Product Price" is displayed on the Product Detail Page
    When The user searches for "Product"
    Then Check the product Price
    When The user clicks on the "Product"
    Then The product Price on the product detail page should be the same as the product price on the homepage

  Scenario: verify Product "Image" Display Properly On Product Detail Page
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The product image on the Product Detail Page should be displayed properly

  Scenario: Verify Hover Feature Works When User "Hovers" On Product Image
    When The user searches for "Product"
    When The user clicks on the "Product"
    And The Hover effect should be Work on product Image

  Scenario: verify "multiple images" gallary for a product detail page are clickable
    When The user searches for "Product"
    When The user clicks on the "Product"
    And The user should be able click on gallary images

  Scenario: verify "Gallary Images" of Product Are in High Quality
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then Product Gallary images should be in High Quality

  Scenario: verify The "Price Formatting" Follow The Standard Currency Symbol Like ₹
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The price should be displayed with the ₹ currency symbol

  Scenario: verify Product Price Change While Selecting "Pack Size"
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then Product PackSize For 500ml Product Price Will Change

  Scenario: verify the functionality of adding a product to the "Add to basket"
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The product was successfully added to the basket

  Scenario: verify "Add to Basket" product quantity Increase When user click on plus btn to add more items
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The product quantity Increase When user click on plus btn to add more items

  Scenario: verify that the product price should be calculated as per quantity of product When user click on plus btn to add more items
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The product quantity Increase When user click on plus btn to add more items

  Scenario: verify the visual confirmation msg should be appere after "Adding product" to the add to Basket
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then confirmation msg should be appere

  Scenario: verify the visual confirmation msg should be appere after "Removing product" to the add to Basket
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then confirmation Removing msg should be appere

  #Bug
  Scenario: verify user should add multiple product as they want by clicking on plus btn to add more items
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The User should add multiple product as they want

  Scenario: verify no spelling or grammatical errors in the product description for "Amul Taaza Milk, 1 L Pouch"
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then verify that the product description has no spelling or grammatical errors

  Scenario: verify that "Save for Later" btn should be on product detail page
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The Save for Later btn should be on product detail page

  Scenario: verify that after clicking on "Save for Later" btn user should able to save a product for later
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The user should able to save a product for later

  Scenario: verify user should able to click on media icone Facebook, twitter,gamil
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The social media icons should be clickable

  Scenario: verify user click on Facebook icon, then user should redirect to facebook url
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The facebook page should open

  Scenario: verify user click on Twitter icon, then user should redirect to facebook url
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The Twitter page should open

  Scenario: verify user click on Email icon, then user should redirect to Email url
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The Email page should open

  Scenario: verify when user click "Home","bakery,cakes&dairy","dairy" & "fresh milk" links then user should able to navigate that perticular page
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The user should able to navigate that perticular page

  Scenario: verify "similar product" list should be appear on the product detail page
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The user should able to see similar product list

  Scenario: verify that the "similar product" list should appear when user scrolls down to the page
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The user should able to see similar product list after scrolling down page

  Scenario: verify that the "About the Product" description should appear on the PIP page
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The user should able to see About the Product description

  Scenario: verify "Other Product Info" details should appear on the PIP page
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The user should able to see Other Product Info details

  Scenario: verify user should able to click on "-" and "+" to see "Other Product Info"
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The user should able to to click on "-" and "+" option to see Other Product Info

  Scenario: Verify that the "Smart basket Icon" should be clickable
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The Smart basket Icon should be clickable

  Scenario: Verify that the "Offer" icon should be clickable
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The Offer Icon should be clickable

  Scenario: Verify that the on PIP page "Amul" BrandName should be clickable
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The user should able to click om "Amul" BrandName

  Scenario: Verify that the after clicking on "amul", only Amul brand product should be appere
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The user should able to click om "Amul" BrandName
    Then The user should able to see only Amul brand product

  Scenario: Verify that the after clicking on Offer Icon product should be display with "OFFER" tag only
    When The user searches for "Product"
    When The user clicks on the "Product"
    Then The product list display with OFFER tag

  Scenario: Verify that the after clicking on "Tea" BTN product url should be display with exotic-fruits-veggies
    Given The User click on "Tea" btn

  Scenario: Verify that the after clicking on Tea BTN product should be display with "Tea" tags
    Given The User click on "Tea" btn
    Then The product should be display with Tea tag

  Scenario: Verify that the after clicking on "Exotic Fruits & Veggies" BTN product url should be display with exotic-fruits-veggies
    Given The User click on "Exotic Fruits & Veggies" btn

  Scenario: Verify that the after clicking on "Exotic Fruits & Veggies" BTN, The perticular products lists should be display
    Given The User click on "Exotic Fruits & Veggies" btn
    Then The product should be display with Exotic Fruits & Veggies tag

  Scenario: Verify that the after clicking on "Ghee" BTN product url should be display with exotic-fruits-veggies
    Given The User click on "Ghee" btn

  Scenario: Verify that the after clicking on "Ghee" BTN, The perticular products lists should be display
    Given The User click on "Ghee" btn
    Then The product should be display with Ghee tag

  Scenario: Verify that the after clicking on "Nandini" BTN product url should be display with exotic-fruits-veggies
    Given The User click on "Nandini" btn

  Scenario: Verify that the after clicking on "Nandini" BTN, The perticular products lists should be display
    Given The User click on "Nandini" btn
    Then The product should be display with Nandini tag

  Scenario: Verify that the after clicking on "Tata Tea Gold", only Tata Tea Gold brand product should be appere
    Given The User click on "Tea" btn
    When The user Click on tea product
    Then The user should able to click om "Tata Tea Gold" BrandName

  Scenario: Verify user should able navigate from "SHOP BY CATEGORY" to "PIP" Page
    Given User click on ShopBycatory menu item
    Then The user should able to navigate on PIP Page
    
  Scenario: Verify user should able navigate from "SHOP BY CATEGORY" to "PIP" Page
    Given User click on ShopBycatory menu item
    Then The user should able to navigate on PIP Page
    
