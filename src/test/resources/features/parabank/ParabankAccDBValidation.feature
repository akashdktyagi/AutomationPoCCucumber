@parabank
Feature: validate account in parabank UI matches with DB accounts table

  Background: Pre Requsite to open browser and sign in
  	Given As a user when I launch application in "chrome" 
	  And navigate to url as "http://parabank.parasoft.com"
    When I enter user name as "john"
    And I enter password as "demo"
    And I click submit button
    Then I should be logged in to the application with title as "ParaBank | Accounts Overview"
		
	@parabank
  Scenario: validate the account 
    When I fetch all the accounts numbers from account overview page for user "John"
    And I fetch Data from DB using "Select acc_number from ParaBankAccounts where customer_name ='john'"
    Then I validate account number in parabank matches with DB accounts table values