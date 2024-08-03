
Feature:TC_001-Bir kullanici olarak sitede yetkililerle iletisim kurabilecegim 'Contact US' sayfasinin olmasini istiyorum.
  Scenario:Contact us buton ve footer linki gorunurluk ve tıklanabilirlik testi
  * Kullanıcı ilgili urle gider
  * AnaSayfa header bolumunden Contact us butonunun aktif ve tıklanabilir oldugunu dogrular
  * Contact us linkine tiklar
  * AnaSayfa header bolumunden Contact us butonunun ilgili sayfaya yonlendirdigini dogrular
  * Contact us sayfasinda Home linkine tıkladıgında anasayfaya donebildigini dogrular
  * Contact us butonu ile Contact us sayfasına gider
  * Sol üst logo ile anasayfaya gidilebildigini dogrular
  * footer bolumundeki contact us linkinin tıklanabilir ve gorunur oldugunu dogrular
  * sayfayi kapatir

  Scenario:TC_002-Kullanici Contact us sayfasindaki sirket bilgilerini goruntulendigini dogrular
    * Kullanıcı ilgili urle gider
    * Contact us linkine tiklar
    * 1 saniye bekle
    * Bilgilerin  gorunur oldugunu dogrular "Address","Phone","Email"
    * Bilgilerin  gorunur oldugunu dogrular "ContactUsText","AddressText","PhoneText","EmailText"
    * Asagidaki box ve butonun gorunur ve tiklanabilir oldugunu dogrular Name,email message boxları,submit butonu
    * sayfayi kapatir

  Scenario Outline: TC_03-gecerli veri ile contact us formunun pozitif testi
  * Kullanıcı ilgili urle gider
  * Contact us linkine tiklar
  * Asagidaki boxlara gecerli veri girer "<Name>" ,"<Email>","<Message>"
  * Submit butonuna tiklar
  * Message Send ! Yazisini goruntuler
  * 2 saniye bekle
  * Okay tusuna tiklar
  * 2 saniye bekle
  * Mail sent succesfully yazisi goruntulenir
  * 2 saniye bekle
  * Contact us formunun bos oldugunu dogrular
  * 2 saniye bekle
  * sayfayi kapatir
Examples:
|Name|Email|Message|
|Name1|EmailContactUS1|Message1|
|Name2|EmailContactUS2|Message2|


  Scenario Outline: TC_04- gecersiz veri ile contact us formunun negatif testi
    * Kullanıcı ilgili urle gider
    * Contact us linkine tiklar
    * Asagidaki boxlara gecersiz veri girer "<Name>" ,"<Email>","<Message>"
    * Submit butonunun tiklanamadigini dogrular
    * Mesaj gonderilemedigini  dogrular
    * sayfayi kapatir

    Examples:
      |Name|Email|Message|
      |Name3|EmailContactUS3|Message3|
      |Name4|EmailContactUS4|Message4|
      |Name5|EmailContactUS5|Message5|