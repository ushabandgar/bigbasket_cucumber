package com.bigbasket.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Features",
glue = "com.bigbasket.stepdefinations",tags="@todays")
public class TestRunner extends AbstractTestNGCucumberTests {

}
