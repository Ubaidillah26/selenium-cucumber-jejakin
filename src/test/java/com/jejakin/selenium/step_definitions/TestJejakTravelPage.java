package com.jejakin.selenium.step_definitions;

import org.openqa.selenium.WebDriver;

import com.jejakin.selenium.drivers.DriverSingleton;
import com.jejakin.selenium.pages.FlightTicketJejak;
import com.jejakin.selenium.pages.MainPageJejak;
import com.jejakin.selenium.pages.ProgramPaymentJejak;
import com.jejakin.selenium.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.*;

public class TestJejakTravelPage {

	public static WebDriver driver;
	private static ExtentTest extentTest;
	private MainPageJejak main = new MainPageJejak();
	private FlightTicketJejak flight = new FlightTicketJejak();
	private ProgramPaymentJejak pay = new ProgramPaymentJejak();
	
	public TestJejakTravelPage() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
	}
	
// Main Page==============================================
	@When("User on website Jejak Travel")
	public void onWebsite() {
		driver.get(Constants.URL1);
		Hooks.delay(3);
		extentTest.log(LogStatus.PASS, "User on website Jejak Travel");
	}
	
	@And("Validate Welcome Page")
	public void validatePage() {
		main.validateHomePage();
		extentTest.log(LogStatus.PASS, "Validate Welcome Page");
	}
	
	@Then("User click to started")
	public void clickStart() {
		main.btnToStart();
		extentTest.log(LogStatus.PASS, "User click to started");
	}
	
// Flight Ticket Page=====================================
	@When("User input airport to Flight")
	public void flightRoute() {
		flight.btnFlight();
		Hooks.delay(1);
		flight.inputAirport("Soekarno Hatta");
		Hooks.delay(2);
		flight.inputAirport2("Ngurah Rai");
		extentTest.log(LogStatus.PASS, "User input airport to Flight");
	}
	
	@And("User choice Passenger Info")
	public void passengerInfo() {
		Hooks.delay(1);
		flight.PassengerInfo();
		extentTest.log(LogStatus.PASS, "User choice Passenger Info");
	}
	
	@Then("User click Travel Purpose")
	public void travelPuspose() {
		flight.TravelPurpose();
		Hooks.delay(2);
		Hooks.scroll(100 );
		flight.TakeAction();
		extentTest.log(LogStatus.PASS, "User click Travel Purpose");
	}
	
// Program Payment Page==================================
	@When("User choice Adoption Program")
	public void adoptionProgram () {
		pay.btnMenuAdoption();
		Hooks.delay(1);
		Hooks.scroll(50);
		pay.choiceBoxMeranti();
		extentTest.log(LogStatus.PASS, "User choice Adoption Program");
	}
	
	@And("User choice Sustainable Program")
	public void sustainableProgram() {
		pay.btnMenuSubstain();
		extentTest.log(LogStatus.PASS, "User choice Sustainable Program");
	}
	
	@Then("User choice Planting Program")
	public void plantingProgram() {
		pay.menuPlanting();
		Hooks.delay(1);
		pay.choiceMangrove();
		pay.scrollElement();
		Hooks.delay(2);
		pay.editPayment();
		pay.inputPayment("500.000");
		Hooks.delay(3);
		pay.btnSubmitPayment();
		Hooks.delay(1);
		pay.inputBio("Ubaidillah", "ubaidillah.jobs@gmail.com");
		Hooks.delay(1);
		pay.selectPayment();
		Hooks.delay(1);
		pay.btnAgree();
		Hooks.delay(20);
		extentTest.log(LogStatus.PASS, "User choice Planting Program");
	}
}
