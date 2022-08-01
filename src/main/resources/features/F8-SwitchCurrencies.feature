@smoke
Feature:F08_switchCurrencies | Logged User could switch between currencies

  Scenario: User could switch between currencies US-Euro
    Given user click on currencies list
    When user change the currency
    Then currency changed successfully