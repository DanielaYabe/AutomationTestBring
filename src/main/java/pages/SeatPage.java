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
            System.out.println("Botão 'Next flight' clicado com sucesso.");
        } catch (Exception e) {
            System.out.println("Falha ao clicar no botão 'Next flight': " + e.getMessage());
        }
    }

    public void clickContinueButton() {
        try {
            click(seatMap.continueButton);
        } catch (Exception e) {
            System.out.println("Falha ao clicar no botão 'Continue': " + e.getMessage());
        }
    }

    public void selectSeatsForTrip() {
        try {
            //Depart
            selectSeat(seatMap.seat14A);
            selectSeat(seatMap.seat14B);
            selectSeat(seatMap.seat14C);
            clickNextFlightButton();

            //Return
            selectSeat(seatMap.seat14A);
            selectSeat(seatMap.seat14B);
            selectSeat(seatMap.seat14C);
            clickContinueButton();
        } catch (Exception e) {
            System.out.println("Falha ao selecionar os assentos: " + e.getMessage());
        }
    }

    private void selectSeat(By seatLocator) {
        click(seatLocator);
    }

    public void clickNoThanksButton() {
        try {
            click(seatMap.noThanksButton);
        } catch (Exception e) {
            System.out.println("Falha ao clicar no botão 'No, thanks': " + e.getMessage());
        }
    }

    public void clickGotItButton() {
        try {
            waitForVisibility(seatMap.gotItButton);
            click(seatMap.gotItButton);
        } catch (Exception e) {
            System.out.println("Botão 'Okay, got it' não encontrado.");
        }
    }
}
