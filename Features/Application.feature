Feature: Test Gmail Scenario

  Scenario: Test Login with valid credentials
    Given Open Firefox and start application
    When I enter Valid username and password
    Then user should be able to login successfully
