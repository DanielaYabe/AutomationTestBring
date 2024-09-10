package pages;

import maps.CookieConsentMap;
import org.openqa.selenium.WebDriver;

public class CookieConsentPage extends BasePage {

    private CookieConsentMap cookieConsentMap;

    public CookieConsentPage(WebDriver driver) {
        super(driver);
        this.cookieConsentMap = new CookieConsentMap();
    }

    public void acceptCookies() {
        try {
            click(cookieConsentMap.acceptCookiesButton);
        } catch (Exception e) {
            System.out.println("Accept Cookies button not found or already accepted. Error: " + e.getMessage());
        }
    }
}