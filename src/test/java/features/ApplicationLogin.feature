Feature: Login into Application

Scenario: Positive login Test validation
Given Initialize the browser with chrome
And Navigate to OrangeHRMlive site
Then User enters loginID  "Admin" and password "admin123"
And User clicks on login button
Then Login Home page is displayed
Then browser is closed
