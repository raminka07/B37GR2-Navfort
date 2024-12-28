package com.navfort.step_definitions;


import com.navfort.pages.*;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US484_CalendarEventDescriptionStepDefinition  {


    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();
    CalendarEventPage calendarEventPage = new CalendarEventPage();


    @And("the user hover over {string} and selects {string} from the dropdown")
    public void theUserHoverOverAndSelectsFromTheDropdown(String tab, String module) {
        createCalendarEventPage.navigateToModule(tab,module);
    }



    CalendarEventPage activitiesPage = new CalendarEventPage();

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String createCalendarEvent) {
        BrowserUtils.waitForVisibility(activitiesPage.createCalendarEvantBtn,800);
        activitiesPage.createCalendarEvantBtn.click();
    }


    CreateCalendarEventPage createEventPage = new CreateCalendarEventPage();

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
