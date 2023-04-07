package starter.stepdefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.ListrikplnPage;
import starter.pages.LoginPage;

public class SelectProductSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    ListrikplnPage listrikplnPage;

    @Steps
    HomePage homePage;

    //// positive

    @Given("I am on the home page")
    public void onTheHomePage() {
        loginPage.openPage();
    }

    @When("I click Listrik PLN product")
    public void clickListrikPLN() {
        homePage.clickProductItem();
    }

    @And("I enter correct nomor meter PLN")
    public void inputNomorMeter() {
        listrikplnPage.inputNomorMeter("56709803730");
    }

    @And("I enter correct nomor handphone")
    public void inputNomorHandphone() {
        listrikplnPage.inputNomorHandphone("085791349382");
    }

    @When("I click on the lanjutkan button")
    public void clickLanjutkanButton() {
        listrikplnPage.clickLanjutkanButton();
    }

    @Then("I should be redirected to select nominal")
    public void validateOnSelectNominal() {
        listrikplnPage.validateOnSelectNominal();
    }

    //// negative

    @And("I enter incorrect nomor meter PLN")
    public void inputIncorrectNomorMeter() {
        listrikplnPage.inputNomorMeter("56709803731");
    }

    @Then("I should see the warning message")
    public void validateWarningMessage() {
        listrikplnPage.validateWarningMessage();
    }

}
