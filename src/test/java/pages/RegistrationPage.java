package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.DataTableComponent;

import java.io.File;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public RegistrationPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    private SelenideElement firstNameInput = $("#firstName"),
                            lastNameInput = $("#lastName"),
                            emailInput = $("#userEmail"),
                            genderInput = $("#genterWrapper"),
                            numberInput = $("#userNumber"),
                            calendarInput = $("#dateOfBirthInput"),
                            hobbiesInput = $("#hobbiesWrapper"),
                            subjectsInput = $("#subjectsInput"),
                            imageInput = $("#uploadPicture"),
                            currentAddressInput = $("#currentAddress"),
                            stateInput = $("#state"),
                            cityInput = $("#city"),
                            clickSubmit = $("#submit"),

                            //проверка данных
                            checkTitle = $("#example-modal-sizes-title-lg");

    CalendarComponent calendarComponent = new CalendarComponent();
    DataTableComponent dataTableComponent = new DataTableComponent();

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        emailInput.setValue(value);

        return this;

    }

    public RegistrationPage setGender(String value) {
        genderInput.$(byText(value)).click();

        return this;

    }

    public RegistrationPage setNumber(String value) {
        numberInput.setValue(value);

        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate();

        return this;
    }


    public RegistrationPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setImage(String value) {
        imageInput.uploadFile(new File(value));

        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        stateInput.click();
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value) {
        cityInput.click();
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage setSubmit() {
        clickSubmit.click();

        return this;
    }

    //проверка данных

    public  RegistrationPage setCheckTitle(String value) {
        checkTitle.shouldHave(exactText(value));

        return this;
    }

    public RegistrationPage checkResult(String key, String value) {
        dataTableComponent.setCheckResult();

        return this;
    }

    public RegistrationPage checkRequiredResult(String key, String value) {
        dataTableComponent.setCheckRequiredResult();

        return this;
    }
}
