package com.jejakin.selenium.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jejakin.selenium.drivers.DriverSingleton;

public class MainPageJejak {

private WebDriver driver;
	
	public MainPageJejak() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/img") private WebElement imgPage;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[2]/a") private WebElement btnStart;
	
	public void validateHomePage() {
		assertTrue(imgPage.isDisplayed());
	}
	
	public void btnToStart() {
		btnStart.click();
	}
}
