package com.irynayausei.aqa.tests;

import com.irynayausei.aqa.pages.LoginPage;
import com.irynayausei.aqa.pages.SecurePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    void validLoginSuccessful() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();

        SecurePage securePage =
                loginPage.login("tomsmith", "SuperSecretPassword!");

        assertTrue(
                securePage.isSuccessMessageDisplayed(),
                "User should be logged in successfully"
        );
    }

    @Test
    void invalidLoginError() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();

        loginPage.login("wrong", "wrong");

        assertTrue(
                loginPage.getErrorMessage()
                        .contains("Your username is invalid!"),
                "Error message is incorrect"
        );
    }
}
