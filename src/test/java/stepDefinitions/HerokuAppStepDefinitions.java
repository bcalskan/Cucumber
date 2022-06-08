package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuAppPage;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HerokuAppStepDefinitions {

    HerokuAppPage herokuAppPage = new HerokuAppPage();

    @And("add Element butona basin")
    public void addElementButonaBasin() {
        herokuAppPage.addElementButton.click();
    }


    @Then("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(herokuAppPage.deleteButton));
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(herokuAppPage.deleteButton.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herokuAppPage.deleteButton.click();
    }


    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        Assert.assertTrue(herokuAppPage.deleteListesi.isEmpty());
    }


}
