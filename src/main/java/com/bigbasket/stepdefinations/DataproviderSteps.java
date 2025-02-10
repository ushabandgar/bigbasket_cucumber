package com.bigbasket.stepdefinations;

import static org.testng.Assert.assertTrue;

import com.bigbasket.base.Keyword;
import com.bigbasket.base.WaitFor;
import com.bigbasket.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataproviderSteps {

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
