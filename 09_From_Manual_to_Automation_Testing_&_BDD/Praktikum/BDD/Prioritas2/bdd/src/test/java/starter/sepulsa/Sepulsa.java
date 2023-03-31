package starter.sepulsa;

import net.thucydides.core.annotations.Step;

public class Sepulsa {
    @Step("I am on Sepulsa main page")
    public void sepulsa1() {
        System.out.println("I am on Sepulsa main page");
    }

    @Step("When i click on Login button")
    public void sepulsa2() {
        System.out.println("i click on Login button");
    }

    @Step("i am enter valid email and password")
    public void sepulsa3() {
        System.out.println("i am enter valid email and password");
    }

    @Step("i click on Login button again")
    public void sepulsa4() {
        System.out.println("i click on Login button again");
    }

    @Step("i should be redirected to Sepulsa dashboard")
    public void sepulsa5() {
        System.out.println("i should be redirected to Sepulsa dashboard");
    }

    @Step("When i click on pulsa icon")
    public void sepulsa6() {
        System.out.println("i click on pulsa icon");
    }

    @Step("i input my telephone number")
    public void sepulsa7() {
        System.out.println("i input my telephone number");
    }

    @Step("i select nominal of the credit")
    public void sepulsa8() {
        System.out.println("i select nominal of the credit");
    }

    @Step("i select payment method")
    public void sepulsa9() {
        System.out.println("i select payment method");
    }

    @Step("i complete the payment process")
    public void sepulsa10() {
        System.out.println("i complete the payment process");
    }
    @Step("i should receive a successful top up message")
    public void sepulsa11() {
        System.out.println("i should receive a successful top up message");
    }

}