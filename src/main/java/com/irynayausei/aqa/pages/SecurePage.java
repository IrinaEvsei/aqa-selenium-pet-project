package com.irynayausei.aqa.pages;

import com.irynayausei.aqa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage {

    private final By successMessage = By.cssSelector(".flash.success");
    private final By logoutButton = By.cssSelector("a[href='/logout']");

    public SecurePage(WebDriver driver) {
        super(driver);
    }

    public boolean isSuccessMessageDisplayed() {
        return waitForVisibility(successMessage).isDisplayed();
    }

    public LoginPage logout() {
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
}
