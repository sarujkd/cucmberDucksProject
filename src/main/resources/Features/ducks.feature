Feature: Search ducks in Google

Scenario: Verify ducks were properly searched

Given User in Google page
When User enters ducks in search field and press enter key
Then User should able to see ducks page 
Then  Verify ducks were properly searched 