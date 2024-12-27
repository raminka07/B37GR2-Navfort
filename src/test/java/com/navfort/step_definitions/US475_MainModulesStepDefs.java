package com.navfort.step_definitions;
import com.navfort.pages.MainModulesPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class US475_MainModulesStepDefs {

    MainModulesPage mainModulesPage = new MainModulesPage();


    @Then("user sees {int} modules: {string}, {string}, {string}, {string}")
    public void user_sees_modules(Integer int1, String expectedModule1, String expectedModule2, String expectedModule3, String expectedModule4) {

        WebDriver driver = Driver.getDriver();

        //BrowserUtils.waitForVisibility(mainModulesPage.fleetBtn, 10);

        WebDriverWait wait = new WebDriverWait( Driver.getDriver(), Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOf(mainModulesPage.fleetBtn));

        String actualModule1 = mainModulesPage.fleetBtn.getText();
        String actualModule2 = mainModulesPage.customersBtn.getText();
        String actualModule3 = mainModulesPage.activitiesBtn.getText();
        String actualModule4 = mainModulesPage.systemBtn.getText();

        Assert.assertEquals(expectedModule1, actualModule1);
        Assert.assertEquals(expectedModule2, actualModule2);
        Assert.assertEquals(expectedModule3, actualModule3);
        Assert.assertEquals(expectedModule4, actualModule4);
    }



}
