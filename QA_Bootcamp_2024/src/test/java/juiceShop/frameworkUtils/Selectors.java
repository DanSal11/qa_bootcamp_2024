package juiceShop.frameworkUtils;

import org.openqa.selenium.WebElement;

public class Selectors {

    //main page
    public static final String ALL_PRODUCTS_SELECTOR = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-search-result > div > div > div.heading.mat-elevation-z6 > div.ng-star-inserted";
    public static final String NAVBAR_ACCOUNT_BUTTON = "navbarAccount";
    public static final String DISMISS_BUTTON = "#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted";
    public static final String ACC_COOKIES_BT = "body > div.cc-window.cc-floating.cc-type-info.cc-theme-classic.cc-bottom.cc-right.cc-color-override--1225450786 > div > a";
    public static final String NAVBAR_LOGIN_BT = "navbarLoginButton";

    // login page
    public static final String LOGIN_HEADER = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-login > div > mat-card > h1";
    public static final String MODAL_OK_BUTTON = "#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted > span.mat-button-wrapper > mat-icon";
    public static final String USERNAME_ID = "email";
    public static final String PASSWORD_ID = "password";
    public static final String SUBMIT_ID = "loginButton";
    public static final String REGISTER_URL = "newCustomerLink";

    // register page
    public static final String REGISTER_HEADER = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-register > div > mat-card > h1";
    public static final String REGISTER_EMAIL = "emailControl";
    public static final String REGISTER_PASSWORD = "passwordControl";
    public static final String REGISTER_CONFIRM = "repeatPasswordControl";
    public static final String SECURITY_QUESTION = "securityQuestion";
    public static final String SECURITY_OPTION1 = "#mat-option-3 > span";
    public static final String SECURITY_ANSWER = "securityAnswerControl";
    public static final String REGISTER_SUBMIT_BUTTON = "#registerButton";

    public static final String NO_EMAIL_ERROR = "mat-error-2";
    public static final String INV_EMAIL_ERROR = "mat-error-7";
    public static final String INV_PASSWORD_ERROR = "mat-error-10";
    public static final String NO_PASSWORD_ERROR = "mat-error-3";
    public static final String NOT_MATCH_PASS_ERR = "mat-error-9";





}