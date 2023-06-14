package test.examples.wikipedia;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.examples.base.AbstractBaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class WikipediaSearchTest extends AbstractBaseTest {

    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @Description("Перевірка результатів пошуку по ключовому слову.")
    @Test
    public void checkWikipediaSearchResult() {
        open("https://en.wikipedia.org/wiki/");
        sleep(1000);
        googleSearchActionsPage.fillInputSearch("Ukraine");
        sleep(1000);
        googleSearchResultActionsPage.countSearchResults();
        sleep(1000);
        googleSearchResultActionsPage.checkEachResultText("Ukraine");

    }
}
