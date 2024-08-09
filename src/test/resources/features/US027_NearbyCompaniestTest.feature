
Feature: US_027

  As a visitor, I would like to have an area on the
  homepage where I can review and contact nearby
  companies

  Scenario: TC_001 Verify 'nearest shop locations' text is visible
    Given Go to "masterUrl" url
    When  Select location as "29.749907" lat, "-95.358421" long
    Then  Verify "Nearest shops to your location" is visible
    And   Close driver

    @sss
  Scenario Outline: TC_002 Verify company name, location information and 'visit store' must be visible on the slider.
    Given Go to "masterUrl" url
    Then  Scroll down to Nearest Shop
      * Company Name "<CompanyName>" is visible and active
      * Location information "<Location>" is visible and active
      * Visit Store Button is visible and active
    And   Close driver

    Examples:
    |CompanyName              |Location               |
    |Harmony Events Planning  |Albany, California     |
    |Serene Home Cleaning     |Bellingham, Washington |
    |Sun Painting             |Chicago, Illinois      |
    |Gourmet Affairs Catering |Houston, Texas         |


  Scenario Outline: TC_003 Verify clicking on the visit store element in the slider should direct you to the relevant page.
    Given Go to "masterUrl" url
    Then  Scroll down to Nearest Shop
    And   Click visit store button on "<Shop Name>"
    Then  Verify that you are on "<Url>"
    And   Close driver

    Examples:
    |Shop Name                |Url                     |
    |Harmony Events Planning  |harmony-events-planning |
    |Serene Home Cleaning     |serene-home-cleaning    |
    |Sun Painting             |sun-painting            |
    |Gourmet Affairs Catering |gourmet-affairs-catering|

  Scenario: TC_004 Verify The 'view all' button under the title must be active and visible.
    Given Go to "masterUrl" url
    Then  Scroll down to Nearest Shop
      * View All Button is visible and active
    And   Close driver

  Scenario: TC_005 Verify Clicking on the 'view all' button under the title should direct you to the relevant page.
    Given Go to "masterUrl" url
    Then  Scroll down to Nearest Shop
    And   Click on view all button
    Then  Verify that you are on relevant url
      |https://qa.onlinemastermarket.com/all-services|
    And   Close driver

  Scenario: TC_006 Verify Verify in view all page, there are shops available
    Given Go to "masterUrl" url
    Then  Scroll down to Nearest Shop
    And   Click on view all button
    Then  Verify that there are shops available in relevant page
    And   Close driver
