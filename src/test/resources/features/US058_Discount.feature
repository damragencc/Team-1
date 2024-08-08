Feature: As a registered user (provider),
  I want to be able to view and manage my discounted services

  Background:
    Given Go to "masterUrl" url
    Then  Sign in with email "pro.email" and password "pro.pass"
    When  Click on the profile icon in the upper right corner
    And   click on dashboard link
    Then  click on Service Offer History

  Scenario: Verify 'Service Offer History' list link is active and visible
    And  should see the Service Offer History link active and visible
      |https://qa.onlinemastermarket.com/service-offer-history|
    Then Close driver

  Scenario: Verify there is a relative discount list in the Service Offer History Page
    Then should see a list of discounted services
    Then Close driver

  @nl
  Scenario Outline: Verify with valid inputs, discount can be edited
    And  edit valid data for "<Offer %>", "<From>", "<To>", "<Start Time>", and "<End Time>"
    Then should see the updated discount information
    Then Close driver

    Examples:
    |Offer %  |From       |To           |Start Time  |End Time |
    |30         |27-08-2024 |28-09-2024   |11:00 AM    |09:00 PM |
    |2147483647 |27-08-2024 |28-09-2024   |11:00 AM    |09:00 PM |
    |4294967295 |27-08-2024 |28-09-2024   |11:00 AM    |09:00 PM |

  Scenario Outline: Verify error message is shown when editing with an invalid offer percentage
    And  edit invalid data for "<Offer %>", "<From>", "<To>", "<Start Time>", and "<End Time>"
    Then verify error message is shown
    Then Close driver
    Examples:
      |Offer %    |From       |To           |Start Time  |End Time |
      #Verify error message is shown when editing with an invalid offer percentage
      |eee        |27-08-2024 |28-09-2024   |11:00 AM    |09:00 PM |
      |???        |27-08-2024 |28-09-2024   |11:00 AM    |09:00 PM |
      |ğğğ        |27-08-2024 |28-09-2024   |11:00 AM    |09:00 PM |
      |-2147483649|27-08-2024 |28-09-2024   |11:00 AM    |09:00 PM |
      |-4294967297|27-08-2024 |28-09-2024   |11:00 AM    |09:00 PM |
      #Verify error message is shown when editing with an invalid date
      |30       |01-08-2024 |28-09-2024   |11:00 AM    |09:00 PM |
      |30       |27-08-2024 |01-08-2024   |11:00 AM    |09:00 PM |
      |30       |01-08-2024 |01-08-2024   |11:00 AM    |09:00 PM |
      |30       |11-11-1111 |28-09-2024   |11:00 AM    |09:00 PM |
      |30       |27-08-2024 |11-11-1111   |11:00 AM    |09:00 PM |
      |30       |11-24-2024 |12-24-2024   |11:00 AM    |09:00 PM |
      #Verify error message is shown when editing with invalid begin and end time
      |30         |27-08-2024 |28-09-2024   |11:00 PM    |09:00 AM |
      |30         |27-08-2024 |28-09-2024   |11:00 AM    |11:00 AM |
      |30         |27-08-2024 |28-09-2024   |Select      |Select   |
      |30         |27-08-2024 |28-09-2024   |11:00 AM    |Select   |
      |30         |27-08-2024 |28-09-2024   |Select      |09:00 PM |
