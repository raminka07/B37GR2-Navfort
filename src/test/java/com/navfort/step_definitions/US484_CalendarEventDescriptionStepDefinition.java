package com.navfort.step_definitions;


import com.navfort.pages.*;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US484_CalendarEventDescriptionStepDefinition {

    US484BasePage basePage = new US484BasePage();

    @And("the user hover over {string} and selects {string} from the dropdown")
    public void theUserHoverOverAndSelectsFromTheDropdown(String modulebtn, String calendarEvent) {
        BrowserUtils.waitForVisibility(basePage.activeties,500);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(basePage.activeties).perform();
        BrowserUtils.sleep(3);
        actions.moveToElement(basePage.calendarEvent).click().perform();


    }



    US484ActivitiesPage activitiesPage = new US484ActivitiesPage();

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String createCalendarEvent) {
        BrowserUtils.waitForVisibility(activitiesPage.createCalendarEvantBtn,800);
        activitiesPage.createCalendarEvantBtn.click();
    }


    US484CreateEventPage createEventPage = new US484CreateEventPage();

    @When("the user types {string} into the text area")
    public void the_user_types_into_the_field(String msg) {
        BrowserUtils.waitForVisibility(createEventPage.iframe,300);
        createEventPage.writeTxt(msg);
        BrowserUtils.sleep(3);
    }



    @Then("the Description field display {string}")
    public void the_field_display(String msg) {

        String actualText = createEventPage.displayText();
        Assert.assertEquals("Displayed text is different from what was writed",msg,actualText);


    }
}
