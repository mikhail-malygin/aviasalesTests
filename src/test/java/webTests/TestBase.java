package webTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://www.aviasales.ru/";
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
        Configuration.pageLoadStrategy = "eager";
        open("");
    }
}
