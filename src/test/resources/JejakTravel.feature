Feature: Page of Jejak Travel

  Scenario: Main page on jejak travel
    When User on website Jejak Travel
    And Validate Welcome Page
    Then User click to started
    
  Scenario: User on flight form
  	When User input airport to Flight
  	And User choice Passenger Info
  	Then User click Travel Purpose
  	
  Scenario: User on Payment Page
  	When User choice Adoption Program
  	And User choice Sustainable Program
  	Then User choice Planting Program
 

