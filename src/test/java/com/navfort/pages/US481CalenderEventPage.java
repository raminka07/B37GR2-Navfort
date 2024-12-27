package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US481CalenderEventPage {

    public US481CalenderEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

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
}
