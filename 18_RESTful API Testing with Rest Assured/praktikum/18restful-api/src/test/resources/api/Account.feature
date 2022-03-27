Feature: Account
    As an User, I want to Authorized my account, So that i can view detail account

    Scenario: POST - As admin i have be able to login and access my account
        Given I set "post" api endpoints
        When I send "post" http requests
        Then I receive valid data for "login" user

    Scenario: GET - As admin i have be able to get detail user by Id
        Given I set "get" api endpoints
        When I send "get" http requests
        Then I receive valid data for "detail" user

    Scenario: DELETE - As admin i have be able to delete user
        Given I set "delete" api endpoints
        When I send "delete" http request
        Then I receive valid data for "delete" user
