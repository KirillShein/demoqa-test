package pages.components;

import utils.TestData;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarFakerComponent {
    private TestData testData;

    public CalendarFakerComponent(TestData testData) {
        this.testData = testData;
    }

    public void setDate() {

        $(".react-datepicker__year-select").selectOption(testData.year);
        $(".react-datepicker__month-select").selectOption(testData.month);
        $(".react-datepicker__month").find(byText(testData.day)).click();
    }
}
