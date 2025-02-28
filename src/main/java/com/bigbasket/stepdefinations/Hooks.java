package com.bigbasket.stepdefinations;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.reporters.Files;

import com.bigbasket.base.Keyword;
import com.propUtils.App;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private static final Logger LOG = LogManager.getLogger(Hooks.class);
	Keyword keyword = new Keyword();

	@Before
	public void setUp() throws Exception {
		keyword.openBrowser(App.getBrowserName());
		System.out.println("launching browser from proeprties file");
		keyword.launchUrl(App.getUrl("qa"));
		keyword.maximizeBrowser();
	}

	/*
	 * @After public void tearDown() { keyword.quitBrowser();
	 * LOG.info("close browser"); }
	 */
	@After
	public void afterScenario(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			File screenshotFile = Keyword.driver.getScreenshotAs(OutputType.FILE);
			File fileLocation = new File(
					System.getProperty("user.dir") + "/target/screenshots/" + scenario.getName() + timestamp + ".png");
			com.google.common.io.Files.copy(screenshotFile, fileLocation);
		}
		keyword.quitBrowser();

	}
}