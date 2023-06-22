@ui
Feature: Validate login functionality
@smoke
  Scenario: Verify user can logout
    Given user open website
    Then verify user is on login page
    When user login with username "login.username" and password "login.password"
    Then verify user is on home page
    When user click on hamburger menu
    And click on logout link
    Then verify user is on login page

  Scenario: Verify user can not login
    Given user open website
    Then verify user is on login page
    When user login with username "invalid.username" and password "invalid.password"
    Then verify invalid login error message is displayed