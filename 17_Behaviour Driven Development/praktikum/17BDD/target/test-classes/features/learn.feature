Feature: Learning
    As a user, I want to increase my skill, So I can find and join the course

    Scenario: The User can find and join the course
        Given User on the home page
        When User click button Learning
        And User searches for the desired course
        Then Users can view and join the course
