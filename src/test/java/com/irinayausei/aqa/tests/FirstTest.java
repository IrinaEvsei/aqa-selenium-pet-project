package com.irinayausei.aqa.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest extends BaseTest{

    public void openPage(){
        webDriver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    void checkPageTitle(){
        openPage();
        assertEquals("The Internet", webDriver.getTitle());
    }
}
