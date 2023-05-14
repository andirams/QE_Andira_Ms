package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginScreen;


public class LoginSteps {
    @Steps
    LoginScreen loginScreen;

    @Given("android user on landing screen")
    public void androidUserOnLandingScreen() {
        boolean actual = loginScreen.isOnPage();
        Assert.assertTrue(actual);
    }

    @When("android user input unregistered email")
    public void androidUserInputUnregisteredEmail() {
        String email = "adi" + "@gmail.com";
        loginScreen.inputEmail(email);
    }

    @And("android user tap login button")
    public void androidUserTapLoginButton() {
        loginScreen.tapLoginButton();
    }

    @And("android user input password")
    public void androidUserInputPassword() {
        loginScreen.inputPassword("password");
    }

    @Then("android user see {string} message")
    public void androidUserSeeMessage(String message) {
        String actual = loginScreen.getToastMessage();
        Assert.assertEquals(actual, message);
    }
}
