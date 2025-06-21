package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DataTextBoxTableComponent {

    public void checkResult() {
        $("#output #name").shouldHave(text("Kirill"));
        $("#output #email").shouldHave(text("kirill@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Donskoy"));
        $("#output #permanentAddress").shouldHave(text("Tbilisi"));
    }
}
