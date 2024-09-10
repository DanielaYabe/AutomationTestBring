package maps;

import org.openqa.selenium.By;

public class CookieConsentMap {

    //Buttons
    public By acceptCookiesButton = By.xpath("//button[@data-ref='cookie.accept-all']");

    //PopUps
    public By cookiePopup = By.xpath("//p[text()='We value your privacy']");

}
