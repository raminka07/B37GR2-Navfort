package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage {

    public PinbarPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Learn how to use this space")
    public WebElement pinbarLink;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement firstLineText;

    @FindBy(xpath = "(//p)[1]")
    public WebElement secondLineText;

    @FindBy(xpath = "//img")
    public WebElement image;
}
