package com.bigbasket.stepdefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.bigbasket.base.Keyword;
import com.bigbasket.base.Locator;
import com.bigbasket.base.WaitFor;
import com.bigbasket.pages.HomePage;
import com.bigbasket.pages.ShopByCategoryPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopByCategorySteps {
	
	int countAfterFilter;
	String classNameBeforeHideFilter, classNameAfterHideFilter;

	@Then("SHOP BY CATEGORY should be displayed on HomePage")
	public void verifyShopByCategoryShouldBeDisplayedOnHomePage() {
		HomePage homepage = new HomePage();
		homepage.verifyShopByCategoryMenuIsAvailable();

	}

	@When("User click on SHOP BY CATEGORY menu")
	public void clickOnShopByCatgeoryMenuBeforeExpand() {
		HomePage homepage = new HomePage();
		homepage.clickOnShopByCategoryMenu();
	}

	@When("User scroll down")
	public void scrollDown() {
		Keyword keyword = new Keyword();
		keyword.mouseScrollDown();
	}

	@And("User click on all the categories one by one")
	public void clickOnAllCatgeoriesOneByOne() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.clickOnAllCategoriesOneByOne();
	}

	@Then("All the categories are clickable")
	public void verifyAllCatgoriesAreClickable() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.verifyAllCategoriesAreClickable();
	}

	@When("User click on {string} menu after expand")
	public void clickOnShopByCatgeoryMenuAfterExpand(String ShopByCategory) {
		HomePage homepage = new HomePage();
		homepage.clickOnShopByCategoryMenu();
	}

	@Then("User should see a catgories list like {string}, {string}, {string} etc")
	public void verifyCategoryListShouldBeDisplayed(String category1, String category2, String category3) {
		HomePage homepage = new HomePage();
		homepage.verifyAllCatgoriesAreDisplayedProperly();
	}

	@Then("User should see {string} menu collapses")
	public void verifyShopByCategoryShouldCollapseAfterExpand(String ShopByCategory) {
		HomePage homepage = new HomePage();
		homepage.verifyShopByCategoryCollapsesOnClickAfterExapands();
	}

	@And("User click outside the dropdwon")
	public void clickOutsideTheDropDown() {
		Keyword keyword = new Keyword();
		keyword.mouseHoverOn();
	}

	@And("User click on {string} category")
	public void clickOnCategory(String catgeoryName) throws InterruptedException {
		HomePage homepage = new HomePage();
		String catgeoryNameLowerCase=catgeoryName.toLowerCase();
		homepage.clickOnCategory(catgeoryNameLowerCase);
	}

	@Then("User should see Fashion category page")
	public void respectiveCategoryPageAfterClick() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifySpecificCatgeoryPageOpens();
	}

	@And("User click on Home button")
	public void clickOnHomeButton() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.clickOnHomeButton();
	}

	@Then("User should navigated to home Page")
	public void verifyNavigationToHomePageBytappingOnHomeButton() {
		HomePage homepage = new HomePage();
		homepage.verifyNavigatedToHomePageFromCategoryPage();
	}

	@And("User click on Back button of the browser")
	public void clickOnBackButtonOfBrowser() {
		Keyword keyword = new Keyword();
		keyword.clickOnBackButtonOfBrowser();
		HomePage homepage = new HomePage();
		homepage.verifyNavigatedToHomePageFromCategoryPage();
	}

	@Then("User should see {string} message")
	public void noProductMessageOfCategory(String NoProductMessage) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyNoProductMessgae();
	}

	@Then("User should see Shop By Category Section on Catgeory page")
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

	@And("User get the text before click on Show more +")
	public void getTextBeforeClickOnshowMore() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getTextBeforeClickOnShowMore();

	}

	@And("User click on {string} link")
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

		// need to write code
	}

	@Then("{string} text replaces to {string}")
	public void showMoreButtonReplacedWithShowLess(String ShowMore, String ShowLess) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyShowMoreButtonReplaceswithShowLess();

	}

	@Then("User click on Show less - link additional categories should be collpased")
	public void additionalCategoriesCollapsed() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyAdditionalCategoriesAreCollapsed();
	}

	@Then("Bydefault Filters should be visible as per Category types like Brands,Product Rating, Price etc")
	public void defaultFiltersAreVisible() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyListOfFilter();
	}

	@When("User check if the filter section is scrollable")
	public void filterSectionScrollable() throws InterruptedException {

		Keyword keyword = new Keyword();
		Thread.sleep(4000);
		keyword.moveCurser();
		Thread.sleep(5000);
		keyword.mouseScrollDown();

	}

	@When("User select the brand {string} from the brand filter")
	public void selectBrand(String filterNameFromList) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.clickOnYourFilter(filterNameFromList);

	}

	@And("User click on checkbox of already selcted brand {string}")
	public void clickOnAlreadySelctedBrandToDeselct(String brandNameFromList) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.deSelectBrand(brandNameFromList);
	}

	@Then("User should see {string} brand is selected")
	public void isBrandSelected(String brandNameFromList) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyBrandIsSelected(brandNameFromList);

	}

	@Then("User should see {string} brand is deselected")
	public void isBrandDeselected(String brandNameFromList) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyBrandIsDeselected(brandNameFromList);

	}

	@Then("User should only see products from {string}")
	public void verifyProductListOfSelectedBrand(String brandNameFromList) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyProductListIsOfSelectedBrandOnly(brandNameFromList);
	}

	@When("User select the multiple brands from the brand filter")
	public void selectMultipleBrands() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.selectMultipleBrands();
	}

	@Then("User should see multiple brands are selected")
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

	@Then("User should see {string} section should be displayed and enabled")
	public void verifyFiltersSectionDisplayedAfterApplyingFilter(String Filters) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyFiltersSectionEnabledAfterApplyingFilter(Filters);
	}

	@Then("User should see {string} button should be displayed in Filters Section.")
	public void verifyClearButtonIsDisplayedInFiltersSection(String Clear) {

		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyClearButtonDisplayed(Clear);
	}

	@Then("User should see {string} as applied Filters in Filter section.")
	public void verifyAppliedFiltersListInFiltersSection(String AdidasTShirt) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		// categoryPage.getAppliedFilterListInFilterSection();
		categoryPage.AppliedFilterInFilterSection(AdidasTShirt);
	}

	@And("User click on {string} button in Filter Section")
	public void clearFilter(String Clear) throws InterruptedException {

		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.clickOnClearButton();
	}

	@Then("User should see all filters should be cleared.")
	public void verifyClearedAllTheFiltersInFilterSection() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyClearAllFilters();

	}

	@And("User scroll until all products are loaded")
	public void scrollDownUntillProductsLoaded() throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		Keyword keyword = new Keyword();
		WebElement footer = keyword.getWebElement(Locator.footer);
		keyword.scrollDownTillSpecificElement(footer);
		categoryPage.waitForSomeTime();

	}

	@And("Fashion category showing 68 count with category heading")
	public void getCategoryShowingCountWithHeading() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getProductCountShowingWithCatgeoryNames();
	}

	@And("User get count of product for that category")
	public void originalProductCountAfterClickOnCategory() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getOriginalProductCountAfterClickingOnCategory();
	}

	@Then("Both count should match")
	public void verifyBothCountMathches() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyActualProductCountAndCountShowingWithCategoryName();
	}

	@And("User get product count for applied filter")
	public void getProductCountAfterApplyingFilter() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		countAfterFilter = categoryPage.getProductCountAfterApplyingFilter();
	}

	@Then("User should see original product list.")
	public void getOriginalProductListWithoutFilter() throws InterruptedException {
		scrollDownUntillProductsLoaded();
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		int countOriginal = categoryPage.getOriginalProductCountAfterClickingOnCategory();
		Assert.assertNotEquals(countAfterFilter, countOriginal);
	}

	@And("User click on {string} subcategory")
	public void clickOnYourSubCategory(String SubCategoryName) throws InterruptedException {
		Keyword keyword = new Keyword();
		keyword.clickOnYourSubCategory(SubCategoryName);
	}

	@Then("User should see that subcategory should be added in Category hierarchy.")
	public void verifySubCategoryAddedInCategoryHierarchy() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyCategoryTagsAfterClickingOnSubActegory();
	}

	@And("User click on {string}")
	public void clickOnHideFilters(String HideFilters) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		classNameBeforeHideFilter = categoryPage.getClassNameBeforeHideFilter();
		categoryPage.clickOnHideFiltersButton();
	}

	@Then("User should see All Filters should get hided.")
	public void verifyAllFiltersAreHidedAfterTapOnHideFilters() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		String classNameAfterHideFilter = categoryPage.getClassNameAfterHideFilter();
		Assert.assertNotEquals(classNameBeforeHideFilter, classNameAfterHideFilter);
	}

	@Then("User should see Hide Filter text replaces with {string}.")
	public void verifyHideFiltersReplacesWithShowFiltersOnTapOfIt(String ExpectedText) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyHideFiltersTextReplacesWithShowFiltersAfterClick(ExpectedText);
	}

	@Then("User should see Show Filter text replaces with {string}.")
	public void verifyShowFiltersReplacesWithHideFiltersOnTapOfIt(String ExpectedText) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyHideFiltersTextReplacesWithShowFiltersAfterClick(ExpectedText);
	}

	@Then("User should see All Filters should be shown.")
	public void verifyAllFiltersShownAfterTapOnShowFilters() {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		String classNameAfterHideFilter = categoryPage.getClassNameAfterHideFilter();
		Assert.assertNotEquals(classNameBeforeHideFilter, classNameAfterHideFilter);
	}

	@Given("User is on Category Page")
	public void userIsOnCategoryPage() {
		clickOnShopByCatgeoryMenuBeforeExpand();
		try {
			clickOnCategory("fashion");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User click on {string} filter")
	public void userClickOnFilter(String filterNameFromList) throws InterruptedException {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.clickOnYourFilter(filterNameFromList);
	}

	@Then("User should see products list of price between {int} and {int}")
	public void user_should_see_products_list_of_price_filter_only(Integer minPrice, Integer maxPrice) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getProductPrice();
		categoryPage.verifyProductPriceAfterPriceFilter(minPrice, maxPrice);
	}

	@Then("User should see products list of price should be greater than {int}")
	public void userShouldSeeProductPriceGreaterThanFiveHundered(Integer MoreThanFiveHunderedFilter) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.verifyProductPriceMoreThanFiveHundered(MoreThanFiveHunderedFilter);
	}

	@Then("User should see products list of having discount More than {int}%")
	public void verifyProductListHavingDiscountMoreThantwentyFive(Integer discountOnProduct) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getDiscountOnProduct();
		categoryPage.verifyDiscountOnProductMoreThanTwentyFivePercentage(discountOnProduct);
	}

	@Then("User should see products list of having discount between {int}% - {int}%")
	public void verifyProductListHavingDiscountBetweenSelectedRange(Integer MinDiscountOnProduct,
			Integer MaxDiscountOnProduct) {
		ShopByCategoryPage categoryPage = new ShopByCategoryPage();
		categoryPage.getDiscountOnProduct();
		categoryPage.verifyDiscountOnProductBetweenSelectedRange(MinDiscountOnProduct, MaxDiscountOnProduct);
	}

    @Then("User should see products list of size {string}")
    public void verifyPorductListOfSizeFromFilter(String sizeFromFilter) {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.getProductSizeOrPackSize();
		categoryPage.verifyPorductListHavingSizeFromFilterOnly(sizeFromFilter);
    }

    @Then("User should see products list of {string}")
    public void verifyPorductListOfPackSizeFilter(String packSizeFromFilter) {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.getProductSizeOrPackSize();
		categoryPage.verifyPorductListHavingPackSizeFromFilterOnly(packSizeFromFilter);
    }
    
    @And("User click on {int} star rating filter")
    public void clickOnYourRatingFilter(Integer ratingNumber) throws InterruptedException {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.clickOnRatingFilter(ratingNumber);
    }
    
    @Then("User should see products list of {string} star ratings only")
    public void verifyProductListWithRatingFilterSelcted(String ratingSelected) throws InterruptedException {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.getRatingOnProductList();
    	categoryPage.verifyProductRatingsOnProductDescritpion(ratingSelected);
    }

    @And("User mouse hover on {string} category")
    public void mouseHoverOnSpecificElement(String categoryNameToHoverOn) throws InterruptedException {

    	Keyword keyword=new Keyword();
    	categoryNameToHoverOn=categoryNameToHoverOn.toLowerCase();
    	keyword.mouseHoverOnYourCategory(categoryNameToHoverOn);

    }
    
    @And("User mouse hover on {string} subcategory")
    public void mouseHoverOnSubCategory(String subcategoryNameToMouseHoverOn) throws InterruptedException {
    	Keyword keyword=new Keyword();

    	subcategoryNameToMouseHoverOn=subcategoryNameToMouseHoverOn.toLowerCase();
    	keyword.mouseHoverOnYourSubCategory(subcategoryNameToMouseHoverOn);

    }

    @And("then hover on {string} and click on it")
    public void clickOnChildOfSubCatgeory(String childCategoryName) {
    	childCategoryName=childCategoryName.toLowerCase();
    	WebElement childCategory= Keyword.driver.findElement(By.xpath("//div[@class=\"CategoryMenu___StyledMenuItems-sc-d3svbp-4 fpskRu\"]/nav/ul[3]/li/a[@href=\"/pc/fruits-vegetables/fresh-fruits/"+childCategoryName+"/?nc=nb\"]"));
    	WaitFor.elementToBeClickable(childCategory);
    	childCategory.click();
    }

    @Then("User should see product list of having {string} only")
    public void verifyPorductListHavingChildCatgeoryProductsOnly(String childCategorySelected) throws InterruptedException {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	scrollDownUntillProductsLoaded();
    	categoryPage.getProductListAfterClickOnCategory();
    	categoryPage.verifyProductDescriptionHavingCatgeoryProducts(childCategorySelected);
    }

    @Then("{string} filter button should be displayed")
    public void relevanceFilterIsDisplayed(String relevanceFilter) {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.verifyRelevanceFiltersDisplayed(relevanceFilter);
    }
    @And("User click on {string} button")
    public void clickOnRelevanceButton(String relevanceButton) throws InterruptedException {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.clickOnRelevanceButton();
    }

    @Then("User should see the sorting options available")
    public void relevanceFilterIsClickable() {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.verifyRelevanceFilAdnSortingOptionsAvaialble();
    }

    @And("User click on {string} relevance option")
    public void clickOnYourRelevenaceOption(String relevanceOptionSelected) throws InterruptedException {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.clickOnAnyRelevanceOption(relevanceOptionSelected);
    }

    @Then("User should see product list sorting from low to high price")
    public void verifyProductListPriceSortingLowToHigh() {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.verifyProductListPriceIsSortingFromLowToHigh();
    }

    @Then("User should see product list sorting from high to low price")
    public void verifyProductListPriceSortingHighToLow() {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.verifyProductListPriceIsSortingFromHighToLow();
    }
    
    @And("User click on {string} icon")
    public void clickOnSaveForLaterButton(String SaveForLater) throws InterruptedException {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.clickOnSaveForLater();
    }

    @Then("User should see opening login or signup popup")
    public void verifyLoginOrSignupPopupOpens() {
    	ShopByCategoryPage categoryPage = new ShopByCategoryPage();
    	categoryPage.verifyLoginTextAfterSaveForLaterClick();
    }

}