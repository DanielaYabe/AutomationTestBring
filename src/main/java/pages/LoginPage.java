package pages;

import maps.LoginMap;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private LoginMap loginMap;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.loginMap = new LoginMap();
    }

    public void enterEmail(String email) {
        driver.switchTo().frame(waitForVisibility(loginMap.loginFrameElenent));
        sendKeys(loginMap.loginEmail, email);
        driver.switchTo().defaultContent();
    }

    public void enterPassword(String password) {
        driver.switchTo().frame(waitForVisibility(loginMap.loginFrameElenent));
        sendKeys(loginMap.loginPassword, password);
        driver.switchTo().defaultContent();
    }

    public void clickLoginButton() {
        driver.switchTo().frame(waitForVisibility(loginMap.loginFrameElenent));
        click(loginMap.loginButton);
        driver.switchTo().defaultContent();
        clickAndWaitForInvisibility(loginMap.loginFrameElenent);
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
}
