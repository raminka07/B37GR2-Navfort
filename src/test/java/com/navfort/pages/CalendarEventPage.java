package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventPage {

    public CalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEvent;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvantBtn;
}
