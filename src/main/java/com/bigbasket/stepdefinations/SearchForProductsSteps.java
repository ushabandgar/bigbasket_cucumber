package com.bigbasket.stepdefinations;


import static org.testng.Assert.assertTrue;

import com.bigbasket.base.Keyword;
import com.bigbasket.base.WaitFor;
import com.bigbasket.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchForProductsSteps {

	@And("close browser")
	public void closeBrowser() {
		Keyword.driver.close();

	}

	@Then("SearchTextBox should be displayed on HomePage")
	public void verifySearchTextBoxShouldBeDisplayedOnHomePageOrNot() {
		HomePage homepage = new HomePage();
		homepage.verifySearchTextBoxVisibleOnThePageOrNot();

	}

	@When("User enter {string} into Search Text box")
	public void user_enter_into_search_text_box(String string) throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.enterTextIntoSearchTextBox();

	}

	@Then("verify User can able to enter text into the Search Bar")
	public void verifyUserCanAbleToTextIntoSearchTextBox() {
		HomePage homepage = new HomePage();
		homepage.verifyThatUserCanAbleToTypeTextIntoTheSearchBar();

	}

	@When("{string} is appear in Text BOX when text box is empty")
	public void is_appear_in_text_box_when_text_box_is_empty(String SearchforProducts) {
	}

	@And("User enter {string} into empty text Box")
	public void user_enter_into_empty_text_box(String Apple) {
		HomePage homepage = new HomePage();
		homepage.getValueOfAttribute();

	}

	@And("Observe {string} is not  appear in Text BOX")
	public void observe_placeholder_text__is_not_appear_in_text_box(String SearchforProducts) {
	}

	@Then("verify placeholder text is displayed when Search Text box is empty")
	public void verify_placeholder_text_is_displayed_when_search_text_box_is_empty() {
		HomePage homepage = new HomePage();
		homepage.verifyThePlaceholderTextIsDisplayedWhenTheSearchBarIsEmpty();
	}

	@When("User enter {string} into text box then get list of search results")
	public void user_enter_into_text_box(String Apple) {
		HomePage homepage = new HomePage();
		homepage.getAllSearchResultDescription();

	}

	@Then("verify list of search Results are displayed which contains {string} word")
	public void verify_list_of_search_results_are_displayed_which_contains_word(String Apple) {
		HomePage homepage = new HomePage();
		homepage.verifyThatRelevantSearchResultsAreDisplayedWhenValidTextIsEntered();

	}

	@When("Observe Url of the page")
	public void observe_url_of_the_page() {
		HomePage homepage = new HomePage();
		homepage.getUrlBeforeText();

	}

	@And("Keep empty search text box")
	public void keep_empty_search_text_box() {
		HomePage homepage = new HomePage();
		homepage.KeepEmptySearchBar();

	}

	@And("Press the enter on empty text box")
	public void press_the_enter_on_empty_text_box() {
		HomePage homepage = new HomePage();
		homepage.getUrlAfterText();

	}

	@Then("Observe homepage should be same Url")
	public void observe_homepage_should_be_same_url() {
		HomePage homepage = new HomePage();
		homepage.verifyTheBehaviourOfPageWhenTheSearchBarIsLeftEmptyAndUserPressTheEnter();

	}

	@When("User enter parial text {string} into search text box")
	public void user_enter_parial_text_into_search_text_box(String Toma) throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.EnterPartialTextIntoTextBox();

	}

	@And("Get list of serach results")
	public void get_list_of_serach_results() {
		HomePage homepage = new HomePage();
		homepage.getAllSearchResultDescriptionWhenEnterPartialText();

	}

	@Then("Verify list of search results contains {string}")
	public void verify_list_of_search_results_contains(String Toam) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterPartialTextIntoSerachbarThenResultShouldBeDisplayeOrNot();

	}

	@When("User enter text {string} into search text box")
	public void user_enter_text_into_search_text_box(String Tomato) throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.enterTextIntoSearchTextBox();
	}

	@And("Click on clear botton")
	public void click_on_clear_botton() {
		HomePage homepage = new HomePage();
		homepage.clickOnClearButton();

	}

	@Then("Verify search text box should be clear")
	public void verify_search_text_box_should_be_clear() {
		HomePage homepage = new HomePage();
		homepage.verifyThatWhenClickTheClearButtonThenSearchBarShouldBeClearOrNot();

	}

	@When("User enter special character only into search text box")
	public void user_enter_special_character_only_into_search_text_box() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.enterSpecialCharacterOnlyIntoSearchTextBox();

	}

	@Then("{string} message should be displayed on page")
	public void message_should_be_displayed_on_page(String NoResulfound) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterSpeacialCharacterOnlyIntoSearchBar();

	}

	@When("User enter Number only into search text box")
	public void user_enter_Number_only_into_search_text_box() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.enterNumberOnlyIntoSearchTextBox();

	}

	@Then("{string} message should be display on page")
	public void message_should_be_displayed(String NoResulfound) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterNumberOnlyIntoSearchBar();

	}

	@When("User enter invalid special character only into search text box")
	public void user_enter_Invalid_Special_Character_only_Into_search_text_box() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.enterInvalidSpecialCharacterOnlyIntoSearchTextBox();

	}

	@Then("{string} message should be display on Homepage")
	public void message_should_be_display_on_homepage(String NoResultfound) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterInvalidSpecialCharacterOnlyIntoSearchBar();

	}

	@When("User enter invalid extremely lagre text into search text box")
	public void user_enter_Invalid_extremely_large_text_Into_search_text_box() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.enterExtremelyLargeInvalidTextIntoSearchTextBox();

	}

	@Then("{string} message should be displayed on Homepage")
	public void result_message_should_be_display(String NoResultfound) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterExtremelyLargeInvalidTextIntoSearchBar();

	}

	@Given("User is on the search page")
	public void userIsOnsearchPage() {
		HomePage page = new HomePage();
		page.clickOnSearchText();
	}

	@When("User searches for {string}")
	public void userSearchesFor(String searchInput) throws InterruptedException {
		System.out.println("Searching for: " + searchInput);
		HomePage page = new HomePage();
		page.sendProductname(searchInput);
	}

	@Then("Search results should be displayed as per {string}")
    public void searchResultsDisplayed(String searchInput) {
        WaitFor.untilUrlLoad("https://www.bigbasket.com/ps");
        String currentURL = Keyword.driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);
        assertTrue(currentURL.contains(searchInput),
                "The URL does not contain the expected search input");
    }
}
