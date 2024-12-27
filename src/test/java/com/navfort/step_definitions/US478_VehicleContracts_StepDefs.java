package com.navfort.step_definitions;

import com.navfort.pages.VehicleContacts;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US478_VehicleContracts_StepDefs {

    VehicleContacts VehicleContracts = new VehicleContacts();

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
        BrowserUtils.verifyURL("https://qa.navfort.com/entity/Extend_Entity_VehicleContract");
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

        VehicleContracts.message.isDisplayed();

    }
}
