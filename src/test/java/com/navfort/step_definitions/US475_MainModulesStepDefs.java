package com.navfort.step_definitions;
import com.navfort.pages.MainModulesPage;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class US475_MainModulesStepDefs {

    MainModulesPage mainModulesPage = new MainModulesPage();


    @Then("user sees four modules: {string}, {string}, {string}, {string}")
    public void user_sees_modules(String expectedModule1, String expectedModule2, String expectedModule3, String expectedModule4) {

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







    @Then("user sees eight modules: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_sees_modules(String expectedModule1, String expectedModule2, String expectedModule3,
                                  String expectedModule4, String expectedModule5, String expectedModule6,
                                  String expectedModule7, String expectedModule8) {

        WebDriverWait wait = new WebDriverWait( Driver.getDriver(), Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOf(mainModulesPage.dashboardBtn));

        String actualModule1 = mainModulesPage.dashboardBtn.getText();
        String actualModule2 = mainModulesPage.fleetBtn.getText();
        String actualModule3 = mainModulesPage.customersBtn.getText();
        String actualModule4 = mainModulesPage.salesBtn.getText();
        String actualModule5 = mainModulesPage.activitiesBtn.getText();
        String actualModule6 = mainModulesPage.marketingBtn.getText();
        String actualModule7 = mainModulesPage.reportsBtn.getText();
        String actualModule8 = mainModulesPage.systemBtn.getText();


        Assert.assertEquals(expectedModule1, actualModule1);
        Assert.assertEquals(expectedModule2, actualModule2);
        Assert.assertEquals(expectedModule3, actualModule3);
        Assert.assertEquals(expectedModule4, actualModule4);
        Assert.assertEquals(expectedModule5, actualModule5);
        Assert.assertEquals(expectedModule6, actualModule6);
        Assert.assertEquals(expectedModule7, actualModule7);
        Assert.assertEquals(expectedModule8, actualModule8);
    }


}
