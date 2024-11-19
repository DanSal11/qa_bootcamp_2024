package demoSite.tests;

import demoSite.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void login() {
        driver.get(baseUrl);
        LoginPage signIn = new LoginPage(driver);
        signIn.login("danut","123456789");
    }
}
