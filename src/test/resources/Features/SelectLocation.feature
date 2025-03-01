
Feature: This feature file test Select Location functionality

  Scenario: Verify that "Select Location" bar is visible on the Homepage
    Then "Select Location" bar should be display on HomePage

  Scenario: verify user can able to type text Into the "Select Location" bar
  
    When User click on select location bar
    And User enter "Pune" into Search For Area TextBox
    Then verify User can able to enter text into Search For Area TextBox

  Scenario: Verify the placeholder text "Search for area or street name" is displayed when the select loaction bar is empty
  
    When User click on select location bar
    And "Search for area or street name" placeholder text is appear in text box
    And User enter "Pune" into TextBox
    Then placeholder text should not be appear in text box

  Scenario: Verify that  address location results are displayed when Enter "Pune"
  
    When User click on select location bar
    And User enter "Pune" into TextBox
    And User get list of address locations
    Then Address of location results should be appear which contains "Pune"

  Scenario: Verify behaviour of Homapage when the search bar is left empty and user press the enter
  
    When User click on select location bar
    And User observe Url of the page
    And User keep empty TextBox
    And User press the enter
    Then page should not be redirect on another page

  Scenario: Verify that when user enter partial text "Mum" into text box then result should be diaplay
  
    When User click on select location bar
    And User enter "Mum" into search for area text box
    And User get list of  related search results
    Then Address of location results should be contains "Mum"

  Scenario: Verify that when click on clear button then search for area text box should be clear
  
    When User click on select location bar
    And User enter "Mumbai" into textBox
    And User click on clear button
    Then "Mumbai" text should be remove from textbox

  Scenario: Verify when user enter speacial character "!@#$%^&*" only into text box
  
    When User click on select location bar
    And User enter  speacial character "!@#$%^&*" only into search for area  text box
    Then "Sorry,we dont deliver in this location" message should be display

  Scenario: Verify when user enter invalid large number "07676476337565" only into text box
  
    When User click on select location bar
    And User enter "07676476337565" into search for area  text box
    Then "Sorry,we dont deliver in this location" result message should be display

  Scenario: Verify when user enter invalid speacial character "<:>/{};" only into search bar
  
    When User click on select location bar
    And User enter "<:>/{};" into text box
    Then "Sorry,we dont deliver in this location" result message should be display on page

  Scenario: Verify when extremely large invalid text "hjfhfjwehjdwjdsooudiqwufiyf" enter into select location  bar
  
    When User click on select location bar
    And User enter "hjfhfjwehjdwjdsooudiqwufiyf" into select Location bar
    Then "Sorry,we dont deliver in this location" result message should be displayed on page

 
  Scenario Outline: Verify Select location with different inputs
  
    When User click on select location bar
    And User enter the following locations using DataTable
        |wakad|
        |warje|

