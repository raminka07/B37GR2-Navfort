package com.navfort.step_definitions;

import com.navfort.pages.VehiclesModelPages;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class VehiclesModelSteps {

    VehiclesModelPages vehiclesModelPages = new VehiclesModelPages();

    @Given("the user relocated the Fleet dropdown")
    public void the_user_relocated_the_fleet_dropdown() {
        vehiclesModelPages.fleet.click();
    }

    @Given("the user navigates the Vehicles Model page")
    public void the_user_navigates_the_vehicles_model_page() {
        vehiclesModelPages.vehiclesModel.click();

    }

    @Then("the user should see the fallowing vehicle models:")
    public void the_user_should_see_the_fallowig(List<String> expectedVehiclesModel) {

        List<String> actualVehicleModel = BrowserUtils.getElementsText(vehiclesModelPages.vehiclesModelList);

        Assert.assertEquals(expectedVehiclesModel, actualVehicleModel);
    }
    @Then("you should get a message {string}")
    public void you_should_get_a_message(String expectedMessage) {

            String actualMessage = vehiclesModelPages.noPermission.getText();

            Assert.assertEquals(expectedMessage, actualMessage);
        }


    }




