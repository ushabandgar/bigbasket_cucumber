package com.bigbasket.stepdefinations;


import com.bigbasket.base.Keyword;
import com.bigbasket.pages.HomePage;
import com.bigbasket.pages.ShopByCategoryPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopByCategorySteps {

	@Given("Browser is launched and maximized")
	public void browserIsLaunchedAndUrlIsLoadedSuccessfully() {
		Keyword keyword = new Keyword();
		keyword.openBrowser("firefox");
        keyword.maximizeBrowser();
	}

	@And("close the browser")
	public void closeBrowser() {
		Keyword.driver.close();
	}

	@When("After entering url, User is on HomePage")
	public void userIsOnHomePage() {
		Keyword keyword = new Keyword();
		keyword.launchUrl("https://www.bigbasket.com/");
	}

	@Then("SHOP BY CATEGORY should be displayed on HomePage")
	public void verifyShopByCategoryShouldBeDisplayedOnHomePage() {
		HomePage homepage = new HomePage();
		homepage.verifyShopByCategoryMenuIsAvailable();

	}

	@When("I click on SHOP BY CATEBORY menu")
	public void clickOnShopByCatgeoryMenuAfterExpand() {
		HomePage homepage = new HomePage();
		homepage.clickOnShopByCategoryMenu();
	}

	@When("I scroll down")
	public void scrollDown() {
		Keyword keyword = new Keyword();
		keyword.mouseScrollDown();
	}

	@And("I click on all the categories one by one")
	public void clickOnAllCatgeoriesOneByOne() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.clickOnAllCategoriesOneByOne();
	}
	@Then("All the categories are clickable")
	public void verifyAllCatgoriesAreClickable() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.verifyAllCategoriesAreClickable();
	}

	
	@When("I click on {string} menu after expand")
	public void clickOnShopByCatgeoryMenuAfterExpand(String ShopByCategory) {
		HomePage homepage = new HomePage();
		homepage.clickOnShopByCategoryMenu();
	}

	@Then("I should see a catgories list like {string}, {string}, {string} etc")
	public void verifyCategoryListShouldBeDisplayed(String category1, String category2, String category3) {
		HomePage homepage = new HomePage();
		homepage.verifyAllCatgoriesAreDisplayedProperly();
	}

	@Then("I should see {string} menu collapses")
	public void verifyShopByCategoryShouldCollapseAfterExpand(String ShopByCategory) {
		HomePage homepage = new HomePage();
		homepage.verifyShopByCategoryCollapsesOnClickAfterExapands();
	}

	@And("I click outside the dropdwon")
	public void clickOutsideTheDropDown() {
		Keyword keyword = new Keyword();
		keyword.mouseHoverOn();
	}

	@And("I click on {string} category")
	public void clickOnCategory(String catgeoryNameLowerCase) throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.clickOnCategory(catgeoryNameLowerCase);
	}

	@Then("I should see Fashion category page")
	public void respectiveCategoryPageAfterClick() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifySpecificCatgeoryPageOpens();
	}

	@And("I click on Home button")
	public void clickOnHomeButton() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.clickOnHomeButton();
	}

	@Then("I should navigated to home Page")
	public void verifyNavigationToHomePageBytappingOnHomeButton() {
		HomePage homepage = new HomePage();
		homepage.verifyNavigatedToHomePageFromCategoryPage();
	}

	@And("I click on Back button of the browser")
	public void clickOnBackButtonOfBrowser() {
		Keyword keyword = new Keyword();
		keyword.clickOnBackButtonOfBrowser();
		HomePage homepage = new HomePage();
		homepage.verifyNavigatedToHomePageFromCategoryPage();
	}

	@Then("I should see {string} message")
	public void noProductMessageOfCategory(String NoProductMessage) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyNoProductMessgae();
	}

	@Then("I should see Shop By Category Section on Catgeory page")
	public void verifyShopByCategorySectionOnCategoryPage() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyShopByCategorySectionAvailableOnCategoryPage();
	}

	@Then("categoris with more than 5 subcatgories should have {string} link")
	public void verifyShowMorelinkDisplays(String ShowMoreLink) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getCountOfSubCategories();
		categoryPage.verifyShowMoreLinksDisplays();
	}
	@Then("categoris with less than or equal to 5 subcatgories should not have {string} link")
	public void verifyShowMorelinkNotDisplays(String ShowMoreLink) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getCountOfSubCategories();
		categoryPage.verifyShowMoreLinksDisplays();
	}
}