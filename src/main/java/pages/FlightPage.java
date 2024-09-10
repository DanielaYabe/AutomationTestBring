package pages;

import maps.FlightMap;
import org.openqa.selenium.WebDriver;

public class FlightPage extends BasePage {

    private FlightMap flightMap;

    public FlightPage(WebDriver driver) {
        super(driver);
        this.flightMap = new FlightMap();
    }

    public void chooseFlightsWithTarifa() {
        click(flightMap.flightDerpatureButton);
        click(flightMap.flightReturnButton);
        click(flightMap.familyTarifaButton);
    }

    public void fillPassengerDetails(String passengerType, int passengerIndex, String title, String firstName, String lastName) {
        if (passengerType.equals("ADT")) {
            //Select title (adults only)
            click(flightMap.titleDropdown(passengerIndex));
            click(flightMap.titleOption(title));
        }

        sendKeys(flightMap.firstNameInput(passengerType, passengerIndex), firstName);
        sendKeys(flightMap.lastNameInput(passengerType, passengerIndex), lastName);
    }

    public void clickContinue() {
        click(flightMap.continueButton);
    }
}