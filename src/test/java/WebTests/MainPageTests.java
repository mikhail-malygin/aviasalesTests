package WebTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static pages.MainPage.*;

public class MainPageTests extends TestBase{

    @Test
    void mainPageShouldHaveWebElements() {
        logo.shouldBe(visible);
        departureFromInput.shouldBe(visible).shouldHave(text("Екатеринбург"));
        destinationToInput.shouldBe(visible);
        startDateInput.shouldBe(visible);
        endDateInput.shouldBe(visible);
        findTicketsButton.shouldBe(visible);
    }
}
