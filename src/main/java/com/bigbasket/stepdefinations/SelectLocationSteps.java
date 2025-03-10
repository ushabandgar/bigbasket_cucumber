package com.bigbasket.stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import com.bigbasket.base.Keyword;
import com.bigbasket.pages.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectLocationSteps {
	int areacode;

	@Then("{string} bar should be display on HomePage")
	public void bar_should_be_display_on_home_page(String SelectLocation) {
		HomePage homepage = new HomePage();
		homepage.verifySelectLoactionBarVisibleOnTheHomepageOrNot();

	}

	@When("User click on select location bar")
	public void user_click_on_select_location_bar() {
		HomePage homepage = new HomePage();
		homepage.clickonSelectLocationbar();

	}

	@When("User enter {string} into Search For Area TextBox")
	public void user_enter_into_search_for_area_text_box(String string) {
		HomePage homepage = new HomePage();
		homepage.enterTextIntoSearchForAreaTextBox();

	}

	@Then("verify User can able to enter text into Search For Area TextBox")
	public void verify_user_can_able_to_enter_text_into_search_for_area_text_box() {
		HomePage homepage = new HomePage();
		homepage.verifyThatUserCanAbleToTypeTextIntosearchForAreaTextBox();

	}

	@And("{string} placeholder text is appear in text box")
	public void placeholder_text_is_appear_in_text_box(String SearchForArea) {
		HomePage homepage = new HomePage();
	}

	@And("User enter {string} into TextBox")
	public void user_enter_text_box(String Pune) {
		HomePage homepage = new HomePage();
		homepage.getValueOfAttributeBeforeAndAfterEntertext();

	}

	@Then("placeholder text should not be appear in text box")
	public void placeholder_text_should_not_be_appear_in_text_box() {
		HomePage homepage = new HomePage();
		homepage.verifyThePlaceholderTextIsDisplayedWhenTheSeachForAreaTextBoxIsEmpty();

	}

	@And("User get list of address locations")
	public void usergetListOfAddressOfLocations() {
		HomePage homepage = new HomePage();
		homepage.addressOfLoactions();
	}

	@Then("Address of location results should be appear which contains {string}")
	public void address_of_location_results_should_be_appear_which_contains(String Pune) {
		HomePage homepage = new HomePage();
		homepage.verifythatAddressOfLocationResultsAreDisplayedWhenValidTextIsEnterIntoTextBOx();

	}

	@And("User observe Url of the page")
	public void user_observe_url_of_the_page() {
		HomePage homepage = new HomePage();
		homepage.getUrlBeforeEnterTextIntoTextBox();

	}

	@And("User keep empty TextBox")
	public void user_keep_empty_text_box() {
		HomePage homepage = new HomePage();
		homepage.KeepEmptySearchForAreaTextBox();

	}

	@And("User press the enter")
	public void user_press_the_enter() {
		HomePage homepage = new HomePage();
		homepage.getUrlAfterEnterTextIntoTextBox();

	}

	@Then("page should not be redirect on another page")
	public void page_should_not_be_redirect_on_another_page() {
		HomePage homepage = new HomePage();
		homepage.verifyTheBehaviourOfPageWhenTheSearchForAreaTextBoxEmptyAndUserPressTheEnter();

	}

	@And("User enter {string} into search for area text box")
	public void user_enter_into_search_for_area_text_Box(String Mum)  {
		HomePage homepage = new HomePage();
		homepage.EnterPartialTextIntoSearchForAreaTextBox();

	}

	@And("User get list of  related search results")
	public void user_get_list_of_related_search_results() {
		HomePage homepage = new HomePage();
		homepage.getAllSearchResultDescriptionWhenEnterPartialTextInIntoSearchForAreaTextBox();

	}

	@Then("Address of location results should be contains {string}")
	public void address_of_location_results_should_be_contains(String Mum) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterPartialTextIntoSearchForAreaTextBoxThenResultShouldBeDisplaye();

	}

	@And("User enter {string} into textBox")
	public void user_enter_into_text_box(String Mumbai) {
		HomePage homepage = new HomePage();
		homepage.enterTextIntoSearchForAreaTextbox();

	}

	@And("User click on clear button")
	public void user_click_on_clear_button() {
		HomePage homepage = new HomePage();
		homepage.clickOnClearButtonIntoSearchForAreaTextBox();

	}

	@Then("{string} text should be remove from textbox")
	public void text_should_be_remove_from_textbox(String Mumbai) {
		HomePage homepage = new HomePage();
		homepage.verifyThatWhenClickOnClearButtonThenSearchForAreaTextBoxShouldBeClear();

	}

	@When("User enter  speacial character {string} only into search for area  text box")
	public void user_enter_speacial_character_only_into_search_for_area_text_box(String string)
			throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.enterSpecialCharacterOnlyIntoSearchForAreaTextBox();

	}

	@Then("{string} message should be display")
	public void message_should_be_display(String SorryWedontdeliverinthislocation) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterSpeacialCharacterOnlyIntoSearchForAreaTextBox();

	}

	@And("User enter {string} into search for area  text box")
	public void user_enter_into_search_for_area_textbox(String string) {
		HomePage homepage = new HomePage();
		homepage.enterLargeNumberOnlyIntoSearchForAreaTextBox();

	}

	@Then("{string} result message should be display")
	public void message_should_be_display_on_page(String SorryWedontdeliverinthislocation) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterOnlyLargeNumberIntoSearchForAreaTextBox();

	}

	@And("User enter {string} into text box")
	public void user_enter_into_Textbox(String string) {
		HomePage homepage = new HomePage();
		homepage.enterInvalidSpecialCharacterOnlyIntoSearchForAreaTextBox();

	}

	@Then("{string} result message should be display on page")
	public void result_message_should_be_display_on_page(String string) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterInvalidSpecialCharacterOnlyIntoSearchForAreatTextBox();

	}

	@And("User enter {string} into select Location bar")
	public void user_enter_into_select_Location_bar(String hjfhfjwehjdwjdsooudiqwufiyf) {
		HomePage homepage = new HomePage();
		homepage.enterExtremelyLargeInvalidTextIntoearchForAreaTextBox();

	}

	@Then("{string} result message should be displayed on page")
	public void result_message_should_be_displayed_on_page(String hjfhfjwehjdwjdsooudiqwufiyf) {
		HomePage homepage = new HomePage();
		homepage.verifyWhenEnterExtremelyLargeInvalidTextIntoearchForAreaTextBox();

	}

	@And("User enter the following locations using DataTable")
	public void userEnterLocation(DataTable locationsTable) throws InterruptedException {
		List<List<String>> locations = locationsTable.cells();
		System.out.println(locations.get(0).get(0));
        Keyword.driver.findElement(By.xpath
        		("(//input[@placeholder=\"Search for area or street name\"])[1]"))
        .sendKeys(locations.get(0).get(0));	
		Thread.sleep(3000);
		
	}

	@Then("Search Suggestions result should contains {string}")
	public void verifySearchSuggestionContainsInputData(String SelectLocationInputData) {
		HomePage homepage = new HomePage();
		homepage.verifySearchSuggestionContainsInputLocationData(SelectLocationInputData);
	}

}
