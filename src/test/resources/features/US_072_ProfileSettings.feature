Feature: As a registered user (Provider)
  I would like to be able to edit my profile settings in my Dashboard.

  Background:
    Given Go to "masterUrl" url
    Then  Sign in with email "pro.ahmetHoca" and password "pro.ahmetHoca.pass"
    When  Click on the profile icon in the upper right corner

  Scenario: Verify  Profile Settings icon is visible and active when clicking on the profile icon
    Then Click on the profile icon in the upper right corner
    And  Verify that Profile Settings icon is visible and active
    Then Close driver

  Scenario: Verify in Profile Setting Page, name text field is filled and cannot be change
    Then Click on profile settings link at hamburger menu in dashboard page
    And  Verify name text field is filled and not changable
    Then Close driver

    @e2e1
    Scenario: Dogru bilgilerle kullanici bilgilerini update edilebildigini dogrulama
      Then Profile Settings linkine tiklayin
      And  Asagidaki bilgilerle kullanicinin bilgilerini update edin
      |11-10-1995|Test Account|123456789|123456789|
      Then Basarili bir sekilde bilgilerin update edildigini dogrulayin
      And  Sayfayi kapatin



  Scenario: Verify in Profile Setting Page, email text field is filled and cannot be change
    Then Click on profile settings link at hamburger menu in dashboard page
    And  Verify name mail field is filled and not changable
    Then Close driver


  Scenario: Verify commercial register field is fillable
    Then Click on profile settings link at hamburger menu in dashboard page
    And  Verify name commercial register field is fillable
    Then Close driver
