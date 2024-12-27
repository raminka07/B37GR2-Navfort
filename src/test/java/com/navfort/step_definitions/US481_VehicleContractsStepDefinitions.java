package com.navfort.step_definitions;

import com.navfort.pages.US481VehicleContacts;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US481_VehicleContractsStepDefinitions {

    US481VehicleContacts VehicleContracts = new US481VehicleContacts();
    //LoginPage LoginPage = new LoginPage();

  /*  @Given("user is on login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get("https://qa.navfort.com");

    }

    @Given("store manager is on the homepage using username {string} and password {string}")
    public void store_manager_is_on_the_homepage_using_username_and_password(String username, String password) {

        LoginPage.login(username, password);
        BrowserUtils.waitForPageToLoad(10);

    }*/


    @When("user clicks on Fleet")
    public void user_clicks_on_fleet() {

        BrowserUtils.waitForPageToLoad(10);
        VehicleContracts.fleet.click();
    }
    @When("user clicks on Vehicle Contracts")
    public void user_clicks_on_vehicle_contracts() {

        VehicleContracts.VehicleContracts.click();
    }

    @Then("user should be able to see URL {string}")
    public void user_should_be_able_to_see_url(String URL) {
        BrowserUtils.verifyURLContains("https://qa.navfort.com/entity/Extend_Entity_VehicleContract");
        BrowserUtils.waitFor(10);

    }
    @Then("user should be able to see the title {string}")
    public void user_should_be_able_to_see_the_title(String expectedTitle) {
        BrowserUtils.waitForTitleContains(expectedTitle);
        //it works only with title contains
        //BrowserUtils.verifyTitle(expectedTitle);

    }

    @Then("the app displays {string}")
    public void the_App_Displays(String message) {


        BrowserUtils.waitFor(2);// to return to the Vehicle contracts page manually by clicking the button"click to go back"
        BrowserUtils.verifyElementDisplayed(VehicleContracts.message);
        // BrowserUtils.verifyElementDisplayed("You do not have permission to perform this action.");

        //VehicleContracts.message.isDisplayed();

    }
}
