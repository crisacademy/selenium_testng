package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LogInPage {

    public static WebDriver driver;
    public static void Setup() {

        driver = new ChromeDriver();
        driver.get("https://demo-store.katalon.com/signin");

    }
    public static String email_inputField_cssSelector = "input[name='email']";
    public static  String password_inputField_cssSelector = "input[name='password']";
    public  static  String signIn_button_cssSelector = "input[value='Sign In']";

    public static void ENTER_EMAIL() {
        driver.findElement(By.cssSelector(email_inputField_cssSelector)).sendKeys("crisdemo@email.com");
    }

    public static void ENTER_PASSWORD() {
        driver.findElement(By.cssSelector(password_inputField_cssSelector)).sendKeys("Testing");
    }

    public  static void CLICK_SIGNIN_BUTTON() {
        driver.findElement(By.cssSelector(signIn_button_cssSelector)).click();
    }

}
