Feature: As a registered user, I want to have a page where I can manage my services

  Background:
    Given Go to "masterUrl" url
    Then  Sign in with email "pro.email" and password "pro.pass"
    And   click on the Home Profile Icon in the header

  Scenario: Verify 'My Services' link is visible and active on Dashboard page
    Then click on dashboard link
    And verifying that the My Service link is visible and active
    When Close driver

  Scenario: Verify 'active and inactive services' is visible and active on My Service Page
    And click on the My Service link in header
    And verifying the page index has "My Services"
    When Close driver

  Scenario: Verify that when the relevant service is clicked, the relevant page opens
    And click on the My Service link in header
    And click on the Language service item
    And verifying the page name is "Leanguage"
    When Close driver

  Scenario: Verify in relevant service page, edit button is visible and active
    And click on the My Service link in header
    And click on the Language service item
    And verifying the Edit button is visible and active
    When Close driver