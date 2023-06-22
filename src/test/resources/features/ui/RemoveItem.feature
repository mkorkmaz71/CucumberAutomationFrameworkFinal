@ui
Feature: Delete Item From The Cart Tests

  Scenario: Verify user can empty the cart
    Given user open website
    Then verify user is on login page
    When user login with username "login.username" and password "login.password"
    Then verify user is on home page
    When user click on add to cart button of first item
    And click on cart icon
    Then verify user is on cart page
    When remove item
    Then verify cart is empty