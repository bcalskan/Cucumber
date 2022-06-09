Feature: US1004 Kullanici parametre ile configuration file´i kullanabilmeli

  @config @pr2
  Scenario: TC07 configuration properties dosyasindan parametre kullanabilmeli
    Given kullanici "techproeducationUrl" anasayfasinda
    Then kullanici 3 saniye bekler
    And url'in "techproeducation" icerdigini test eder
    Then sayfayi kapatir
