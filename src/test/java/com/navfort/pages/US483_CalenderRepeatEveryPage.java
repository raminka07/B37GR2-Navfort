package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US483_CalenderRepeatEveryPage {

    public US483_CalenderRepeatEveryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement repeatInput;

    @FindBy(xpath = "//h4[.='Additional']")
    public WebElement additionalHeader;

    @FindBy(xpath = "(//span[.='The value have not to be less than 1.'])[3]")
    public WebElement negativeErrorMessage;

    @FindBy(xpath = "(//span[.='The value have not to be more than 99.'])[3]")
    public WebElement moreThanErrorMessage;


}
