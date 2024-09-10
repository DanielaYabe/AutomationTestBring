package pages;

import maps.SeatMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeatPage extends BasePage {

    private SeatMap seatMap;

    public SeatPage(WebDriver driver) {
        super(driver);
        this.seatMap = new SeatMap();
    }

    public void clickNextFlightButton() {
        try {
            click(seatMap.nextFlightButton);
        } catch (Exception e) {
            System.out.println("Failed to click 'Next flight' button: " + e.getMessage());
        }
    }

    public void clickContinueButton() {
        try {
            click(seatMap.continueButton);
        } catch (Exception e) {
            System.out.println("Failed to click 'Continue' button: " + e.getMessage());
        }
    }

    public void selectSeatsForTrip() {
        try {
            //Depart
            selectSeat(seatMap.seat14D);
            selectSeat(seatMap.seat14E);
            selectSeat(seatMap.seat14F);
            clickNextFlightButton();

            //Return
            selectSeat(seatMap.seat14D);
            selectSeat(seatMap.seat14E);
            selectSeat(seatMap.seat14F);
            clickContinueButton();
        } catch (Exception e) {
            System.out.println("Failed to select seats: " + e.getMessage());
        }
    }

    private void selectSeat(By seatLocator) {
        click(seatLocator);
    }

    public void clickNoThanksButton() {
        try {
            click(seatMap.noThanksButton);
        } catch (Exception e) {
            System.out.println("Failed to click 'No, thanks' button: " + e.getMessage());
        }
    }

    public void clickGotItButton() {
        try {
            waitForVisibility(seatMap.gotItButton);
            click(seatMap.gotItButton);
        } catch (Exception e) {
            System.out.println("'Okay, got it' button not found:"  + e.getMessage());
        }
    }
}
