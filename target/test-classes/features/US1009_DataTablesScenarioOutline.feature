Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  @dataTable
  Scenario Outline: TC14 5 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "dataTablesUrl" anasayfasinda
    Then new butonuna basar
    And kullanici 1 saniye bekler
    And isim bölümüne "<firstName>" yazar
    And kullanici 1 saniye bekler
    And soyisim bölümüne "<lastName>" yazar
    And kullanici 1 saniye bekler
    And position bölümüne "<position>" yazar
    And kullanici 1 saniye bekler
    And office bölümüne "<office>" yazar
    And kullanici 1 saniye bekler
    And extension bölümüne "<extension>" yazar
    And kullanici 1 saniye bekler
    And startDate bölümüne "<startDate>" yazar
    And kullanici 1 saniye bekler
    And salary bölümüne "<salary>" yazar
    And kullanici 1 saniye bekler
    And Create tusuna basar
    And kullanici 1 saniye bekler
    When kullanici "<firstName>" ile arama yapar
    And kullanici 1 saniye bekler
    Then isim bolumunde "<firstName>" oldugunu dogrular
    And kullanici 1 saniye bekler
    And sayfayi kapatir

    Examples:
      | firstName | lastName | position | office | extension | startDate  | salary |
      | Alim      | Alim     | QA       | ankara | UI        | 2021-10-11 | 10000  |
      | Berk      | Can      | tester   | ankara | api       | 2022-05-05   | 11000  |
      | Hüseyin   | Korkmaz  | BA       | berlin | -         | 2022-07-10 | 40000  |
      | Fatih     | Sahin    | PO       | berlin | -         | 2022-03-12 | 45000  |
      | Ahmet     | Kaya     | Tester   | ankara | database  | 2022-06-03 | 11000  |
