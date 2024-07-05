package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;



public class LogInPage {

    public static WebDriver driver;

    public static void Setup() {

        // Setup ChromeDriver (ensure the chromedriver executable is in your PATH)
        System.setProperty("chromedriver", "seleniumtestng/src/test/resources/drivers/chromedriver.exe");

        // Set Chrome options to run in headless mode
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
        driver.get("https://demo-store.katalon.com/signin");

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    public static String logInPage_text_cssSelector = "div[class='footer'] div:nth-child(1)";
    public static String email_inputField_cssSelector = "input[name='email']";

    public static  String password_inputField_cssSelector = "input[name='password']";
    public static  String signIn_button_cssSelector = "input[value='Sign In']";

    public static String dashboard_allProduct_text_xPath = "//div[normalize-space()='All Products']";

    public static void VERIFY_SIGN_IN_PAGE_TEXT() {
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

    public  static void CLICK_SIGN_IN_BUTTON() {
        driver.findElement(By.cssSelector(signIn_button_cssSelector)).click();
    }

    public static void VERIFY_DASHBOARD_ALL_PRODUCTS_PAGE_TEXT() {
        // Wait for an element to become visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dashboard_allProduct_text_xPath)));
        String actualText = element.getText();
        String expectedText = "ALL PRODUCTS";
        Assert.assertEquals(actualText, expectedText, "Text does not match!");

    }

    public static void WAITING_DELAY() {
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}
