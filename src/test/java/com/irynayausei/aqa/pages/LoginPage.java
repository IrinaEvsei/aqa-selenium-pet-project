package com.irynayausei.aqa.pages;

import com.irynayausei.aqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.irynayausei.aqa.utils.Urls.LOGIN_PAGE;

public class LoginPage extends BasePage {

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//*[@id=\"login\"]/button/i");
    private final By errorMessage = By.id("flash");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openLoginPage(){
        webDriver.get(LOGIN_PAGE);
    }

    public void login(String username, String password){
        webDriver.findElement(usernameField).sendKeys("username");
        webDriver.findElement(passwordField).sendKeys("password");
        webDriver.findElement(loginButton).click();
    }

    public String getErrorMessage(){
        WebElement error = webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(errorMessage)
        );
        return error.getText();
    }
}
