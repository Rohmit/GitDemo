Feature: OrangeHRM Login Validation
Scenario: OrangeHRM Login Test Validation

Given User is in OrangeHRM Login Application
Then User enters the userID and password
|userid |password |
|Admin  |admin123 |
Then click on login button
And navigate to PIM section
Then click on Add Employee 
And enter firstname and last name 
And click on save button
Then close the browser
