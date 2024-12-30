package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFiltersPage {
    public ManageFiltersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


@FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li[6]")
    public WebElement marketingMenu;

    @FindBy(xpath = "(//span[.='Campaigns'])[1]")
    public WebElement  campaignsLink;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
public WebElement filtersMark;

@FindBy(xpath = "//select[@data-action='add-filter-select']")
    public WebElement manageFiltersButton;


}
