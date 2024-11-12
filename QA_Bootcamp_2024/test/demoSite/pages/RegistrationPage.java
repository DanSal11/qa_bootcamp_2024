package demoSite.pages;

import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegistrationPage extends BasePage{
    public static final String GO_TO_LOGIN_BT = "#svelte > div.container-fluid > div.header.sticky-top.row > div:nth-child(2) > div > a > h2 > i";
    public static final String GO_TO_REGISTER_BT = "#svelte > div.container-fluid > div.main.row > div.content > p:nth-child(3) > div > a";

    public static final String SIGN_UP_HEADER = "#svelte > div.container-fluid > div.main.row > div.content > h1";
    public static final String REGISTER_USERNAME = "username";
    public static final String REGISTER_PASSWORD = "password";
    public static final String CONFIRM_PASSWORD = "password2";
    public static final String GENDER_BUTTON_SELECTOR_MR = "Mr";
    public static final String GENDER_BUTTON_SELECTOR_MS = "Ms";
    public static final String FIRST_NAME_SELECTOR = "input-first-name";
    public static final String LAST_NAME_SELECTOR = "input-last-name";
    public static final String EMAIL_SELECTOR = "input-email";
    public static final String DATE_OF_BIRTH_SELECTOR = "input-dob";
    public static final String NATIONALITY_SELECTOR = "input-nationality";
    public static final String NATIONALITY_ANSWER_SELECTOR = "#input-nationality > option:nth-child(144)";
    public static final String ACCEPT_TERMS_SELECTOR = "terms";
    public static final String SUBMIT_REGISTRATION_BT = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > div:nth-child(13) > button";

    public static final String SIGN_UP_TEXT = "Sign up";

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void register(String username, String password, String gender, String firstName, String lastName, String email, String dateOfBirth) {

        WebElement goToLogin = driver.findElement(By.cssSelector(GO_TO_LOGIN_BT));
        goToLogin.click();
        Utils.waitForElement(driver,5,By.cssSelector(GO_TO_REGISTER_BT));
        WebElement goToRegister = driver.findElement(By.cssSelector(GO_TO_REGISTER_BT));
        goToRegister.click();

        Utils.waitForElement(driver,5,By.id(REGISTER_USERNAME));
        WebElement usernameRegister = driver.findElement(By.id(REGISTER_USERNAME));
        WebElement signUpHeader = driver.findElement(By.cssSelector(SIGN_UP_HEADER));
        WebElement passwordRegister = driver.findElement(By.id(REGISTER_PASSWORD));
        WebElement passwordConfirm = driver.findElement(By.id(CONFIRM_PASSWORD));

        WebElement firstNameRegister = driver.findElement(By.id(FIRST_NAME_SELECTOR));
        WebElement lastNameRegister = driver.findElement(By.id(LAST_NAME_SELECTOR));
        WebElement emailRegister = driver.findElement(By.id(EMAIL_SELECTOR));
        WebElement dateOfBirthRegister = driver.findElement(By.id(DATE_OF_BIRTH_SELECTOR));


        WebElement termsBt = driver.findElement(By.id(ACCEPT_TERMS_SELECTOR));
        WebElement signUpBt = driver.findElement(By.cssSelector(SUBMIT_REGISTRATION_BT));

        Assert.assertEquals(signUpHeader.getText(), SIGN_UP_TEXT);

        usernameRegister.clear();
        usernameRegister.sendKeys(username);
        passwordRegister.clear();
        passwordRegister.sendKeys(password);
        passwordConfirm.clear();
        passwordConfirm.sendKeys(password);


        if(gender.equals("male")) {
            Utils.waitForElement(driver, 5, By.id(GENDER_BUTTON_SELECTOR_MR)).click();
            WebElement genderBt = driver.findElement(By.id(GENDER_BUTTON_SELECTOR_MR));
            genderBt.click();
        }
        else if(gender.equals("female")) {
            Utils.waitForElement(driver, 5, By.id(GENDER_BUTTON_SELECTOR_MS)).click();
            WebElement genderBt = driver.findElement(By.id(GENDER_BUTTON_SELECTOR_MS));
            genderBt.click();
        }

        firstNameRegister.clear();
        firstNameRegister.sendKeys(firstName);
        lastNameRegister.clear();
        lastNameRegister.sendKeys(lastName);
        emailRegister.clear();
        emailRegister.sendKeys(email);

        dateOfBirthRegister.clear();
        dateOfBirthRegister.sendKeys(dateOfBirth);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        WebElement nationalityBt = Utils.waitForElementClickable(driver,30,By.id(NATIONALITY_SELECTOR));
        WebElement nationalityBt = driver.findElement(By.id(NATIONALITY_SELECTOR));
        nationalityBt.click();

        WebElement nationalityAnswer = Utils.waitForElement(driver,5,By.cssSelector(NATIONALITY_ANSWER_SELECTOR));
        nationalityAnswer.click();

        termsBt.click();
        signUpBt.click();


    }
}
