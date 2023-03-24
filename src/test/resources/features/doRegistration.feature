@Registration
Feature: registration page
validate registration funcatinality is working fine
@Sanity
Scenario: validate  registration page is available
Given I am on the home page "https://www.nopcommerce.com/en"
When I move to the user profile
And click on register 
Then Registration page should be displayed
And  url should be "https://www.nopcommerce.com/en/register?returnUrl=%2Fen"