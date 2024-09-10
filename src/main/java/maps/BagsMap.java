package maps;

import org.openqa.selenium.By;

public class BagsMap {

    //Buttons
    public By bagOptionRadioButton = By.xpath("//label[contains(@class, 'ry-radio-circle-button__label') and @for='ry-radio-button--0']");
    public By continueButton = By.xpath("//button[contains(@data-ref, 'bags-continue-button') and contains(text(), 'Continue')]");

}