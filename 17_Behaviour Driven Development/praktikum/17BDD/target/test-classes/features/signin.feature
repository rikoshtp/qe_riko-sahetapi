Feature: Login
    As a user, I want to see my home page, So that I can update my profile

    Scenario: As a user, I want update my profile
    Given User on the login page
    When User input email and password correctly
    And User click login button
    Then User on the home page
