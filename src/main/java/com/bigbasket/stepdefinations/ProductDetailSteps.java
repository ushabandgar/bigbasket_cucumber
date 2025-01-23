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
	
	@Given("Browser launched with Url!")
	public void browserIsLaunchedAndUrlIsLoadedSuccessfully() {
		Keyword keyword=new Keyword();
		keyword.openBrowser("Firefox");
		keyword.launchUrl("https://www.bigbasket.com/");
		keyword.maximizeBrowser();
	}

	@When("User clicks on the search input and searches for a product name")
	public void userclicksOnTheSearchInputandSearchesForProductName() {
	    HomePage page = new HomePage();
	    page.clickOnSearchText();
	    page.sendProductName();   
	}

	@Then("Verify that after clicking the product, the URL should change on the same tab")
	public void verify_that_after_clicking_the_product_the_url_should_change_on_the_same_tab() {
		HomePage page = new HomePage();
		page.verifyUrlAfterSearch();
	}
	
	@When("Click on the product")
	public void click_on_the_product() {
	   ProductSearchPage productSearchPage = new ProductSearchPage();
	   productSearchPage.clickOnProduct();
	}
	
	@Then("Switch window on Product detail page")
	public void switch_window_on_product_deatil_page() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.switchWindowOnproductDetailPage();
	}

	@Then("Verify that after clicking the product, Product Url Title Changed")
	public void verify_that_after_clicking_the_product_product_url_title_changed() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.verifyAfterClickOnProductThenProductUrlTitleChanged();
	}
	@Then("Verify that after clicking the product, Product Page URl Changed")
	public void verify_that_after_clicking_the_product_product_url_page_changed() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.verifyAfterClickOnProductThenProductUrlChanged();
	}
	@Then("Verify that after clicking the product, Product url loaded Fully")
	public void verify_that_after_clicking_the_product_product_url_loaded_fully() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.CheckProductUrlLoadingSuccessfully();
	}
	@Then("Get Actual Product Text")
	public void get_actual_prodct_name() {
		ProductSearchPage productSearchPage = new ProductSearchPage();
		   productSearchPage.getActualSearchProductTitleText();    
	}

	@Then("Get Expected Product Text")
	public void get_expected_prodct_name() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.getexpectedProductDetailTitleText();
	}
	@Then("Verify Actual and Expected product Text should be same")
	public void verifyActualandExpectedproductTextshouldbesame() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.verifyActualAndExpectedProductText();
	}
	
	@Then("Get Actual Product Price")
	public void get_actual_productPrice() {
		ProductSearchPage productSearchPage = new ProductSearchPage();
		   productSearchPage.getActualSearchProductTitlePrice();   
	}

	@Then("Get Expected Product Price")
	public void get_expected_productPrice() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.getExpectedProductDetailPagePrice();
	}
	
	@Then("Verify Actual and Expected product Price should be same")
	public void verifyActualandExpectedproductPriceShouldbesame() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.verifyActualAndExpectedProductPrice();
	}
	
	@Then("Verify Product Image display properly")
		public void verifyImageDisplayProperly() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.CheckProductImageToverifyImageloadingSuccessfully();
		}
	
	@Then("Hover on Image")
	public void hover_on_image() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.hoverOnImage();
	}

	@Then("Verify Hover functionality works")
	public void verify_hover_functionality_works() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.verifyHoverFeatureWorks();
	}
	
	@Then("verify click Fuctionality On Product Image Gallary One by One")
	public void verifyClickFucntinalityOnProductImageGallaryOnebyone() throws InterruptedException {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.verifyclickFucntinalityOnProductImageGallaryOnebyOne();
	}
	
	@And("verify Gallary ImageQuality")
	public void verifyGallaryImageQuality() {
		ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.verifyGallaryImageQuality();
	}
	
    @Then("veriy Price Contain Currency Symbol Like ₹")
    public void verifyPriceContainCurrencysymbolLike₹() {
    	ProductDetailPage productDetailPage = new ProductDetailPage();
		productDetailPage.verifyPriceContainCurrencySymbolLike₹();
    }
    
    @Then("verify After click On Product PackSize For 500ml Product Price Will Change")
    public void verifyAfterclickOnProductPacksizeFor500mlProductPriceWillChange() {
    	ProductDetailPage productDetailPage = new ProductDetailPage();
    	productDetailPage.verifyAfterclickOnProductPackSizeFor500mlProductPriceWillChange();
    }

    
	


}
