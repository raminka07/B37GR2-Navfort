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

    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginButton;


    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetLocation;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[4]")
    public WebElement vehicleOdometer;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement DriverFleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[2]")
    public WebElement DriverVehicleOdo;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement defaultPage;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPage;



}

