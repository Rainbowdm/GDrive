package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//a[@class='gb_b gb_ec']")
    public WebElement btnAppsGoogle;

    @FindBy(xpath = ".//span[contains(text(),'Диск')]")
    public WebElement linkGoogleDrive;


    public void clickAppsGoogle() {
        lib.clickOnElement(btnAppsGoogle);
    }

    public void clickLinkGoogleDrive() {
        lib.clickOnElement(linkGoogleDrive);
    }
}
