package pages;

import maps.HomeMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private HomeMap homeMap;

    public HomePage(WebDriver driver) {
        super(driver);
        this.homeMap = new HomeMap();
    }

    public void clickLoginMenu() {
        click(homeMap.loginMenu);
    }

    public void enterDepartureCity(String departureCity) {
        click(homeMap.departureInput);
        click(homeMap.clearAirportButton);
        sendKeys(homeMap.departureInput, departureCity);
    }

    public void enterDestinationCity(String destinationCity) {
        click(homeMap.destinationInput);
        sendKeys(homeMap.destinationInput, destinationCity);
        sendKeys(homeMap.destinationInput, Keys.TAB.toString());
    }

    public void selectDates(String departureDate, String returnDate) {
        click(homeMap.dateCalendar);
        click(homeMap.getDateElementById(departureDate));
        click(homeMap.getDateElementById(returnDate));
    }


    public void selectPassengers(int adults, int children) {
        click(homeMap.passengersButton);
        for (int i = 1; i < adults; i++) {
            click(homeMap.adultsIncrementButton);
        }
        for (int i = 0; i < children; i++) {
            click(homeMap.childrenIncrementButton);
        }
        click(homeMap.doneButton);
        click(homeMap.searchButton);
    }

    public void searchForFlight(String departureCity, String destinationCity, String departureDate, String returnDate) {
        enterDepartureCity(departureCity);
        enterDestinationCity(destinationCity);
        selectDates(departureDate, returnDate);
    }
}
