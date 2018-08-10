package loginTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import parentTests.ParentTest;

import java.io.File;
import java.util.ArrayList;

public class LoginTest extends ParentTest {

    public LoginTest() {
    }

    @Before
    public void setBrowserSetting() {
        lib.setDriverSettings(driver, 10);
    }

    @After
    public void saveScreenShot() {
        File file = new File("");
        pathToScreenShot = file.getAbsolutePath() + "\\target\\screenshot\\"
                + this.getClass().getSimpleName() + "\\" + this.testName.getMethodName() + ".jpg";
        lib.waitABit(5);
        lib.screenShot(driver, pathToScreenShot);
    }

    @Test
    public void validLoginTest() {
        loginPage.openLoginPage("Url_test");
        loginPage.clickBtnSingIn();
        loginPage.enterLoginToInput("validLogin");
        loginPage.enterBtnNext();
        soft.assertThat(lib.getText(loginPage.profileIdentifier))
                .as("Expected profile Identifier - testdmitry5@gmail.com")
                .isEqualTo("testdmitry5@gmail.com");
        loginPage.enterPassToInput("validPass");
        loginPage.enterBtnPassNext();
        homePage.clickAppsGoogle();
        homePage.clickLinkGoogleDrive();
        soft.assertThat(lib.getText(googleDrivePage.titleGDrive))
                .as("Expected title - Мой диск")
                .isEqualTo("Мой диск");
        googleDrivePage.clickBtnCreate();
        googleDrivePage.clickLinkGoogleDoc();
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        googleDrivePage.clickTitleGDoc();
        googleDrivePage.setTextTitleGDoc1();
        googleDrivePage.clickLinkFile();
        soft.assertThat(lib.getText(googleDrivePage.titleSaveDisk))
                .as("Expected title - Все изменения сохранены на Диске")
                .isEqualTo("Все изменения сохранены на Диске");
        driver.switchTo().window(newTab.get(1)).close();
        driver.switchTo().window(newTab.get(0));
        soft.assertThat(lib.getText(googleDrivePage.docFile))
                .as("Expected title - test")
                .isEqualTo("test");

        googleDrivePage.clickDocFile();
        googleDrivePage.clickOpenWith();
        googleDrivePage.setReNameTitleGDoc2();
        googleDrivePage.clickBtnOk();
        soft.assertThat(lib.getText(googleDrivePage.docFile))
                .as("Expected title - new test")
                .isEqualTo("new test");
    }
}
