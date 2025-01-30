package com.bigbasket.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Rosh1\\Cucumber_project\\bigbasket_cucumber\\src\\test\\resources\\Features\\ProductDetailPage.feature",
glue = "com.bigbasket.stepdefinations")
public class TestRunner extends AbstractTestNGCucumberTests {

}
