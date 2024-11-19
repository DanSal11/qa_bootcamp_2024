package demoSite.pages;

import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class LoginPage extends BasePage{

    public static final String GO_TO_LOGIN_BT = "#svelte > div.container-fluid > div.header.sticky-top.row > div:nth-child(2) > div > a > h2 > i";

    private static final String SIGN_IN_TEXT_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > h1";

    private static final String USERNAME_SELECTOR = "user";
    private static final String PASSWORD_SELECTOR = "pass";
    private static final String SIGN_IN_BUTTON_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > button";

    private static final String SIGN_IN_TEXT_VALUE = "Sign in";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password){
        WebElement goToLogin = driver.findElement(By.cssSelector(GO_TO_LOGIN_BT));
        goToLogin.click();

        Utils.waitForElement(driver,5,By.id(USERNAME_SELECTOR));
        WebElement usernameField = driver.findElement(By.id(USERNAME_SELECTOR));
        WebElement passwordField = driver.findElement(By.id(PASSWORD_SELECTOR));
        WebElement signInText = driver.findElement(By.cssSelector(SIGN_IN_TEXT_SELECTOR));

        Assert.assertEquals(signInText.getText(), SIGN_IN_TEXT_VALUE);

        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement signInButton = driver.findElement(By.cssSelector(SIGN_IN_BUTTON_SELECTOR));
        signInButton.click();
    }
}
