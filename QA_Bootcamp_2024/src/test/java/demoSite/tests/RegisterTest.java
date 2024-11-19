package demoSite.tests;

import demoSite.pages.RegistrationPage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registration() {
        driver.get(baseUrl);
        RegistrationPage rp = new RegistrationPage(driver);
        rp.register("danut","123456789","male","Dan","Salistean","salistean_d@yahoo.com","11.06.2001");
    }

    @Test
    public void registration02() {
        driver.get(baseUrl);
        RegistrationPage rp = new RegistrationPage(driver);
        rp.register("andreea03","123456789","female","Andreea","Vlada","andreea_vld@yahoo.com","05.11.1998");
    }

}
