Feature: Books
    As an admin, i want to see list of book so that i can create new Book

    Scenario: GET - As admin i have be able to get detail Book
        Given I set "get" api endpoint
        When I send "get" http request
        Then I receive valid data for "detail" book

    Scenario: POST - As admin i have be able to add list of book
        Given I set "post" api endpoint
        When I send "post" http request
        Then I receive valid data for "add" book

    Scenario: PUT - As admin i have be able to replace ISBN of book
        Given I set "put" api endpoint
        When I send "put" http request
        Then I receive valid data for "update" book

    Scenario: DELETE - As admin i have be able to delete book
        Given I set "delete" api endpoint
        When I send "delete" http request
        Then I receive valid data for "delete" book

