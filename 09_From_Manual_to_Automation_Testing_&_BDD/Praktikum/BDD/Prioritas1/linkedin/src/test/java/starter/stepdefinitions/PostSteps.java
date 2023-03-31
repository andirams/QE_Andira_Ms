package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.Post;

public class PostSteps {
    @Steps
    Post post;

    @Given("I am on the LinkedIn main page")
    public void onTheMainPage() {
        post.onTheMainPage();
    }

    @When("I click on the Photo icon")
    public void clickPhotoIcon() {
        post.clickPhotoIcon();
    }

    @And("I select the photo from my computer")
    public void selectPhoto() {
        post.selectPhoto();
    }

    @And("I type Check out this is my achievement! in the post text box")
    public void onTheTextBox() {
        post.onTheTextBox();
    }

    @And("I click the Post button")
    public void clickPostButton() {
        post.clickPostButton();
    }

    @Then("the post with photo should appear on my main page")
    public void onTheMainPage2() {
        post.onTheMainPage2();
    }
}