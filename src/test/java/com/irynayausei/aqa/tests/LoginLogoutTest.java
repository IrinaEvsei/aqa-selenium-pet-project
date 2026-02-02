package com.irynayausei.aqa.tests;

import com.irynayausei.aqa.pages.LoginPage;
import com.irynayausei.aqa.pages.SecurePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginLogoutTest extends BaseTest {

    @Test
    void successfulLoginLogout(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();

        SecurePage securePage =
                loginPage.login("tomsmith", "SuperSecretPassword!");

        assertTrue(
                securePage.isSuccessMessageDisplayed(),
                "Secure page should be opened."
        );

        LoginPage newLoginPage = securePage.logout();
        assertTrue(newLoginPage.isOpened(), "User returned to the Login page.");
    }
}
