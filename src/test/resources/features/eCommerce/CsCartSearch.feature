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
@cscart
Feature: Check the Search Functionality for multiple products
  Iterate Search for multiple products

  @cscart_search
  Scenario Outline: Search multiple products from feature file
  	Given As a user when I launch application in "chrome" 
	  And navigate to url as "https://demo.cs-cart.com"
    When I enter "<Product>" in top search box
    And click on search submit button 
    Then page navigates to product search results
    And proudct results are displayed
    And close the browser

    Examples: 
      | Product         |
      | Computer        |
      | Mobile          |
      

