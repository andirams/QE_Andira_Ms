Feature: Sepulsa Login and Top Up

    As a user
    I want to access some feature on sepulsa.com
    So that I can topup balance

    Scenario: User successfully logged in and top up balance

        Given I am on Sepulsa main page
        When i click on Login button
        And i am enter valid email and password
        And i click on Login button again
        Then i should be redirected to Sepulsa dashboard
        When i click on pulsa icon
        And i input my telephone number
        And i select nominal of the credit
        And i select payment method
        And i complete the payment process
        Then i should receive a successful top up message