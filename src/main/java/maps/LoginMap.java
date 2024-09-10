package maps;

import org.openqa.selenium.By;

public class LoginMap {

    //Button
    public By loginButton = By.xpath("//button[@type='submit' and @color='gradient-yellow']");

    //Text field
    public By loginEmail = By.xpath("//input[@name='email']");
    public By loginPassword = By.xpath("//input[@name='password']");

    //Frames
    public By loginFrameElenent = By.xpath("//iframe[@data-ref='kyc-iframe']");
}
