package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {

    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonu.click();
    }

    @Then("isim bölümüne {string} yazar")
    public void isim_bölümüne_yazar(String firstName) {
        dataTablesPage.firstName.sendKeys(firstName);

    }

    @Then("soyisim bölümüne {string} yazar")
    public void soyisim_bölümüne_yazar(String lastName) {
        dataTablesPage.lastName.sendKeys(lastName);
    }

    @Then("position bölümüne {string} yazar")
    public void position_bölümüne_yazar(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @Then("office bölümüne {string} yazar")
    public void office_bölümüne_yazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @Then("extension bölümüne {string} yazar")
    public void extension_bölümüne_yazar(String extension) {
        dataTablesPage.extn.sendKeys(extension);
    }

    @Then("startDate bölümüne {string} yazar")
    public void start_date_bölümüne_yazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);

    }

    @Then("salary bölümüne {string} yazar")
    public void salary_bölümüne_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.create.click();
    }


    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablesPage.search.sendKeys(firstName);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstName));
    }
}
