Feature: Product Detail Page functionality

  Scenario: Verify When User Search "Product" After URL Will Change On Same Tab.
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    Then Verify that after clicking the product, the URL should change on the same tab
    And close the browser

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
