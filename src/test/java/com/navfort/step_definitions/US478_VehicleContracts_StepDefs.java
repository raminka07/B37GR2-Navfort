package com.navfort.step_definitions;

import com.navfort.pages.VehicleContacts;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US478_VehicleContracts_StepDefs {

    VehicleContacts vc = new VehicleContacts();

    @When("user navigates to Fleet and clicks on Vehicle Contracts")
    public void userNavigatesToFleetAndClicksOnVehicleContracts() {
        BrowserUtils.waitForPageToLoad(10);
        //vc.navigateToModule("Fleet", "Vehicle Contracts");

        vc.fleet.click();
        vc.VehCont.click();
    }

    @Then("user should be able to see URL {string}")
    public void user_should_be_able_to_see_url(String URL) {

        BrowserUtils.verifyURLContains("https://qa.navfort.com/entity/Extend_Entity_VehicleContract");
        BrowserUtils.waitFor(10);

    }
    @Then("user should be able to see the title {string}")
    public void user_should_be_able_to_see_the_title(String expectedTitle) {

       BrowserUtils.sleep(20);
       BrowserUtils.verifyTitle(expectedTitle);

    }

    @Then("the app displays {string}")
    public void the_App_Displays(String message) {

        if (vc.errorPageMessage.isDisplayed()) {
            vc.clickBack.click();
        } else {

            vc.message.isDisplayed();
        }
    }


}
