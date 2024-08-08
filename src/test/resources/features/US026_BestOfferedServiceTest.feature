
Feature: US026 As a user, I would like to have a section on the homepage where I can follow the discounts on the best services offered

    Background:
      * Go to "masterUrl" URl
      * "Best Offered Services" text is verified
      * "Offers valid only now" only now text is verified

    Scenario: TC01 Best Offered Services title should be visible in the body section of the homepage
      
      * Go to "masterUrl" URl
      * "Best Offered Services" text is verified
      * "Offers valid only now" only now text is verified
      * quit driverr


      Scenario Outline: TC02 Verify company name, location information and 'visit store' must be visible on the slider
        * Location information: Select "33.753746" latitude, "-119.417931" long
        * Service Name "<ServiceName>" is visible and active
        * Location information "<Location>" is visible and activee
        * Service Amount "<ServiceAmount>" is visible and active

        Examples:

          |ServiceName                                        |Location     |ServiceAmount   |
          |Full House Cleaning                                |Washington   |$120            |
          |Party Planning Services                            |Philadelphia |$1500           |
          |Full-Service Catering (per person)                 |New York     |$150            |


