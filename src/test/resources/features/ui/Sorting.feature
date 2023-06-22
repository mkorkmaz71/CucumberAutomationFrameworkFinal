@ui
Feature: Sorting Functionality Tests
@smoke
  Scenario: Verify user can sort items by price -high to low
    Given user open website
    Then verify user is on login page
    When user login with username "login.username" and password "login.password"
    Then verify user is on home page
    When user click on filter drop down menu
    Then user can choose Price-high to low
    And verify user can sort the items by price -high to low