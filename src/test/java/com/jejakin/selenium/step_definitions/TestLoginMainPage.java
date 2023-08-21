package com.jejakin.selenium.step_definitions;

import org.openqa.selenium.WebDriver;

import com.jejakin.selenium.pages.loginMainPage;
import com.jejakin.selenium.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class TestLoginMainPage {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private loginMainPage loginPage = new loginMainPage();
	
	public TestLoginMainPage() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
	@When("User go to web Swaglab")
	public void user_go_to_web_Swaglab() {
		driver.get(Constants.URL);
		Hooks.delay(3);
		extentTest.log(LogStatus.PASS, "User go to web Swaglab");
	}
	
	@And("User enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
		loginPage.invalid("standard_user","");
		extentTest.log(LogStatus.FAIL, "User enter invalid username and password");
	}
	
	@And("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
		loginPage.valid("standard_user", "secret_sauce");
		extentTest.log(LogStatus.PASS, "User enter valid username and password");
	}
	
	@Then("User click button login")
	public void user_click_button_login() {
		loginPage.buttonLogin();
		Hooks.delay(2);
		extentTest.log(LogStatus.PASS, "User click button login");
	}
}
