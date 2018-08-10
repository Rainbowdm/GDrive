package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GoogleDrivePage extends ParentPage {

    public GoogleDrivePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class='h-sb-Ic h-R-w-d-ff']")
    public WebElement titleGDrive;

    @FindBy(xpath = ".//div[@class='a-ec-Gd a-ec-Gd-Cs-mp-S']/button[@type='button']")
    public WebElement btnCreate;

    @FindBy(xpath = ".//div[contains(text(),'Google Документы')]")
    public WebElement linkGoogleDoc;

    @FindBy(xpath = ".//input[@class='docs-title-input']")
    public WebElement titleGDoc;

    @FindBy(xpath = ".//div[@id='docs-file-menu']")
    public WebElement linkFile;

    @FindBy(xpath = ".//div[@class='docs-title-save-label-text docs-title-save-label-text-link']")
    public WebElement titleSaveDisk;

    @FindBy(xpath = ".//div[@class='a-u-xb-j a-Wa-ka' and @data-target='doc']")
    public WebElement docFile;

    @FindBy(xpath = ".//div[contains(text(),'Переименовать…')]")
    public WebElement openReName;

    @FindBy(xpath = ".//input[@class='lb-k-Kk g-Gh']")
    public WebElement reNameTitle;

    @FindBy(xpath =".//button[@class='h-De-Vb h-De-Y']")
    public WebElement btnOk;

    public void clickBtnCreate() {
        lib.clickOnElement(btnCreate);
    }

    public void clickLinkGoogleDoc() {
        lib.clickOnElement(linkGoogleDoc);
    }

    public void clickTitleGDoc() {
        lib.clickOnElement(titleGDoc);
        lib.clickOnElement(titleGDoc);
    }

    public void setTextTitleGDoc1() {
        lib.setText(titleGDoc, "nameDoc1");
    }

    public void clickLinkFile() {
        lib.clickOnElement(linkFile);
        lib.clickOnElement(linkFile);
    }

    public void clickDocFile() {
        lib.waitABit(5);
        Actions action = new Actions(driver);
        action.contextClick(docFile).perform();
    }

    public void setReNameTitleGDoc2() {
        lib.setText(reNameTitle, "nameDoc2");
    }

    public void clickOpenWith() {
        lib.clickOnElement(openReName);
    }

    public void clickBtnOk(){
        lib.clickOnElement(btnOk);
    }
}
