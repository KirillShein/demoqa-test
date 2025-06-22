package pages.components;

import utils.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DataTableFakerComponent {

    private TestData testData;

    public DataTableFakerComponent(TestData testData) {
        this.testData = testData;
    }



    public void setCheckResult() {
        //Находим локатор table-responsive затем находим key (прим. Student Name) parent() - поднимаемся по dom вверх к родителю, чтобы найти значение по тексту Kirill Shein
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(testData.firstName + " " + testData.lastName));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text(testData.email));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text(testData.gender));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text(testData.numberMobile));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text(testData.day + " " + testData.month + "," + testData.year));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text(testData.hobbies));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text(testData.subjects));
        $(".table-responsive").$(byText("Picture")).parent()
                .shouldHave(text(testData.image.split("/")[testData.image.split("/").length - 1]));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text(testData.currentAddress));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text(testData.state + " " + testData.city));
    }

    public void setFakerCheckRequiredResult() {
        //Находим локатор table-responsive затем находим key (прим. Student Name) parent() - поднимаемся по dom вверх к родителю, чтобы найти значение по тексту Kirill Shein
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(testData.firstName + " " + testData.lastName));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text(testData.email));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text(testData.gender));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text(testData.numberMobile));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text(testData.day + " " + testData.month + "," + testData.year));

    }
}
