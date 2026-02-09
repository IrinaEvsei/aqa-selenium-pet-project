package com.irynayausei.aqa.pages;

import com.irynayausei.aqa.base.BasePage;
import com.irynayausei.aqa.utils.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage {
    private final By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(Urls.BASE_URL+"/dropdown");
    }

    private Select select(){
        return new Select(waitForVisibility(dropdown));
    }

    public void selectByVisibileText(String text){
        select().selectByVisibleText(text);
    }

    public void selectByValue(String value){
        select().selectByValue(value);
    }

    public String getSelectedOptionText(){
        return select().getFirstSelectedOption().getText();
    }

}
