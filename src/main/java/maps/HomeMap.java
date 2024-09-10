package maps;

import org.openqa.selenium.By;

public class HomeMap {

    //Buttons
    public By clearAirportButton = By.xpath("//button[@aria-label='Clear selection']");
    public By searchButton = By.xpath("//button[@aria-label='Search']");
    public By passengersButton = By.xpath("//ry-input-button[@uniqueid='passengers']");
    public By adultsIncrementButton = By.xpath("//ry-counter[@data-ref='passengers-picker__adults']//div[@data-ref='counter.counter__increment']");
    public By childrenIncrementButton = By.xpath("//ry-counter[@data-ref='passengers-picker__children']//div[@data-ref='counter.counter__increment']");
    public By doneButton = By.xpath("//button[@aria-label='Done']");


    //Menus
    public By loginMenu = By.xpath("//button[contains(@class, 'ry-button--flat-yellow')]");

    //Text field
    public By departureInput = By.xpath("//input[@id='input-button__departure']");
    public By destinationInput = By.xpath("(//input[@id='input-button__destination'])[1]");

    //Dates
    public By dateCalendar = By.xpath("//div[@data-ref='input-button__display-value']");

    public By getDateElementById(String date) {
        return By.xpath("//div[@data-id='" + date + "']");
    }

}
