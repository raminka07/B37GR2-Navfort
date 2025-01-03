package com.navfort.step_definitions;

import com.navfort.pages.CustomerInfoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US486_CustomersInfoAccountsPage_StepDefs {
    CustomerInfoPage customersInfoPage = new CustomerInfoPage();
    @And("user clicks on filter icon")
    public void userClicksOnFilterIcon() {
        customersInfoPage.filterIcon.click();
    }

    @Then("user should see following filter items")
    public void userShouldSeeFollowingFilterItems(List<String> filterItems) {
        List<String> actualFilterItems = new ArrayList<>();
        for (WebElement each : customersInfoPage.customersInfo) {
            actualFilterItems.add(each.getText().replaceAll(":.*", "").trim());
        }
        System.out.println(actualFilterItems);
        System.out.println(filterItems);
        Assert.assertEquals("Assertion failed!", filterItems, actualFilterItems);
    }
}
