package com.navfort.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US481_VehiclePage extends LoginPage{

  WebDriver driver;

    @FindBy(css = "table#vehicleTable input[@type='checkbox']")
    public List<WebElement> checkboxes;

   @FindBy(css = "table#vehivleTable input[@type='checkbox']:first-of-type")
    public WebElement selectAllCheckbox;

    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;


    public US481_VehiclePage() {
        PageFactory.initElements(driver, this);
    }
    public boolean areAllCheckboxesUnchecked(){
        for(WebElement checkbox : checkboxes){
            if (checkbox.isSelected()){
                return  false;
            }
        }
        return true;
    }
    public void setSelectAllCheckbox(){
        if(!selectAllCheckbox.isSelected()){
            selectAllCheckbox.click();
        }
    }
    public boolean areAllCarsSelected(){
        for (WebElement checkbox : checkboxes){
            if (!checkbox.isSelected()){
                return false;
            }
        }
        return true;
    }
    public void selectCarByIndex(int index) {
        WebElement checkbox = checkboxes.get(index - 1); // Adjust for zero - based index
        if (!checkbox.isSelected()){
            checkbox.click();
        }
    }
    public boolean isSpecificCarSelected (int index) {
        WebElement checkbox = checkboxes.get(index - 1); // Adjust for zero based index
        return checkbox.isSelected();

    }
}
