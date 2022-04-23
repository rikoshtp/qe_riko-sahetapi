Feature: As a user, i want to be able to calculate, so that i can see the result
    Scenario: Android users see the result of the calculation of the sum
        Given User on the Homepage
        When User tap button 5
        And User tap button +
        And User tap button 2
        Then User can see calculation results
