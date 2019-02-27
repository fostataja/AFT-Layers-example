package Frontend_UI;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class WebSiteTest {

   @Test
    public void userCanLoginByUsername() {

       open("https://novaposhta.ua/");

        $(By.name("q")).setValue("Тарифи").pressEnter();

        $("div.b_search_results > ul > li:nth-child(1) > h3 > a").shouldHave(text("Тарифи"));
   }
}
