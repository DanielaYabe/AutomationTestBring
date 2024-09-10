package pages;

import maps.BagsMap;
import org.openqa.selenium.WebDriver;

public class BagsPage extends BasePage {

    private BagsMap bagsMap;

    public BagsPage(WebDriver driver) {
        super(driver);
        this.bagsMap = new BagsMap();
    }

    public void selectBagOption() {
        try {
            click(bagsMap.bagOptionRadioButton);
        } catch (Exception e) {
            System.out.println("Failed to select baggage option: " + e.getMessage());
        }
    }

    public void scrollAndClickContinue() {
        try {
            scrollToAndClick(bagsMap.continueButton);
        } catch (Exception e) {
            System.out.println("Failed to click 'Continue' button: " + e.getMessage());
        }
    }
}
