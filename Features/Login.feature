#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Test
Feature:  Verify the login page functionality of Automation Practise URL
 
  @LoginTest
  Scenario Outline: Verify user should be able to login successfully
    Given Open automation Practise website
    And click on signin button
    When enter email address "<email>"  && password "<password>" in text box
    And click on sign in Button
    Then Verify the user logged in successfully or not
    
    Examples: 
      | email                | password |  
      | test001122@gmail.com | pass@12  | 
      | test1@gmail.com      | pass@123 | 
      | test001122@gmail.com | pass@123 |
