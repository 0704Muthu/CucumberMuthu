Feature: Buy a Product by enduser

Background: capture a screenshot

Given user can take a snap at every scenario


Scenario: Search a Some Product in amazon Home page

Given user can able to launch the amazon homepage
When  user can pass the data in input field
And user can select a random product in present page
Then user can get a title and validate

Scenario Outline: Search a Some Product in amazon Home page with different datas

Given user can able to launch the amazon homepage
When  user can pass the data  in "<search>" 
And user can select a random product in present page
Then user can get a title and validate

		
Examples:

|search|
|grocerry|
|homeappliance|
|toys|
