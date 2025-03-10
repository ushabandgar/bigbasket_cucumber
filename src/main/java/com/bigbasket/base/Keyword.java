package com.bigbasket.base;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.bigbasket.pages.HomePage;

public class Keyword {

	public static RemoteWebDriver driver;

	private static final Logger LOG = LogManager.getLogger(Keyword.class);

	public void openBrowser(@Optional String browserName) throws IOException {
		boolean isOnGrid=false;
		if(isOnGrid) {
			String hubUrl=" http://192.168.1.6:4444";
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--start-maximized");
			driver=new RemoteWebDriver(new URL(hubUrl),option);
			
		}else if (browserName == null) {
			System.out.println("Launching Chrome by default");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {

			LOG.error("Invalid browser name");
		}
		LOG.info("Launched " + browserName + " browser");
	}

	public void launchUrl(String url) {
		driver.get(url);
		LOG.info("Lauched url");
	}

	public void clickOn(WebElement element) {
		element.click();
		System.out.println("Clicked on: " + element.getText());

	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void maximizeBrowser() {
		driver.manage().window().maximize();

	}

	public void print(String string) {
		System.out.println(string);

	}

	public static void sendkeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	public void sendKeys(WebElement element, Keys enter) {
		element.sendKeys(enter);

	}

	public void mouseHoverOn(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public void mouseHoverOn() {
		Actions actions = new Actions(driver);
		actions.moveToLocation(200, 0).click().perform();
	}

	public void mouseScrollDown() {
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 700).perform();
	}

	public void scrollDownTillSpecificElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void switchToChildWindowHandle() {
		Set<String> allWindows = driver.getWindowHandles();
		String parentWindow = driver.getWindowHandle();
		for (String handle : allWindows) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
	}

	public void switchToWindowByTitle(String expectedTitleSubstring) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String handle : allWindows) {
			String currentTitle = driver.switchTo().window(handle).getTitle();
			if (currentTitle.contains(expectedTitleSubstring)) {
				System.out.println("Switched to window with title: " + currentTitle);
				break;
			}
		}
	}

	public List<WebElement> getWebElements(String locator) {
		String locatorType = locator.split("##")[0];
		locator = locator.split("##")[1];

		if (locatorType.equalsIgnoreCase("id")) {
			return driver.findElements(By.id(locator));
		} else if (locatorType.equalsIgnoreCase("name")) {
			return driver.findElements(By.name(locator));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return driver.findElements(By.xpath(locator));
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			return driver.findElements(By.linkText(locator));
		} else if (locatorType.equalsIgnoreCase("partial")) {
			return driver.findElements(By.partialLinkText(locator));
		} else if (locatorType.equalsIgnoreCase("css")) {
			return driver.findElements(By.cssSelector(locator));
		} else if (locatorType.equalsIgnoreCase("classname")) {
			return driver.findElements(By.className(locator));
		} else
			return null;
	}

	public WebElement getWebElement(String locator) {

		String locatorType = locator.split("##")[0];
		locator = locator.split("##")[1];

		if (locatorType.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(locator));
		} else if (locatorType.equalsIgnoreCase("name")) {
			return driver.findElement(By.name(locator));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(locator));
		} else if (locatorType.equalsIgnoreCase("linktext")) {
			return driver.findElement(By.linkText(locator));
		} else if (locatorType.equalsIgnoreCase("partial")) {
			return driver.findElement(By.partialLinkText(locator));
		} else if (locatorType.equalsIgnoreCase("css")) {
			return driver.findElement(By.cssSelector(locator));
		} else if (locatorType.equalsIgnoreCase("classname")) {
			return driver.findElement(By.className(locator));
		} else
			return null;

	}

	public List<String> getExpectedCategoryNames() {
		List<String> expectedCategories = Arrays.asList("Electronics", "Fashion", "Apparel", "Fruits & Vegetables",
				"Foodgrains, Oil & Masala", "Bakery, Cakes & Dairy", "Beverages", "Snacks & Branded Foods",
				"Beauty & Hygiene", "Cleaning & Household", "Kitchen, Garden & Pets", "Eggs, Meat & Fish",
				"Gourmet & World Food", "Baby Care", "Paan Corner", "Audio devices", "Beauty & Grooming",
				"Cameras & Accessories", "Electrical Accessories", "Home Appliances", "Kitchen Appliances",
				"Phone & Laptop Accessory", "Phone, Laptop & Tablets", "Smart Wearables", "Earbuds",
				"Headphones & Earphones", "Speakers & Microphones");
		return expectedCategories;
	}

	public void clickOnYourCategory(String categoryNameInLowerCaseOnly) throws InterruptedException {
		categoryNameInLowerCaseOnly = categoryNameInLowerCaseOnly.replace(" & ", "-").replace(", ", "-").replace(" ",
				"-");
		WebElement categoryName = HomePage.shopByCategoryMenu.findElement(
				By.xpath("//div[@class=\"CategoryMenu___StyledMenuItems-sc-d3svbp-4 fpskRu\"]/nav/ul/li/a[@href=\"/cl/"
						+ categoryNameInLowerCaseOnly + "/?nc=nb\"]"));
		categoryName.click();
		Thread.sleep(3000);
	}

	public void clickOnYourSubCategory(String SubCategoryName) throws InterruptedException {
		List<WebElement> ListOfSubCategories = getWebElements(Locator.shopByCatgeorySubCategories);
		for (WebElement SubCategory : ListOfSubCategories) {
			String SubCategoryNames = SubCategory.getText();
			if (SubCategoryNames.equalsIgnoreCase(SubCategoryName)) {
				SubCategory.click();
				Thread.sleep(3000);
			}
		}
	}

	public void clickOnBackButtonOfBrowser() {
		driver.navigate().back();
	}

	public void moveCurser() {
		WebElement filterSection = getWebElement(Locator.shopByCatgeorySubCategories);
		Actions actions = new Actions(driver);
		actions.moveToElement(filterSection).perform();
	}

	public void mouseHoverOnYourSubCategory(String categoryNameToHoverOn) throws InterruptedException {
		categoryNameToHoverOn = categoryNameToHoverOn.replace(" & ", "-").replace(", ", "-").replace(" ", "-");
		WebElement categoryName = HomePage.shopByCategoryMenu.findElement(By.xpath(
				"//div[@class=\"CategoryMenu___StyledMenuItems-sc-d3svbp-4 fpskRu\"]/nav/ul[2]/li/a[@href=\"/pc/fruits-vegetables/"
						+ categoryNameToHoverOn + "/?nc=nb\"]"));
		WaitFor.elementToBeClickable(categoryName);
		mouseHoverOn(categoryName);
		Thread.sleep(3000);
	}

	public void mouseHoverOnYourCategory(String categoryNameToHoverOn) throws InterruptedException {
		categoryNameToHoverOn = categoryNameToHoverOn.replace(" & ", "-").replace(", ", "-").replace(" ", "-");
		WebElement categoryName = HomePage.shopByCategoryMenu.findElement(
				By.xpath("//div[@class=\"CategoryMenu___StyledMenuItems-sc-d3svbp-4 fpskRu\"]/nav/ul/li/a[@href=\"/cl/"
						+ categoryNameToHoverOn + "/?nc=nb\"]"));
		WaitFor.elementToBeClickable(categoryName);
		mouseHoverOn(categoryName);
		Thread.sleep(3000);

	}

}
