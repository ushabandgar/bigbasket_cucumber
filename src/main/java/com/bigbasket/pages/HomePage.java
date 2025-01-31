package com.bigbasket.pages;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import com.bigbasket.base.WaitFor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.bigbasket.base.Keyword;

public class HomePage {
	Keyword keyword = new Keyword();

	@FindBy(css = "button[id*='headlessui-menu-button-:R5bab6:']")
	public static WebElement shopByCategoryMenu;

	@FindBy(xpath = "//li[@class=\"jsx-1259984711\" and @role=\"none\"]")
	List<WebElement> categoryList;

	@FindBy(xpath = "(//input[@placeholder=\"Search for Products...\"])[2]")
	WebElement searchTextBox;

	@FindBy(css = "svg.mr-3")
	WebElement clearButton;

	@FindBy(xpath = "//span[contains(text(),\"No results found for\")]")
	WebElement noResultMsg;

	@FindBy(xpath = "//li[@class=\"QuickSearch___StyledMenuItem-sc-rtz2vl-4 ibNDA-d\"]")
	List<WebElement> results;

	@FindBy(css = "div.Header___StyledQuickSearch2-sc-19kl9m3-0 input.flex-1")
	WebElement searchText;

	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(xpath = "(//span[@class=\"Label-sc-15v1nk5-0 gJxZPQ ml-1.5 flex-1 text-sm text-darkOnyx-900 truncate font-semibold leading-base\"])[2]")
	WebElement selectLocation;

	@FindBy(xpath = "(//input[@placeholder=\"Search for area or street name\"])[2]")
	WebElement searchForArea;

	@FindBy(xpath = "//span[@class=\"Label-sc-15v1nk5-0 gJxZPQ\"]")
	List<WebElement> addressOfLocations;

	@FindBy(css = "svg.mr-3")
	WebElement clearButtonOfSearchForAreaTextBox;
	
	@FindBy(xpath = "//img[@src=\"https://www.bbassets.com/bb2assets/images/svg/no-delivery.svg?tr=w-undefined,q-80\"]")
	WebElement noResultMsgForDeliveryLocatrion;

	public void verifySelectLoactionBarVisibleOnTheHomepageOrNot() {
		Assert.assertTrue(selectLocation.isDisplayed());

	}

	public void clickonSelectLocationbar() throws InterruptedException {
		Thread.sleep(3000);
		selectLocation.click();

	}

	public void enterTextIntoSearchForAreaTextBox() throws InterruptedException {
		Keyword.sendkeys(searchForArea, "Pune");
		Thread.sleep(3000);
	}

	public void verifyThatUserCanAbleToTypeTextIntosearchForAreaTextBox() {
		Assert.assertEquals(searchForArea.getAttribute("value"), "Pune");
	}

	public String getValueOfAttributeBeforeAndAfterEntertext() {
		String value = searchForArea.getAttribute("value");
		Keyword.sendkeys(searchForArea, "Pune");
		String value1 = searchForArea.getAttribute("value");
		return value;

	}

	public void verifyThePlaceholderTextIsDisplayedWhenTheSeachForAreaTextBoxIsEmpty() {
		String value = getValueOfAttribute();
		String value1 = getValueOfAttribute();
		Assert.assertFalse(value == value1);

	}

	public List<String> addressOfLoactions() {
		List<WebElement> descriptions = addressOfLocations;
		List<String> searchaddressdescriptions = new ArrayList<String>();
		for (WebElement description : descriptions) {
			searchaddressdescriptions.add(description.getText());

		}
		return searchaddressdescriptions;

	}

	public void verifythatAddressOfLocationResultsAreDisplayedWhenValidTextIsEnterIntoTextBOx() {
		SoftAssert softly = new SoftAssert();
		for (String description : getAllSearchResultDescription()) {
			softly.assertTrue(description.contains("Pune"));

		}
		softly.assertAll();

	}

	public String getUrlBeforeEnterTextIntoTextBox() {
		String urlBeforeText = Keyword.driver.getCurrentUrl();
		System.out.println(urlBeforeText);
		return urlBeforeText;
	}

	public void KeepEmptySearchForAreaTextBox() {
		Keyword.sendkeys(searchForArea, "");
		searchForArea.sendKeys(Keys.ENTER);

	}

	public String getUrlAfterEnterTextIntoTextBox() {
		String urlAfterText = Keyword.driver.getCurrentUrl();
		System.out.println(urlAfterText);
		return urlAfterText;

	}

	public void verifyTheBehaviourOfPageWhenTheSearchForAreaTextBoxEmptyAndUserPressTheEnter() {
		String urlBeforeText = getUrlBeforeText();
		KeepEmptySearchBar();
		String urlAfterText = getUrlAfterText();
		Assert.assertEquals(urlBeforeText, urlAfterText);

	}

	public void EnterPartialTextIntoSearchForAreaTextBox() throws InterruptedException {
		Keyword.sendkeys(searchForArea, "Mum");
		Thread.sleep(3000);

	}

	public List<String> getAllSearchResultDescriptionWhenEnterPartialTextInIntoSearchForAreaTextBox() {
		List<WebElement> descriptions = results;
		List<String> searchdescriptions = new ArrayList<String>();
		for (WebElement description : descriptions) {
			searchdescriptions.add(description.getText());

		}
		return searchdescriptions;

	}

	public void verifyWhenEnterPartialTextIntoSearchForAreaTextBoxThenResultShouldBeDisplaye() {
		SoftAssert softly = new SoftAssert();
		for (String description : getAllSearchResultDescription()) {
			softly.assertTrue(description.contains("Mum"));

		}
		softly.assertAll();

	}
	public String enterTextIntoSearchForAreaTextbox() {
		keyword.sendkeys(searchForArea, "Mumbai");
		String valueAfterEnterText = searchForArea.getAttribute("value");
		return valueAfterEnterText;

	}

	public String clickOnClearButtonIntoSearchForAreaTextBox() {
		clearButtonOfSearchForAreaTextBox.click();
		String valueAfterClearText = searchForArea.getAttribute("value");
		return valueAfterClearText;
	}

	public void verifyThatWhenClickOnClearButtonThenSearchForAreaTextBoxShouldBeClear() {
		String valueAfterEnterText = enterTextIntoSearchForAreaTextbox();
		String valueAfterClearText = clickOnClearButtonIntoSearchForAreaTextBox();
		Assert.assertFalse(valueAfterEnterText == valueAfterClearText);

	}
	
	public void enterSpecialCharacterOnlyIntoSearchForAreaTextBox() throws InterruptedException {
		keyword.sendkeys(searchForArea, "!@#");
		Thread.sleep(3000);

	}

	public void verifyWhenEnterSpeacialCharacterOnlyIntoSearchForAreaTextBox() {
		Assert.assertTrue (noResultMsgForDeliveryLocatrion.isDisplayed());

	}
	
	public void enterLargeNumberOnlyIntoSearchForAreaTextBox() throws InterruptedException {
		keyword.sendkeys(searchForArea, "07676476337565");
		Thread.sleep(3000);

	}
	
	public void verifyWhenEnterOnlyLargeNumberIntoSearchForAreaTextBox() {
		Assert.assertTrue (noResultMsgForDeliveryLocatrion.isDisplayed());

	}
	public void enterInvalidSpecialCharacterOnlyIntoSearchForAreaTextBox() throws InterruptedException {
		keyword.sendkeys(searchForArea, "<:>/{};");
		Thread.sleep(3000);

	}

	public void verifyWhenEnterInvalidSpecialCharacterOnlyIntoSearchForAreatTextBox() {
		Assert.assertTrue(noResultMsgForDeliveryLocatrion.isDisplayed());

	}
	
	public void enterExtremelyLargeInvalidTextIntoearchForAreaTextBox() throws InterruptedException {
		keyword.sendkeys(searchForArea, "hjfhfjwehjdwjdsooudiqwufiyf");
		Thread.sleep(3000);

	}

	public void verifyWhenEnterExtremelyLargeInvalidTextIntoearchForAreaTextBox() {
		Assert.assertTrue(noResultMsgForDeliveryLocatrion.isDisplayed());

	}



	// Test case For search product

	public void verifySearchTextBoxVisibleOnThePageOrNot() {
		Assert.assertTrue(searchTextBox.isDisplayed());

	}

	public void enterTextIntoSearchTextBox() throws InterruptedException {
		Keyword.sendkeys(searchTextBox, "Apple");
		Thread.sleep(3000);
	}

	public void verifyThatUserCanAbleToTypeTextIntoTheSearchBar() {
		Assert.assertEquals(searchTextBox.getAttribute("value"), "Apple");
	}

	public String getValueOfAttribute() {
		String value = searchTextBox.getAttribute("value");
		Keyword.sendkeys(searchTextBox, "Apple");
		String value1 = searchTextBox.getAttribute("value");
		return value;

	}

	public void verifyThePlaceholderTextIsDisplayedWhenTheSearchBarIsEmpty() {
		String value = getValueOfAttribute();
		String value1 = getValueOfAttribute();
		Assert.assertFalse(value == value1);

	}

	public List<String> getAllSearchResultDescription() {
		List<WebElement> descriptions = results;
		List<String> searchdescriptions = new ArrayList<String>();
		for (WebElement description : descriptions) {
			searchdescriptions.add(description.getText());

		}
		return searchdescriptions;

	}

	public void verifyThatRelevantSearchResultsAreDisplayedWhenValidTextIsEntered() {
		SoftAssert softly = new SoftAssert();
		for (String description : getAllSearchResultDescription()) {
			softly.assertTrue(description.contains("Apple"));

		}
		softly.assertAll();

	}

	public String getUrlBeforeText() {
		String urlBeforeText = Keyword.driver.getCurrentUrl();
		System.out.println(urlBeforeText);
		return urlBeforeText;
	}

	public void KeepEmptySearchBar() {
		Keyword.sendkeys(searchTextBox, "");
		searchTextBox.sendKeys(Keys.ENTER);

	}

	public String getUrlAfterText() {
		String urlAfterText = Keyword.driver.getCurrentUrl();
		System.out.println(urlAfterText);
		return urlAfterText;

	}

	public void verifyTheBehaviourOfPageWhenTheSearchBarIsLeftEmptyAndUserPressTheEnter() {
		String urlBeforeText = getUrlBeforeText();
		KeepEmptySearchBar();
		String urlAfterText = getUrlAfterText();
		Assert.assertEquals(urlBeforeText, urlAfterText);

	}

	public void EnterPartialTextIntoTextBox() throws InterruptedException {
		Keyword.sendkeys(searchTextBox, "Toma");
		Thread.sleep(3000);

	}

	public List<String> getAllSearchResultDescriptionWhenEnterPartialText() {
		List<WebElement> descriptions = results;
		List<String> searchdescriptions = new ArrayList<String>();
		for (WebElement description : descriptions) {
			searchdescriptions.add(description.getText());

		}
		return searchdescriptions;

	}

	public void verifyWhenEnterPartialTextIntoSerachbarThenResultShouldBeDisplayeOrNot() {
		SoftAssert softly = new SoftAssert();
		for (String description : getAllSearchResultDescription()) {
			softly.assertTrue(description.contains("Toma"));

		}
		softly.assertAll();

	}

	public String enterTextIntoTextBox() {
		keyword.sendkeys(searchTextBox, "Tomato");
		String valueAfterEnterText = searchTextBox.getAttribute("value");
		return valueAfterEnterText;

	}

	public String clickOnClearButton() {
		clearButton.click();
		String valueAfterClearText = searchTextBox.getAttribute("value");
		return valueAfterClearText;
	}

	public void verifyThatWhenClickTheClearButtonThenSearchBarShouldBeClearOrNot() {
		String valueAfterEnterText = enterTextIntoTextBox();
		String valueAfterClearText = clickOnClearButton();
		Assert.assertFalse(valueAfterEnterText == valueAfterClearText);

	}

	public void enterSpecialCharacterOnlyIntoSearchTextBox() throws InterruptedException {
		keyword.sendkeys(searchTextBox, "!@#");
		Thread.sleep(3000);

	}

	public void verifyWhenEnterSpeacialCharacterOnlyIntoSearchBar() {
		Assert.assertTrue(noResultMsg.isDisplayed());

	}

	public void enterNumberOnlyIntoSearchTextBox() throws InterruptedException {
		keyword.sendkeys(searchTextBox, "01234569746");
		Thread.sleep(3000);

	}

	public void verifyWhenEnterNumberOnlyIntoSearchBar() {
		Assert.assertTrue(noResultMsg.isDisplayed());

	}

	public void enterInvalidSpecialCharacterOnlyIntoSearchTextBox() throws InterruptedException {
		keyword.sendkeys(searchTextBox, "<:>/{};");
		Thread.sleep(3000);

	}

	public void verifyWhenEnterInvalidSpecialCharacterOnlyIntoSearchBar() {
		Assert.assertTrue(noResultMsg.isDisplayed());

	}

	public void enterExtremelyLargeInvalidTextIntoSearchTextBox() throws InterruptedException {
		keyword.sendkeys(searchTextBox, "heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		Thread.sleep(3000);

	}

	public void verifyWhenEnterExtremelyLargeInvalidTextIntoSearchBar() {
		Assert.assertTrue(noResultMsg.isDisplayed());

	}

	public void verifyShopByCategoryMenuIsAvailable() {
		String expectedShopByCategoryMenuName = "Shop by";
		String actualShopByCategoryMenuName = shopByCategoryMenu.getText();
		if (shopByCategoryMenu.isDisplayed()) {
			Assert.assertTrue(actualShopByCategoryMenuName.contains(expectedShopByCategoryMenuName));
		}
	}

	public void verifyAllCatgoriesAreDisplayedProperly() {
		SoftAssert softlyAssert = new SoftAssert();
		for (WebElement category : categoryList) {
			Assert.assertTrue(category.isDisplayed());
		}

		softlyAssert.assertAll();
	}

	public void verifyAllCatgoriesOfShopByCatogoryNamesAreDisplayedProperly() {
		List<String> expectedCategoryNames = keyword.getExpectedCategoryNames();
		ArrayList<String> actualCategoryNames = new ArrayList<String>();
		SoftAssert softlyAssert = new SoftAssert();
		for (WebElement category : categoryList) {
			actualCategoryNames.add(category.getText());
		}
		softlyAssert.assertEquals(actualCategoryNames, expectedCategoryNames);
		softlyAssert.assertAll();
	}

	public void clickOnSearchText() {
		WaitFor.visibilityOfElement(searchText);
		searchText.click();
		System.out.println("Clicked on search text field.");
	}

	public void sendProductName(String productName) {
		searchText.sendKeys("Amul Taaza Milk, 1 L Pouch");
		searchText.sendKeys(Keys.ENTER);
		WaitFor.untilUrlLoad("https://www.bigbasket.com/ps");
	}

	public void verifyShopByCategoryCollapsesOnClickAfterExapands() {
		String classNameAfterExapnd = shopByCategoryMenu.getAttribute("class");
		clickOnShopByCategoryMenu();
		String classNameAfterCollapse = shopByCategoryMenu.getAttribute("class");
		Assert.assertFalse(classNameAfterCollapse.equals(classNameAfterExapnd));
	}

	public boolean clickOnAllCategoriesOneByOne() throws InterruptedException {
		boolean areClickable = false;
		keyword.maximizeBrowser();
		for (WebElement category : categoryList) {
			WaitFor.visibilityOfElement(category);
			String categoryNames = category.getText().toLowerCase();
			clickOnCategory(categoryNames);
			System.out.println(categoryNames);
			Thread.sleep(5000);
			clickOnShopByCategoryMenu();
			if (categoryNames.equals("Paan Corner")) {
				areClickable = true;
				System.out.println("flag after last parent category : " + areClickable);
				break;
			}
		}
		return areClickable;
	}

	public void verifyAllCategoriesAreClickable() throws InterruptedException {
		boolean flag = clickOnAllCategoriesOneByOne();
		SoftAssert softlyAssert = new SoftAssert();
		softlyAssert.assertTrue(flag, "All category are not clickable");
		softlyAssert.assertAll();
	}

	public void verifyUrlAfterSearch() {
		String currentURL = Keyword.driver.getCurrentUrl();
		keyword.print("Current URL: " + currentURL);
		assertTrue(currentURL.contains("https://www.bigbasket.com/ps"));

	}

	public void clickOnShopByCategoryMenu() {
		keyword.clickOn(shopByCategoryMenu);
	}

	public void clickOnCategory(String categoryNameInLowerCaseOnly) throws InterruptedException {
		keyword.clickOnYourCategory(categoryNameInLowerCaseOnly);

	}

	public void verifyNavigatedToHomePageFromCategoryPage() {
		String urlAfterNavigationToHome = Keyword.driver.getCurrentUrl();
		assertTrue(urlAfterNavigationToHome.equals("https://www.bigbasket.com/"));
	}
}
