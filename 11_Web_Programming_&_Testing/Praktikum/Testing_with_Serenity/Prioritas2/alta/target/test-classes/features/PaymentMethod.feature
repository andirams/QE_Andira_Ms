Feature: Select Payment Method

    Scenario: Select Payment Method Dana After Choosing Product
        Given I am on the Listrik PLN Page
        When I select a product and proceeds to checkout
        And I choose the Nominal of Listrik PLN
        Then I select the payment method with DANA