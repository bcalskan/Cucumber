package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuAppPage {
    public HerokuAppPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Add Element']")
    public WebElement addElementButton;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@id='elements']//button")
    public List<WebElement> deleteListesi;


}
