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
    Then Switch window on Product Deatil page
    Then Verify that after clicking the product, Product Url Title Changed

  Scenario: verify When User Click On "Product" Then Product Page URl changed
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product Deatil page
    Then Verify that after clicking the product, Product Page URl Changed

  Scenario: verify When User Click On "Product" Then Product Url Loaded Fully
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    And Click on the product
    Then Switch window on Product Deatil page
    Then Verify that after clicking the product, Product url loaded Fully

  Scenario: verify When User Click On "Product" Should Display Same "Product Title" On Product Detail Page
    Given Browser launched with Url!
    When User clicks on the search input and searches for a product name
    Then Get Actual Prodct Text
    And Click on the product
    Then Switch window on Product Deatil page
    Then Get Expected Prodct Text
    Then Verify Actual and Expected product Text should be same
