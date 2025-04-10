package com.bigbasket.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
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

	@FindBy(css = "div.p-6 div.qqnNj")
	WebElement similarProducts;

	@FindBy(css = "div.p-6 li.pb-1")
	WebElement similarProductsLists;

	@FindBy(css = "section.bnsJyy div.dNIxde div.overflow-hidden")
	WebElement aboutTheProductDesceiption;

	@FindBy(css = "section.bnsJyy div.kIqWEi div.overflow-hidden")
	WebElement otherProductInfo;

	@FindBy(css = "button.fNKyNB")
	WebElement otherProductInfoIcons;

	@FindBy(css = "div.place-content-center a:nth-child(1)")
	WebElement smartBasketIcon;

	@FindBy(css = "div.place-content-center a:nth-child(2)")
	WebElement offerIcon;

	@FindBy(css = "div.owl-stage div.owl-item div.item div.owl-pd  div.save-price")
	List<WebElement> offerList;

	@FindBy(css = "div.owl-next")
	WebElement next;

	@FindBy(css = "li.dDBqny h3.flex-col a")
	List<WebElement> brandList;

	@FindBy(css = "footer.footer")
	WebElement footerSection;
	@FindBy(css = "section.z-10  li:nth-child(1)")
	WebElement firstProduct;
	
	@FindBy(xpath = "//div[@class=\"TopNav___StyledMotionDiv2-sc-1vxbycn-3 cQFtua\"]/span[text()='Kelloggs']")
	WebElement Kellongs;
	
	@FindBy(xpath = "//button[@class=\"h-full px-0 py-1.5\"]")
	WebElement corserPointer;
	
	@FindBy(xpath = "//div[@class=\"SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP\"]/h3/a")
	List<WebElement> kellogsProductList;
	

	public ProductDetailPage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	public void switchWindowOnproductDetailPage() {
		keyword.switchToWindowByTitle("Buy brandList Taaza Milk Online at Best Price of Rs 56 - bigbasket");
	}

	public void verifyAfterClickOnProductThenProductUrlTitleChanged() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd");
		String currentTitle = Keyword.driver.getTitle();
		System.out.println("Current Title: " + currentTitle);
		assertTrue(currentTitle.contains("Buy Amul Taaza Milk Online at "),
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

	public void verifyHoverFeatureWorks() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd/");
		WaitFor.elementToBeClickable(productImage);
		keyword.mouseHoverOn(productImage);
		assertTrue(productImage.isDisplayed(), "Hover effect did not make the zoomed image visible.");
	}

	public void verifyclickFucntinalityOnProductImageGallaryOnebyOne() throws InterruptedException {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd/");
		for (int i = 0; i <= 4; i++) {
			WebDriverWait wait1 = new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));
			String imageSelector = "#thumb-" + i;
			Thread.sleep(1000);
			List<WebElement> productImages = WaitFor
					.visibilityOfElements(Keyword.driver.findElements(By.cssSelector(imageSelector)));
			for (WebElement image : productImages) {
				wait1.until(ExpectedConditions.visibilityOf(image));
				image.click();
				assertTrue(image.isDisplayed(), "Image is not visible");
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
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd");
		WaitFor.visibilityOfElement(AddToBasket);
		Thread.sleep(1000);
		AddToBasket.click();
		WaitFor.elementTobeVisible(ConfirmationMsg);
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

	public void verifyconfirmationMsgShouldBeAppere() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd");
		WaitFor.visibilityOfElement(AddToBasket);
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
		assertTrue(SaveForLaterBtn.isDisplayed(), "Not display!");
	}

	public void saveProductForLater() throws InterruptedException {
		Thread.sleep(1000);
		WaitFor.visibilityOfElement(SaveForLaterBtn);
		SaveForLaterBtn.click();
		WaitFor.visibilityOfElement(LoginSignup);
		System.out.println(LoginSignup.getText());

	}

	public void clickOnMediaIcons() throws InterruptedException {
		// Thread.sleep(1000);
		WaitFor.visibilityOfElements(SocialMediaIcons);
		for (WebElement icons : SocialMediaIcons) {
			Thread.sleep(1000);
			icons.click();
			assertTrue(icons.isEnabled(), "Icons not clickable");
		}
	}

	public void clickOnFacebookIcon() throws InterruptedException {
		Thread.sleep(1000);
		facebookIcon.click();
		assertTrue(facebookIcon.isEnabled());
	}

	public void clickOnTwitter() {
		WaitFor.visibilityOfElement(twitter);
		twitter.click();
		assertTrue(twitter.isEnabled());
	}

	public void clickOnEmailOcon() {
		WaitFor.visibilityOfElement(email);
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

	public void similarProductList() {
		WaitFor.visibilityOfElement(similarProducts);
		System.out.println(similarProducts.getText());
		assertTrue(similarProducts.isDisplayed(), "similar product list are not on PIP page.");
	}

	public void scrollPageToseeSimiliarProductList() {
		WaitFor.visibilityOfElement(similarProducts);
		JavascriptExecutor jse = (JavascriptExecutor) Keyword.driver;
		jse.executeScript("window.scrollBy(0,1500)");
		assertTrue(similarProductsLists.isDisplayed(), "Similar products list should be visible after scrolling");
	}

	public void aboutTheProdutDescription() {
		WaitFor.visibilityOfElement(aboutTheProductDesceiption);
		JavascriptExecutor jse = (JavascriptExecutor) Keyword.driver;
		jse.executeScript("window.scrollBy(0,800)");
		//String description = "Known for its dairy, confectionary and other products, Amul is one of the best brands in the Indian food industry. It brings in pure products that are also filled with flavour and good health. Amul Taazas Toned Milk is one such product that is made for the health conscious consumer.";
		assertTrue(aboutTheProductDesceiption.getText().contains("dairy"), "About the product description Not match");
	}

	public void otherProductInfo() {
		WaitFor.visibilityOfElement(otherProductInfo);
		JavascriptExecutor jse = (JavascriptExecutor) Keyword.driver;
		jse.executeScript("window.scrollBy(0,800)");
		assertTrue(otherProductInfo.getText().contains("EAN Code: 8901262260091"));
	}

	public void clickOnOtherProductInfoIcons() throws InterruptedException {
		WaitFor.visibilityOfElement(otherProductInfoIcons);
		JavascriptExecutor jse = (JavascriptExecutor) Keyword.driver;
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		WaitFor.visibilityOfElement(otherProductInfoIcons);
		otherProductInfoIcons.click();
		otherProductInfoIcons.click();
		assertTrue(otherProductInfoIcons.isEnabled(), "Icon are not clickable.");
	}

	public void clickOnSmartBasketIcon() {
		WaitFor.visibilityOfElement(smartBasketIcon);
		smartBasketIcon.click();
		String url = Keyword.driver.getCurrentUrl();
		assertTrue(url.contains("https://www.bigbasket.com/member/sb"));
	}

	public void clickOnOfferIcon() {
		WaitFor.visibilityOfElement(offerIcon);
		offerIcon.click();
		String url = Keyword.driver.getCurrentUrl();
		assertTrue(url.contains("https://www.bigbasket.com/offers/?nc"));
	}

	public void listDisplayWithOfferTag() {
		clickOnOfferIcon();
		WaitFor.visibilityOfElement(next);
		for (int i = 1; i <= 7; i++) {
			next.click();
			for (WebElement offerItemList : offerList) {
				String offerListsItems = offerItemList.getText();
				System.out.println(offerListsItems);
				// assertTrue(offerListsItems.contains("OFF"), "In item list, no offer available
				// for Products.");
			}
		}
	}

	public void amulbrandListBrandProduct() {
		WaitFor.visibilityOfElement(footerSection);
		keyword.scrollDownTillSpecificElement(footerSection);
		WaitFor.visibilityOfElements(brandList);
		System.out.println("Total brandList brand products found: " + brandList.size());
	//	JavascriptExecutor js = (JavascriptExecutor) Keyword.driver;
		SoftAssert softAssert = new SoftAssert();
		boolean freshoFound = false;
		for (WebElement list : brandList) {
			String brandLists = list.getText();
			System.out.println(brandLists);
			if (brandLists.contains("Amul")) {
				freshoFound = true;
				break;
			}
		}
		softAssert.assertTrue(freshoFound, "Not found Amul brand products!");
		softAssert.assertAll();
	}

	public void clickonBrandName(String brandName) throws InterruptedException {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/");
		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(Keyword.driver, Duration.ofSeconds(10));
		WebElement brandElement = wait1.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//a[contains(@class, 'Description___StyledLink') and contains(text(), '" + brandName + "')]")));
		brandElement.click();
		brandName = brandName.replace(" & ", "-").replace(", ", "-").replace(" ", "-");
		System.out.println("I click on: " + brandName);
		Thread.sleep(2000);
		WaitFor.untilUrlLoad(brandName.toLowerCase());
		String url = Keyword.driver.getCurrentUrl();
		System.out.println(url);
		assertTrue(url.contains(brandName.toLowerCase()));
	}

	public void teaBrandProduct() {
		WaitFor.untilUrlLoad("tea");
		WaitFor.visibilityOfElement(footerSection);
		keyword.scrollDownTillSpecificElement(footerSection);
		WaitFor.visibilityOfElements(brandList);

		SoftAssert softAssert = new SoftAssert();
		boolean itemFound = false;
		for (WebElement list : brandList) {
			String productName = list.getText().trim();
			System.out.println(productName);
			if (productName.toLowerCase().contains("tea")) {
				itemFound = true;
			} else if (productName.contains("Chai")) {
				itemFound = true;
			} else if (productName.contains("Tea")) {
				itemFound = true;
			} else {
				softAssert.fail("Product '" + productName + "' does not contain 'Tea'!");
			}
		}
		softAssert.assertTrue(itemFound, "No Tea brand products found!");
		softAssert.assertAll();

	}

	public void ExoticFruitsVeggiesBrandProduct() {
		WaitFor.untilUrlLoad("exotic-fruits-veggies");
		WaitFor.visibilityOfElement(footerSection);
		keyword.scrollDownTillSpecificElement(footerSection);
		WaitFor.visibilityOfElements(brandList);

		SoftAssert softAssert = new SoftAssert();
		boolean freshoFound = false;
		for (WebElement list : brandList) {
			String brandLists = list.getText();
			System.out.println(brandLists);

			if (brandLists.contains("fresho!")) {
				freshoFound = true;
				break;
			}
		}
		softAssert.assertTrue(freshoFound, "Not found fresho! brand products!");
		softAssert.assertAll();
	}

	public void ClickonteaProduct() {
		WaitFor.visibilityOfElement(firstProduct);
		firstProduct.click();
	}

	public void greeBrandProduct() {
		WaitFor.untilUrlLoad("ghee");
		WaitFor.visibilityOfElement(footerSection);
		keyword.scrollDownTillSpecificElement(footerSection);
		WaitFor.visibilityOfElements(brandList);

//		boolean gheeFound = false;
//		for (WebElement list : brandList) {
//			String brandLists = list.getText();
//			System.out.println(brandLists);
//
//			if (brandLists.contains("Ghee")) {
//				gheeFound = true;
//				break;
//			}
//		}
//		softAssert.assertTrue(gheeFound, "Not found Ghee brand products!");
//		softAssert.assertAll();
		for (WebElement list : brandList) {
			String brandLists = list.getText();
			System.out.println(brandLists);
			assertTrue(list.getText().contains("Ghee"));
		}
		
		

	}

	public void nandiniBrandProduct() {
		WaitFor.untilUrlLoad("nandini");
		WaitFor.visibilityOfElement(footerSection);
		keyword.scrollDownTillSpecificElement(footerSection);
		WaitFor.visibilityOfElements(brandList);

		SoftAssert softAssert = new SoftAssert();
		boolean brandNameFound = false;
		for (WebElement list : brandList) {
			String brandLists = list.getText();
			System.out.println(brandLists);

			if (brandLists.contains("Nandini")) {
				brandNameFound = true;
				break;
			}
		}
		softAssert.assertTrue(brandNameFound, "Not found Nandini brand products!");
		softAssert.assertAll();
	}

	public void verifyPIPpage() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pd");
		String currentURL = Keyword.driver.getCurrentUrl();
		System.out.println("Current Title: " + currentURL);
		assertTrue(currentURL.contains("pd"));
	}

	public void clickoncursor() {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/");
		corserPointer.click();
		
	}

	public void clickOnkelloggs() throws InterruptedException {
		WaitFor.elementToBeClickable(Kellongs);
		Thread.sleep(4000);
		Kellongs.click();
		
	}

	public void kellogsBrandproducts() throws InterruptedException {
		WaitFor.untilUrlLoad("https://www.bigbasket.com/pb/kelloggs/");
		Thread.sleep(5000);
		for(WebElement list:kellogsProductList) {
	
		String lists= list.getText();
		System.out.println(lists);
	
		assertTrue(list.getText().contains("Kellogg's"));
		}
		
		
		
	}

}
