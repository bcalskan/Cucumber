package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String actualText = amazonPage.aramaSonucElementi.getText();
        String expectedText = "Nutella";
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String actualText = amazonPage.aramaSonucElementi.getText();
        String expectedText = "Java";
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Iphone" + Keys.ENTER);

    }

    @Then("sonuclarin Iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String actualText = amazonPage.aramaSonucElementi.getText();
        String expectedText = "Iphone";
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);


    }

    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
        String arananKelime = istenenKelime;
        String actualAramaSonucYazısı = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazısı.contains(arananKelime));


    }


    @Given("kullanici {string} anasayfasinda") //amazonUrl
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualAramaSonucYazısı = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazısı.contains(istenenKelime));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
