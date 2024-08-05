@OM-85
Feature: US_020_PageAboutUs
  As a user, I want to have an about us page on the site where I can get information about the site.

  @OM-273
  Scenario: Verify that the 'About Us' link is visible and clickable on the homepage.

    * Tarayiciyi baslatin
    * Anasayfaya gidin
    * Anasayfa header bolumunde bulunan About Us linkinin gorunur oldugunu dogrulayin
    * Anasayfa header bolumunde bulunan About Us linkine tiklayin
    * Anasayfa header bolumunde bulunan About Us linkine tiklandiginda About Us sayfasina gidildigini dogrulayin.
    * Sayfayi kapatin

  @OM-274
  Scenario: Verify that the 'About Us' link is visible and clickable under the 'Quick Links' heading in the homepage footer.

    * Tarayiciyi baslatin
    * Anasayfaya gidin
    * Anasayfa footer bolumunde bulunan Quick basliginin altinda bulunan About Us linkinin gorunur oldugunu dogrulayin
    * Quick basliginin altinda bulunan About Us linkine tiklayin
    * Quick basliginin altinda bulunan About Us linkine tiklanildiginda About Us sayfasina gidildigini dogrulayin
    * Sayfayi kapatin

  @OM-275
  Scenario: Verify that the 'About Us' page contains relevant headings and that the site information is visible.

    * Tarayiciyi baslatin
    * Anasayfaya gidin
    * Anasayfa header bolumunde bulunan About Us linkine tiklayin
    * Acilan About Us sayfasinda asagida yer alan basliklarin ve bunlarinin iceriklerin oldugunu dogrulayin : Welcome to OnlineMasterMarket!, Our Story, What We Offer, Why Choose Us?
    * Sayfayi kapatin

  @OM-276
  Scenario: Verify that clicking the 'Home' link in the top right corner of the 'About Us' page redirects the user to the homepage.

    * Tarayiciyi baslatin
    * Anasayfaya gidin
    * Anasayfa header bolumunde bulunan About Us linkine tiklayin
    * Acilan About Us sayfasinin sol ustunde yer alan Home linkinin gorunur oldugunu dogrulayin
    * Home linkine tiklayin
    * Home linki tiklanildiginda Home page'e gidildigini dogrulayin
    * Sayfayi kapatin