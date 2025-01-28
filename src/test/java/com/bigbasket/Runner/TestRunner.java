package com.bigbasket.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "/Users/vibhanshu/eclipseNew-workspace/bigbasket_cucumber/src/test/resources/Features/ShopByCategory.feature",
glue = "com.bigbasket.stepdefinations",
tags = "@today")
public class TestRunner extends AbstractTestNGCucumberTests {

}
