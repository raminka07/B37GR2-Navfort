package com.navfort.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US481_VehiclePage extends BasePage{

  WebDriver driver;

    @FindBy(xpath = "//table[@class='grid']//input[@type='checkbox']")
    public List<WebElement> checkboxes;

   @FindBy(xpath = "//table[@class='grid']//input[@type=checkbox'][1]")
    public WebElement selectAllCheckbox;

    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    public void Login(String userNameStr, String passwordStr){
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }


    public US481_VehiclePage() {
        PageFactory.initElements(driver, this);
    }
    //Navigate to the Vehicle page
    public void navigateToVehiclesPage() {
        driver.get("https://qa.vytrack.com/entity/Extend_Entity_Carreservation");
    }
    // verify all checkboxes are unchecked
    public boolean areAllCheckboxesUnchecked(){
        for(WebElement checkbox : checkboxes){
            if (checkbox.isSelected()){
                return  false;
            }
        }
        return true;
    }
    // Select the "Select All" checkbox
    public void setSelectAllCheckbox(){
        if(!selectAllCheckbox.isSelected()){
            selectAllCheckbox.click();
        }
    }
    //Verify all checkboxes are selected
    public boolean areAllCarsSelected(){
        for (WebElement checkbox : checkboxes){
            if (!checkbox.isSelected()){
                return false;
            }
        }
        return true;
    }
    // Select a specific car by index
    public void selectCarByIndex(int index) {
        WebElement checkbox = checkboxes.get(index - 1); // Adjust for zero - based index
        if (!checkbox.isSelected()){
            checkbox.click();
        }
    }
    // Verify a specific car is selected
    public boolean isSpecificCarSelected (int index) {
        WebElement checkbox = checkboxes.get(index - 1); // Adjust for zero based index
        return checkbox.isSelected();
    }
}
