package maps;

import org.openqa.selenium.By;

public class FlightMap {

    //Buttons
    public By flightDerpatureButton = By.xpath("(//button[contains(@class, 'flight-card-summary__select-btn') and contains(@class, 'ry-button--gradient-blue')])[1]");
    public By flightReturnButton = By.xpath("(//button[contains(@class, 'flight-card-summary__select-btn') and contains(@class, 'ry-button--gradient-blue')])[1]");
    public By familyTarifaButton = By.xpath("(//div[contains(@class, 'fare-table__fare-column-border') and contains(@class, 'fare-table__fare-column-border--fami')])");
    public By continueButton = By.xpath("//button[contains(@class, 'continue-flow__button') and contains(@class, 'ry-button--gradient-yellow')]");

    //Dynamic text field
    public By titleDropdown(int passengerIndex) {
        return By.xpath("(//button[contains(@class, 'dropdown__toggle')])[" + (passengerIndex + 1) + "]");
    }

    public By titleOption(String title) {
        return By.xpath("//div[contains(@class, 'dropdown-item__label') and contains(text(), '" + title + "')]");
    }

    public By firstNameInput(String passengerType, int passengerIndex) {
        return By.xpath("//input[@name='form.passengers." + passengerType + "-" + passengerIndex + ".name']");
    }

    public By lastNameInput(String passengerType, int passengerIndex) {
        return By.xpath("//input[@name='form.passengers." + passengerType + "-" + passengerIndex + ".surname']");
    }


}
