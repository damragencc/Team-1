@Fatih
Feature: As a user, I would like to have an area with prominent companies on the homepage of the site

Scenario: TC01 User goes to OnlineMasterMarketUrl

  Given User goes to "masterUrl"

Scenario: TC02 TC03 TC04 Click on the "LOGIN" button in the Header section

  Given user click on the "LOGIN" button in the Header section

Scenario: TC05 The "Featured Shop" title should be visible in the homepage body section

  Given User "Featured Shop" title should be visible in the homepage body section.

Scenario: TC06 It is tested that the company name and location information are visible on the slider under the title

  Given User It is tested that the company name and location information are visible on the slider under the title

Scenario: TC07 It is verified that the "Visit Store" icon is visible and when clicked, it goes to the relevant page

  Given User is verified that the "Visit Store" icon is visible and when clicked
  Then  User goes to the relevant page

Scenario: TC08 Go to the previous page using the back button

  Given user go to the previous page using the back button

Scenario: TC09 Verify that the "View All" button under the company headings is visible

  Given User verify that the "View All" button under the company headings is visible

Scenario: TC10 When you click on the "View All" button, it is tested that you go to the relevant page

  Given User click on the "View All" button, it is tested that you go to the relevant page

Scenario: TC11 Closes the page

  Given Closes the page
