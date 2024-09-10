package pages;

import maps.TransportRentMap;
import org.openqa.selenium.WebDriver;

public class TransportRentPage extends BasePage {

    private TransportRentMap transportRentMap;

    public TransportRentPage(WebDriver driver) {
        super(driver);
        this.transportRentMap = new TransportRentMap();
    }

    public void scrollAndClickContinue() {
        try {
            scrollToAndClick(transportRentMap.continueButton);
        } catch (Exception e) {
            System.out.println("Failed to click 'Continue' button:" + e.getMessage());
        }
    }
}
