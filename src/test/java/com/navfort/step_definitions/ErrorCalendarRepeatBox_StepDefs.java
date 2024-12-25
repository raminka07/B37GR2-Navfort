package com.navfort.step_definitions;

import com.navfort.pages.BasePage;
import com.navfort.pages.CalendarRepeatEveryPage;
import com.navfort.pages.LoginPage;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class ErrorCalendarRepeatBox_StepDefs extends BasePage{
    LoginPage loginPage = new LoginPage();
    CalendarRepeatEveryPage calendarRepeatEveryPage = new CalendarRepeatEveryPage();
    Actions actions = new Actions(Driver.getDriver());

    @And("user clicks on {string} tab and {string} module")
    public void userClicksOnTabAndModule(String tabName, String moduleName) {
        navigateToModule(tabName, moduleName);
    }
    @And("user clicks on Create Calendar event button")
    public void userClicksOnCreateCalendarEventButton() {
        calendarRepeatEveryPage.createCalendarEvent.click();
    }

    @And("user checks repeat every checkbox")
    public void userChecksRepeatEveryCheckbox() {
        calendarRepeatEveryPage.repeatCheckBox.click();
    }

    @And("user enters invalid {string} in the input area")
    public void userEntersInvalidInTheInputArea(String number) {
        actions.doubleClick(calendarRepeatEveryPage.repeatInput).perform();
        calendarRepeatEveryPage.repeatInput.sendKeys(number);
        actions.click(calendarRepeatEveryPage.additionalHeader).perform();
    }

    @Then("user should see {string} message for negative value")
    public void userShouldSeeMessageForNegativeValue(String negativeInputMessage) {
        String actual = calendarRepeatEveryPage.negativeErrorMessage.getText();
        System.out.println("actual = " + actual);
        Assert.assertEquals("Verification did not pass!", negativeInputMessage, actual);
    }

    @Then("user should see {string} message for more than value")
    public void userShouldSeeMessageForMoreThanValue(String moreThanInputMessage) {
        String actual = calendarRepeatEveryPage.moreThanErrorMessage.getText();
        Assert.assertEquals("Verification did not pass!", moreThanInputMessage, actual);
    }




}


