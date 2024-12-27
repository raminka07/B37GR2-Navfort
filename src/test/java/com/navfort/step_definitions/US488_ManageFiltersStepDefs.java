package com.navfort.step_definitions;

import com.navfort.pages.ManageFiltersPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US488_ManageFiltersStepDefs {
    ManageFiltersPage manageFiltersPage=new ManageFiltersPage();
    @When("the user clicks the Campaigns link from the Marketing menu")
    public void theUserClicksTheCampaignsLinkFromTheMarketingMenu() {
        BrowserUtils.waitForVisibility(manageFiltersPage.marketingMenu,10);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(manageFiltersPage.marketingMenu).perform();

        BrowserUtils.waitForClickablility(manageFiltersPage.campaignsLink,10);
        manageFiltersPage.campaignsLink.click();

    }

    @When("the user clicks the filters mark")
    public void the_user_clicks_the_filters_mark() {
        BrowserUtils.waitForVisibility(manageFiltersPage.filtersMark,10);
        if (!manageFiltersPage.filtersMark.isSelected()) {
            manageFiltersPage.filtersMark.click();
        }
    }

    @Then("Verify that Store and Sales managers see all 5 filter options as checked by default.")
    public void verify_that_store_and_sales_managers_see_all_filter_options_as_checked_by_default() {
        Select manageFiltersDropdown=new Select(manageFiltersPage.manageFiltersButton);
       List<WebElement>  allDefaultSelectedOptions= manageFiltersDropdown.getAllSelectedOptions();
      int actualSelectedOptionsSize= allDefaultSelectedOptions.size();
      int expectedSelectedOptionsSize= 5;
        Assert.assertTrue(expectedSelectedOptionsSize==actualSelectedOptionsSize);
    }


    @Then("Verify a single filter option can be unchecked")
    public void verifyASingleFilterOptionCanBeUnchecked() {
        Select manageFiltersDropdown=new Select(manageFiltersPage.manageFiltersButton);
        // Make the <select> element visible using JavaScript
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].style.display='block';", manageFiltersDropdown);
        manageFiltersDropdown.deselectByVisibleText("Name");

        List<WebElement>  allSelectedOptions= manageFiltersDropdown.getAllSelectedOptions();
        Assert.assertTrue(allSelectedOptions.size()==4);
    }

    @Then("Verify multiple filter options can be unchecked")
    public void verifyMultipleFilterOptionsCanBeUnchecked() {
        Select manageFiltersDropdown=new Select(manageFiltersPage.manageFiltersButton);
         ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].style.display='block';", manageFiltersDropdown);
        manageFiltersDropdown.deselectByVisibleText("Name");
        manageFiltersDropdown.deselectByVisibleText("Budget");
        manageFiltersDropdown.deselectByVisibleText("Code");
        manageFiltersDropdown.deselectByVisibleText("End Date");

        List<WebElement>  allSelectedOptions= manageFiltersDropdown.getAllSelectedOptions();
        Assert.assertTrue(allSelectedOptions.size()==1);
    }

    @Then("Verify all filter options can be unchecked")
    public void verifyAllFilterOptionsCanBeUnchecked() {
        Select manageFiltersDropdown=new Select(manageFiltersPage.manageFiltersButton);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].style.display='block';", manageFiltersDropdown);
        manageFiltersDropdown.deselectByVisibleText("Name");
        manageFiltersDropdown.deselectByVisibleText("Budget");
        manageFiltersDropdown.deselectByVisibleText("Code");
        manageFiltersDropdown.deselectByVisibleText("End Date");
        manageFiltersDropdown.deselectByVisibleText("Start Date");
        List<WebElement>  allSelectedOptions= manageFiltersDropdown.getAllSelectedOptions();
        Assert.assertTrue(allSelectedOptions.size()==0);
    }


}
