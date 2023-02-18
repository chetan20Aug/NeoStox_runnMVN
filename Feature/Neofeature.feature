Feature: Neostox login

Background: SetUp
Given user open the browser
And User lounch Neostox portalwith URL "https://neostox.com/"
When User click on sign in button on Homepage of neostox 


@NeoRun
Scenario: Validate company name
#Given user open the browser
#And User lounch Neostox portalwith URL "<URL>"
#When User click on sign in button on Homepage of neostox
And User added mbile number as "9096429868" and click on sign in button
And User added password as "6203" and click on sign in button
Then User validate the selected company name as "ADANI ENTERPRISES" is correct ot not
And User click on  logout button 


@NeoRun
Scenario: Validate company name
#Given user open the browser
#And User lounch Neostox portalwith URL "<URL>"
#When User click on sign in button on Homepage of neostox
And User added mbile number as "9421357890" and click on sign in button
And User added password as "9838" and click on sign in button
Then User validate the selected company name as "ADANI ENTERPRISES" is correct ot not
And User click on  logout button 


Scenario: Validate company name
Given user open the browser
And User lounch Neostox portalwith URL "<URL>"
When User click on sign in button on Homepage of neostox
And User added mbile number as "<mobNumber>" and click on sign in button
And User added password as "<PassWord>" and click on sign in button
Then User validate the selected company name as "ADANI ENTERPRISES" is correct ot not
And User click on  logout button 

#Examples:
#|URL|mobNumber|PassWord|
#|https://neostox.com/|9096429868|6203|
#|https://neostox.com/|9421357890|9838|
