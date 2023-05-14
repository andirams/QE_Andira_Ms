Feature: Register
    As a New User
    I want to succes register
    So that I can succes login

  @Negative @Unregistered-User
  Scenario: As a New User, I have be able to create new account
    Given new user on the login page
    When new user click register link
    And new user input name on name field
    And new user input email on email field
    And new user input password on password field
    And new user confirm password
    And new user click register button
    Then new user see succes message "Registration Successful" 