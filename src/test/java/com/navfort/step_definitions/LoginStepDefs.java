package com.navfort.step_definitions;

import com.navfort.pages.LoginPage;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);

    }
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    }
    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager85","UserUser123");
    }
    @Then("user should be able to see {int} modules")
    public void user_should_be_able_to_see_modules(Integer int8) {

    }
    @When("user enters the sales manager information")
    public void userEntersTheSalesManagerInformation() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("salesmanager101","UserUser123");
    }
    @When("user enters the driver information")
    public void userEntersTheDriverInformation() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("user1","UserUser123");
    }

    @Then("user should be able to see {string} modules")
    public void userShouldBeAbleToSeeModules(String arg4) {

    }
}
