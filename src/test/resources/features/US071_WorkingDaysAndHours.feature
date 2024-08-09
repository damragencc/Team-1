
@Damra
Feature: As a registered user (provider), I want to be able to organize my working days and hours.

  Background:

    * Kullanici "masterUrl" gider.
    * "ProviderEmail" ve "ProviderPassword" bilgilerini girerek giris yapar
    * "Team1 Provider" Butonuna tiklar
    * "Availability" butonunaa tıklar



  Scenario: TC01 Availability button must be verified and clicked in the Provider Dashboard sidebar


    * "Team1 Provider" Butonuna tiklar
    * "Availability" butonunaa tıklar
    * sayfayi kapatir




  Scenario: TC02 The Availability button should be clicked on the Team1 Provider dropdown menu.

    * Acılan dropdown menude "Availability" butonu goruntulenir
    * sayfayi kapatir





  Scenario: TC03 Availability text must be validated and the day and time form must be validated

    * "Form" sayfasinda "All Days","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday" textleri goruntulenir
    * "From Time",To Time" checkboxlarin aktif oldugu dogrulanir
    * sayfayi kapatir





  Scenario:  TC04 In the Availability section, click on the Tuesday checkbox and set the hours in the From Time and To time text boxes.

    * "Tuesday" a checkbox kutusuna tıklar.
    * "From Time"  b butonuna tiklar "09:00" "AM" secer
    * "To Time" c butonuna tiklar "05:00" "PM" secer
    * sayfayi kapatir


  Scenario:  TC05 In the Availability section, click on the Wednesydad checkbox and set the hours in the From Time and To time text boxes.


    When "Wednesday" d checkbox kutusuna tıklar.
    And 2 saniye bekle
    Then "From Time" e  butonuna tiklar "09:00" "AM" secer
    And "To Time" f butonuna tiklar "05:00" "PM" secer
    And sayfayi kapatir


  Scenario:  TC06 In the Availability section, click on the Thursday checkbox and set the hours in the From Time and To time text boxes.


    * "Thursday" g checkbox kutusuna tıklar.
    * "From Time" h butonuna tiklar "09:00" "AM" secer
    * "To Time" i (persembe) butonunaa tiklar "05:00 "PM" secerr
    * sayfayi kapatir

  Scenario:  TC07 In the Availability section, click on the Friday checkbox and set the hours in the From Time and To time text boxes.


    * "Friday" j checkbox kutusuna tıklar.
    * "From Time" k butonuna tiklar "09:00" "AM" secer
    * "To Time" l butonuna tiklar "05:00" "PM" secerr
    * sayfayi kapatir


  Scenario:  TC08 In the Availability section, click on the Saturday checkbox and set the hours in the From Time and To time text boxes.


    * "Saturday" m checkbox kutusuna tıklar.
    * "From Time" n butonuna tiklar "09:00" "AM" secer
    * "To Time" o butonuna tiklar "14:00" "PM" secerr
    * sayfayi kapatir


    Scenario: TC09 You should click on the Submit button and the text Availability Time Added Successfully should be displayed

      * "Submit" butonuna tikla.r
      * 2 saniye bekle
      * "Availability Time Added Succesfully" onay mesaji goruntulenir


#Scenario Outline:  TC04 In the Availability section, click on the Monday checkbox and set the hours in the From Time and To time text boxes.


     # |option|
    # |<option1>|
    #  |<option2>|
    #  |<option3>|
     # |<option4>|
    #  |<option5>|
    #  |<option6>|

   # Examples:
     # |DropDownType|option1 |option2  ||option3  ||option4||option5||option6 |
    #  |Days        |Monday  |Tuesday  ||Wednesday|Thursday||Friday ||Saturday|
    #  |FromTİme    |09:00   |09:00    ||09:00    ||09:00  ||09:00  ||09:00   |
    #  |To Time     |05:00   |05:00    ||05:00    ||05:00  ||05:00  ||05:00   |

