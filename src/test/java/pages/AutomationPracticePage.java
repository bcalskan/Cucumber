package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationPracticePage {

    public AutomationPracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signupButton;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    public WebElement createAnAccountButton;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> genderList;

    @FindBy(xpath = "//input[@class='is_required validate form-control']")
    public List<WebElement> createAccountBoxesList;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement days;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement months;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement years;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkboxList;

    @FindBy(xpath = "//input[@class='form-control']")
    public List<WebElement> createAccountBoxesList2;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement postCode;

    @FindBy(xpath = "//select[@name='id_state']")
    public WebElement state;

    @FindBy(xpath = "//textarea[@name='other']")
    public WebElement textArea;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "(//*[text()='My account'])[2]")
    public WebElement myAccountText;

}
