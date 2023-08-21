Feature: User on website swaglab

  Scenario: login main page
    When User go to web Swaglab
    And User enter invalid username and password
    Then User click button login
    And User enter valid username and password
    Then User click button login

