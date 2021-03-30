Feature: Registering users
Scenario Outline: Testing registering users

Given click on the registration link
When entering the "<firstname>" and "<lastname>"
Then the user is able to register

Examples:
      |  firstname   |  lastname   |
      |  firstname1  |  lastname1  |
      |  firstname   |  lastname 2 |