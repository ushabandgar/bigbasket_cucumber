//package com.bigbasket.stepdefinations;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import com.bigbasket.base.Keyword;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//public class Hooks {
//	private static final Logger LOG = LogManager.getLogger(Hooks.class);
//	Keyword keyword = new Keyword();
//	@Before
//	public void setUp() throws Exception {
//		keyword.openBrowser("Firefox");
//		keyword.launchUrl("https://www.bigbasket.com/");
//		keyword.maximizeBrowser();
//	}
//
//	@After
//	public void tearDown() {
//		keyword.quitBrowser();
//        LOG.info("close browsee");
//	}
//}
