package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.DataTextBoxTableComponent;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxPage {

    public TestBoxPage openPage() {
        open("/text-box");

        return this;
    }

    private SelenideElement userName = $("#userName"),
                            userEmail = $("#userEmail"),
                            currentAddress = $("#currentAddress"),
                            permanentAddress = $("#permanentAddress"),
                            clickSubmit = $("#submit");

    DataTextBoxTableComponent dataTextBoxTableComponent = new DataTextBoxTableComponent();

    public TestBoxPage setUserName(String value) {
        userName.setValue(value);

        return this;
    }

    public TestBoxPage setUserEmail(String value) {
        userEmail.setValue(value);

        return this;
    }

    public TestBoxPage setCurrentAddress(String value) {
        currentAddress.setValue(value);

        return this;
    }

    public TestBoxPage setPermanentAddress(String value) {
        permanentAddress.setValue(value);

        return this;
    }

    public TestBoxPage setClickSubmit() {
        clickSubmit.click();

        return this;
    }

    public TestBoxPage setCheckResult(String value) {
        dataTextBoxTableComponent.checkResult();

        return this;
    }
}
