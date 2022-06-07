Feature: US1010 herokuapp Delete testi

  Scenario: TC15 herokuapp´dan delete butonu calismality
    Given kullanici "herokuAppUrl" anasayfasinda
    And add Element butona basin
    Then Delete butonu gorunur oluncaya kadar bekleyin
    And Delete butonunun gorunur oldugunu test edin
    Then Delete butonuna basarak butonu silin
    And Delete butonunun gorunmedigini test edin
    And sayfayi kapatir