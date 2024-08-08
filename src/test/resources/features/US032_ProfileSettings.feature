Feature: As a registered user (Provider)
  I would like to be able to edit my profile settings in my Dashboard.

  Background:
    Given Go to "masterUrl" url
    Then  Sign in with email "pro.email" and password "pro.pass"
    When  Click on the profile icon in the upper right corner
    And   click on dashboard link

  Scenario: Verify  Profile Settings icon is visible and active when clicking on the profile icon
    Then Click on the profile icon in the upper right corner
    And  Verify that Profile Settings icon is visible and active
    Then Close driver

  Scenario: Verify in Profile Setting Page, name text field is filled and cannot be change
    Then Click on profile settings link at hamburger menu in dashboard page
    And  Verify name text field is filled and not changable
    Then Close driver

  Scenario: Verify in Profile Setting Page, email text field is filled and cannot be change
    Then Click on profile settings link at hamburger menu in dashboard page
    And  Verify name mail field is filled and not changable
    Then Close driver


  Scenario: Verify commercial register field is fillable
    Then Click on profile settings link at hamburger menu in dashboard page
    And  Verify name commercial register field is fillable
    Then Close driver
