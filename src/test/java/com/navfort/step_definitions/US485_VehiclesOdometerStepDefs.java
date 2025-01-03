package com.navfort.step_definitions;

import com.navfort.pages.BasePage;
import com.navfort.pages.LoginPage;
import com.navfort.pages.VehiclesOdometerPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class US485_VehiclesOdometerStepDefs extends BasePage {

    VehiclesOdometerPage vehiclesOdometerPage = new VehiclesOdometerPage();
    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


//    @And("I click on the Vehicle Odometer")
//    public void iClickOnTheVehicleOdometerModule() {

    /// /        vehiclesOdometerPage.fleetLocation.click();
    /// /        BrowserUtils.waitFor(2);
    /// /        vehiclesOdometerPage.vehicleOdometer.click();
//        navigateToModule();
//
//    }


//    @And("I click on the Vehicle Odometer as a driver")
//    public void iNavigateToTheVehicleOdometerModuleAsADriver() {
//        vehiclesOdometerPage.DriverFleet.click();
//        vehiclesOdometerPage.DriverVehicleOdo.click();
//    }

    @When("user enter the username {string} and password {string}")
    public void userEnterTheUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);

    }

    @Then("I should see the error message: {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage, vehiclesOdometerPage.errorMessage.getText());
    }


    @When("driver enter the username {string} and password {string}")
    public void driverEnterTheUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the default page number should be {string}")
    public void theDefaultPageNumberShouldBe(String number) {

        Assert.assertEquals(number, vehiclesOdometerPage.defaultPage.getAttribute("value"));

    }

    @Then("the default View Per Page should be {string}")
    public void theDefaultViewPerPageShouldBe(String number) {

        Assert.assertEquals(number, vehiclesOdometerPage.viewPage.getText());

    }
}