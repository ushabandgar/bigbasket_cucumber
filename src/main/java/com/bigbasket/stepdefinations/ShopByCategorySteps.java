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
		keyword.maximizeBrowser();

	}

	@Then("SHOP BY CATEGORY should be displayed on HomePage")
	public void verifyShopByCategoryShouldBeDisplayedOnHomePage() {
		HomePage homepage = new HomePage();
		homepage.verifyShopByCategoryMenuIsAvailable();

	}

	@When("I click on SHOP BY CATEGORY menu")
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

	@And("I get the text before click on Show more +")
	public void getTextBeforeClickOnshowMore() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getTextBeforeClickOnShowMore();

	}

	@And("I click on {string} link")
	public void clickOnShowMore(String ShowMore) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.clickOnShowMoreLink();
	}

	@Then("additional categories should be displayed")
	public void verifyAdditionalCategoriesDisplays() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyAdditionalCategoriesAreDisplayed();
	}
	@Then("additional categories should be collapased")
	public void verifyAddiotionalCategoriesCollapsed() {
		
		
		
		//need to write code
	}

	@Then("{string} text replaces to {string}")
	public void showMoreButtonReplacedWithShowLess(String ShowMore, String ShowLess) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyShowMoreButtonReplaceswithShowLess();

	}

	@Then("I click on Show less - link additional categories should be collpased")
	public void additionalCategoriesCollapsed() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyAdditionalCategoriesAreCollapsed();
	}

	@Then("Bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc")
	public void defaultFiltersAreVisible() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyListOfFilter();
	}

	@When("I check if the filter section is scrollable")
	public void filterSectionScrollable() throws InterruptedException {

		Keyword keyword = new Keyword();
		Thread.sleep(4000);
		keyword.moveCurser();
		Thread.sleep(5000);
		keyword.mouseScrollDown();

	}

	@When("I select the brand {string} from the brand filter")
	public void selectBrand(String brandNameFromList) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.clickOnYourBrand(brandNameFromList);

	}

	@And("I click on checkbox of already selcted brand {string}")
	public void clickOnAlreadySelctedBrandToDeselct(String brandNameFromList) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.deSelectBrand(brandNameFromList);
	}

	@Then("I should see {string} brand is selected")
	public void isBrandSelected(String brandNameFromList) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyBrandIsSelected(brandNameFromList);

	}

	@Then("I should see {string} brand is deselected")
	public void isBrandDeselected(String brandNameFromList) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyBrandIsDeselected(brandNameFromList);

	}

	@Then("I should only see products from {string}")
	public void verifyProductListOfSelectedBrand(String brandNameFromList) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyProductListIsOfSelectedBrandOnly(brandNameFromList);
	}

	@When("I select the multiple brands from the brand filter")
	public void selectMultipleBrands() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.selectMultipleBrands();
	}

	@Then("I should see multiple brands are selected")
	public void verifyMultipleBrandsSelected() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyMultipleBrandsAreSelected();
	}

	@Then("the displayed products should only belong to the selected brands")
	public void verifyProductListBelongToMultpleSelctedBrandsOnly() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getSelectedBrandNames();
		categoryPage.verifyProductListForMultipleBrands();
	}

	@Then("I should see {string} section should be displayed and enabled")
	public void verifyFiltersSectionDisplayedAfterApplyingFilter(String Filters) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyFiltersSectionEnabledAfterApplyingFilter(Filters);
	}

	@Then("I should see {string} button should be displayed in Filters Section.")
	public void verifyClearButtonIsDisplayedInFiltersSection(String Clear) {

		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyClearButtonDisplayed(Clear);
	}
	
    @Then("I should see {string} as applied Filters in Filter section.")
    public void verifyAppliedFiltersListInFiltersSection(String AdidasTShirt) {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	//categoryPage.getAppliedFilterListInFilterSection();
		categoryPage.AppliedFilterInFilterSection(AdidasTShirt);
    }

}