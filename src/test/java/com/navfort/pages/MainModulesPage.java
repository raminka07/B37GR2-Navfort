package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage {
    public MainModulesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //Dashboards
    @FindBy(xpath = "//*[@class='title title-level-1'][contains(text(), 'Dashboards')]")
    public WebElement dashboardBtn;

    //Fleet
    @FindBy(xpath = "//*[@class='title title-level-1'][contains(text(), 'Fleet')]")
    public WebElement fleetBtn;

    //Customers
    @FindBy(xpath = "//*[@class='title title-level-1' and contains(text(),'Customers')]")
    public WebElement customersBtn;

    //Sales
    @FindBy(xpath = "//*[@class='title title-level-1' and contains(text(),'Sales')]")
    public WebElement salesBtn;

    //Activities
    @FindBy(xpath = "//*[@class='title title-level-1' and contains(text(),'Activities')]")
    public WebElement activitiesBtn;

    //Marketing
    @FindBy(xpath = "//*[@class='title title-level-1' and contains(text(),'Marketing')]")
    public WebElement marketingBtn;

    //Reports & Segments
    @FindBy(xpath = "//*[@class='title title-level-1' and contains(text(),'Reports')]")
    public WebElement reportsBtn;

    //System
    @FindBy(xpath = "//*[@class='title title-level-1' and contains(text(),'System')]")
    public WebElement systemBtn;

}
