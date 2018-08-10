package parentTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import libs.WebLibrary;
import org.assertj.core.api.JUnitSoftAssertions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleDrivePage;
import pages.HomePage;
import pages.LoginPage;

public class ParentTest {

    public static WebDriver driver;

    public String pathToScreenShot;
    public static WebLibrary lib;
    public LoginPage loginPage;
    public HomePage homePage;
    public GoogleDrivePage googleDrivePage;

    public ParentTest() {
        lib = new WebLibrary(driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        googleDrivePage = new GoogleDrivePage(driver);
    }


    @Rule
    public TestName testName = new TestName();

    @Rule
    public JUnitSoftAssertions soft = new JUnitSoftAssertions();


    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        if (!(driver == null)) {
            driver.quit();
        }
    }

}
