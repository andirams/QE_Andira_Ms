package starter.post;

import net.thucydides.core.annotations.Step;

public class Post {
    @Step("I am on the LinkedIn main page")
    public void onTheMainPage() {
        System.out.println("I am on the LinkedIn main page");
    }

    @Step("When I click on the Photo icon")
    public void clickPhotoIcon() {
        System.out.println("I click on the Photo icon");
    }

    @Step("I select the photo from my computer")
    public void selectPhoto() {
        System.out.println("I select the photo from my computer");
    }

    @Step("I type Check out this is my achievement! in the post text box")
    public void onTheTextBox() {
        System.out.println("I type Check out this is my achievement! in the post text box");
    }

    @Step("I click the Post button")
    public void clickPostButton() {
        System.out.println("I click the Post button");
    }

    @Step("the post with photo should appear on my main page")
    public void onTheMainPage2() {
        System.out.println("the post with photo should appear on my main page");
    }

}