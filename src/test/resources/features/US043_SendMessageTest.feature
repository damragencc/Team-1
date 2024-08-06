Feature: As a registered user,
  I would like to be able to send messages to administrators and providers.

  Background:
    Given Go to "masterUrl" url
    Then  Sign in with email "mail.selcuk" and password "pass.selcuk"
    And   Click on the profile icon in the upper right corner

  Scenario: Verify chat icon is visible and active when clicking on the profile icon
    Then Should see the chat link visible and active
    And  Close driver

  Scenario: Verify that when the chat icon is clicked, the relevant page opens
    And  Click on the chat icon
    Then Should be redirected to the chat page
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

  Scenario: Verify in home page, chat icon is visible and active
    And  Click on the chat icon
    Then Should see the chat icon visible and active
    And  Close driver

  Scenario: Verify in home page, when clicked to chat icon, 'View All Chat' and 'Clear All' links are visible and active
    And  Click on the chat icon
    Then Should see 'View All Chat' and 'Clear All' links visible and active
    And  Close driver

  Scenario: Verify that when the 'view all chat' is clicked, the relevant page opens
    And  Click on the chat icon
    And  Click on the 'View All Chat' link
    Then Should be redirected to the chat page
    And  Close driver

  Scenario: Verify error message is shown when invalid message input entered
    And  Click on the chat icon
    And  Enter invalid input "Space'"
    And  Click on the send message icon
    Then I should see an error message
    And  Close driver

  Scenario: Verify that message can be sent with valid message input
    And  Click on the chat icon
    And  Enter valid input "Test message for TC10"
    And  Click on the send message icon
    Then Should see the message sent successfully
    And  Close driver
