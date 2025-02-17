package com.bigbasket.stepdefinations;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.bigbasket.base.Keyword;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks1 {
	static ThreadLocal<String> browser = new ThreadLocal<String>();
	//private static final Logger LOG = LogManager.getLogger(Hooks.class);
	Keyword keyword = new Keyword();

	@Parameters("browser-name")
	@BeforeTest
	public void setBrowser(String browserName) throws IOException {
		System.out.println("Launching: " + browserName + " browser");
		browser.set(browserName);

	}

	@Before
	public void setUp() throws Exception {
		keyword.openBrowser(browser.get());
		keyword.launchUrl("https://www.bigbasket.com");
		keyword.maximizeBrowser();
	}

	@After
	public void tearDown() {
		keyword.quitBrowser();
		System.out.println("close browser");
		//LOG.info("close browser");
	}

}
