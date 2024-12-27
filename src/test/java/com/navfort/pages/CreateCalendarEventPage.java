package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage extends BasePage {

    public CreateCalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(name = "oro_calendar_event_form[title]")
    public WebElement titleBox;

    @FindBy(xpath = "//iframe[contains(@id, 'oro_calendar_event_form_description')]")
    public WebElement iframe;

    @FindBy (xpath="//body[@id='tinymce']")
    public WebElement txtBox;

    public void writeTxt(String msg){
        Driver.getDriver().switchTo().frame(iframe);
        txtBox.click();
        txtBox.sendKeys(msg);
    }

    @FindBy(xpath = "//body[@id='tinymce']//p")
    public WebElement displayTxt;

    public String displayText(){
        return displayTxt.getText();
    }

    @FindBy(name = "date_selector_oro_calendar_event_form_start-uid-676e15d5c1e2a")
    public WebElement startDate;


    @FindBy(xpath = "//*[contains(@id, 'recurrence-repeat-view')]")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//span[.='day(s)']/preceding-sibling::input[1]")
    public WebElement repeatEveryInput;

    @FindBy(xpath = "//h4[.='Additional']")
    public WebElement additionalHeader;

    @FindBy(xpath = "(//span[.='The value have not to be less than 1.'])[3]")
    public WebElement negativeErrorMessage;

    @FindBy(xpath = "(//span[.='The value have not to be more than 99.'])[3]")
    public WebElement moreThanErrorMessage;

}
