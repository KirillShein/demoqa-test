package tests;

import org.junit.jupiter.api.Test;
import pages.TestBoxPage;


public class TextBoxTest extends TestBase {

    TestBoxPage testBoxPage = new TestBoxPage();


    @Test
    void fullFormTest() {
        testBoxPage.openPage()
                    .setUserName("Kirill")
                    .setUserEmail("kirill@mail.ru")
                    .setCurrentAddress("Donskoy")
                    .setPermanentAddress("Tbilisi")
                    .setClickSubmit()

                    //Проверка данных
                    .setCheckResult("Kirill")
                    .setCheckResult("kirill@mail.ru")
                    .setCheckResult("Donskoy")
                    .setCheckResult("Tbilisi");


    }
}
