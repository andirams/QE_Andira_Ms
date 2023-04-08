Feature: Select Payment Method

    Scenario: Select Payment Method Dana After Choosing Product
        Given I am on the Listrik PLN Page
        When I select a product and proceeds to checkout
        And I choose the Nominal of Listrik PLN
        Then I select the payment method with DANA

    Scenario: Not choosing a Payment Method After Selecting a Product
        Given I already login with correct account and go to the Listrik PLN Page
        And I select a product and proceeds to checkout
        And I choose the Nominal of Listrik PLN
        When I do not select any payment method and click Bayar Sekarang button
        Then I should see a reminder message