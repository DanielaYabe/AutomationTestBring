package pages;

import maps.PaymentMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PaymentPage extends BasePage {

    private PaymentMap paymentMap;

    public PaymentPage(WebDriver driver) {
        super(driver);
        this.paymentMap = new PaymentMap();
    }

    public void validatePaymentPageLoaded() {
        WebElement contactDetailsTitle = waitForVisibility(paymentMap.contactDetailsTitle);
        Assert.assertTrue(contactDetailsTitle.isDisplayed(), "A tela de pagamento foi carregada com sucesso.");
    }
}