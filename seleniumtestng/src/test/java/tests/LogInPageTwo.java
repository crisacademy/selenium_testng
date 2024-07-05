package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LogInPage;

public class LogInPageTwo {

    @BeforeTest
    void openBrowser() {
        LogInPage.Setup();
    }

    @Test
    void logInPageTest() {



    }


}
