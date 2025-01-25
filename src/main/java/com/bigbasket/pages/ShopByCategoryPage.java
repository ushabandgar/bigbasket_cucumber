package com.bigbasket.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
	
	String textbeforeclick;

	public ShopByCategoryPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public String getNameOfCategoryAfterClick(String categoryName) {
		String CategoryNameOnCategoryPage = Keyword.driver
				.findElement(By.cssSelector("a[href=\"/cl/" + categoryName + "/?nc=ct-fa\"]")).getText();
		return CategoryNameOnCategoryPage;
	}

	public void verifySpecificCatgeoryPageOpens() throws InterruptedException {
		Thread.sleep(3000);
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

	public void clickOnShowMoreLink() {
		
		keyword.clickOn(showMoreLink);
	}

	public void getTextBeforeClickOnShowMore() {
		textbeforeclick=showMoreLink.getText();
	}
	public void verifyAdditionalCategoriesAreDisplayed() {
		int countofSubCategoris = getCountOfSubCategories();
		List<WebElement> subCategories = keyword.getWebElements(Locator.shopByCatgeorySubCategories);

		for (int i = 4; i <countofSubCategoris; i++) {
			Assert.assertTrue(subCategories.get(i).isDisplayed());
		}

	}

	public void verifyShowMoreButtonReplaceswithShowLess() throws InterruptedException {
		Thread.sleep(3000);
		String textAfterClickonShowMore=showMoreLink.getText();
		System.out.println(textAfterClickonShowMore);
		Assert.assertNotEquals(textbeforeclick, textAfterClickonShowMore);
	}

	public void clickOnShowLessLink() {

		keyword.clickOn(showLessLink);
	}

	public void verifyAdditionalCategoriesAreCollapsed() {
		int countofSubCategoris = getCountOfSubCategories();
		List<WebElement> subCategories = keyword.getWebElements(Locator.shopByCatgeorySubCategories);

		for (int i = 4; i <countofSubCategoris; i++) {
			Assert.assertFalse(subCategories.get(i).isDisplayed());
		}
	}
}
