package webTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static pages.MainPage.*;

public class MainPageTests extends TestBase {

    @Test
    public void mainPageShouldHaveWebElements() {
        logo.shouldBe(visible);
        departureFromInput.shouldBe(visible).shouldHave(value("Екатеринбург"));
        destinationToInput.shouldBe(visible);
        startDateInput.shouldBe(visible);
        endDateInput.shouldBe(visible);
        passengersInput.shouldBe(visible);
        findTicketsButton.shouldBe(visible);
    }
}
