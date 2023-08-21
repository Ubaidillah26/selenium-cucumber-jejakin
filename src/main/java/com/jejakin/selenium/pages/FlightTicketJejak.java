package com.jejakin.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jejakin.selenium.drivers.DriverSingleton;

public class FlightTicketJejak {

private WebDriver driver;
	
	public FlightTicketJejak() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
// Choice The Flight =============================
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M2 11.5V14')]") private WebElement btnFlight;
	@FindBy(xpath = "//input[@placeholder='Search airport']") private WebElement fieldSrc;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/div[1]") private WebElement clickFlight1;
	
	public void btnFlight() {
		btnFlight.click();
	}
	
	public void inputAirport(String input) {
		this.fieldSrc.sendKeys(input);
		clickFlight1.click();
		fieldSrc.clear();
	}
	
	public void inputAirport2(String input2) {
		this.fieldSrc.sendKeys(input2);
		clickFlight1.click();
	}
	
// Choice The Passenger Info =====================
	@FindBy(xpath = "//span[@class='swiper-pagination-bullet']") private WebElement btnPagination;
	@FindBy(xpath = "//span[@class='board-passenger ger board board-green']") private WebElement clickPassenger;
	@FindBy(xpath = "//div[contains(text(),'Business')]") private WebElement passBusiness;
	@FindBy(xpath = "//div[contains(text(),'First Class')]") private WebElement passFirstClass;
	@FindBy(xpath = "//div[@class='badge-jejakin mx-auto null'][normalize-space()='2']") private WebElement Pass2;
	@FindBy(xpath = "//button[@class='dflex mt-auto mx-auto mb-10 Button_btn___hqnz Button_btnBlock__2xQWD Button_btnGreen__k7VCG']") private WebElement btnSavePass;
	
	public void PassengerInfo() {
		clickPassenger.click();
		passBusiness.click();
		passFirstClass.click();
		Pass2.click();
		btnSavePass.click();
	}
	
// Choice The Travel Purpose =====================
	@FindBy(xpath = "//span[@class='board-purpose ger board board-green']//*[name()='svg']") private WebElement clickTravel;
	@FindBy(xpath = "//div[@class='travel-purpose']//div[1]") private WebElement choiceLeisure;
	@FindBy(xpath = "//button[@class='dflex mt-auto mx-auto Button_btn___hqnz Button_btnBlock__2xQWD Button_btnGreen__k7VCG Button_btnBlock__2xQWD']") private WebElement btnTakeAction;
	
	public void TravelPurpose() {
		clickTravel.click();
		choiceLeisure.click();
	}
	
	public void TakeAction() {
		btnTakeAction.click();
	}
}
