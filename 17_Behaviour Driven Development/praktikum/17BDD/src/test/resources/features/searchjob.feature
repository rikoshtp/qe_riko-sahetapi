Feature: SearchJob
    As a user, I want to search the job, So that I can apply the job

    Scenario: As a user i want to apply the job
        Given User on the home page
        When User click button Jobs
        And User search the job
        Then User can apply the job
