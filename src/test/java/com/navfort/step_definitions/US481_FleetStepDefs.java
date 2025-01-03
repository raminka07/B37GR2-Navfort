package com.navfort.step_definitions;

import com.navfort.pages.US481_VehiclePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US481_FleetStepDefs extends US481_VehiclePage{

    US481_VehiclePage vehiclesPage = new US481_VehiclePage();

    @Given("the user is on the vehicles page")
    public void the_user_is_on_the_vehicles_page() {


    }
    @Then("all checkboxes should be unchecked")
    public void all_checkboxes_should_be_unchecked() {
        Assert.assertTrue("Not all checkboxes are unchecked",vehiclesPage.areAllCheckboxesUnchecked());

    }

    @When("the user selects the first checkbox")
    public void the_user_selects_the_first_checkbox() {
        vehiclesPage.selectAllCheckbox.isSelected();

    }
    @Then("all cars should be selected")
    public void all_cars_should_be_selected() {

        Assert.assertTrue("Not all cars are selected", vehiclesPage.areAllCarsSelected());

    }

    @When("the user selects a specific car with index {int}")
    public void the_user_selects_a_specific_car_with_index(Integer index) {
        vehiclesPage.selectCarByIndex(index);

    }
    @Then("only the checkbox for the selected car should be checked")
    public void only_the_checkbox_for_the_selected_car_should_be_checked() {
        Assert.assertTrue(vehiclesPage.isSpecificCarSelected(3));

    }


}
