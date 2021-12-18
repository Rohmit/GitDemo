Feature: Application login

Scenario: Home Page Default login
Given User is on landing page
When User login into application with username "Rahul" and password "Life#1234"
Then Home page is displayed 
And cart page displayed is "true"

Scenario: Home Page invalid user login
Given User is on landing page
When User login into application with username "RohitMahto" and password "Rose#2021"
Then Home page is displayed 
And cart page displayed is "false"