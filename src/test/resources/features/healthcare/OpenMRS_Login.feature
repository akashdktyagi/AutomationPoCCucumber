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
@OpenMRS @reg @login_feature
Feature: Login
  To vaidate and check all aspects of Login functionaity

	#Background:
	@temp
  @login @positive
  Scenario: Succesfull Login validation 
  	Given As a user when I launch application in "chrome" 
	  And navigate to url as "https://demo.openmrs.org/openmrs/index.htm"
    When I enter user name as "admin"
    And I enter password as "Admin123"
    And I click submit button
    Then I should be logged in to the application with title as "Home"
    And close the browser
    
    @login @negative
    Scenario Outline: User should not be able to login with in valid credentials
    Given As a user when I launch application in "chrome" 
	  And navigate to url as "https://demo.openmrs.org/openmrs/index.htm"
    When I enter user name as "<Username>"
    And I enter password as "<Password>"
    And I click submit button
    Then application should give error message as "<ErrorMsg>"
    And close the browser
    
    Examples:
    | Username | Password | ErrorMsg                                     |
    | admin		 | wrng		  | Invalid username/password. Please try again. |
    | wrng     | Admin123 | Invalid username/password. Please try again. |

    