@gokcen
Feature:

  Scenario:TC_01
    * Odeme sayfasina gelir
    * Payment type stripe secilir
    * Acilan modalda email, card number, MMYY, CVC alanlarinin ve pay butonunun gorunur oldugu dogrulanir
    * sayfayi kapatir

    Scenario Outline:TC_02
      * Odeme sayfasina gelir
      * Payment type stripe secilir
      * Service booking modalın "<email>" ,"<card number>","<MMYY>","<CVC>" alanina gecerli veri girilir
      * sayfayi kapatir

      Examples:
        | email         | card number     | MMYY | CVC |
        |g@mail.com     |4242424242424242 |1225  |076  |
        |a@mail.com     |4000056655665556 |1229  |987  |
        |b@mail.com     |5555555555554444 |1224  |123  |


  Scenario Outline:TC_03
      * Odeme sayfasina gelir
      * Payment type stripe secilir
      * Service booking modalın "<email>" ,"<card number>","<MMYY>","<CVC>" alanına gecersiz veri girilir
      * sayfayi kapatir
    Examples:
      | email         | card number     | MMYY | CVC |
     # |g@             |4242424242424242 |1225  |076  |
      |g@mail.com     |0000000000000000 |1225  |076  |
      #|g@mail.com     |4242424242424242 |122020|076 |
      #|               |                 |      |     |
      #|g@mail.com     |4242424242424242 |1220|076 |


  Scenario Outline:TC_04
        * Odeme sayfasina gelir
        * Payment type stripe secilir
        * Service booking modalın "<email>" ,"<card number>","<MMYY>","<CVC>" alanina gecerli veri girilir
        * Success yazisi goruntulenir
        * okay butonuna tiklanir
        * You have booked appointment successfully yazisi goruntulenir
    Examples:
      | email         | card number     | MMYY | CVC |
      |g@mail.com     |4242424242424242 |1225  |076  |

