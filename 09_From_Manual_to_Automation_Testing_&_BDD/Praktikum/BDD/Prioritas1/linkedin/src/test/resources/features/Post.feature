Feature: Post

    As a user
    I want to post something
    So that I can share my achievement

    Scenario: As a user i have to able to post with photo on the main page
        Given I am on the LinkedIn main page
        When I click on the Photo icon
        And I select the photo from my computer
        And I type Check out this is my achievement! in the post text box
        And I click the Post button
        Then the post with photo should appear on my main page