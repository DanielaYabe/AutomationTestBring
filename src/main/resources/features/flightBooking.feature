Feature: Search for a trip on Ryanair and book a flight

  Scenario Outline: Book a flight from Lisbon to Paris Beauvais with 2 adults and 1 child
    Given I am logged into the Ryanair website
    When I search for a flight between Lisbon and Paris Beauvais with departure date <departure>, return date <return>
    And I search for tickets for 2 adults, 1 child
    When I choose the flights with tarifa value
    And I enter the passenger details:
      | Passenger    | Title | First Name | Last Name  |
      | First Adult  |  <first_passenger_first_title>   | <first_passenger_first_name>  | <first_passenger_last_name>  |
      | Second Adult |  <second_passenger_first_title>  | <second_passenger_first_name> | <second_passenger_last_name> |
      | Child        |                                  | <third_passenger_first_name>  | <third_passenger_last_name>  |
    And I select seats, details flight for the passengers
    Then I should be redirected to the checkout page

    Examples:
      | departure    | return       | first_passenger_first_title   |first_passenger_first_name | first_passenger_last_name | second_passenger_first_title   | second_passenger_first_name | second_passenger_last_name | third_passenger_first_name | third_passenger_last_name |
      | 2024-10-01   | 2024-10-30   |         Mrs                   | Sónia                    | Pereira                    |        Mr                      | Diogo                       | Bettencourt                | Inês                       | Marçal                    |