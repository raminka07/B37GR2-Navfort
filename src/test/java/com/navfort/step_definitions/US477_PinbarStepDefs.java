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



    @When("when user click the “Learn how to use this space” link")
    public void when_user_click_the_learn_how_to_use_this_space_link() {
      pinbarPage.pinbarLink.click();
    }

    @Then("users see the {string}")
    public void usersSeeThe(String text) {
        Assert.assertEquals("How To Use Pinbar",pinbarPage.firstLineText.getText());
    }

    @Then("users see the instructional {string}")
    public void usersSeeTheInstructional(String message) {
        BrowserUtils.waitForVisibility(pinbarPage.secondLineText,20);

        Assert.assertEquals("Use the pin icon on the right top corner of page to create fast access link in the pinbar.",pinbarPage.secondLineText.getText());
    }




    @Then("verify the image {string}.")
    public void verifyTheImage(String source) {
        String expectedSource="/bundles/oronavigation/images/pinbar-location.jpg";
        String actualSource=pinbarPage.image.getAttribute("src");


        Assert.assertTrue(actualSource.contains(expectedSource));
    }
}
