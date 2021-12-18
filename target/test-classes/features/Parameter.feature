Feature: Login into Application

Scenario Outline: Positive login Test validation
Given Initialize the browser with chrome
And Navigate to OrangeHRMlive site
Then User enters loginID <username> and password <password>
And User clicks on login button
Then Login Home page is displayed
Then browser is closed

Examples:
|username |password |
|Rahul    |admin123 |
|Rohit    |admin1234|
|Admin    |admin123|
