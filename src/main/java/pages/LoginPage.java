package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//a[@class='gb_ve gb_Aa gb_Fb']")
    public WebElement btnSingIn;

    @FindBy(xpath = ".//input[@type='email']")
    public WebElement fieldEmail;

    @FindBy(xpath = ".//div[@id='identifierNext']")
    public WebElement btnNext;

    @FindBy(xpath = ".//div[@id='profileIdentifier']")
    public WebElement profileIdentifier;

    @FindBy(xpath = ".//input[@type='password']")
    public WebElement fieldPass;

    @FindBy(xpath = ".//div[@id='passwordNext']")
    public WebElement btnPassNext;

    public void openLoginPage(String url){
        getUrl(driver, url);
    }

    public void clickBtnSingIn(){
        lib.clickOnElement(btnSingIn);
    }

    public void enterLoginToInput(String login){
    lib.setText(fieldEmail, login);
    }

    public void enterBtnNext(){
        lib.clickOnElement(btnNext);
    }

    public void enterPassToInput(String Pass){
        lib.setText(fieldPass, Pass);
    }

    public void enterBtnPassNext(){
        lib.clickOnElement(btnPassNext);
    }
}
