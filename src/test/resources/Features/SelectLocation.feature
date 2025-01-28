Feature: This feature file test Select Location functionality

  Scenario: Verify that "Select Location" bar is visible on the Homepage
    Given Browser launched
    When After enter url, User on HomePage
    Then "Select Location" bar should be display on HomePage

  Scenario: verify user can able to type text Into the "Select Location" bar
    Given After enter url, User on HomePage
    When User click on select location bar
    And User enter "Pune" into Search For Area TextBox
    Then verify User can able to enter text into Search For Area TextBox

  Scenario: Verify the placeholder text "Search for area or street name" is displayed when the select loaction bar is empty
    Given After enter url, User on HomePage
    When User click on select location bar
    And "Search for area or street name" placeholder text is appear in text box
    And User enter "Pune" into TextBox
    Then placeholder text should not be appear in text box

  Scenario: Verify that  address location results are displayed when Enter "Pune"
    Given After enter url, User on HomePage
    When User click on select location bar
    And User enter "Pune" into TextBox
    And User get list of address locations
    Then Address of location results should be appear which contains "Pune"

  Scenario: Verify behaviour of Homapage when the search bar is left empty and user press the enter
    Given After enter url, User on HomePage
    When User click on select location bar
    And User observe Url of the page
    And User keep empty TextBox
    And User press the enter
    Then page should not be redirect on another page

  Scenario: Verify that when user enter partial text "Mum" into text box then result should be diaplay
    Given After enter url, User on HomePage
    When User click on select location bar
    And User enter "Mum" into search for area text box
    And User get list of  related search results
    Then Address of location results should be contains "Mum"
