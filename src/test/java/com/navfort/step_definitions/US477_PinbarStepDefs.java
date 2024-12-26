package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.pages.PinbarPage;
import com.navfort.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US477_PinbarStepDefs {

    PinbarPage pinbarPage = new PinbarPage();
    @When("user click the “Learn how to use this space” link")
    public void user_click_the_learn_how_to_use_this_space_link() {
        pinbarPage.pinbarLink.click();
    }
    @Then("user see the text {string}")
    public void user_see_the_text(String string) {
        Assert.assertEquals("How To Use Pinbar",pinbarPage.firstLineText.getText());
    }
    @Then("user see the instructional message")
    public void user_see_the_instructional_message() {
        Assert.assertEquals("Use the pin icon on the right top corner of page to create fast access link in the pinbar.",pinbarPage.secondLineText.getText());
    }


    @Then("verify the image source.")
    public void verifyTheImageSource() {
        String expectedSource="/bundles/oronavigation/images/pinbar-location.jpg";
        String actualSource=pinbarPage.image.getAttribute("src");


        Assert.assertTrue(actualSource.contains(expectedSource));
    }
}
