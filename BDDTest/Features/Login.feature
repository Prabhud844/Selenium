Feature: login

Scenario: Successful login with Valid Credentials

Given user Lanuch Chrome browser
When User Opens URL "https://admin-demo.nopcommerce.com/login"
And User enter Email as "admin@yourstore.com" and Password as "admin"
And clik on Login 
Then Page Titel should be "Dashboard / nopCommerce administration"
When User Click on Log out link
Then Page Titel should be "Your store. Login"
And Close browser


Scenario Outline:Successful login with Valid Credentials different input

Given user Lanuch Chrome browser
When User Opens URL "https://admin-demo.nopcommerce.com/login"
And User enter Email as "<email>" and Password as "<password>"
And clik on Login 
Then Page Titel should be "Dashboard / nopCommerce administration"
When User Click on Log out link
Then Page Titel should be "Your store. Login"
And Close browser

Examples:
	| email | password |
	| admin@yourstore.com | admin |
	| admin@yourstore.com | admin123 |


