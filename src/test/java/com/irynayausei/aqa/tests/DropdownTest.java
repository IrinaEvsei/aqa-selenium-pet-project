package com.irynayausei.aqa.tests;

import com.irynayausei.aqa.pages.DropDownPage;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DropdownTest extends BaseTest{

    @Test
    void selectDropdownOption(){
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.open();

        dropDownPage.selectByVisibileText("Option 1");

        assertEquals(
                "Selected option should be 'Option 1'",
                dropDownPage.getSelectedOptionText(),
                "Option 1"
        );
    }
}
