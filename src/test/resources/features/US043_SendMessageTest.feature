Feature: As a registered user,
  I would like to be able to send messages to administrators and providers.

  Background:
    Given Go to "masterUrl" url
    Then  Sign in with email "user.selcuk" and password "pass.selcuk"
    And   Click on the profile icon in the upper right corner

  Scenario: Verify chat icon is visible and active when clicking on the profile icon
    Then Should see the chat link visible and active
    And  Close driver

  Scenario: Verify that when the chat icon is clicked, the relevant page opens
    And  Click on the chat icon
    Then Should be redirected to the chat page
          |https://qa.onlinemastermarket.com/user-chat|
    And  Close driver

  Scenario: Verify in relevant chat page, chat text box is visible and active
    And  Click on the chat icon
    Then Should see the chat text box visible and active
    And  Close driver

  Scenario: Verify in relevant chat page, Submit button is visible and active
    And  Click on the chat icon
    Then Should see the submit button visible and active
    And  Close driver

  Scenario: Verify in relevant chat page, search box is visible and active
    And  Click on the chat icon
    Then Should see the search box visible and active
    And  Close driver
