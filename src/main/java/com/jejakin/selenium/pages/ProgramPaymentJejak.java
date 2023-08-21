package com.jejakin.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jejakin.selenium.drivers.DriverSingleton;

public class ProgramPaymentJejak {

private WebDriver driver;
	
	public ProgramPaymentJejak() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
// Feature Adoption Program ============
	@FindBy(xpath = "//li[@id='react-tabs-8']") private WebElement menuAdoption;
	@FindBy(xpath = "//*[@id=\"react-tabs-9\"]/div[2]") private WebElement choiceMeranti;
	
	public void btnMenuAdoption() {
		menuAdoption.click();
	}
	
	public void choiceBoxMeranti() {
		choiceMeranti.click();
	}
	
// Feature Substain Program ============
	@FindBy(xpath = "//*[@id=\"react-tabs-10\"]") private WebElement menuSubstain;
	
	public void btnMenuSubstain() {
		menuSubstain.click();
	}
	
// Feature Planting Program ============
	@FindBy(xpath = "//li[@id='react-tabs-6']") private WebElement menuPlanting;
	@FindBy(xpath = "//h1[normalize-space()='Penanaman Mangrove Area Konservasi Kapuk Muara']") private WebElement choiceMangrove;
	@FindBy(xpath = "//*[@id=\"icon-edit\"]") private WebElement editPayment;
	@FindBy(xpath = "//*[@id=\"input-manual-enter\"]") private WebElement inputPayment;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div/div[2]/button") private WebElement btnSubmitPayment;
	@FindBy(xpath = "//input[@id='input-fullname']") private WebElement inputNama;
	@FindBy(xpath = "//input[@id='input-email']") private WebElement inputEmail;
	@FindBy(xpath = "//div[@id='card-select-payment']") private WebElement selectPayment;
	@FindBy(xpath = "//div[@class='backdrop']//div[3]") private WebElement selectGopay;
	@FindBy(xpath = "//label[contains(@class,'tx-note')]") private WebElement btnAgree;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div/div/button") private WebElement btnPayment;
	
	public void menuPlanting() {
		menuPlanting.click();
	}
	
	public void choiceMangrove() {
		choiceMangrove.click();
	}
	
	public void scrollElement() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//h1[normalize-space()='Penanaman Mangrove Area Konservasi Kapuk Muara']"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"icon-edit\"]"))).clickAndHold().build().perform();
	}
	
	public void editPayment() {
		editPayment.click();
	}
	
	public void inputPayment(String input) {
		inputPayment.clear();
		this.inputPayment.sendKeys(input);
	}
	
	public void btnSubmitPayment() {
		btnSubmitPayment.sendKeys(Keys.ENTER);
	}
	
	public void inputBio(String nama, String email) {
		this.inputNama.sendKeys(nama);
		this.inputEmail.sendKeys(email);
	}
	
	public void selectPayment() {
		selectPayment.click();
		selectGopay.click();
	}
	
	public void btnAgree() {
		btnAgree.click();
		btnPayment.click();
	}
}
