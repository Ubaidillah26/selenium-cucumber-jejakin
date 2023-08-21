package com.jejakin.selenium.utils;

public enum TestScenarios {

	T0("User go to website Jejak Travel"),
	T1("Validate Welcome Page"),
	T2("User click to started"),
	T3("User input {string} to Flight"),
	T4("User choice Passenger Info"),
	T5("User click Travel Purpose"),
	T6("User choice Adoption Program"),
	T7("User choice Sustainable Program"),
	T8("User choice Plangting Program"),
	T9("Lets Begin");
	
	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	
}
