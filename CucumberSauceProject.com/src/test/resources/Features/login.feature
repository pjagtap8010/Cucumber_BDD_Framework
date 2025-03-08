Feature: login
Scenario Outline: verify that login is successful with valid credentials
Given user is on login page
When user enter valide "<Username>" and "<Password>"
And user click on login button
Then user is navigate to home page 
And close the browser

Examples:
| Username | Password |
| standard_user | secret_sauce |
| standard_user | secret_sauce |
