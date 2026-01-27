package com.irinayausei.aqa.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver webDriver;

    @BeforeEach
    public void driverSetUp(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @AfterEach
    void driverClose() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
