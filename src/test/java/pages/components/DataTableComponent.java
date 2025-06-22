package pages.components;

import utils.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DataTableComponent {

    public void setCheckResult() {
        //Находим локатор table-responsive затем находим key (прим. Student Name) parent() - поднимаемся по dom вверх к родителю, чтобы найти значение по тексту Kirill Shein
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Kirill Shein"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("kirill@mail.ru"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("9110993250"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("22 October,1991"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Sports, Reading"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("English"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("kim.jpeg"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("street New 56"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("NCR Delhi"));
    }

    public void setCheckRequiredResult() {
        //Находим локатор table-responsive затем находим key (прим. Student Name) parent() - поднимаемся по dom вверх к родителю, чтобы найти значение по тексту Kirill Shein
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Kirill Shein"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("kirill@mail.ru"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("9110993250"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("22 October,1991"));

    }


}
