Feature: As a user, I want to be able to minus calculate, so that I can see the result
    Scenario: Android users see the result of the calculation of the minus
        Given User on the landing page
        When User tap button 1
        And User tap button 8
        And User tap button -
        And User tap button 9
        Then User can see calculation result
