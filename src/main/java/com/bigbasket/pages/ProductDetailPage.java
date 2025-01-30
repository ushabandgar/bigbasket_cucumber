package com.bigbasket.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bigbasket.base.Keyword;
import com.bigbasket.base.WaitFor;

public class ProductDetailPage {
	Keyword keyword = new Keyword();

	@FindBy(xpath = "//section[contains(@class, 'Image___StyledSection')]")
	WebElement productImage;

	@FindBy(css = "h1.Description___StyledH-sc-82a36a-2")
	WebElement expectedProductTitleText;

	@FindBy(css = "td.fLZywG")
	WebElement expectedproductprice;

	@FindBy(css = "span.Pricing___StyledLabel-sc-pldi2d-1")
	WebElement actualProductPrice;

	@FindBy(css = "section.jFkiCb div.w-full:nth-child(2) div.border-silverSurfer-400 div.w-40:nth-child(2) span.cWTZQL span.bvikaK:nth-child(1)")
	WebElement packsize500ml;

	@FindBy(css = "div.kiucsj section.border-silverSurfer-400 div section.iDeFak  div:nth-child(1) div.flex")
	WebElement AddToBasket;

	@FindBy(css = "p.mx-4")
	WebElement ConfirmationMsg;

	@FindBy(css = "div.kiucsj section.border-silverSurfer-400 div section.iDeFak  div:nth-child(1) div.flex button.bwKrKT")
	WebElement AddToBasketPlusBtn;

	@FindBy(css = "div.kiucsj section.border-silverSurfer-400 div section.iDeFak  div:nth-child(1) div.flex button.TvAgf")
	WebElement AddToBasketRemovingBtn;

	@FindBy(css = "div.kiucsj section.border-silverSurfer-400 div section.iDeFak  div:nth-child(2) button")
	WebElement SaveForLaterBtn;

	@FindBy(css = "div.opacity-100 div.px-12 span")
	WebElement LoginSignup;

	@FindBy(css = "div.hlQOJm div")
	List<WebElement> CheckoutPage;

	@FindBy(css = "div.iUVPaR section div.justify-end button.gXeHMp")
	WebElement facebookIcon;

	@FindBy(css = "div.iUVPaR section div.justify-end button.bUcDsU")
	WebElement twitter;

	@FindBy(css = "div.iUVPaR section div.justify-end button.jGRTco")
	WebElement email;

	@FindBy(css = "div.iUVPaR section div.justify-end button")
	List<WebElement> SocialMediaIcons;

	public ProductDetailPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void switchWindowOnproductDetailPage() {
		keyword.switchToWindowByTitle("Buy Amul Taaza Milk Online at Best Price of Rs 56 - bigbasket");
	}

	public void verifyAfterClickOnProductThenProductUrlTitleChanged() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd");
		String currentTitle = Keyword.driver.getTitle();
		System.out.println("Current Title: " + currentTitle);
		assertTrue(currentTitle.contains("Buy Amul Taaza Milk Online at Best Price"),
				"The title did not change to the product page title.");
	}

	public void verifyAfterClickOnProductThenProductUrlChanged() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd");
		String currentURL = Keyword.driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		assertTrue(currentURL.contains("https://www.bigbasket.com/pd/"),
				"The url did not change to the product page title.");

	}

	public void CheckProductImageToverifyImageloadingSuccessfully() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd");
		WaitFor.visibilityOfElement(productImage);
		assertTrue(productImage.isDisplayed(), "Product image is not displayed, page might not be fully loaded.");
	}

	public void getexpectedProductDetailTitleText() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd/");
		System.out.println("Expected Product Title: " + expectedProductTitleText.getText());
	}

	public void verifyActualAndExpectedProductText() {
		assertTrue(expectedProductTitleText.getText().contains("Taaza Milk"),
				"Expected product title does not contain 'Taaza Milk'");
	}

	public void getExpectedProductDetailPagePrice() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd");
		WaitFor.visibilityOfElement(expectedproductprice);
		String expectedproductPrice = expectedproductprice.getText();
		System.out.println("Expected Product Title: " + expectedproductPrice);
	}

	public void verifyActualAndExpectedProductPrice() {
		assertTrue(expectedproductprice.getText().contains("₹"), "Price not match!");
	}

	public void CheckProductUrlLoadingSuccessfully() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd/");
		String currentUrl = Keyword.driver.getCurrentUrl();
		System.out.println(currentUrl);
		assertTrue(currentUrl.contains("https://www.bigbasket.com/pd/"));
	}

	public void hoverOnImage() throws InterruptedException {
		Thread.sleep(1000);
		WaitFor.elementToBeClickable(productImage);
		keyword.mouseHoverOn(productImage);

	}

	public void verifyHoverFeatureWorks() {
		assertTrue(productImage.isDisplayed(), "Hover effect did not make the zoomed image visible.");
	}

	public void verifyclickFucntinalityOnProductImageGallaryOnebyOne() throws InterruptedException {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd/");
		for (int i = 0; i <= 4; i++) {
			String imageSelector = "#thumb-" + i;
			List<WebElement> productImages = WaitFor
					.visibilityOfElements(Keyword.driver.findElements(By.cssSelector(imageSelector)));
			for (WebElement images : productImages) {
				Thread.sleep(3000);
				WaitFor.visibilityOfElement(images);
				images.click();
				assertTrue(images.isDisplayed(), "Image is not visible");
			}
		}
	}

	public void verifyGallaryImageQuality() {
		assertTrue(productImage.isDisplayed());
	}

	public void verifyPriceContainCurrencySymbolLike₹() {
		assertTrue(expectedproductprice.getText().contains("₹"));
		System.out.println("₹ currency symbol available");
	}

	public void verifyAfterclickOnProductPackSizeFor500mlProductPriceWillChange() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd");
		WaitFor.visibilityOfElement(packsize500ml);
		String actualpacksizePrice = packsize500ml.getText();
		System.out.println("actualpacksizePrice: " + actualpacksizePrice);
		keyword.clickOn(packsize500ml);
		WaitFor.visibilityOfElement(expectedproductprice);
		String price = expectedproductprice.getText();
		String[] expectedPackSizePrice = price.split(" "); // "Price:" and "₹26"
		String expectedPriceValue = expectedPackSizePrice[1]; // ₹26
		System.out.println("Expected price: " + expectedPriceValue);
		assertEquals(actualpacksizePrice, expectedPriceValue, "Price does not match for the pack size");
	}

	public void verifyProductAddedToTheBasket() throws InterruptedException {
		Thread.sleep(1000);
		WaitFor.visibilityOfElement(AddToBasket);
		AddToBasket.click();
		WaitFor.visibilityOfElement(ConfirmationMsg);
		String confirmationMsg = ConfirmationMsg.getText();
		System.out.println(confirmationMsg);
		assertTrue(confirmationMsg.contains("An item has been added to your basket successfully"),
				"The confirmation message is incorrect.");
	}

	public void verifyProductQuantityIncreaseWhenUserClickOnPlusBtn() throws InterruptedException {
		Thread.sleep(1000);
		WaitFor.visibilityOfElement(AddToBasket);
		AddToBasket.click();
		Thread.sleep(2000);
		WaitFor.elementToBeClickable(AddToBasketPlusBtn);
		AddToBasketPlusBtn.click();
		WaitFor.visibilityOfElement(ConfirmationMsg);
		String confirmationMsg = ConfirmationMsg.getText();
		System.out.println(confirmationMsg);
		assertTrue(confirmationMsg.contains("An item has been added to your basket successfully"),
				"The confirmation message is incorrect.");
	}

	public void verifyconfirmationMsgShouldBeAppere() throws InterruptedException {
		Thread.sleep(1000);
		AddToBasket.click();
		WaitFor.visibilityOfElement(ConfirmationMsg);
		String confirmationMsg = ConfirmationMsg.getText();
		System.out.println(confirmationMsg);
		assertTrue(confirmationMsg.contains("An item has been added to your basket successfully"),
				"The confirmation message is incorrect.");

	}

	public void confirmationRemovingMsgShouldBeAppere() throws InterruptedException {
		Thread.sleep(1000);
		AddToBasket.click();
		Thread.sleep(1000);
		WaitFor.visibilityOfElement(AddToBasketRemovingBtn);
		AddToBasketRemovingBtn.click();
		Thread.sleep(1000);
		assertTrue(ConfirmationMsg.getText().contains("Quantity of this item has been reduced"),
				"The confirmation message is incorrect.");
	}

	public void usershoulAbleToAddMultipleProduct() throws InterruptedException {
		Thread.sleep(1000);
		AddToBasket.click();
		for (int i = 0; i <= 7; i++) {
			Thread.sleep(1000);
			AddToBasketPlusBtn.click();
			if (ConfirmationMsg.getText().contains("You cannot add more than 6 quantities of this product")) {
				assertTrue(false, "User should able to add more item as they want.");
				break;
			}
		}
	}

	public void noSpellingGrammaticalMistakeInProductDescription() throws InterruptedException {
		Thread.sleep(2000);
		String expectedCorrectDescription = "Amul Taaza Milk, 1 L Pouch";
		assertTrue(expectedProductTitleText.getText().equals(expectedCorrectDescription),
				"Description contains spelling or grammatical errors");
	}

	public void saveForLaterBtnShouldBeOnProductDetailPage() throws InterruptedException {
		Thread.sleep(1000);
		//assertTrue(Keyword.driver.getCurrentUrl().contains("pd/"), " saveForLater btn Not on product detail page");
		assertTrue(SaveForLaterBtn.isDisplayed(), "Not display!");
	}

	public void saveProductForLater() throws InterruptedException {
		Thread.sleep(1000);
		SaveForLaterBtn.click();
		// afer Login/Signup page open
		WaitFor.visibilityOfElement(LoginSignup);
		System.out.println(LoginSignup.getText());

	}

	public void clickOnMediaIcons() throws InterruptedException {
		Thread.sleep(1000);
		for (WebElement icons : SocialMediaIcons) {
			Thread.sleep(1000);
			icons.click();
			assertTrue(icons.isEnabled(), "Icons not clickable");
		}

	}

	public void clickOnFacebookIcon() throws InterruptedException {
		Thread.sleep(2000);
		facebookIcon.click();
		assertTrue(facebookIcon.isEnabled());

	}

	public void clickOnTwitter() throws InterruptedException {
		Thread.sleep(2000);
		twitter.click();
		assertTrue(twitter.isEnabled());
	}

	public void clickOnEmailOcon() throws InterruptedException {
		Thread.sleep(2000);
		email.click();
		assertTrue(email.isEnabled());
	}

	public void navigateToPageOneByOne() throws InterruptedException {
		WaitFor.visibilityOfElements(CheckoutPage);
		for (int i = 0; i < 3; i++) {
			try {
				for (WebElement CheckoutPageOption : CheckoutPage) {
					CheckoutPageOption.click();
					Thread.sleep(2000);
					assertTrue(CheckoutPageOption.isDisplayed(),
							"CheckoutPage Links are not visible after navigating back");
					Keyword.driver.navigate().back();
					Thread.sleep(2000);
				}
			} catch (StaleElementReferenceException e) {
				System.out.println("Stale element encountered, retrying...");
				continue;
			}
		}

	}
}
