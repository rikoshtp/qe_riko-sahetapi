Feature: FindPerson
    As a user, I want to search people on Linkedin, So I can find that people

    Scenario: The User can find the person he is looking for
        Given User on the home page
        When User click button People
        And User input first and last name
        Then Showed a list of search users
