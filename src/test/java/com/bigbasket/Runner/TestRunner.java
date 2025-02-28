package com.bigbasket.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Features",glue = "com.bigbasket.stepdefinations",
dryRun=false,tags="@todays1", plugin= {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
