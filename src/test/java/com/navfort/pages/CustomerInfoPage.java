package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CustomerInfoPage {


        public CustomerInfoPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//span[@class='filter-items']//div[@class='filter-item oro-drop']")
        public List<WebElement> customersInfo;

        @FindBy(xpath = "//a[@title='Filters']")
        public WebElement filterIcon;

}
