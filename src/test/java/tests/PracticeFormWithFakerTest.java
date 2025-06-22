package tests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import utils.TestData;

public class PracticeFormWithFakerTest extends TestBase {


    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();


    @Test
    void fullPracticeFormTest() {

        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setNumber(testData.numberMobile)
                .setFakerDateOfBirth(testData, testData.day, testData.month, testData.year)
                .setHobbies(testData.hobbies)
                .setSubjects(testData.subjects)
                .setImage(testData.image)
                .setCurrentAddress(testData.currentAddress)
                .setState(testData.state)
                .setCity(testData.city)
                .setSubmit()

                //проверка данных
                .setCheckTitle("Thanks for submitting the form")
                .checkResultRandom(testData, "Student Name", testData.firstName + " " + testData.lastName)
                .checkResultRandom(testData,"Student Email", testData.email)
                .checkResultRandom(testData,"Gender", testData.gender)
                .checkResultRandom(testData,"Mobile", testData.numberMobile)
                .checkResultRandom(testData,"Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResultRandom(testData,"Subjects", testData.subjects)
                .checkResultRandom(testData,"Hobbies", testData.hobbies)
                .checkResultRandom(testData,"Picture", testData.image)
                .checkResultRandom(testData,"Address", testData.currentAddress)
                .checkResultRandom(testData,"State and City", testData.state + " " + testData.city);


    }

    //Проверка ввода обязательных полей
    @Test
    public void submitFormWithOnlyRequiredFieldsTest() {
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setNumber(testData.numberMobile)
                .setFakerDateOfBirth(testData, testData.day, testData.month, testData.year)
                .setSubmit()

                //проверка данных
                .setCheckTitle("Thanks for submitting the form")
                .checkFakerRequiredResult(testData, "Student Name", testData.firstName + " " + testData.lastName)
                .checkFakerRequiredResult(testData,"Student Email", testData.email)
                .checkFakerRequiredResult(testData,"Gender", testData.gender)
                .checkFakerRequiredResult(testData,"Mobile", testData.numberMobile)
                .checkFakerRequiredResult(testData,"Date of Birth", testData.day + " " + testData.month + "," + testData.year);
    }

    //Отправка данных без firstName
    @Test
    public void submitFormWithNoFirstName() {
        registrationPage.openPage()
                .setFirstName("")
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setNumber(testData.numberMobile)
                .setFakerDateOfBirth(testData, testData.day, testData.month, testData.year)
                .setHobbies(testData.hobbies)
                .setSubjects(testData.subjects)
                .setImage(testData.image)
                .setCurrentAddress(testData.currentAddress)
                .setState(testData.state)
                .setCity(testData.city)
                .setSubmit()

                //проверка данных
                .setCheckTitle("Thanks for submitting the form")
                .checkResultRandom(testData, "Student Name", testData.firstName + " " + testData.lastName)
                .checkResultRandom(testData,"Student Email", testData.email)
                .checkResultRandom(testData,"Gender", testData.gender)
                .checkResultRandom(testData,"Mobile", testData.numberMobile)
                .checkResultRandom(testData,"Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResultRandom(testData,"Subjects", testData.subjects)
                .checkResultRandom(testData,"Hobbies", testData.hobbies)
                .checkResultRandom(testData,"Picture", testData.image)
                .checkResultRandom(testData,"Address", testData.currentAddress)
                .checkResultRandom(testData,"State and City", testData.state + " " + testData.city);
    }



}
