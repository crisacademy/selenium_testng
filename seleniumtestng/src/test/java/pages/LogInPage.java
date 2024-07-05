package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class LogInPage {

    public static WebDriver driver;
    public static void Setup() {

        // Setup ChromeDriver (ensure the chromedriver executable is in your PATH)
        System.setProperty("chromedriver", "seleniumtestng/src/test/resources/drivers/chromedriver.exe");

        // Set Chrome options to run in headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
        driver.get("https://demo-store.katalon.com/signin");

    }

    public static String logInPage_text_cssSelector = "#root > div > div > div > div > div > div.footer > div";
    public static String email_inputField_cssSelector = "input[name='email']";

    public static  String password_inputField_cssSelector = "input[name='password']";
    public  static  String signIn_button_cssSelector = "input[value='Sign In']";

    public static void VALIDATE_SIGN_IN_PAGE_TEXT() {
        WebElement element = driver.findElement(By.cssSelector(logInPage_text_cssSelector));
        String actualText = element.getText();
        String expectedText = "Don't you have an account? Sign Up";
        Assert.assertEquals(actualText, expectedText, "Text does not match!");
    }

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
