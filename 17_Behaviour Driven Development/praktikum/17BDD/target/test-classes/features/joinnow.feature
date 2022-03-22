Feature: JoinNow
    As a user, I want to register, So that I can see my profile

    Scenario: As an user, i want to success register using valid data
        Given User on the sign up page
        When User input email or phone number
        When User input password
        And User click button "Agree & Join"
        Then User on the home page or feed
