package pages;

import maps.SecurityMap;
import org.openqa.selenium.WebDriver;

public class SecurityPage extends BasePage {

    private SecurityMap securityMap;

    public SecurityPage(WebDriver driver) {
        super(driver);
        this.securityMap = new SecurityMap();
    }

    public void scrollAndClickContinue() {
        try {
            scrollToAndClick(securityMap.continueButton);
        } catch (Exception e) {
            System.out.println("Failed to click 'Continue' button:" + e.getMessage());
        }
    }
}
