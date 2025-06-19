package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GitSoftAssertions {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void testGitHubSoftAssertions() {

        //открываем github
        open ("https://github.com");

        //в поиске пишем selenide
       $("[placeholder='Search or jump to...']").click();
       $("[name='query-builder-test']").setValue("selenide").pressEnter();

       // кликаем по more, открывается выпадающий список, кликаем по Wikis, затем проверяем наличие SoftAssertions и кликаем
       $$(".prc-ActionList-ActionListItem-uq6I7").findBy(text("More")).shouldBe(visible).click();
       $$(".prc-ActionList-ActionListItem-uq6I7").findBy(text ("Wikis")).click();
       $$(".prc-Link-Link-85e08").findBy(text("SoftAssertions")).shouldBe(visible).click();

        // Переключение на новую вкладку
       switchTo().window(1);

       $("#wiki-body").shouldHave(text(
               """ 
                @ExtendWith({SoftAssertsExtension.class})
                    class Tests {
                      @Test
                      void test() {
                        Configuration.assertionMode = SOFT;
                        open("page.html");
                    
                        $("#first").should(visible).click();
                        $("#second").should(visible).click();
                      }
                    }
                       """
       ));


    }
}
