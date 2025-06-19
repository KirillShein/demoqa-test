package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate() {

        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__month-select").selectOption("October");
        $(".react-datepicker__day--022").click();
    }
}
