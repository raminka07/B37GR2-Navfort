package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecurringCalendarEventPage {

    public RecurringCalendarEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement calendarEventButton;

    @FindBy(xpath = "(//span[.='This value should not be blank.'])[3]")
    public WebElement blankWarningMessage;
}
