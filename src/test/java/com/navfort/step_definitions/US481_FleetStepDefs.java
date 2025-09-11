package com.navfort.step_definitions;

import com.navfort.pages.US481_VehiclePage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class US481_FleetStepDefs{

    US481_VehiclePage vehiclePage = new US481_VehiclePage();

    int globalCarRow;
    @Then("the user should be able to see options as {string}")
    public void the_user_should_be_able_to_see_options_as(String options) {

        String[] optionArray = options.split(",");
        List<String> strings = Arrays.stream(optionArray).map(k -> k.substring(0, 1).toUpperCase() + k.substring(1)).collect(Collectors.toList());

        vehiclePage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.sleep(5);
        vehiclePage.checkThreeDots(strings);


    }


    @Then("the user should be able to see all the checkboxes as {string}")
    public void the_user_should_be_able_to_see_all_the_checkboxes_as_unchecked(String unchecked) {
        vehiclePage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.sleep(5);
        vehiclePage.checkAllCheckboxes(unchecked);
    }

    @When("the user select the all cars")
    public void the_user_select_the_all_cars() {
        vehiclePage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(10);
        vehiclePage.check_all.click();
    }
    @When("the user sees {string} to {string}")
    public void theUserSesT(String role, String unchecked) {
        vehiclePage.checkAllCheckboxes(toString());
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertEquals(role, unchecked.isBlank());

    }

    @When("the user select any car {int}")
    public void the_user_select_any_car(Integer row) {
        vehiclePage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(10);
        globalCarRow=row;
        vehiclePage.selectCar(row);
    }
    @Then("the user should be able to see car as {string}")
    public void the_user_should_be_able_to_see_car_as(String isChecked) {

        vehiclePage.verifyCarIsSelected(globalCarRow,isChecked);

    }


}
