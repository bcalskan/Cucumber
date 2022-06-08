package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage = new GuruPage();

    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {
        Driver.getDriver().switchTo().frame(guruPage.cookiesIframe);
        guruPage.cookiesAccept.click();
    }

    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {
        List<WebElement> tabloBaslikListesi = guruPage.basliklarListesi;
        //listemiz WebElementlerden olusuyor bu WebElementlerden hangisi istenen sutun basligini tasiyor
        //bilemeyiz
        int istenenBaslikindex = -3;
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals("Company")) {
                istenenBaslikindex = i + 1;
                break;
            }
        }
        //for loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile
        //karsilastirdim loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve
        //bulunduysa yoluma devam etmek istiyorum
        if (istenenBaslikindex != -3) {//baslik bulundu
            List<WebElement> istenenSutundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + (istenenBaslikindex) + "]"));
            for (WebElement w : istenenSutundakiElementler
            ) {
                System.out.println(w.getText());
            }
        } else {//baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }
    }
}
