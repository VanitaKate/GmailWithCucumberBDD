Feature: Login
Scenario: User is able to login to gmail.com with valid credentials

Given User is on Gmail login page
When User enters valid username and password
Then Clicks on Login button
Then user is able to login successfully