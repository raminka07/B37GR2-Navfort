package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage {
    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='title title-level-1'][contains(text(), ' Fleet')]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//*[@class='title title-level-1'][contains(text(), ' Customers')]")
    public WebElement customersBtn;

    @FindBy(xpath = "//*[@class='title title-level-1'][contains(text(), 'Activities')]")
    public WebElement activitiesBtn;

    @FindBy(xpath = "//*[@class='title title-level-1'][contains(text(), 'System')]")
    public WebElement systemBtn;

}
