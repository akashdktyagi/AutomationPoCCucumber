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

@cs_cart
Feature: Login
  To validate that I am able to login in to the application

  @cs_cart_login
  Scenario: validate the sign in pop up
		Given As a user when I launch application in "chrome" 
	  And navigate to url as "https://demo.cs-cart.com"
    When I click on My account link at the top right
    And and click on Sign in button
    Then sign in pop up is displayed
		And username and password already entered
		When I click on sign in button
		Then I am logged in to the application

