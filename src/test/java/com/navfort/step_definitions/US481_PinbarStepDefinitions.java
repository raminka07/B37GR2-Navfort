package com.navfort.step_definitions;

import com.navfort.pages.US481_PinbarPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US481_PinbarStepDefinitions {

    US481_PinbarPage US481PinbarPage = new US481_PinbarPage();

    @When("when user click the “Learn how to use this space” link")
    public void when_user_click_the_learn_how_to_use_this_space_link() {
        US481PinbarPage.pinbarLink.click();
    }
    @Then("users see the {string}")
    public void usersSeeThe(String text) {
        Assert.assertEquals("How To Use Pinbar", US481PinbarPage.firstLineText.getText());
    }
    @Then("users see the instructional {string}")
    public void usersSeeTheInstructional(String message) {
        BrowserUtils.waitForVisibility(US481PinbarPage.secondLineText,20);

        Assert.assertEquals("Use the pin icon on the right top corner of page to create fast access link in the pinbar.", US481PinbarPage.secondLineText.getText());
    }
    @Then("verify the image {string}.")
    public void verifyTheImage(String source) {
        String expectedSource="/bundles/oronavigation/images/pinbar-location.jpg";
        String actualSource= US481PinbarPage.image.getAttribute("src");

        Assert.assertTrue(actualSource.contains(expectedSource));
    }
}
