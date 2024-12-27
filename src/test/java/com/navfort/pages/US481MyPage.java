package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US481MyPage extends BasePage{

    public US481MyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Activities")
    public WebElement activeties;

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEvent;



}
