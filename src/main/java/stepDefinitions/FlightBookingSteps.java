package stepDefinitions;

import config.Configuration;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;
import utils.Credenciais;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class FlightBookingSteps {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private CookieConsentPage cookieConsentPage;

    @Given("I am logged into the Ryanair website")
    public void iAmLoggedIntoTheRyanairWebsite() {
        driver = Configuration.iniciarDriver();
        cookieConsentPage = new CookieConsentPage(driver);
        cookieConsentPage.acceptCookies();

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        homePage.clickLoginMenu();
        loginPage.login(Credenciais.USER.getLogin(), Credenciais.USER.getPassword());
    }

    @When("^I search for a flight between (.*) and (.*) with departure date (.*), return date (.*)$")
    public void searchForFlight(String departureCity, String destinationCity, String departureDate, String returnDate) {
        homePage.searchForFlight(departureCity, destinationCity, departureDate, returnDate);
    }

    @And("^I search for tickets for (\\d+) adults?, (\\d+) child$")
    public void searchForTickets(int adults, int children) {
        homePage.selectPassengers(adults, children);
    }

    @When("^I choose the flights with tarifa value$")
    public void chooseFlightsWithTarifa() {
        FlightPage flightPage = new FlightPage(driver);
        flightPage.chooseFlightsWithTarifa();
    }

    @And("^I enter the passenger details:$")
    public void enterPassengerDetails(DataTable passengerDetails) {
        List<Map<String, String>> data = passengerDetails.asMaps(String.class, String.class);
        FlightPage flightPage = new FlightPage(driver);

        // Preencher detalhes dos passageiros
        flightPage.fillPassengerDetails("ADT", 0, data.get(0).get("Title"), data.get(0).get("First Name"), data.get(0).get("Last Name"));
        flightPage.fillPassengerDetails("ADT", 1, data.get(1).get("Title"), data.get(1).get("First Name"), data.get(1).get("Last Name"));
        flightPage.fillPassengerDetails("CHD", 0, null, data.get(2).get("First Name"), data.get(2).get("Last Name"));

        flightPage.clickContinue();
    }

    @And("^I select seats, details flight for the passengers$")
    public void selectSeatsForPassengers() {
        SeatPage seatPage = new SeatPage(driver);
        BagsPage bagsPage = new BagsPage(driver);
        SecurityPage securityPage = new SecurityPage(driver);
        TransportRentPage transportRentPage = new TransportRentPage(driver);

        // Clique no botão "Okay, got it", caso ele apareça
        seatPage.clickGotItButton();

        // Seleciona três assentos consecutivos para o voo de ida e de volta
        seatPage.selectSeatsForTrip();
        seatPage.clickNoThanksButton();
        bagsPage.selectBagOption();
        bagsPage.scrollAndClickContinue();
        securityPage.scrollAndClickContinue();
        transportRentPage.scrollAndClickContinue();

    }

    @Then("^I should be redirected to the checkout page$")
    public void validateRedirectedToCheckoutPage() {
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.validatePaymentPageLoaded();
        Configuration.fecharDriver();
    }
}
