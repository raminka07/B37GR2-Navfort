package com.navfort.step_definitions;

import com.navfort.pages.BasePage;
import com.navfort.pages.CalendarEventPage;
import com.navfort.pages.CreateCalendarEventPage;
import com.navfort.pages.RecurringCalendarEventPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.swing.text.Utilities;

public class US482_RecurringCalendarEvent_StepDefs {

    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();
    RecurringCalendarEventPage recurringCalendarEventPage = new RecurringCalendarEventPage();


    @And("user clicks on {string} tab and {string} module.")
    public void user_clicks_on_tab_and_module(String tabName, String moduleName) {
        createCalendarEventPage.navigateToModule(tabName, moduleName);

    }

    @And("user clicks on Create Calendar event button.")
    public void user_clicks_on_create_calendar_event_button() {
        BrowserUtils.sleep(3);
        recurringCalendarEventPage.calendarEventButton.click();


    }

    @And("user checks repeat checkbox")
    public void user_checks_repeat_checkbox() {
        createCalendarEventPage.repeatCheckBox.click();


    }

    @Then("user should see the number “{int}” by default in the Repeat Every input option")
    public void user_should_see_the_number_by_default_in_the_repeat_every_input_option(Integer int1) {

        String actualValue = createCalendarEventPage.repeatEveryInput.getAttribute("value");
        System.out.println("actualValue = " + actualValue);

        String expectedValue = "1";

        Assert.assertEquals(actualValue, expectedValue);


    }
    @And("user cleared the Repeat Every field")
    public void user_cleared_the_repeat_every_field() {
        createCalendarEventPage.repeatEveryInput.clear();

    }

    @Then("user see the error message “This value should not be blank.”")
    public void user_see_the_error_message_this_value_should_not_be_blank() {
    String actualText = recurringCalendarEventPage.blankWarningMessage.getText();
        System.out.println("actualText = " + actualText);

        String expectedText = "This value should not be blank.";

        Assert.assertEquals(actualText,expectedText);

    }
}


