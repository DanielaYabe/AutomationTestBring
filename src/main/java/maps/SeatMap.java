package maps;

import org.openqa.selenium.By;

public class SeatMap {

    //Buttons
    public By gotItButton = By.xpath("//button[contains(@class, 'seats-modal__cta')]");
    public By nextFlightButton = By.xpath("//button[contains(@class, 'passenger-carousel__cta--next') and contains(text(), 'Next flight')]");
    public By noThanksButton = By.xpath("//button[contains(@class, 'enhanced-takeover-beta__product-dismiss-cta') and contains(text(), 'No, thanks')]");
    public By continueButton = By.xpath("//button[contains(@class, 'passenger-carousel__cta--next') and contains(text(), 'Continue')]");
    public By seat14D = By.id("seat-14D");
    public By seat14E = By.id("seat-14E");
    public By seat14F = By.id("seat-14F");

}
