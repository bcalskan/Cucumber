Feature: US1011 web tablosundaki istenen sütunu yazdirma

  @guru @pr2
  Scenario: TC16 kullanici sütun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    And kullanici 3 saniye bekler
    And cookies sorulursa kabul eder
    And "Company", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir