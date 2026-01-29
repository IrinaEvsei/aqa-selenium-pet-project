package com.irynayausei.aqa.pages;

import com.irynayausei.aqa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.irynayausei.aqa.utils.Urls;

public class LoginPage extends BasePage {

    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By errorMessage = By.id("flash");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(Urls.LOGIN_PAGE);
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
