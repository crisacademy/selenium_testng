package Tests;

import Pages.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTest {

    public static WebDriver driver;

    @BeforeTest
    public static void Setup() {
        driver = new ChromeDriver();
        driver.get("https://demo-store.katalon.com/signin");
    }

    @Test
    void logInPageTest() {
        LogInPage.ENTER_EMAIL();
        LogInPage.ENTER_PASSWORD();
        LogInPage.CLICK_SIGNIN_BUTTON();

    }

}

