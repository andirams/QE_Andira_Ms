package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;
import com.github.javafaker.Faker;

public class RegisterScreen extends BasePageObject {
    
    public String name = createRandomName();

    public String password = "password";

    private By registerLink(){
        return MobileBy.id("textViewLinkRegister");
    }

    private By nameField(){
        return MobileBy.id("textInputEditTextName");
    }

    private By emailField(){
        return MobileBy.id("textInputEditTextEmail");
    }

    private By passwordField(){
        return MobileBy.id("textInputEditTextPassword");

    }
    private By confirmPassword(){
        return MobileBy.id("textInputEditTextConfirmPassword");

    }
    private By registerButton(){
        return MobileBy.id("appCompatButtonRegister");
    }
    private By snackbarMessage(){
        return MobileBy.id("snackbar_text");
    }

    @Step
    public void clickRegisterLink(){
        onClick(registerLink());
    }
    @Step
    public void inputNameField(){
        Faker faker = new Faker();
        name = faker.name().firstName();
        onType(nameField(), createRandomName());
    }
    
    @Step
    public void inputEmailField(){
        onType(emailField(), createRandomName() + "@gmail.com");
    }

    @Step
    public void inputPasswordField(){
        onType(passwordField(), password);
    }

    @Step
    public void confirmPasswordField(){
        onType(confirmPassword(), password);
    }

    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }

    @Step
    public String validateSuccesMessage(){;
        return waitUntilVisible(snackbarMessage()).getText();
    }

    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }


    

}
