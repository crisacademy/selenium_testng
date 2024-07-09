package Pages;

import org.openqa.selenium.By;

import static Tests.LogInTest.driver;

public class LogInPage {

    public static String email_inputField_cssSelector = "input[name='email']";
    public static  String password_inputField_cssSelector = "input[name='password']";
    public  static  String signIn_button_cssSelector = "input[value='Sign In']";
    public static void ENTER_EMAIL() {
        driver.findElement(By.cssSelector(email_inputField_cssSelector)).sendKeys("jpajoyo@ssct.edu.ph");
    }
    public static void ENTER_PASSWORD() {
        driver.findElement(By.cssSelector(password_inputField_cssSelector)).sendKeys("Fgiqmz20");
    }
    public  static void CLICK_SIGNIN_BUTTON() {
        driver.findElement(By.cssSelector(signIn_button_cssSelector)).click();
    }

}

