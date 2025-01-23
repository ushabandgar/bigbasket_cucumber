package com.bigbasket.stepdefinations;

import com.bigbasket.base.Keyword;
import com.bigbasket.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchForProductsSteps {
	@Given("Browser launched")
	public void browserLaunchedAndUrlIsLoadedSuccessfully() {
		Keyword keyword = new Keyword();
		keyword.openBrowser("Firefox");

	}

	@And("close browser")
	public void closeBrowser() {
		Keyword.driver.close();

	}

	@When("After enter url, User on HomePage")
	public void userOnHomePageOrNot() {
		Keyword keyword = new Keyword();
		keyword.launchUrl("https://www.bigbasket.com/");
	}

	@Then("SearchTextBox should be displayed on HomePage")
	public void verifySearchTextBoxShouldBeDisplayedOnHomePageOrNot() {
		HomePage homepage = new HomePage();
		homepage.verifySearchTextBoxVisibleOnThePageOrNot();

	}

	@When("User enter text into Search Text box")
	public void enterTextIntoSearchTextBox() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.enterTextIntoSearchTextBox();

	}

	@Then("verify User can able to enter text into the Search Bar")
	public void verifyUserCanAbleToTextIntoSearchTextBox() {
		HomePage homepage = new HomePage();
		homepage.verifyThatUserCanAbleToTypeTextIntoTheSearchBar();

	}

	@When("{string} is appear in Text BOX when text box is empty")
	public void is_appear_in_text_box_when_text_box_is_empty(String string) {
	}

	@And("User enter {string} into empty text Box")
	public void user_enter_into_empty_text_box(String string) {
		HomePage homepage = new HomePage();
		homepage.getValueOfAttribute();

	}

	@And("Observe {string} is not  appear in Text BOX")
	public void observe_is_not_appear_in_text_box(String string) {
	}

	@Then("verify placeholder text is displayed when Search Text box is empty")
	public void verify_placeholder_text_is_displayed_when_search_text_box_is_empty() {
		HomePage homepage = new HomePage();
		homepage.verifyThebBehaviourWhenThSearchbBarIsLeftEmptyAndUserPressTheEnter();
	}

}
