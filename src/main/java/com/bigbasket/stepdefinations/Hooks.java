package com.bigbasket.stepdefinations;

import com.bigbasket.base.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	Keyword keyword = new Keyword();

	@Before
	public void setUp() throws Exception {
		keyword.openBrowser("Firefox");
		keyword.launchUrl("https://www.bigbasket.com/");
		keyword.maximizeBrowser();
	}

	@After
	public void tearDown() {
		keyword.quitBrowser();

	}
}
