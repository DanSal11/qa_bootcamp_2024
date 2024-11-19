package juiceShop.tests;

import juiceShop.frameworkUtils.Selectors;
import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegistrationHomework {

    static final String baseUrl = Utils.getConfigProperty("baseUrl");

    WebDriver driver;

    @BeforeMethod
    public void initDriver() {
        // OLD version !! Do not use unless the server you are testing does not have internet
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\myuser\\Downloads\\chromedirver.exe");

        driver = Utils.getDriver();
    }

    @DataProvider(name = "RegistrationDataProvider")
    public Iterator<Object[]> registerDp () {
        Collection<Object[]> dp = new ArrayList<>();
//        dp.add(new String[] {"tudor291@dan.com", "Dan123@", "Dan123@", "vlad"});
        dp.add(new String[] {"", "Alex98876%", "Alex98876%", "alex"});
        dp.add(new String[] {"dan", "Alex98876%", "Alex98876%", "alex"});
        dp.add(new String[] {"dan@dan.com", "123", "Alex98876%", "alex"});
        dp.add(new String[] {"dan@dan.com", "", "Alex98876%", "alex"});
        dp.add(new String[] {"dan@dan.com", "Dan123@", "Dan12345454@", "vlad"});

        return dp.iterator();
    }

    @Test(dataProvider = "RegistrationDataProvider")
    public void loginRegister(String username, String password, String repPassword, String securityAns) {
        driver.get(baseUrl + "/#/");

        WebElement pageText = driver.findElement(By.cssSelector(Selectors.ALL_PRODUCTS_SELECTOR));
        Assert.assertEquals(pageText.getText(), "All Products");

        WebElement dismissBt = Utils.waitForElementClickable(driver,5,By.cssSelector(Selectors.DISMISS_BUTTON));
        dismissBt.click();

        WebElement cookiesBt = Utils.waitForElementClickable(driver,5,By.cssSelector(Selectors.ACC_COOKIES_BT));
        cookiesBt.click();

        WebElement accountButton = driver.findElement(By.id(Selectors.NAVBAR_ACCOUNT_BUTTON));
        accountButton.click();

        WebElement navbarLoginButton = driver.findElement(By.id(Selectors.NAVBAR_LOGIN_BT));
        navbarLoginButton.click();

        Assert.assertEquals(
                driver.findElement(By.cssSelector(Selectors.LOGIN_HEADER)).getText(),
                "Login"
        );

        WebElement registerLink = driver.findElement(By.id(Selectors.REGISTER_URL));
        registerLink.click();

        Assert.assertEquals(
                driver.findElement(By.cssSelector(Selectors.REGISTER_HEADER)).getText(),
                "User Registration"
        );

        WebElement usernameElement = driver.findElement(By.id(Selectors.REGISTER_EMAIL));
        usernameElement.clear();
        usernameElement.sendKeys(username);

        WebElement passwordElement = driver.findElement(By.id(Selectors.REGISTER_PASSWORD));
        passwordElement.clear();
        passwordElement.sendKeys(password);

// TEST
        if(username.isEmpty()) {
            WebElement noEmail = Utils.waitForElement(driver,5,By.id(Selectors.NO_EMAIL_ERROR));
            Assert.assertEquals(
                    noEmail.getText(),
                    "Please provide an email address."
            );
        }

// TEST
        if (!username.contains("@") || !username.contains(".")) {
            WebElement invEmail = Utils.waitForElement(driver,5,By.id(Selectors.INV_EMAIL_ERROR));
            Assert.assertEquals(
                    invEmail.getText(),
                    "Email address is not valid."
            );
        }

        WebElement passwordConfirm = driver.findElement(By.id(Selectors.REGISTER_CONFIRM));
        passwordConfirm.clear();
        passwordConfirm.sendKeys(repPassword);

// TEST
        if (password.length() < 5 || password.length() > 40) {
            WebElement invPassword = Utils.waitForElement(driver,5,By.id(Selectors.INV_PASSWORD_ERROR));
            Assert.assertEquals(
                    invPassword.getText(),
                    "Password must be 5-40 characters long."
            );
        }

// TEST
        if(password.isEmpty()) {
            WebElement noPassword = Utils.waitForElement(driver,5,By.id(Selectors.NO_PASSWORD_ERROR));
            Assert.assertEquals(
                    noPassword.getText(),
                    "Please provide a password."
            );
        }

        WebElement securityQuestion = Utils.waitForElement(driver, 5,
                By.name(Selectors.SECURITY_QUESTION)
        );
        securityQuestion.click();

        WebElement securityQuestionChoice = Utils.waitForElementClickable(driver,5,By.cssSelector(Selectors.SECURITY_OPTION1));
        securityQuestionChoice.click();

// TEST
        if (!password.equals(repPassword)) {
            WebElement noMatchPassword = Utils.waitForElement(driver,5,By.id(Selectors.NOT_MATCH_PASS_ERR));
            Assert.assertEquals(
                    noMatchPassword.getText(),
                    " Passwords do not match "
            );
        }

        WebElement securityAnswer = driver.findElement(By.id(Selectors.SECURITY_ANSWER));
        securityAnswer.clear();
        securityAnswer.sendKeys(securityAns);


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement submitButton = Utils.waitForElement(driver,10,By.cssSelector(Selectors.REGISTER_SUBMIT_BUTTON));
        submitButton.click();

    }

    @AfterMethod
    public void closeBrowser() {
        try {
            driver.close();
        }
        catch (Exception ex) {
            driver.quit();
        }
    }

}

