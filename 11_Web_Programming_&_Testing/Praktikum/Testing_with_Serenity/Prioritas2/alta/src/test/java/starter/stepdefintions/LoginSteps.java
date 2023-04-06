package starter.stepdefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the Sepulsa login page")
    public void onTheLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("I enter correct email")
    public void inputEmail() {
        loginPage.inputEmail("andiramahendra13@gmail.com");
    }

    @And("I enter correct password")
    public void inputPassword() {
        loginPage.inputPassword("mahendra13");
    }

    @And("I click on the Login button")
    public void clickSubmitButton() {
        loginPage.clickSubmitButton();
    }

    @Then("I should be redirected to my Sepulsa account dashboard")
    public void validateLoginSuccess() {
        loginPage.validateLoginSuccess();
    }

}
