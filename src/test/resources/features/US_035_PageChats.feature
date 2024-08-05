Feature: US_035_PageChats
  As a registered user (Provider) I would like to be able to exchange messages with service users or administrators

  Scenario: Verify that the 'Chat' link is visible and clickable under the profile icon on the homepage.
    * Tarayiciyi baslatin
    * Anasayfaya gidin
    * Login penceresinde bulunan Email alanina "providerEmail" ve password alanina "providerPassword" girin
    * Anasayfada header bolumunde bulunan user iconuna tiklayin
    * Acilan menude Chat linkinin gorunur oldugunu dogrulayin
    * Chat linkine tiklayin
    * Sayfanin chats sayfasi oldugunu dogrulayin
    * Sayfayi kapatin

  Scenario: Verify that the search box is visible and active on the chats page.

    * Tarayiciyi baslatin
    * Anasayfaya gidin
    * Login penceresinde bulunan Email alanina "providerEmail" ve password alanina "providerPassword" girin
    * Anasayfada header bolumunde bulunan user iconuna tiklayin
    * Chat linkine tiklayin
    * Chat sayfasinda bulunan search alaninin gorunur oldugunu dogrulayin
    * Search alaninda arama yapilabildigini dogrulayin

  Scenario: Verify that the chat text field is visible and active on the chats page.

    * Tarayiciyi baslatin
    * Anasayfaya gidin
    * Login penceresinde bulunan Email alanina "providerEmail" ve password alanina "providerPassword" girin
    * Anasayfada header bolumunde bulunan user iconuna tiklayin
    * Chat linkine tiklayin
    * Chat sayfasinda bulunan text alaninin gorunur oldugunu dogrulayin
    * Chat sayfasinda bulunan text alaninin aktif oldugunu dogrulayin

  Scenario: Verify that the 'Submit' button is visible and clickable on the chats page.

    * Tarayiciyi baslatin
    * Anasayfaya gidin
    * Login penceresinde bulunan Email alanina "providerEmail" ve password alanina "providerPassword" girin
    * Anasayfada header bolumunde bulunan user iconuna tiklayin
    * Chat linkine tiklayin
    * Submit butonunun gorunur oldugunu dogrulayin.
    * Submit butonunun tiklanabilir oldugunu dogrulayin.
