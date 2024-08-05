@Fatih
Feature: As a user, I would like to have a page where I can follow the companies and services of events.


  Scenario: TC01 User goes to OnlineMasterMarketUrl

    Given User goes to "masterUrl"


  Scenario: TC02 Clicks on the "Categories" tab in the Header section

    Then User clicks on the "Categories" tab in the header section


  Scenario: TC03 Tests that the "Events" element is visible

    Then User that the "Events" element is visible


  Scenario: TC04 Clicks on the "Events" element

    Then User click on the "Events" element


  Scenario: TC05 Verifies that the "Shops" and "Service" elements are visible

    Then User verifies that the "Shops" and "Service" elements are visible

  Scenario: TC06 When you click on the "Shop" button, it is tested that the "Shops Found" text is visible.

    Then User click on the "Shop" button, it is tested that the "Shops Found" text is visible

  Scenario:  TC07 It is confirmed that the first company that appears when clicking on the "Shops" element has a "Visit Store" icon

    Then User confirmed that the first company that appears when clicking on the "Shops" element has a "Visit Store" icon

  Scenario: TC08 When you click on the "Visit Store" icon, the company information page should open

    Then User click on the "Visit Store" icon, the company information page should open

  Scenario: TC09 "Shop Details", "Shop Availability" and "Services" elements should be visible on the page that opens

    Then User "Shop Details", "Shop Availability" and "Services" elements should be visible on the page that opens

  Scenario: TC10 When you click on the "Services" button, the services should be visible

    Then User click on the "Services" button, the services should be visible

  Scenario: TC11 Address and fee information should be displayed when any of the service cards is clicked

    Then User address and fee information should be displayed when any of the service cards is clicked

  Scenario: TC12 Closes the page

  Scenario: TC13 User goes to OnlineMasterMarketUrl

    Given User goes to "masterUrl"
  
  Scenario: TC14 Clicks on the "Categories" tab in the Header section

    Then User clicks on the "Categories" tab in the header section

  Scenario: TC15 Clicks on the "Events" element

    Then User click on the "Events" element

  Scenario: TC16 The filter icon on the page containing the "Shops" and "Service" elements must be visible

    Then User filter icon on the page containing the "Shops" and "Service" elements must be visible

  Scenario: TC17 "Location", "Sort By", "Keyword", "Categories" and "Sub Category" elements should be visible on the form screen that opens when you click on the filter icon

    Then User "Location", "Sort By", "Keyword", "Categories" and "Sub Category" elements should be visible on the form screen that opens when you click on the filter icon

  Scenario: TC18 There should be a "Search" button on the filter screen

    Then User there should be a "Search" button on the filter screen

  Scenario: TC19 Searches can be made by sending values to the filtering screen that opens

    Then User searches can be made by sending values to the filtering screen that opens