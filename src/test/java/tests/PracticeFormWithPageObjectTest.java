package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;



public class PracticeFormWithPageObjectTest extends TestBase {


    RegistrationPage registrationPage = new RegistrationPage();



    @Test
    void fullPracticeFormTest() {

        RegistrationPage registrationPage = new RegistrationPage();

        registrationPage.openPage()
                .setFirstName("Kirill")
                .setLastName("Shein")
                .setEmail("kirill@mail.ru")
                .setGender("Male")
                .setNumber("9110993250")
                .setDateOfBirth("22", "October", "1991")
                .setHobbies("Sports")
                .setHobbies("Reading")
                .setSubjects("English")
                .setImage("src/test/resources/kim.jpeg")
                .setCurrentAddress("street New 56")
                .setState("NCR")
                .setCity("Delhi")
                .setSubmit()

                //проверка данных
                .setCheckTitle("Thanks for submitting the form")
                .checkResult("Student Name", "Kirill Shein")
                .checkResult("Student Email", "kirill@mail.ru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7911099325")
                .checkResult("Date of Birth", "22 October,1991")
                .checkResult("Subjects", "English")
                .checkResult("Hobbies", "Sports, Reading")
                .checkResult("Picture", "kim.jpeg")
                .checkResult("Address", "street New 56")
                .checkResult("State and City", "NCR Delhi");


    }

    //Проверка ввода обязательных полей
    @Test
    public void submitFormWithOnlyRequiredFieldsTest() {
        registrationPage.openPage()
                .setFirstName("Kirill")
                .setLastName("Shein")
                .setEmail("kirill@mail.ru")
                .setGender("Male")
                .setNumber("9110993250")
                .setDateOfBirth("22", "October", "1991")
                .setSubmit()

                //проверка данных
                .setCheckTitle("Thanks for submitting the form")
                .checkRequiredResult("Student Name", "Kirill Shein")
                .checkRequiredResult("Student Email", "kirill@mail.ru")
                .checkRequiredResult("Gender", "Male")
                .checkRequiredResult("Mobile", "7911099325")
                .checkRequiredResult("Date of Birth", "22 October,1991");
    }

    //Отправка данных без firstName
    @Test
    public void submitFormWithNoFirstName() {
        registrationPage.openPage()
                .setFirstName("")
                .setLastName("Shein")
                .setEmail("kirill@mail.ru")
                .setGender("Male")
                .setNumber("9110993250")
                .setDateOfBirth("22", "October", "1991")
                .setHobbies("Sports")
                .setHobbies("Reading")
                .setSubjects("English")
                .setImage("src/test/resources/kim.jpeg")
                .setCurrentAddress("street New 56")
                .setState("NCR")
                .setCity("Delhi")
                .setSubmit()

                //проверка данных
                .setCheckTitle("Thanks for submitting the form")
                .checkResult("Student Name", "Kirill Shein")
                .checkResult("Student Email", "kirill@mail.ru")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7911099325")
                .checkResult("Date of Birth", "22 October,1991")
                .checkResult("Subjects", "English")
                .checkResult("Hobbies", "Sports, Reading")
                .checkResult("Picture", "kim.jpeg")
                .checkResult("Address", "street New 56")
                .checkResult("State and City", "NCR Delhi");
    }
}
