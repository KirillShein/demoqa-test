package tests;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HerokuAppTest {

    @Test
    void HerokuAppTest() {

        SelenideElement squareA = $("#column-a");
        SelenideElement squareB = $("#column-b");

        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().clickAndHold(squareA).moveToElement(squareB).release().perform();

        squareA.shouldHave(text("b"));
        squareB.shouldHave(text("a"));
    }
}
