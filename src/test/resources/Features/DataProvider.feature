
Feature: Search Functionality

  Scenario Outline: Verify search with different inputs
    Given User is on the search page
    When User searches for "<searchInput>"
    Then Search results should be displayed as per "<searchInput>"

    Examples: 
      | searchInput |
      | Laptop      |
      | Smartphone  |
      | banana      |
      | Mango       |
      | milk        |
