Feature: As an User, I want to clear the number on the screen, So that screen looks clean

    Scenario: As a User, i tap number and button AC
        Given User on the Calculator
        When User tap 6 button
        And User tap 3 button
        And User tap AC button
        Then User see no number
