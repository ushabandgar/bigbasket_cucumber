Feature: This feature file test Search For Produtcs functionality

Scenario: verify "Search Text Box" displayed on HomePage

Given Browser launched
When After enter url, User on HomePage
Then SearchTextBox should be displayed on HomePage


Scenario: verify user can able to type text Into the "Search Bar"

Given After enter url, User on HomePage
When User enter text into Search Text box
Then verify User can able to enter text into the Search Bar

Scenario: verify placeholder text("Search for Products...")is displayed when Search Text box is empty

Given After enter url, User on HomePage
When "Search for Products" is appear in Text BOX when text box is empty
And   User enter "Apple" into empty text Box
And  Observe "Search for Products" is not  appear in Text BOX
Then verify placeholder text is displayed when Search Text box is empty
