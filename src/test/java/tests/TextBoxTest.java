package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        //#userName это id = userName из html
        $("#userName").setValue("Kirill");
        $("#userEmail").setValue("kirill@mail.ru");
        $("#currentAddress").setValue("Donskoy");
        $("#permanentAddress").setValue("Tbilisi");
        $("#submit").click();


        $("#output #name").shouldHave(text("Kirill"));
        $("#output #email").shouldHave(text("kirill@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Donskoy"));
        $("#output #permanentAddress").shouldHave(text("Tbilisi"));
    }
}
