Feature: Compose email
Scenario: User is able to compose new email and send it.
Given User is on Gmail login page
When User enters valid username and password
Then Clicks on Login button
Then user is able to login successfully
When user clicks on Compose button opens new email window
Then user enters subject of email
Then user enters To email address of the email
Then user enters the Message Body
Then user clicks on Send button
And email send successfully and displays under Sent items