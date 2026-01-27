package com.irynayausei.aqa.tests;

import com.irynayausei.aqa.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest{

    @Test
    public void invalidLoginError(){

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openLoginPage();
        loginPage.login("username", "password");

        assertTrue(
                loginPage.getErrorMessage().contains("Your username is invalid!"),
                "Error message is incorrect"
        );
    }
}
