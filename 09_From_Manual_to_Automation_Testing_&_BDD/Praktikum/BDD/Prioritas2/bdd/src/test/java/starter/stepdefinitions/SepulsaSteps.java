package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.sepulsa.Sepulsa;

public class SepulsaSteps {
    @Steps
    Sepulsa sepulsa;

    @Given("I am on Sepulsa main page")
    public void sepulsa12() {
        sepulsa.sepulsa1();
    }

    @When("i click on Login button")
    public void sepulsa13() {
        sepulsa.sepulsa2();
    }

    @And("i am enter valid email and password")
    public void sepulsa14() {
        sepulsa.sepulsa3();
    }

    @And("i click on Login button again")
    public void sepulsa15() {
        sepulsa.sepulsa4();
    }

    @Then("i should be redirected to Sepulsa dashboard")
    public void sepulsa16() {
        sepulsa.sepulsa5();
    }

    @When("i click on pulsa icon")
    public void sepulsa17() {
        sepulsa.sepulsa6();
    }

    @And("i input my telephone number")
    public void sepulsa18() {
        sepulsa.sepulsa7();
    }

    @And("i select nominal of the credit")
    public void sepulsa19() {
        sepulsa.sepulsa8();
    }

    @And("i select payment method")
    public void sepulsa20() {
        sepulsa.sepulsa9();
    }

    @And("i complete the payment process")
    public void sepulsa21() {
        sepulsa.sepulsa10();
    }

    @Then("i should receive a successful top up message")
    public void sepulsa22() {
        sepulsa.sepulsa11();
    }
}