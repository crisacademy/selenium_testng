package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LogInPage;

public class LogInTest {

    @BeforeTest
    void openBrowser() {
        LogInPage.Setup();
    }

    @Test
    void logInPageTest() {

        LogInPage.ENTER_EMAIL();
        LogInPage.ENTER_PASSWORD();
        LogInPage.CLICK_SIGNIN_BUTTON();

    }




}
