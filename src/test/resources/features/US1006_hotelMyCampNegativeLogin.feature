# hotel my camp sitesinde 3 adet negatif test seneryasu olusturalim
  # 1- dogru username-yanlis password
  # 2- yanlis username-dogru password
  # 3- yanlis username-yanlis password

  Feature: US1006 yanlis bilgilerle siteye giris yapilamazon

    Scenario: TC09 yanlis password ile giris yapilamaz
      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecerli username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      And sayfayi kapatir

    Scenario: TC10 yanlis password ile giris yapilamaz
      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecerli password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      And sayfayi kapatir

    Scenario: TC11 yanlis password ile giris yapilamaz
      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      And sayfayi kapatir