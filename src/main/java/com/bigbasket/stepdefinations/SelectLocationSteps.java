package com.bigbasket.stepdefinations;

import com.bigbasket.base.Keyword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectLocationSteps {
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
	
	@Then("{string} bar should be display on HomePage")
	public void bar_should_be_display_on_home_page(String SelectLocation) {
	    
	}



}
