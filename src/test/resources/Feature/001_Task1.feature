Feature: Chaldal test
  @Cookup
  Scenario Outline: order from Cookup
    Given go to Home page
    When click on Cookup button
    And click on categories
    And click Groceries
    And click Oil
    Then exit
    Examples:
      | Coockup |
      | Oil |