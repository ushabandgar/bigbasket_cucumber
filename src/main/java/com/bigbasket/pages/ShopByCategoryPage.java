package com.bigbasket.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//button[contains(@class,\"FilterToggler___StyledButton\")]")
	WebElement HideFilterButton;

	@FindBy(xpath = "//section[contains(@class,\"slug___StyledMotionSection\")]")
	WebElement FilterSection;

	@FindBy(xpath = "//span[text()=\"Price\"]")
	WebElement priceFilterText;

	@FindBy(xpath = "//div[@class=\"Pricing___StyledDiv-sc-pldi2d-0 bUnUzR\"]/span[1]")
	List<WebElement> productPriceText;

	@FindBy(xpath = "//span[@class=\"font-semibold lg:text-xs xl:text-sm leading-xxl xl:leading-md\"]")
	List<WebElement> DiscountOnProduct;

	@FindBy(xpath = "//div[@id=\"side-filter-by-rating\"][2]/div[2]")
	WebElement brandSection;

	@FindBy(xpath = "//span[@class=\"Label-sc-15v1nk5-0 gJxZPQ truncate\"]")
	List<WebElement> sizeOnPorductList;

	@FindBy(xpath = "//h3[@class=\"block m-0 line-clamp-2 font-regular text-base leading-sm text-darkOnyx-800 pt-0.5 h-full\"]")
	List<WebElement> productDescriptionFromProductList;
	@FindBy(css = "span[class=\"Label-sc-15v1nk5-0 FilterByRating___StyledLabel-sc-17wxy9s-0 gJxZPQ jKZfbM\"]")
	WebElement productRating;

	@FindBy(css = "footer[class=\"sm:hidden w-full pt-13 mt-6 text-md text-silverSurfer-300 bg-darkOnyx-900 footer\"]")
	WebElement footerSection;

	@FindBy(xpath = "//span[@class=\"Label-sc-15v1nk5-0 Badges___StyledLabel-sc-1k3p1ug-0 gJxZPQ kAyiFy leading-xxs\"]/span")
	List<WebElement> productRatingsFromProdDescription;

	String textbeforeclick;
	String brandName;
	String TextBeforeClickOnHideFilter;
	String TextAfterClickOnHideFilter;
	int ProductPrice;
	String filterNameFromList;

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

	public void verifyListOfFilter() {
		SoftAssert softlyAssert = new SoftAssert();
		softlyAssert.assertTrue(ProductRatingFilter.isDisplayed());
		for (WebElement filter : filters) {
			System.out.println(filter.getText());
			softlyAssert.assertTrue(filter.isDisplayed());
		}
		softlyAssert.assertAll();
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

	public void clickOnHideFiltersButton() throws InterruptedException {
		String buttonName = HideFilterButton.getText();
		HideFilterButton.click();

		System.out.println("clicked on : " + buttonName);
		Thread.sleep(3000);

	}

	public String getClassNameBeforeHideFilter() {
		String classNameBeforeHideFilter = FilterSection.getDomAttribute("class");
		return classNameBeforeHideFilter;
	}

	public String getClassNameAfterHideFilter() {
		String classNameAfterHideFilter = FilterSection.getDomAttribute("class");
		return classNameAfterHideFilter;
	}

	public void verifyHideFiltersTextReplacesWithShowFiltersAfterClick(String ExpectedText) {
		String TextAfterClickOnHideFilter = HideFilterButton.getText();
		System.out.println("TextAfterClickOnHideFilter: " + TextAfterClickOnHideFilter);
		System.out.println("ExpectedText: " + ExpectedText);
		Assert.assertEquals(TextAfterClickOnHideFilter, ExpectedText);
	}

	public void clickOnYourFilter(String filterNameFromList) throws InterruptedException {

		WebElement filterName = getFilterNameElementFromFilterList(filterNameFromList);
		keyword.scrollDownTillSpecificElement(filterName);
		WaitFor.elementToBeClickable(filterName);
		filterName.click();
		// Thread.sleep(3000);
		WaitFor.elementTobeVisible(HideFilterButton);

	}

	public WebElement getFilterNameElementFromFilterList(String filterNameFromList) {
		filterNameFromList = filterNameFromList.replace(" ", "");
		filterNameFromList = "i-" + filterNameFromList;
		WebElement filterName = HomePage.shopByCategoryMenu
				.findElement(By.xpath("//input[@id=\"" + filterNameFromList + "\"]"));
		return filterName;
	}

	public List<String> getProductPrice() {
		ArrayList<String> productPriceList = new ArrayList<String>();
		for (WebElement productPrice : productPriceText) {
			productPriceList.add(productPrice.getText());
		}
		return productPriceList;
	}

	public void verifyProductPriceAfterPriceFilter(int minPrice, int maxPrice) {
		List<String> prices = getProductPrice();
		for (int i = 0; i < prices.size(); i++) {
			String price = prices.get(i);
			price = price.replace("₹", "");
			ProductPrice = Integer.parseInt(price);
			System.out.println("Price on products: " + ProductPrice);
			SoftAssert softlyassert = new SoftAssert();
			softlyassert.assertTrue(ProductPrice >= minPrice && ProductPrice <= maxPrice);
			softlyassert.assertAll();
		}
	}

	public void verifyProductPriceMoreThanFiveHundered(Integer moreThanFiveHunderedFilter) {
		List<String> prices = getProductPrice();
		for (int i = 0; i < prices.size(); i++) {
			String price = prices.get(i);
			price = price.replace("₹", "");
			ProductPrice = Integer.parseInt(price);
			System.out.println("Price on products: " + ProductPrice);
			SoftAssert softlyassert = new SoftAssert();
			softlyassert.assertTrue(ProductPrice > moreThanFiveHunderedFilter);
			softlyassert.assertAll();
		}

	}

	public List<String> getDiscountOnProduct() {
		ArrayList<String> DiscountOnProducts = new ArrayList<String>();
		for (WebElement discount : DiscountOnProduct) {
			DiscountOnProducts.add(discount.getText());
		}
		return DiscountOnProducts;
	}

	public void verifyDiscountOnProductMoreThanTwentyFivePercentage(Integer discountOnProduct) {
		List<String> discounts = getDiscountOnProduct();
		for (int i = 0; i < discounts.size(); i++) {
			String discount = discounts.get(i);
			discount = discount.replace("%", "").replace(" OFF", "");
			int ProductDiscount = Integer.parseInt(discount);
			System.out.println("Discount on products: " + ProductDiscount);
			SoftAssert softlyassert = new SoftAssert();
			softlyassert.assertTrue(ProductDiscount > discountOnProduct);
			softlyassert.assertAll();
		}
	}

	public void verifyDiscountOnProductBetweenSelectedRange(Integer minDiscountOnProduct,
			Integer maxDiscountOnProduct) {
		List<String> discounts = getDiscountOnProduct();
		SoftAssert softlyassert = new SoftAssert();

		for (int i = 0; i < discounts.size(); i++) {
			String discount = discounts.get(i);
			discount = discount.replace("%", "").replace(" OFF", "");
			int ProductDiscount = Integer.parseInt(discount);
			System.out.println("Discount on products: " + ProductDiscount);
			softlyassert.assertTrue(ProductDiscount > minDiscountOnProduct && ProductDiscount < maxDiscountOnProduct);
		}
		softlyassert.assertAll();

	}

	ArrayList<String> SizeOnProducts = new ArrayList<String>();

	public List<String> getProductSizeOrPackSize() {
		for (WebElement size : sizeOnPorductList) {
			SizeOnProducts.add(size.getText());
		}

		return SizeOnProducts;
	}

	public void verifyPorductListHavingSizeFromFilterOnly(String sizeFromFilter) {
		List<String> sizeOnProductLists = getProductSizeOrPackSize();
		SoftAssert softlyassert = new SoftAssert();

		for (int i = 0; i < sizeOnProductLists.size(); i++) {
			String sizeOnProduct = sizeOnProductLists.get(i);
			System.out.println(sizeFromFilter);
			System.out.println("SizeOnProducts: " + sizeOnProduct);
			softlyassert.assertTrue(sizeOnProduct.contains(sizeFromFilter));

		}
		softlyassert.assertAll();

	}

	public void verifyPorductListHavingPackSizeFromFilterOnly(String packSizeFromFilter) {
		List<String> sizeOnProductLists = getProductSizeOrPackSize();
		SoftAssert softlyassert = new SoftAssert();

		for (int i = 0; i < sizeOnProductLists.size(); i++) {
			String packSizeOnProduct = sizeOnProductLists.get(i);
			System.out.println(packSizeFromFilter);
			System.out.println("packSizeOnProduct: " + packSizeOnProduct);
			softlyassert.assertTrue(packSizeOnProduct.contains(packSizeFromFilter));

		}
		softlyassert.assertAll();
	}

	public void clickOnRatingFilter(Integer ratingNumber) throws InterruptedException {

		WaitFor.elementTobeVisible(HideFilterButton);
		keyword.scrollDownTillSpecificElement(productRating);
		WebElement ratingFilte = Keyword.driver.findElement(By.xpath(
				"//input[@class=\"Checkbox-sc-aryd7b-0 FilterByRating___StyledCheckbox-sc-17wxy9s-2 dOzoNh fevZOS form-checkbox cursor-pointer\" and @id=\""
						+ ratingNumber + "\"]"));
		ratingFilte.click();

	}

	public List<String> getRatingOnProductList() throws InterruptedException {
		keyword.scrollDownTillSpecificElement(productRating);
		WaitFor.visibilityOfElements(productDescriptionFromProductList);
		ArrayList<String> productRatings = new ArrayList<String>();
		for (WebElement prodRating : productRatingsFromProdDescription) {
			productRatings.add(prodRating.getText());
		}
		return productRatings;
	}

	public void verifyProductRatingsOnProductDescritpion(String ratingSelected) throws InterruptedException {
		List<String> ratingsOnProductLists = getRatingOnProductList();
		SoftAssert softlyassert = new SoftAssert();

		for (int i = 0; i < ratingsOnProductLists.size(); i++) {
			String ratingOnProduct = ratingsOnProductLists.get(i);
			System.out.println("ratingOnProduct: "+ratingOnProduct);
			System.out.println("ratingSelected: "+ratingSelected);
			softlyassert.assertTrue(ratingOnProduct.equals(ratingSelected));

		}
		softlyassert.assertAll();
		
	}
}
