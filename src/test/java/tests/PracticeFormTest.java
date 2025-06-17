package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1400x720";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void fillPracticeFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Kirill");
        $("#lastName").setValue("Shein");
        $("#userEmail").setValue("kirill@mail.ru");
        $("label[for='gender-radio-1']").click();
        $("#userNumber").setValue("7911099325");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__month-select").selectOption("October");
        $(".react-datepicker__day--022").click();
        $("label[for='hobbies-checkbox-1']").click();
        $("label[for='hobbies-checkbox-2']").click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/kim.jpeg"));
        $("#currentAddress").setValue("street New 56");
        $("#state").$(".css-yk16xz-control").click();
        $("#react-select-3-option-0").click();
        $("#city").$(".css-yk16xz-control").click();
        $("#react-select-4-option-0").click();
        $("#submit").click();



        $("#example-modal-sizes-title-lg").shouldHave(exactText("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                Condition.text("Student Name Kirill Shein"),
                Condition.text("Student Email kirill@mail.ru"),
                Condition.text("Gender Male"),
                Condition.text("Mobile 7911099325"),
                Condition.text("Date of Birth 22 October,1991"),
                Condition.text("Subjects "),
                Condition.text("Hobbies Sports, Reading"),
                Condition.text("kim.jpeg"),
                Condition.text("Address street New 56"),
                Condition.text("State and City NCR Delhi")

        );
    }
}
