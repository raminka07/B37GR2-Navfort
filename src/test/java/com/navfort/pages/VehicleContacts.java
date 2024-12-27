package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContacts {

    public VehicleContacts() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Fleet")
    public WebElement fleet;

    @FindBy(linkText = "Vehicle Contracts")
    public WebElement VehicleContracts;

    //@FindBy(xpath ="//div[@class='message']")
    //public WebElement message;

    @FindBy(xpath =" //div[.='You do not have permission to perform this action.']")
    public WebElement message;

}
