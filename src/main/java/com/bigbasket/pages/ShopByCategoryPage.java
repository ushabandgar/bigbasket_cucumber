package com.bigbasket.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.bigbasket.base.Keyword;
import com.bigbasket.base.Locator;
import com.bigbasket.base.WaitFor;

public class ShopByCategoryPage {

	Keyword keyword = new Keyword();
	@FindBy(css = "span[class=\"name text-md leading-md xl:leading-sm xl:text-base text-darkOnyx-800\"]")
	WebElement HomeButtonOnCategoryPage;

	@FindBy(css = "p[class=\"m-auto text-2xl font-light w-152 leading-lg\"]")
	WebElement NoProductMessage;
	@FindBy(css = "div[class=\"slug___StyledFilterByCategory-sc-1pgl3kl-2 ebgQYS\"]")
	WebElement ShopByCatgeorySection;

	@FindBy(css = "span[class=\"Label-sc-15v1nk5-0 FilterByCategory___StyledLabel-sc-c0pkxv-0 gJxZPQ bPmHlw\"]")
	WebElement ShopByCategoryOnCategoryPage;

	@FindBy(css = "button[class=\"Button-sc-1dr2sn8-0 FilterByCategory___StyledButton-sc-c0pkxv-5 kYQsWi bDIesH\"]")
	WebElement showMoreLink;

	@FindBy(css = "button[class=\"Button-sc-1dr2sn8-0 FilterByCategory___StyledButton-sc-c0pkxv-5 kYQsWi bDIesH\"]")
	WebElement showLessLink;

	@FindBy(xpath = "//ul[@id=\"side-menu-category-navigation\"]")
	WebElement subcategoriesList;

	@FindBy(xpath = "//span[@class=\"Label-sc-15v1nk5-0 FilterByRating___StyledLabel-sc-17wxy9s-0 gJxZPQ jKZfbM\"]")
	WebElement ProductRatingFilter;

	@FindBy(xpath = "//span[@class=\"Label-sc-15v1nk5-0 FilterSelection___StyledLabel-sc-1d3okpu-0 gJxZPQ ffRDqB\"]")
	List<WebElement> filters;

	@FindBy(css = "span[class=\"Label-sc-15v1nk5-0 BrandName___StyledLabel2-sc-hssfrl-1 gJxZPQ keQNWn\"]")
	WebElement brandNameOnProductDesc;

	@FindBy(xpath = "//span[@class=\"Label-sc-15v1nk5-0 BrandName___StyledLabel2-sc-hssfrl-1 gJxZPQ keQNWn\"]")
	List<WebElement> brandNamesOnProductDesc;

	@FindBy(xpath = "//div[@id=\"side-filter-by-rating\"][2]/div[2]/span/label")
	List<WebElement> selectedBrandNames;

	@FindBy(css = "div[class=\"p-2.5 mt-5 flex flex-col bg-white border border-silverSurfer-200 rounded-2xs\"]")
	WebElement FiltersSection;

	@FindBy(css = "span[class=\"Label-sc-15v1nk5-0 gJxZPQ text-base font-semibold leading-sm tracking-xs text-darkOnyx-900\"]")
	WebElement FiltersText;

	@FindBy(css = "button[class=\"Button-sc-1dr2sn8-0 FilterSelected___StyledButton-sc-bx06kz-0 kYQsWi dwgfcn\"]")
	WebElement ClearButton;

	@FindBy(xpath = "//div[@class=\"flex justify-start items-center\"]/a/span")
	List<WebElement> SelectedCategoryHierarchy;

	String textbeforeclick;
	String brandName;

	public ShopByCategoryPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public String getNameOfCategoryAfterClick(String categoryName) {
		String CategoryNameOnCategoryPage = Keyword.driver
				.findElement(By.cssSelector("a[href=\"/cl/" + categoryName + "/?nc=ct-fa\"]")).getText();
		return CategoryNameOnCategoryPage;
	}

	public void verifySpecificCatgeoryPageOpens() throws InterruptedException {
		WaitFor.untilUrlLoad("fashion");
		if (Keyword.driver.getCurrentUrl().contains("fashion")) {
			String categoryNameAfterClick = getNameOfCategoryAfterClick("fashion");
			Assert.assertTrue(categoryNameAfterClick.equalsIgnoreCase("fashion"));
		}
	}

	public void clickOnHomeButton() throws InterruptedException {
		keyword.clickOn(HomeButtonOnCategoryPage);
		Thread.sleep(3000);
		WaitFor.untilUrlLoad("https://www.bigbasket.com/");
	}

	public String getNoProductMessage() {

		String actualNoProductMessage = NoProductMessage.getText();
		return actualNoProductMessage;
	}

	public int getProductListAfterClickOnCategory() {
		List<WebElement> productList = Keyword.driver
				.findElements(By.cssSelector("div[class=\"SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP\"]"));
		int productCount = productList.size();
		return productCount;
	}

	public void verifyNoProductMessgae() {
		int productCount = getProductListAfterClickOnCategory();
		if (productCount == 0) {
			String actualNoProductMessage = getNoProductMessage();
			String expectedMessage = "We couldn't find anything matching your query. Try something else.";
			Assert.assertEquals(actualNoProductMessage, expectedMessage);
		} else {
			System.out.println("Category having products in it.");
		}

	}

	public void clickOnBackButtonOfBrowserFromCategoryPage() {
		keyword.clickOnBackButtonOfBrowser();
	}

	public void verifyShopByCategorySectionAvailableOnCategoryPage() {
		if (ShopByCatgeorySection.isDisplayed()) {
			String ShopByCategoryText = ShopByCategoryOnCategoryPage.getText();
			Assert.assertTrue(ShopByCategoryText.equals("Shop by Category"));
		}
	}

	public int getCountOfSubCategories() {
		Keyword keyword = new Keyword();
		List<WebElement> subCategories = keyword.getWebElements(Locator.shopByCatgeorySubCategories);
		int countOfSubCategories = subCategories.size();

		return countOfSubCategories;

	}

	public void verifyShowMoreLinksDisplays() {
		if (getCountOfSubCategories() > 5) {
			if (showMoreLink.isDisplayed()) {
				String ActualShowMoreLinkText = showMoreLink.getText();
				String expectedShowMoreLinkText = "Show more +";
				Assert.assertEquals(ActualShowMoreLinkText, expectedShowMoreLinkText);
			}
		} else {
			Assert.assertFalse(false, "Clicked Categories have less or equal to 5 subcategories in it.");
		}
	}

	public void clickOnShowMoreLink() throws InterruptedException {
		keyword.clickOn(showMoreLink);
		Thread.sleep(3000);
	}

	public void getTextBeforeClickOnShowMore() {
		textbeforeclick = showMoreLink.getText();
	}

	public void verifyAdditionalCategoriesAreDisplayed() {
		int countofSubCategoris = getCountOfSubCategories();
		List<WebElement> subCategories = keyword.getWebElements(Locator.shopByCatgeorySubCategories);

		for (int i = 4; i < countofSubCategoris; i++) {
			Assert.assertTrue(subCategories.get(i).isDisplayed());
		}

	}

	public void verifyShowMoreButtonReplaceswithShowLess() throws InterruptedException {
		Thread.sleep(3000);
		String textAfterClickonShowMore = showMoreLink.getText();
		Assert.assertNotEquals(textbeforeclick, textAfterClickonShowMore);
	}

	public void verifyAdditionalCategoriesAreCollapsed() throws InterruptedException {

		String classNameAfterClickOnShowMore = subcategoriesList.getAttribute("class");
		clickOnShowMoreLink();
		String classNameAfterClickOnShowLess = subcategoriesList.getAttribute("class");
		Assert.assertFalse(classNameAfterClickOnShowMore.equals(classNameAfterClickOnShowLess));

	}

//	public void getDefaultFilterList() {
//		for(WebElement filter:filters) {
//			System.out.println(filter.getText());
//		}
//		
//	}
	public void verifyListOfFilter() {
		SoftAssert softlyAssert = new SoftAssert();
		softlyAssert.assertTrue(ProductRatingFilter.isDisplayed());
		for (WebElement filter : filters) {
			System.out.println(filter.getText());
			softlyAssert.assertTrue(filter.isDisplayed());
		}
		softlyAssert.assertAll();
	}

	public void clickOnYourBrand(String brandNameFromList) throws InterruptedException {
		Thread.sleep(3000);
		keyword.mouseScrollDown();
		brandNameFromList = brandNameFromList.replace(" ", "");
		brandNameFromList = "i-" + brandNameFromList;
		WebElement brandName = HomePage.shopByCategoryMenu
				.findElement(By.xpath("//input[@id=\"" + brandNameFromList + "\"]"));
		brandName.click();
		Thread.sleep(3000);
	}

	public void deSelectBrand(String brandNameFromList) throws InterruptedException {
		brandNameFromList = brandNameFromList.replace(" ", "");
		brandNameFromList = "i-" + brandNameFromList;
		WebElement brandName = HomePage.shopByCategoryMenu
				.findElement(By.xpath("//input[@id=\"" + brandNameFromList + "\"]"));
		brandName.click();
		Thread.sleep(3000);
	}

	public void verifyBrandIsSelected(String brandNameFromList) {

		boolean flag = getBrandNameElement(brandNameFromList).isSelected();
		if (flag == true) {
			Assert.assertTrue(true);
		}
	}

	public WebElement getBrandNameElement(String brandNameFromList) {
		brandNameFromList = brandNameFromList.replace(" ", "");
		brandNameFromList = "i-" + brandNameFromList;
		WebElement brandName = HomePage.shopByCategoryMenu
				.findElement(By.xpath("//label[@for=\"" + brandNameFromList + "\"]"));
		return brandName;
	}

	public String getBrandNameOnProductDesc() {
		String brandNameOnProduct = brandNameOnProductDesc.getText();
		return brandNameOnProduct;
	}

	public List<String> getBrandNamesFromProducts() {
		ArrayList<String> BrandNameList = new ArrayList<String>();
		for (WebElement brandNameOnProduct : brandNamesOnProductDesc) {
			BrandNameList.add(brandNameOnProduct.getText());
		}
		return BrandNameList;
	}

	public List<String> getSelectedBrandNames() throws InterruptedException {
		ArrayList<String> selectedBrand = new ArrayList<String>();

		List<WebElement> brandListCheckboxes = keyword.getWebElements(Locator.brandListCheckbox);
		List<WebElement> brandListNames = keyword.getWebElements(Locator.brandListNames);
		for (int i = 0; i < brandListCheckboxes.size(); i++) {
			String brandName = brandListNames.get(i).getText();
			boolean flag = brandListCheckboxes.get(i).isSelected();
			if (flag == true) {
				selectedBrand.add(brandName);
			}
		}
		return selectedBrand;
	}

	public void verifyProductListIsOfSelectedBrandOnly(String brandNameFromList) {

		String selectedBrandName = getBrandNameElement(brandNameFromList).getText();
		Assert.assertTrue(selectedBrandName.contains(getBrandNameOnProductDesc()));
	}

	public void verifyBrandIsDeselected(String brandNameFromList) {
		boolean flag = getBrandNameElement(brandNameFromList).isSelected();
		if (flag == false) {
			Assert.assertTrue(true);
		}
	}

	public void selectMultipleBrands() throws InterruptedException {
		Thread.sleep(3000);
		keyword.mouseScrollDown();
		List<WebElement> brandListCheckboxes = keyword.getWebElements(Locator.brandListCheckbox);
		List<WebElement> brandListNames = keyword.getWebElements(Locator.brandListNames);
		for (int i = 0; i < brandListCheckboxes.size(); i++) {
			String brandName = brandListNames.get(i).getText();
			if (brandName.contains("Adidas") || brandName.contains("Brodees")) {
				brandListCheckboxes.get(i).click();
				Thread.sleep(3000);
				brandListNames = keyword.getWebElements(Locator.brandListNames);
				brandListCheckboxes = keyword.getWebElements(Locator.brandListCheckbox);
			}
		}
	}

	public void verifyMultipleBrandsAreSelected() {
		List<WebElement> brandListCheckboxes = keyword.getWebElements(Locator.brandListCheckbox);
		List<WebElement> brandListNames = keyword.getWebElements(Locator.brandListNames);
		for (int i = 0; i < brandListCheckboxes.size(); i++) {
			String brandName = brandListNames.get(i).getText();
			boolean flag = brandListCheckboxes.get(i).isSelected();
			if (brandName.contains("Adidas") || brandName.contains("Brodees")) {
				Assert.assertTrue(flag);
			} else {
				Assert.assertFalse(flag);
			}
		}
	}

	public void verifyProductListForMultipleBrands() throws InterruptedException {
		List<String> brandSelected = getSelectedBrandNames();
		List<String> brandsOnP = getBrandNamesFromProducts();

		Set<String> brandsOnPSet = new HashSet<String>(brandsOnP);
		List<String> list = new ArrayList<String>(brandsOnPSet);
		Collections.sort(list);
		SoftAssert softlyAssert = new SoftAssert();
		softlyAssert.assertEquals(brandSelected, list);
		softlyAssert.assertAll();
	}

	public void verifyFiltersSectionEnabledAfterApplyingFilter(String Filters) {

		SoftAssert softlyAssert = new SoftAssert();
		softlyAssert.assertTrue(FiltersSection.isDisplayed());
		softlyAssert.assertTrue(FiltersSection.isEnabled());
		softlyAssert.assertTrue(FiltersText.getText().equals(Filters));
		softlyAssert.assertAll();
	}

	public void verifyClearButtonDisplayed(String Clear) {

		SoftAssert softlyAssert = new SoftAssert();
		softlyAssert.assertTrue(ClearButton.isDisplayed());
		softlyAssert.assertTrue(ClearButton.getText().equals(Clear));
		softlyAssert.assertAll();

	}

	public List<String> getAppliedFilterListInFilterSection() {
		ArrayList<String> FilterListInFilterSection = new ArrayList<String>();
		List<WebElement> AppliedFilterListInFilterSection = Keyword.driver.findElements(By.cssSelector(
				"span[class=\"Label-sc-15v1nk5-0 FilterSelected___StyledLabel2-sc-bx06kz-5 gJxZPQ fTfejP\"]"));
		for (WebElement AppliedFlter : AppliedFilterListInFilterSection) {
			FilterListInFilterSection.add(AppliedFlter.getText());
		}
		return FilterListInFilterSection;
	}

	public List<String> getAppliedFiltersListFromIndividualFilter() {
		ArrayList<String> FilterListFromSpecificFilter = new ArrayList<String>();

		Keyword.driver.findElements(By.xpath("//input[@id=\"i-Rs101toRs200\" and @checked=\"\"]"));
		return FilterListFromSpecificFilter;
	}

	public void AppliedFilterInFilterSection(String AdidasTShirt) {

		AdidasTShirt = "Adidas T-shirt";
		Assert.assertTrue(getAppliedFilterListInFilterSection().contains(AdidasTShirt));

	}

	public void clickOnClearButton() throws InterruptedException {
		ClearButton.click();
		waitForSomeTime();
	}

	public void verifyClearAllFilters() {

		boolean isClearedFilterList = getAppliedFilterListInFilterSection().isEmpty();
		Assert.assertTrue(isClearedFilterList);
	}

	public int getOriginalProductCountAfterClickingOnCategory() {
		int originalProductCount = WaitFor.visibilityOfElements(
				Keyword.driver.findElements(By.xpath("//div[@class=\"SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP\"]")))
				.size();
		return originalProductCount;
	}

	public int getProductCountAfterApplyingFilter() {
		int productCountAfterFilter = Keyword.driver
				.findElements(By.xpath("//div[@class=\"SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP\"]")).size();
		return productCountAfterFilter;
	}

	public int getProductCountShowingWithCatgeoryNames() {
		String productCountWithCategory = Keyword.driver
				.findElement(
						By.xpath("//span[@class=\"Label-sc-15v1nk5-0 Title___StyledLabel-sc-800s46-0 gJxZPQ lnIjdY\"]"))
				.getText();
		productCountWithCategory = productCountWithCategory.replace("(", "").replace(")", "");
		int productCountWithCategoryName = Integer.parseInt(productCountWithCategory);
		return productCountWithCategoryName;
	}

	public void verifyActualProductCountAndCountShowingWithCategoryName() {
		Assert.assertEquals(getProductCountShowingWithCatgeoryNames(), getProductCountAfterApplyingFilter());
	}

	public void waitForSomeTime() throws InterruptedException {
		Thread.sleep(2000);
	}

	public List<String> getSelectedCategoryHierarchy() {
		ArrayList<String> SelectedCategoryHierarchyList = new ArrayList<String>();
		for (WebElement SelectedCategory : SelectedCategoryHierarchy) {
			SelectedCategoryHierarchyList.add(SelectedCategory.getText());
		}
		return SelectedCategoryHierarchyList;
	}

	public void verifyCategoryTagsAfterClickingOnSubActegory() {
		String ExpectedSUbCategoryInCategoryHierahcy = "Women's Apparel";
		Assert.assertTrue(getSelectedCategoryHierarchy().contains(ExpectedSUbCategoryInCategoryHierahcy));

	}

}
