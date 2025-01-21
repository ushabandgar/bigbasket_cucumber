package com.bigbasket.stepdefinations;

import org.openqa.selenium.By;

import com.bigbasket.base.Keyword;
import com.bigbasket.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopByCategorySteps {

	@Given("Browser is launched")
	public void browserIsLaunchedAndUrlIsLoadedSuccessfully() {
		Keyword keyword=new Keyword();
		keyword.openBrowser("firefox");
	
	}

	@And("close the browser")
	public void closeBrowser() {
		Keyword.driver.close();
	}
	@When("After entering url, User is on HomePage")
	public void userIsOnHomePage() {
		Keyword keyword=new Keyword();
		keyword.launchUrl("https://www.bigbasket.com/");
	}

	@Then("SHOP BY CATEGORY should be displayed on HomePage")
	public void verifyShopByCategoryShouldBeDisplayedOnHomePage() {
         HomePage homepage=new HomePage();
         homepage.verifyShopByCategoryMenuIsAvailable();
		
	}
	@When("I click on SHOP BY CATEBORY menu")
	public void clickOnShopByCatgeoryMenuAfterExpand() {
		 HomePage homepage=new HomePage();
         homepage.clickOnShopByCategoryMenu();
	}
	@When("I click on {string} menu after expand")
	public void clickOnShopByCatgeoryMenuAfterExpand(String ShopByCategory) {
		 HomePage homepage=new HomePage();
         homepage.clickOnShopByCategoryMenu();
	}
	@Then("I should see a catgories list like {string}, {string}, {string} etc")
	public void verifyCategoryListShouldBeDisplayed(String category1,String category2,String category3) {
		HomePage homepage=new HomePage();
        homepage.verifyAllCatgoriesAreDisplayedProperly();
	}

	@Then("I should see {string} menu collapses")
	public void verifyShopByCategoryShouldCollapseAfterExpand(String ShopByCategory) {
		HomePage homepage=new HomePage();
        homepage.verifyShopByCategoryCollapsesOnClickAfterExapands();
	}
	@And("I click outside the dropdwon")
	public void clickOutsideTheDropDown() {
		Keyword keyword=new Keyword();
		keyword.mouseHoverOn();
	}
}