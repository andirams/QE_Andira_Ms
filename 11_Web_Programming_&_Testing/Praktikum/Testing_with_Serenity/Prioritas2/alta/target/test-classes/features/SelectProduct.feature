Feature: Select Product ListrikPLN

    Scenario: Input correct nomor meter and correct nomor handphone
        Given I am on the home page
        When I click Listrik PLN product
        And I enter correct nomor meter PLN
        And I enter correct nomor handphone
        When I click on the lanjutkan button
        Then I should be redirected to select nominal

    Scenario: Input incorrect nomor meter and correct nomor handphone
        Given I am on the home page
        When I click Listrik PLN product
        And I enter incorrect nomor meter PLN
        And I enter correct nomor handphone
        When I click on the lanjutkan button
        Then I should see the warning message