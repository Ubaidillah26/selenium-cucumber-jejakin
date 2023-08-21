package com.jejakin.selenium.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(tags="",
					features={"src/test/resources/JejakTravel.feature"},
					glue = "com.jejakin.selenium.step_definitions",
					plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})

			public class TestRunner extends AbstractTestNGCucumberTests{		
}
