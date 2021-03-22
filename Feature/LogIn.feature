@LogIn
Feature: Macy's Functionality feature in  test

Scenario: I am able to click on function with valid credentials successfully

    Given I am on the home page
    When I click on the menu bar 
    And I click on the shop by department
    And I click on the men
    And I click on the men clothing
    And I click on the see all men clothing
    And I click on the T-shirt
    Then I am successfully on the men T-shirt page
    