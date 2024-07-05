package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LogInPage;

import static pages.LogInPage.driver;

public class LogInTest {

    @BeforeTest
    void openBrowserPageTest() {
        LogInPage.Setup();
    }

    @Test
    void validateSignInPageTextTest() {
        LogInPage.VALIDATE_SIGN_IN_PAGE_TEXT();
    }

    @Test
    void enterEmailPasswordTest() {
        LogInPage.ENTER_EMAIL();
        LogInPage.ENTER_PASSWORD();
    }

    @AfterTest
    public void tearDownTest() {
        if (driver != null) {
            driver.quit();
        }
    }

}
