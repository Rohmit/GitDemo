@FunctionalTest
Feature: Login validation

@E2ETesting @smoke
Scenario: Login to application  with valid user
Given Login to application with valid user 

@smoke @Regression
Scenario: Login to appliaction with invalid user
Given login to application with invalid user name

@smoke
Scenario: Login with user id with special characters
Given Login with user name having special characters

@Regression
Scenario: Login with user name having numeric characters
Given Login with user id having numeric characters