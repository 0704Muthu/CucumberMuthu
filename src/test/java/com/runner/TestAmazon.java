package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.utility.TestBase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\rmuth\\eclipse-workspace\\Relay\\src\\main\\java\\com\\feature\\amazon.feature",
glue = "com.stepDefinition",monochrome = true,
plugin = {"pretty","json:Report/Cucumber.json",
		"html:Report/report.html"})
public class TestAmazon extends TestBase {

	@BeforeClass
	public static void setUp() {
		browserLaunch("chrome");
	}
	
	
	@AfterClass
	public static void tearDown() {
		exit();
	}
}
