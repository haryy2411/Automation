package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"pretty", "json:target/report.json"},features= {"C:\\Users\\Scandy\\eclipse-workspace\\CucumberFramework\\"
		+ "src\\test\\resources\\Features\\LoginPage.feature"},glue= {"com.stepdefinition"})
public class TestRunner {

	@AfterClass
	public static void afterclass() {
		
		Reporting.generateJVMReport("C:\\Users\\Scandy\\eclipse-workspace\\CucumberFramework\\target\\report.json");

	}
}
