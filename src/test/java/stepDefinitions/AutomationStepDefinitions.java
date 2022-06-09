package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationPracticePage;
import utilities.Driver;

public class AutomationStepDefinitions {

    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    Faker faker = new Faker();

    @And("user sign in linkine tiklar")
    public void userSignInLinkineTiklar() {
        automationPracticePage.signupButton.click();
    }


    @And("user Create and account bölümüne email adresi girer")
    public void userCreateAndAccountBölümüneEmailAdresiGirer() {
        automationPracticePage.emailBox.sendKeys(faker.internet().emailAddress());
    }

    @And("Create an Account butonuna basar")
    public void createAnAccountButonunaBasar() {
        automationPracticePage.createAnAccountButton.click();
    }


    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void userKisiselBilgileriniVeIletisimBilgileriniGirer() {
        automationPracticePage.genderList.get(1).click();
        automationPracticePage.createAccountBoxesList.get(0).sendKeys(faker.name().firstName());
        automationPracticePage.createAccountBoxesList.get(1).sendKeys(faker.name().lastName());
        //automationPracticePage.createAccountBoxesList.get(2).sendKeys(faker.internet().emailAddress());
        automationPracticePage.createAccountBoxesList.get(3).sendKeys(faker.internet().password());

        automationPracticePage.days.sendKeys("1");
        automationPracticePage.months.sendKeys("April");
        automationPracticePage.years.sendKeys("2000");

        automationPracticePage.checkboxList.get(0).click();
        automationPracticePage.checkboxList.get(1).click();

        //automationPracticePage.createAccountBoxesList2.get(0).sendKeys(faker.name().firstName());
        //automationPracticePage.createAccountBoxesList2.get(1).sendKeys(faker.name().lastName());
        automationPracticePage.createAccountBoxesList2.get(2).sendKeys(faker.company().name());
        automationPracticePage.createAccountBoxesList2.get(3).sendKeys(faker.address().streetAddress());
        automationPracticePage.createAccountBoxesList2.get(4).sendKeys(faker.address().secondaryAddress());
        automationPracticePage.createAccountBoxesList2.get(5).sendKeys(faker.address().city());
        WebElement ddm = Driver.getDriver().findElement(By.xpath("//select[@id='id_state']"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Alaska");
        automationPracticePage.postCode.sendKeys(faker.address().zipCode());

        automationPracticePage.textArea.sendKeys("-");
        automationPracticePage.createAccountBoxesList2.get(6).sendKeys(faker.phoneNumber().cellPhone());
        automationPracticePage.createAccountBoxesList2.get(7).sendKeys(faker.phoneNumber().cellPhone());


    }

    @And("user Register butonuna basar")
    public void userRegisterButonunaBasar() {
        automationPracticePage.registerButton.click();
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesapOlustugunuDogrulayin() {
        Assert.assertTrue(automationPracticePage.myAccountText.isDisplayed());
    }
}
