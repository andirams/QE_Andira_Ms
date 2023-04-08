package starter.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ListrikplnPage extends PageObject {

    private By nomorMeterField() {
        return By.id("nomor-meter");
    }

    private By nomorHandphoneField() {
        return By.id("nomor-handphone");
    }

    private By lanjutkanButton() {
        return By.className("MuiButton-label");
    }

    private By selectNominalLogo() {
        return By.className("nominal-baselogo");
    }

    private By warningMessage() {
        return By.xpath("//p[contains(text(),'Nomor salah / terblokir / expired')]");
    }

    private By Nominal() {
        return By.id("Nominal Rp20.000");
    }

    private By paymentMethod() {
        return By.id("label DANA");
    }

    private By reminderMessage() {
        return By.id("error_select_payment");
    }

    private By bayarSekarang() {
        return By.id("submit_payment");
    }

    @Step
    public void inputNomorMeter(String nomorMeter) {
        $(nomorMeterField()).type(nomorMeter);
    }

    @Step
    public void inputNomorHandphone(String nomorHandphone) {
        $(nomorHandphoneField()).type(nomorHandphone);
    }

    @Step
    public void clickLanjutkanButton() {
        $(lanjutkanButton()).click();
    }

    @Step
    public boolean validateOnSelectNominal() {
        return $(selectNominalLogo()).isDisplayed();
    }

    @Step
    public boolean validateWarningMessage() {
        return $(warningMessage()).isDisplayed();
    }

    @Step
    public void chooseNominal() {
        $(Nominal()).click();
    }

    @Step
    public void choosePaymentMethod() {
        $(paymentMethod()).click();
    }

    @Step
    public void validateReminderMessage() {
        $(reminderMessage()).isDisplayed();
    }

    @Step
    public void clickBayarSekarang() {
        $(bayarSekarang()).click();
    }

}
