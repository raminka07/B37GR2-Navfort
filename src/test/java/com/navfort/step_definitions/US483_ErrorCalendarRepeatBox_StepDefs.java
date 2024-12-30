package com.navfort.step_definitions;

import com.navfort.pages.CalendarEventPage;
import com.navfort.pages.CreateCalendarEventPage;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US483_ErrorCalendarRepeatBox_StepDefs {
    Actions actions = new Actions(Driver.getDriver());

    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();
    CalendarEventPage calendarEventPage = new CalendarEventPage();


    @And("user clicks on {string} tab and {string} module")
    public void userClicksOnTabAndModule(String tabName, String moduleName) {
        createCalendarEventPage.navigateToModule(tabName, moduleName);
    }
    @And("user clicks on Create Calendar event button")
    public void userClicksOnCreateCalendarEventButton() {
        calendarEventPage.createCalendarEvantBtn.click();
    }

    @And("user checks repeat every checkbox")
    public void userChecksRepeatEveryCheckbox() {
        createCalendarEventPage.repeatCheckBox.click();
    }

    @And("user enters invalid {string} in the input area")
    public void userEntersInvalidInTheInputArea(String number) {
        createCalendarEventPage.repeatEveryInput.clear();
        createCalendarEventPage.repeatEveryInput.sendKeys(number );
        createCalendarEventPage.repeatEveryInput.sendKeys(Keys.TAB);
    }


    @Then("user should see {string} message")
    public void userShouldSeeMessage(String message) {
        BrowserUtils.sleep(3);
        String actual= createCalendarEventPage.errorMessage.getText();
        Assert.assertEquals("Verification did not pass!", message, actual);
    }
}


