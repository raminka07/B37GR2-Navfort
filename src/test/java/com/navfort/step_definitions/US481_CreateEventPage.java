package com.navfort.step_definitions;

import com.navfort.pages.US481_ActivitiesPage;
import com.navfort.pages.US481_MyPage;
import com.navfort.pages.US481_CalenderEventPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US481_CreateEventPage extends US481_CalenderEventPage {

    US481_MyPage basePage = new US481_MyPage();

    @And("the user hover over {string} and selects {string} from the dropdown")
    public void theUserHoverOverAndSelectsFromTheDropdown(String modulebtn, String calendarEvent) {
        BrowserUtils.waitForVisibility(basePage.activities,500);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(basePage.activities).perform();
        BrowserUtils.sleep(3);
        actions.moveToElement(basePage.calendarEvent).click().perform();
    }

    US481_ActivitiesPage activitiesPage = new US481_ActivitiesPage();

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String createCalendarEvent) {
        BrowserUtils.waitForVisibility(activitiesPage.createCalendarEvantBtn,800);
        activitiesPage.createCalendarEvantBtn.click();
    }

    US481_CreateEventPage createEventPage = new US481_CreateEventPage();

    @When("the user types {string} into the text area")
    public void the_user_types_into_the_field(String msg) {
        BrowserUtils.waitForVisibility(createEventPage.iframe,300);
        createEventPage.writeTxt(msg);
        BrowserUtils.sleep(3);
    }
    @Then("the Description field display {string}")
    public void the_field_display(String msg) {

        String actualText = createEventPage.displayText();
        Assert.assertEquals("Displayed text is different from what was written",msg,actualText);


    }

}
