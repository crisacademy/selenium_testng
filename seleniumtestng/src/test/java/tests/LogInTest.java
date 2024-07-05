package tests;

import org.testng.annotations.*;
import pages.LogInPage;

import static pages.LogInPage.driver;

public class LogInTest {

    @BeforeTest
    void openBrowserPageTest() {
        LogInPage.Setup();
        LogInPage.VERIFY_SIGN_IN_PAGE_TEXT();
    }

    @Test
    void enterEmailPasswordTest() {
        LogInPage.ENTER_EMAIL();
        LogInPage.ENTER_PASSWORD();
        LogInPage.CLICK_SIGN_IN_BUTTON();
        LogInPage.VERIFY_DASHBOARD_ALL_PRODUCTS_PAGE_TEXT();
        LogInPage.WAITING_DELAY();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
