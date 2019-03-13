package Frontend_UI;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class WebSiteTest {

//    private static final Logger log = LogManager.getLogger("WebSiteTest");

   @Test
    public void userCanLoginByUsername() {

       open("https://novaposhta.ua/");

//       log.trace("Trace Message!");
//       log.debug("Debug Message!");
//       log.info("Info Message!");
//       log.warn("Warn Message!");
//       log.error("Error Message!");
//       log.fatal("Fatal Message!");


        $(By.name("q")).setValue("Тарифи").pressEnter();

        $("div.b_search_results > ul > li:nth-child(1) > h3 > a").shouldHave(text("Тарифи"));
   }
}
