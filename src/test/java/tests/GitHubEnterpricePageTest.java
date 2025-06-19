package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubEnterpricePageTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void gitHubEnterprizePagetest() {
        //открываем страницу github.com
        open("https://github.com/");
       $(byTagAndText("button", "Solutions")).hover();
       $(byText("Enterprises")).click();
       $("#hero-section-brand-heading").shouldHave(text("The AI-powered"));
    }
}
