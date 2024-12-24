package com.navfort.step_definitions;


import com.navfort.pages.*;
import com.navfort.utilities.BrowserUtils;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US484StepDefinition {

    LoginPage loginPage = new LoginPage();


    @Given("the user logs in with username {string} and password {string}")
    public void theUserLogsInWithUsernameAndPassword(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        loginPage.login(username, password);
    }



    US484BasePage basePage = new US484BasePage();

    @And("the user hover over {string} and selects {string} from the dropdown")
    public void theUserHoverOverAndSelectsFromTheDropdown(String modulebtn, String calendarEvent) {
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
    @When("the user types {string} into the {string} area")
    public void the_user_types_into_the_field(String msg, String txtBox) {
        BrowserUtils.waitForVisibility(createEventPage.iframe,300);
        createEventPage.writeTxt(msg);
        BrowserUtils.sleep(3);
    }



    @Then("the {string} field display {string}")
    public void the_field_display(String txtArea, String msg) {

        String actualText = createEventPage.displayText();
        Assert.assertEquals("Displayed text is different from what was writed",msg,actualText);


    }

}
