package com.bigbasket.stepdefinations;

import com.bigbasket.base.Keyword;
import com.bigbasket.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopByCategorySteps {

	@Given("Browser is launched")
	public void browserIsLaunchedAndUrlIsLoadedSuccessfully() {
		Keyword keyword=new Keyword();
		keyword.openBrowser("firefox");
	
	}

	@When("After entering url, User is on HomePage")
	public void userIsOnHomePage() {
		Keyword keyword=new Keyword();
		keyword.launchUrl("https://www.bigbasket.com/");
	}

	@Then("SHOP BY CATEGORY should be displayed on HomePage")
	public void shopByCategoryShouldBeDisplayedOnHomePage() {
         HomePage homepage=new HomePage();
         homepage.verifyShopByCategoryMenuIsAvailable();
		
	}
}
