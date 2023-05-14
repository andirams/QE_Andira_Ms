package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.RegisterScreen;
import test.automation.pages.LoginScreen;

public class RegisterSteps {
    
    @Steps
    RegisterScreen registerScreen;

    @Steps
    LoginScreen loginScreen;

    @Given("new user on the login page")
    public void onTheLoginPage(){
        loginScreen.isOnPage();

    }
    @When("new user click register link")
    public void clickRegisterLink(){
        registerScreen.clickRegisterLink();

    }
    @And("new user input name on name field")
    public void inputNameField(){
        registerScreen.inputNameField();

    }

    @And("new user input email on email field")
    public void inputEmailField(){
        registerScreen.inputEmailField();

    }

    @And("new user input password on password field")
    public void inputPasswordField(){
        registerScreen.inputPasswordField();

    }

    @And("new user confirm password")
    public void confirmPasswordField(){
        registerScreen.confirmPasswordField();

    }

    @And("new user click register button")
    public void clickRegisterButton(){
        registerScreen.clickRegisterButton();

    }

    @Then("new user see succes message {string}")
    public void validateSuccesMessage(String message){
        String actual = registerScreen.validateSuccesMessage();
        Assert.assertEquals(actual,message);

    }
}
