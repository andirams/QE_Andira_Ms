package starter.stepdefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.ListrikplnPage;
import starter.pages.LoginPage;

public class PaymentMethodSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    ListrikplnPage listrikplnPage;

    @Steps
    HomePage homePage;

    @Steps
    SelectProductSteps selectProductSteps;

    //// Positive

    @Given("I am on the Listrik PLN Page")
    public void onTheListrikPLNPage() {
        loginPage.openPage();
        loginPage.clickLoginButton();
        loginPage.inputEmail("andiramahendra13@gmail.com");
        loginPage.inputPassword("mahendra13");
        loginPage.clickSubmitButton();
    }

    @When("I select a product and proceeds to checkout")
    public void proceedsToCheckout() {
        homePage.clickProductItem();
        selectProductSteps.inputNomorMeter();
        selectProductSteps.inputNomorHandphone();
        selectProductSteps.clickLanjutkanButton();
    }

    @And("I choose the Nominal of Listrik PLN")
    public void chooseNominal() {
        listrikplnPage.chooseNominal();
    }

    @Then("I select the payment method with DANA")
    public void selectPaymentMethod() {
        listrikplnPage.choosePaymentMethod();
    }

    //// Negative

    @When("I do not select any payment method and click Bayar Sekarang button")
    public void clickBayarSekarang() {
        listrikplnPage.clickBayarSekarang();
    }

    @Then("I should see a reminder message")
    public void validateReminderMessage() {
        listrikplnPage.validateReminderMessage();
    }
}
