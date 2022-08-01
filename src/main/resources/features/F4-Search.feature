@smoke
Feature: F04_search | Logged User could search for any product

  Scenario: user could search using SKU
    Given user clicks on search field
    When user search with SKU of product
    Then user could find results is true

  Scenario: user could search for product using full name
    When user clicks on search field
    And user search with name of product
    Then user could find relative results

  Scenario: user could makes advanced search
    Given user choose advanced search
    When user choose specific category
    Then user choose manufacturer
    And user click on search button
