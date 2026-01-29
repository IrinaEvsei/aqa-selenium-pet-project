package com.irynayausei.aqa.pages;

import com.irynayausei.aqa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By errorMessage = By.id("flash");

    private static final String LOGIN_URL =
            "https://the-internet.herokuapp.com/login";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(LOGIN_URL);
    }

    public SecurePage login(String username, String password) {
        waitForVisibility(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
        return new SecurePage(driver);
    }

    public String getErrorMessage() {
        return waitForVisibility(errorMessage).getText();
    }
}
