package com.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.stepdefinitions",dryRun = false, monochrome = true,
plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber-report"}
)
public class TestRunner {

}
