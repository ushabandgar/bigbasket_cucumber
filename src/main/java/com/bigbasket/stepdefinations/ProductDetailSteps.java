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
	public void userClicksOnTheSearchInputAndSearchesForProductName(String productName) {
	    HomePage page = new HomePage();
	    page.clickOnSearchText();
	    page.sendProductName(productName);  // Pass the productName parameter to the method
	}
	@Then("The URL should change on the same tab")
	public void verifyThatAfterClickingTheProductTheUrlShouldChangeOnTheSameTab() {
		HomePage page = new HomePage();
		page.verifyUrlAfterSearch();
	}
	@When("The user clicks on the {string}")
	public void clickOnTheProduct(String productName) {
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
	public void  getActualProductPrice() {
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
	public void verifyHoverFunctionalityWorks() {
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
}
