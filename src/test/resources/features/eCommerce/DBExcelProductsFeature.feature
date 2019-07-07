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
@dbvalidation
Feature: DB product validation  with Excel File
 

  @dbvalidation
  Scenario: Compare DB with Excel
    Given I fetch Data from Excel file path as "E:\_AkashStuff\Automation\EclipseWorkspace\AutomationPoCCucumber\src\test\resources\eCommerceData\SearchProducts.xlsx" and Sheet name as "Sheet1"
    And I fetch Data from DB using "Select * from Products order by PRODUCTS ASC"
    When compare the DB with Excel

