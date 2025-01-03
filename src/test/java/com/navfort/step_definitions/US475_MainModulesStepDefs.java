package com.navfort.step_definitions;
import com.navfort.pages.MainModulesPage;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Arrays;

public class US475_MainModulesStepDefs {
    private final MainModulesPage mainModulesPage = new MainModulesPage();
    private final WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    private void verifyModules(List<String> expectedModules, List<WebElement> actualElements) {
        wait.until(ExpectedConditions.visibilityOf(actualElements.get(0)));
        for (int i = 0; i < expectedModules.size(); i++) {
            Assert.assertEquals(expectedModules.get(i), actualElements.get(i).getText());
        }
    }

    @Then("user sees four modules: {string}, {string}, {string}, {string}")
    public void user_sees_modules(String m1, String m2, String m3, String m4) {
        verifyModules(
                Arrays.asList(m1, m2, m3, m4),
                Arrays.asList(mainModulesPage.fleetBtn, mainModulesPage.customersBtn,
                        mainModulesPage.activitiesBtn, mainModulesPage.systemBtn)
        );
    }

    @Then("user sees eight modules: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_sees_modules(String m1, String m2, String m3, String m4, String m5, String m6, String m7, String m8) {
        verifyModules(
                Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m8),
                Arrays.asList(mainModulesPage.dashboardBtn, mainModulesPage.fleetBtn,
                        mainModulesPage.customersBtn, mainModulesPage.salesBtn,
                        mainModulesPage.activitiesBtn, mainModulesPage.marketingBtn,
                        mainModulesPage.reportsBtn, mainModulesPage.systemBtn)
        );
    }
}