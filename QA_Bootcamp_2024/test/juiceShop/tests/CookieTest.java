package juiceShop.tests;

import jdk.jshell.execution.Util;
import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.util.Set;

public class CookieTest extends  BaseTest{

    @Test
    public void cookieTest() {
        driver.get(baseUrl + "/#/");

        Utils.printCookies(driver);
        Cookie c = new Cookie("danCookie", "cookie_value");
        driver.manage().addCookie(c);
        Utils.printCookies(driver);
        driver.manage().deleteCookieNamed("danCo0kie");
        driver.manage().deleteAllCookies();
        Utils.printCookies(driver);
    }

}