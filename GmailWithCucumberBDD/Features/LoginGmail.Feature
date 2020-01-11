Feature: Login
Scenario: User is able to login to gmail.com with valid credentials

Given User is on Gmail login page
When User enters valid username and password and clicks LoginButton
Then user is able to login successfully