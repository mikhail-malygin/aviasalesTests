package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static final SelenideElement logo = $("[data-test-id='logo']"),
                                        departureFromInput = $("[data-test-id='origin-input']"),
                                        destinationToInput = $("[data-test-id='destination-input']"),
                                        startDateInput = $("[data-test-id='start-date-field']"),
                                        endDateInput = $("[data-test-id='end-date-field']"),
                                        passengersInput = $("[data-test-id='passengers-field']"),
                                        findTicketsButton = $("[data-test-id='form-submit']");


}
