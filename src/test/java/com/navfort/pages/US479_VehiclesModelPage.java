package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US479_VehiclesModelPage {

    public US479_VehiclesModelPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//span[contains(@class, 'title-level-1') and contains(text(), 'Fleet')]")
    public WebElement fleet;


    @FindBy(xpath = "//span[contains(@class, 'title-level-2') and text()='Vehicles Model']")
    public WebElement vehiclesModel;


    @FindBy(xpath = "//td[@data-column-label='Model Name']")
    public List<WebElement> vehiclesModelList;

    @FindBy(xpath = " //div[@class='message' and text()='You do not have permission to perform this action.']")
    public WebElement noPermission;

}
