## Travel Booking Automation
This project automates the process of booking a trip, from login to payment page validation.

#### Automated Steps:
1. Log in;
2. Select a trip from Lisbon to Paris in October for 2 adults and 1 child;
3. Select the flight, fare, and enter passenger details;
4. Select seats: same seat for both outbound and return flights, if available;
5. Select baggage;
6. Click continue until reaching the payment page;
7. Validate that the payment page has been loaded.

#### Tech stack:
- Java
- Cucumber
- Selenium

### Project Structure:

The project is organized into three main layers to separate concerns and maintain readability:

1. **Maps**:
   - This layer contains classes that define the locators (XPaths, IDs, etc.) for web elements. Each class represents a specific page or section of the application (e.g., login, flight selection, seat selection, etc.).
   - Example: `LoginMap.java`, `SeatMap.java`, `BagMap.java`.

2. **Pages**:
   - The page classes encapsulate the interaction logic with the elements defined in the `Maps`. Each class corresponds to a page or section of the web application and contains methods that perform actions like clicking buttons, filling in forms, and navigating between pages.
   - Example: `LoginPage.java`, `SeatPage.java`, `PaymentPage.java`.

3. **Step Definitions**:
   - This layer contains the Cucumber step definitions that link Gherkin feature files to the implementation. Each method in the step definition class corresponds to a Gherkin step and uses methods from the `Pages` classes to interact with the web application.
   - Example: `FlightBookingSteps.java`, `PaymentSteps.java`.
  
### How to run the tests:
1. Clone this repository to your local machine.
2. Set up your preferred IDE (like IntelliJ) to run Java, Cucumber and Selenium.
3. Run the Cucumber feature files using the configured test runner.

### Successful execution:
![image](https://github.com/user-attachments/assets/645b9df9-2a3a-45f2-b34b-bc23d3b888d2)
