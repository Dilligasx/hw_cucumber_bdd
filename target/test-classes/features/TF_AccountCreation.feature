@feature
Feature: User clicks "bankCash" and creates new account and then validates the account

@Scenario
Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	Given User is on the techfios login page 
	When User enters the username as "<username>" 
	When User enters the password as "<password>" 
	And  User clicks on login 
	Then User should land on Dashboard page 
	And User clicks on bank cash
	And User clicks on new account 
	And User enters accountTitle as "<accountTitle>" in accounts page 
	And User enters description as "<description>" in accounts page 
	And User enters initialBalance as "<initialBalance>" in accounts page 
	And User enters accountNumber as "<accountNumber>" in accounts page 
	And User enters contactPerson as "<contactPerson>" in accounts page 
	And User enters Phone as "<Phone>" in accounts page 
	And User enters internetBankingURL as "<internetBankingURL>" in accounts page 
	And User clicks on submit 
	Then User should be able to validate account created succesfully and delete
	
	
	
	Examples:
	| username | password |accountTitle|description|initialBalance|accountNumber|contactPerson|Phone|internetBankingURL|
	| demo@techfios.com | abc123 |Checking account1991|Personal checking.zia|2500|1991|Joe smith|2145871991|https://www.wellsfargo.com/|
	| demo@techfios.com | abc123 |Checking account1992|Personal checking.zia|2500|1992|Joe smith|2145871992|https://www.wellsfargo.com/|
	| demo@techfios.com | abc123 |Checking account1993|Personal checking.zia|2500|1993|Joe smith|2145871993|https://www.wellsfargo.com/|
	| demo@techfios.com | abc123 |Checking account1994|Personal checking.zia|2500|1994|Joe smith|2145871994|https://www.wellsfargo.com/|
	| demo@techfios.com | abc123 |Checking account1995|Personal checking.zia|2500|1995|Joe smith|2145871995|https://www.wellsfargo.com/|
	| demo@techfios.com | abc123 |Checking account1996|Personal checking.zia|2500|1996|Joe smith|2145871996|https://www.wellsfargo.com/|
	| demo@techfios.com | abc123 |Checking account1997|Personal checking.zia|2500|1997|Joe smith|2145871997|https://www.wellsfargo.com/|
	| demo@techfios.com | abc123 |Checking account1998|Personal checking.zia|2500|1998|Joe smith|2145871998|https://www.wellsfargo.com/|
	| demo@techfios.com | abc123 |Checking account1999|Personal checking.zia|2500|1999|Joe smith|2145871999|https://www.wellsfargo.com/|