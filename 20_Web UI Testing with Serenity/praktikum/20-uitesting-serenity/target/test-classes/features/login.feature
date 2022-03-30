Feature: Login

    Background:
        Given I am on Home page
        When I click Book Store Application
        And I click login button for go to the login page
        And I am on login page

    Scenario: As a user, i want go to the login page, and have be able to success login
        And I input username "<username>" and password "<password>"
        And I click login button
        Then I am on profile page



#    Scenario: As a user, i have be able to success login
#        Given I am on login page
#        When I type username "<username>"
#        And I type password "<password>"
#        And I click login button
#        Then I am on Profile page
