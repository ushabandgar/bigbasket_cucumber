package com.bigbasket.pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import com.bigbasket.base.WaitFor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	WebElement noResultMsgForDeliveryLocation;

	public void verifySelectLoactionBarVisibleOnTheHomepageOrNot() {
		WaitFor.elementTobeVisible(selectLocation);
		Assert.assertTrue(selectLocation.isDisplayed());

	}

	public void clickonSelectLocationbar()  {
		WaitFor.elementToBeClickable(selectLocation);
		//Thread.sleep(3000);
		selectLocation.click();

	}

	public void enterTextIntoSearchForAreaTextBox() {
		Keyword.sendkeys(searchForArea, "Pune");
		WaitFor.elementToBeDisplayed(searchForArea);
		//Thread.sleep(3000);
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

	public void EnterPartialTextIntoSearchForAreaTextBox()  {
		Keyword.sendkeys(searchForArea, "Mum");
		WaitFor.elementToBeDisplayed(searchForArea);
		//Thread.sleep(3000);

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
	
	public void enterSpecialCharacterOnlyIntoSearchForAreaTextBox(){
		keyword.sendkeys(searchForArea, "!@#$%^&*");
		WaitFor.elementToBeDisplayed(searchForArea);
		//Thread.sleep(3000);

	}

	public void verifyWhenEnterSpeacialCharacterOnlyIntoSearchForAreaTextBox() { 
		WaitFor.elementToBeDisplayed(noResultMsgForDeliveryLocation);
		Assert.assertTrue (noResultMsgForDeliveryLocation.isDisplayed());

	}
	
	public void enterLargeNumberOnlyIntoSearchForAreaTextBox(){
		keyword.sendkeys(searchForArea, "07676476337565");
		WaitFor.elementToBeDisplayed(searchForArea);
		//Thread.sleep(3000);
		}
	
	public void verifyWhenEnterOnlyLargeNumberIntoSearchForAreaTextBox() {
		WaitFor.elementToBeDisplayed(noResultMsgForDeliveryLocation);
		Assert.assertTrue (noResultMsgForDeliveryLocation.isDisplayed());
		

	}
	public void enterInvalidSpecialCharacterOnlyIntoSearchForAreaTextBox() {
		keyword.sendkeys(searchForArea, "<:>/{};");
		WaitFor.elementToBeDisplayed(searchForArea);
		//Thread.sleep(3000);

	}

	public void verifyWhenEnterInvalidSpecialCharacterOnlyIntoSearchForAreatTextBox() {
		WaitFor.elementTobeVisible(noResultMsgForDeliveryLocation);
		WaitFor.elementToBeDisplayed(noResultMsgForDeliveryLocation);
		Assert.assertTrue(noResultMsgForDeliveryLocation.isDisplayed());

	}
	
	public void enterExtremelyLargeInvalidTextIntoearchForAreaTextBox() {
		keyword.sendkeys(searchForArea, "hjfhfjwehjdwjdsooudiqwufiyf");
		WaitFor.elementToBeDisplayed(searchForArea);
		//Thread.sleep(3000);

	}

	public void verifyWhenEnterExtremelyLargeInvalidTextIntoearchForAreaTextBox() {
		WaitFor.elementToBeDisplayed(noResultMsgForDeliveryLocation);
		Assert.assertTrue(noResultMsgForDeliveryLocation.isDisplayed());

	}



	// Test case For search product

	public void verifySearchTextBoxVisibleOnThePageOrNot() {
		Assert.assertTrue(searchTextBox.isDisplayed());

	}

	public void enterTextIntoSearchTextBox() {
		Keyword.sendkeys(searchTextBox, "Apple");
		WaitFor.elementToBeDisplayed(searchTextBox);
		//Thread.sleep(3000);
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

	public void EnterPartialTextIntoTextBox() {
		Keyword.sendkeys(searchTextBox, "Toma");
		WaitFor.elementToBeDisplayed(searchTextBox);
		//Thread.sleep(3000);

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
		WaitFor.elementToBeDisplayed(searchTextBox);
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

	public void enterSpecialCharacterOnlyIntoSearchTextBox(){
		keyword.sendkeys(searchTextBox, "!@#");
		WaitFor.elementToBeDisplayed(searchTextBox);
		//Thread.sleep(3000);

	}

	public void verifyWhenEnterSpeacialCharacterOnlyIntoSearchBar() {
		WaitFor.elementToBeDisplayed(noResultMsg);
		Assert.assertTrue(noResultMsg.isDisplayed());

	}

	public void enterNumberOnlyIntoSearchTextBox() {
		keyword.sendkeys(searchTextBox, "01234569746");
		WaitFor.elementToBeDisplayed(searchTextBox);
		//Thread.sleep(3000);

	}

	public void verifyWhenEnterNumberOnlyIntoSearchBar() {
		WaitFor.elementToBeDisplayed(noResultMsg);
		Assert.assertTrue(noResultMsg.isDisplayed());

	}

	public void enterInvalidSpecialCharacterOnlyIntoSearchTextBox(){
		keyword.sendkeys(searchTextBox, "<:>/{};");
		WaitFor.elementToBeDisplayed(searchTextBox);
		//Thread.sleep(3000);

	}

	public void verifyWhenEnterInvalidSpecialCharacterOnlyIntoSearchBar() {
		WaitFor.elementToBeDisplayed(noResultMsg);
		Assert.assertTrue(noResultMsg.isDisplayed());

	}

	public void enterExtremelyLargeInvalidTextIntoSearchTextBox()  {
		keyword.sendkeys(searchTextBox, "heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		WaitFor.elementToBeDisplayed(searchTextBox);
		//Thread.sleep(3000);

	}

	public void verifyWhenEnterExtremelyLargeInvalidTextIntoSearchBar() {
		WaitFor.elementToBeDisplayed(noResultMsg);
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

	public void sendProductName(String productName) throws InterruptedException {
		searchText.sendKeys("Amul Taaza Milk, 1 L Pouch");
		searchText.sendKeys(Keys.ENTER);
		WaitFor.untilUrlLoad("https://www.bigbasket.com/ps");
		//WaitFor.untilUrlLoad("https://www.bigbasket.com/ps");
		Thread.sleep(1000);

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

	public void clickOnHeaderFoodItem(String itemName) {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/");
		WebDriverWait wait1 = new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));
	    WebElement itemname = wait1.until(ExpectedConditions.visibilityOfElementLocated(
	    		By.xpath("//span[@class='TopNav___StyledMotionSpan-sc-1vxbycn-2 gcPbqq' and text()='" + itemName + "']")));
	    itemname.click();
	    itemName = itemName.replace(" & ", "-").replace(", ", "-").replace(" ", "-");
	    System.out.println("I clicked on: "+ itemName);
	    WaitFor.untilUrlLoad(itemName.toLowerCase());
	    String url = Keyword.driver.getCurrentUrl();
		assertTrue(url.contains(itemName.toLowerCase()));
	    
	}
    
	public void sendProductname(String productName) throws InterruptedException {
	    searchText.clear(); // Clear the input field before entering new text
	    searchText.sendKeys(productName);  // Now using dynamic product name
	    searchText.sendKeys(Keys.ENTER);
	    WaitFor.untilUrlLoad("https://www.bigbasket.com/ps");
	    Thread.sleep(1000);
	}

	public void verifySearchSuggestionContainsInputLocationData(String selectLocationInputData) {

		List<WebElement> selectLocationSuggestionsList=Keyword.driver.findElements(By.xpath("//span[@class=\"Label-sc-15v1nk5-0 AddressDropdown___StyledLabel5-sc-i4k67t-10 gJxZPQ gutzfG\"]"));
	
		SoftAssert softlyassert=new SoftAssert();
		for(WebElement selectLocationSuggestion:selectLocationSuggestionsList)
		{
			String selectLocationSuggestionName=selectLocationSuggestion.getText();
			softlyassert.assertTrue(selectLocationSuggestionName.contains(selectLocationInputData));
		}
		softlyassert.assertAll();
	}

	public void enterTextIntoSelectLocation(String location) throws InterruptedException {
		WebElement selectLocation=Keyword.driver.findElement(By.xpath("(//input[@placeholder=\"Search for area or street name\"])[1]"));
		Keyword.sendkeys(selectLocation, location);
		Thread.sleep(3000);
	}

}
