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
@OpenMRS @register_a_patient
Feature: validate register patient
  To check when user register a patient after entering all the details of the patient then,
  patient records are saved in to the system and is displayed in Patient Records tab

	Background:
		Given As a user when I launch application in "chrome" 
		And navigate to url as "https://demo.openmrs.org/openmrs/index.htm"
		When I enter user name as "admin"
    And I enter password as "Admin123"
    And I click submit button
    Then I should be logged in to the application with title as "Home"
    And I click on "RegisterAPatient" tab
    
  @register_a_patient @positive
  Scenario: Register a Patient
  	Given Register a Patient Form is displayed
    When register a patient form fields is filled as "Akash","Tyagi","Male","12/12/84","Add1","Add2","Pune","MH","India","411012","1234567891"
    And confirm button is clicked
    Then patient is register in the system with patient Id generated
    And patient records are displayed in Find patient tab under menu


