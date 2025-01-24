Feature: This feature file test Search For Produtcs functionality

  Scenario: verify "Search Text Box" displayed on HomePage
    Given Browser launched
    When After enter url, User on HomePage
    Then SearchTextBox should be displayed on HomePage

  Scenario: verify user can able to type text Into the "Search Bar"
    Given After enter url, User on HomePage
    When User enter "Apple" into Search Text box
    Then verify User can able to enter text into the Search Bar

  Scenario: verify placeholder text "Search for Products" is displayed when Search Text box is empty
    Given After enter url, User on HomePage
    When "Search for Products" is appear in Text BOX when text box is empty
    And User enter "Apple" into empty text Box
    And Observe "Search for Products" is not  appear in Text BOX
    Then verify placeholder text is displayed when Search Text box is empty

  Scenario: verify relevant search Results are displayed when valid text "Apple" is entered
    Given After enter url, User on HomePage
    When User enter "Apple" into text box then get list of search results
    Then verify list of search Results are displayed which contains "Apple" word

  Scenario: verify behaviour of homepage("Url should be same") when search text box left empty and use press enter
    Given After enter url, User on HomePage
    When Observe Url of the page
    And Keep empty search text box
    And Press the enter on empty text box
    Then Observe homepage should be same Url

  Scenario: verify when user enter partial text "Toma" into search text box then result should be displayed
    Given After enter url, User on HomePage
    When User enter parial text "Toma" into search text box
    And Get list of serach results
    Then Verify list of search results contains "Toma"
