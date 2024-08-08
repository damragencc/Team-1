@Fatih
Feature: As a user, I would like to have a page on the site where I can request a service related to my business

Scenario: TC01 User goes to OnlineMasterMarketUrl

    Given User goes to "masterUrl"

Scenario: TC02 Click on the "LOGIN" button in the Header section

  Given User click on the "LOGIN" button in the Header section

Scenario: TC05 It is tested that the "Business Services" title is visible on the home page

  Given tested that the "Business Services" title is visible on the home page

Scenario: TC06 When you enter the "Business Services" page, it is verified that the "Shops" and "Service" buttons are visible

  Given User enter the "Business Services" page, it is verified that the "Shops" and "Service" buttons are visible

Scenario: TC07 Verify that the filter button is visible next to the "Shops" and "Service" buttons

  Given User verify that the filter button is visible next to the "Shops" and "Service" buttons

Scenario: TC08 Services on the Business Services page should be displayed

  Given User services on the Business Services page should be displayed

Scenario: TC09 When the Shops icon is clicked, the relevant services should be displayed

  Given User when the Shops icon is clicked, the relevant services should be displayed

Scenario: TC10 When the Shops icon is clicked, the relevant services should be displayed and it is tested that the "Visit Store" icon is visible on the Service card. When you click on the cards, it must be verified that it goes to the relevant service

  Given User when the Shops icon is clicked, the relevant services should be displayed
  And it is tested that the "Visit Store" icon is visible on the Service card
  Then click on the cards, it must be verified that it goes to the relevant service

Scenario: TC11 When the desired service is selected, "Shop Detail", "Shop Availability", "Services", "number of services" and general information should be accessible.

  Given User when the desired service is selected, "Shop Detail", "Shop Availability", "Services", "number of services" and general information should be accessible

Scenario: TC12 Closes the page

  Given Closes the page