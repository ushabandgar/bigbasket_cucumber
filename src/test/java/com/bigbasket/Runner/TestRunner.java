package com.bigbasket.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/resources",
glue="com.bigbasket",
tags="@today")
public class TestRunner extends AbstractTestNGCucumberTests{

	
}
