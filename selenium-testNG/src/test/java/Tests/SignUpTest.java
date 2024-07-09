package Tests;

import Pages.PageSignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpTest {

    public static WebDriver driver;

    @BeforeTest
    public static void Setup() {
        driver = new ChromeDriver();
        driver.get("https://demo-store.katalon.com/signup");
    }

    @Test
    void PageSignUp(){
        PageSignUp.ENTER_fullName();
        PageSignUp.ENTER_EMAIL();
        PageSignUp.ENTER_PASSWORD();
        PageSignUp.ENTER_VERIFYPASSWORD();
        PageSignUp.CLICK_SIGNUP_BUTTON();


    }

}
