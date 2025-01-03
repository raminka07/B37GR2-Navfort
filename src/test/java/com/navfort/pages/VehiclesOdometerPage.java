package com.navfort.pages;

import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesOdometerPage {

    public VehiclesOdometerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement defaultPage;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPage;

}

