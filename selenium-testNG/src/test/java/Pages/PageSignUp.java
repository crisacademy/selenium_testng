package Pages;

import org.openqa.selenium.By;

import static Tests.SignUpTest.driver;

public class PageSignUp {

    public static String name_inputField_cssSelector = "input[name='fullname']";
    public static String email_inputField_cssSelector = "input[name='email']";
    public static String password_inputField_cssSelector = "input[name='password']";
    public static String verifyPassword_inputField_cssSelector = "input[name='verifyPassword']";
    public  static  String signUp_button_cssSelector = "input[value='Sign Up']";

    public static void ENTER_fullName(){
        driver.findElement(By.cssSelector(name_inputField_cssSelector)).sendKeys("Josua Pajoyo");
    }
    public static void ENTER_EMAIL() {
        driver.findElement(By.cssSelector(email_inputField_cssSelector)).sendKeys("jpajoyo@ssct.edu.ph");
    }
    public static void ENTER_PASSWORD() {
        driver.findElement(By.cssSelector(password_inputField_cssSelector)).sendKeys("Fgiqmz20");
    }
    public static void ENTER_VERIFYPASSWORD(){
        driver.findElement(By.cssSelector(verifyPassword_inputField_cssSelector)).sendKeys("Fgiqmz20");
    }
    public static void CLICK_SIGNUP_BUTTON(){
        driver.findElement(By.cssSelector(signUp_button_cssSelector)).click();
    }

}

