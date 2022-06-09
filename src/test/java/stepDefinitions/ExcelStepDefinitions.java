package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelStepDefinitions {

    Workbook workbook;

    @Given("kullanici excel dosyasini kullanilabilir hale getirir")
    public void kullanici_excel_dosyasini_kullanilabilir_hale_getirir() throws IOException {
        String dosyaYolu = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        workbook = WorkbookFactory.create(fis);
    }

    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreyi_yazdirir(Integer satir, Integer sütun) {
        String istenenHücreText = workbook.getSheet("Sayfa1").getRow(satir - 1).getCell(sütun - 1).toString();
        System.out.println(satir + ".satir " + sütun + ".sütundaki deger : " + istenenHücreText);
    }

    @Then("baskenti Jakarta olan ulke ismini yazdiralim")
    public void baskenti_jakarta_olan_ulke_ismini_yazdiralim() {
        int satirSayisi = workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 0; i < satirSayisi; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")) {
                System.out.println("Baskenti Jakarta olan ülke : " + workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            }
        }
    }

    @Then("ülke sayisinin {int} oldugunu test eder")
    public void ülke_sayisinin_oldugunu_test_eder(Integer ülkeSayisi) {
        int actualÜlkeSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        Assert.assertTrue(ülkeSayisi == actualÜlkeSayisi);
    }

    @Then("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer fizikiSatirSayisi) {
        int actualFizikiSatirSayisi = workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(fizikiSatirSayisi == actualFizikiSatirSayisi);
    }


}
