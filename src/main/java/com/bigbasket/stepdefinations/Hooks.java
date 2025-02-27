package com.bigbasket.stepdefinations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bigbasket.base.Keyword;
import com.propUtils.App;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
	
	@After
	public void tearDown() {
		keyword.quitBrowser();
        LOG.info("close browsee");
	}
}