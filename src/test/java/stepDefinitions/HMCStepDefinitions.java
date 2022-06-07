package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {
    HMCPage hmcPage = new HMCPage();

    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        hmcPage.loginButonu.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hmcPage.loginButonu2.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hmcPage.loginButonu2.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }
}
