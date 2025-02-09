package com.bigbasket.stepdefinations;

import com.bigbasket.base.Keyword;

import com.bigbasket.pages.HomePage;
import com.bigbasket.pages.ProductDetailPage;
import com.bigbasket.pages.ProductSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailSteps {

	@Given("The user is on the homepage")
	public void browserIsLaunchedAndUrlIsLoadedSuccessfully() {
		Keyword keyword = new Keyword();
		keyword.openBrowser("Firefox");
		keyword.launchUrl("https://www.bigbasket.com/");
		keyword.maximizeBrowser();
	}

	@When("The user searches for {string}")
	public void userClicksOnTheSearchInputAndSearchesForProductName(String productName) throws InterruptedException {
		HomePage page = new HomePage();
		page.clickOnSearchText();
		page.sendProductName(productName); // Pass the productName parameter to the method
	}

	@Then("The URL should change on the same tab")
	public void verifyThatAfterClickingTheProductTheUrlShouldChangeOnTheSameTab() {
		HomePage page = new HomePage();
		page.verifyUrlAfterSearch();
	}

	@When("The user clicks on the {string}")
	public void clickOnTheProduct(String productName) throws InterruptedException {
		ProductSearchPage productSearchPage = new ProductSearchPage();
		productSearchPage.clickOnProduct(productName);
	}

	@Then("The product page URL should changed")
	public void verifyThatAfterClickingTheProductProductUrlPageChanged() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.verifyAfterClickOnProductThenProductUrlChanged();
	}

	@Then("The product page Title should changed")
	public void verifyThatAfterClickingTheProductProductUrlTitleChanged() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.verifyAfterClickOnProductThenProductUrlTitleChanged();
	}

	@Then("The Product url should loaded Fully")
	public void verifyThatAfterClickingTheProductProductUrlLoadedFully() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.CheckProductUrlLoadingSuccessfully();
	}

	@Then("Check the product title")
	public void getActualProductName() {
		ProductSearchPage productSearchPage = new ProductSearchPage();
		productSearchPage.getActualSearchProductTitleText();
	}

	@Then("The product title on the product detail page should be the same as the product title on the homepage")
	public void vverifyActualAndExpectedProductTextShouldBeSame() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.getexpectedProductDetailTitleText();
		productDetailPage.verifyActualAndExpectedProductText();
	}

	@Then("Check the product Price")
	public void getActualProductPrice() {
		ProductSearchPage productSearchPage = new ProductSearchPage();
		productSearchPage.getActualSearchProductTitlePrice();
	}

	@Then("The product Price on the product detail page should be the same as the product price on the homepage")
	public void verifyActualAndExpectedProductPriceShouldBeSame() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.getExpectedProductDetailPagePrice();
		productDetailPage.verifyActualAndExpectedProductPrice();
	}

	@Then("The product image on the Product Detail Page should be displayed properly")
	public void verifyImageDisplayProperly() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.CheckProductImageToverifyImageloadingSuccessfully();
	}

	@Then("The Hover effect should be Work on product Image")
	public void verifyHoverFunctionalityWorks() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.hoverOnImage();
		productDetailPage.verifyHoverFeatureWorks();
	}

	@Then("The user should be able click on gallary images")
	public void verifyClickFucntinalityOnProductImageGallaryOnebyone() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.verifyclickFucntinalityOnProductImageGallaryOnebyOne();
	}

	@And("Product Gallary images should be in High Quality")
	public void verifyGallaryImageQuality() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.verifyclickFucntinalityOnProductImageGallaryOnebyOne();
		productDetailPage.verifyGallaryImageQuality();
	}

	@Then("The price should be displayed with the ₹ currency symbol")
	public void verifyPriceContainCurrencysymbolLike₹() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.getExpectedProductDetailPagePrice();
		productDetailPage.verifyPriceContainCurrencySymbolLike₹();
	}

	@Then("Product PackSize For 500ml Product Price Will Change")
	public void verifyAfterclickOnProductPacksizeFor500mlProductPriceWillChange() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.verifyAfterclickOnProductPackSizeFor500mlProductPriceWillChange();
	}

	@Then("The product was successfully added to the basket")
	public void verifyProductAddedToTheSasket() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.verifyProductAddedToTheBasket();
	}

	@Then("The product quantity Increase When user click on plus btn to add more items")
	public void verifyProductQuantityIncreaseWhenUserClickOnPlusBtn() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.verifyProductQuantityIncreaseWhenUserClickOnPlusBtn();
	}

	@Then("confirmation msg should be appere")
	public void confirmationMsgShouldBeAppere() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.verifyconfirmationMsgShouldBeAppere();
	}

	@Then("confirmation Removing msg should be appere")
	public void confirmationRemovingMsgShouldBeAppere() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.confirmationRemovingMsgShouldBeAppere();
	}

	@Then("The User should add multiple product as they want")
	public void usershoulAbleToAddMultipleProduct() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.usershoulAbleToAddMultipleProduct();
	}

	@Then("verify that the product description has no spelling or grammatical errors")
	public void noSpellingGrammaticalMistakeInProductDescription() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.noSpellingGrammaticalMistakeInProductDescription();
	}

	@Then("The Save for Later btn should be on product detail page")
	public void saveForLaterBtnShouldBeOnProductDetailPage() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.saveForLaterBtnShouldBeOnProductDetailPage();
	}

	@Then("The user should able to save a product for later")
	public void saveProductForLater() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.saveProductForLater();
	}

	@Then("The social media icons should be clickable")
	public void clickOnMediaIcons() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.clickOnMediaIcons();
	}

	@Then("The facebook page should open")
	public void clickOnFacebookIcons() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.clickOnFacebookIcon();
	}

	@Then("The Twitter page should open")
	public void clickOnTwitterIcons() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.clickOnTwitter();
	}

	@Then("The Email page should open")
	public void clickOnEmailIcons() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.clickOnEmailOcon();
	}

	@Then("The user should able to navigate that perticular page")
	public void navigateToPage() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.navigateToPageOneByOne();

	}

	@Then("The user should able to see similar product list")
	public void similarProdutList() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.similarProductList();
	}

	@Then("The user should able to see similar product list after scrolling down page")
	public void scrollPageToseeSimiliarProductList() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.scrollPageToseeSimiliarProductList();
	}

	@Then("The user should able to see About the Product description")
	public void aboutTheProdutDescription() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.aboutTheProdutDescription();
	}

	@Then("The user should able to see Other Product Info details")
	public void otherProductInfo() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.otherProductInfo();
	}

	@Then("The user should able to to click on \"-\" and \"+\" option to see Other Product Info")
	public void clickOnOtherProductInfoIcons() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.clickOnOtherProductInfoIcons();
	}

	@Then("The Smart basket Icon should be clickable")
	public void clickOnSmartBasketIcon() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.clickOnSmartBasketIcon();
	}

	@Then("The Offer Icon should be clickable")
	public void clickOnOfferIcon() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.clickOnOfferIcon();
	}

	@Then("The user should able to click on amul word")
	public void clickOnAmul() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.clickOnAmul();
	}

	@Then("The user should able to see only Amul brand product")
	public void amulBrandProduct() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.amulBrandProduct();

	}
	@Then("The product list display with OFFER tag")
	public void listDisplayWithOfferTag() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
		productDetailPage.listDisplayWithOfferTag();
	}

}
