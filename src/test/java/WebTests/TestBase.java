package WebTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://www.aviasales.ru/";
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 10000;
        open("");

    }
}
