package com.navfort.step_definitions;

import com.navfort.pages.CalenderEventPage;
import com.navfort.pages.CreateCalenderEventPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US484_CalenderEventDescriptionStepDefs {

    CreateCalenderEventPage createCalendarEventPage = new CreateCalenderEventPage();
    CalenderEventPage calendarEventPage = new CalenderEventPage();


    @And("the user hover over {string} and selects {string} from the dropdown")
    public void theUserHoverOverAndSelectsFromTheDropdown(String tab, String module) {
        createCalendarEventPage.navigateToModule(tab,module);
    }



    CalenderEventPage activitiesPage = new CalenderEventPage();

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String createCalendarEvent) {
        BrowserUtils.waitForVisibility(activitiesPage.createCalendarEvantBtn,800);
        activitiesPage.createCalendarEvantBtn.click();
    }

    CreateCalenderEventPage createEventPage = new CreateCalenderEventPage();

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
