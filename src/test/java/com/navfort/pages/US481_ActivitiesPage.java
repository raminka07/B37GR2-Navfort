package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US481_ActivitiesPage {
    public void US481_ActivitiesPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvantBtn;

}
