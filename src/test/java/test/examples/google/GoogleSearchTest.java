package test.examples.google;

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

public class GoogleSearchTest extends AbstractBaseTest {

    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(false).savePageSource(true));
    }

    @Description("Перевірка результатів пошуку по ключовому слову.")
    @Test
    public void checkGoogleSearchResult() {
        open("https://www.google.com.ua/");
        sleep(1000);
        googleSearchActionsPage.fillInputSearch("Selenide");
        sleep(1000);
        googleSearchResultActionsPage.countSearchResults();
        sleep(1000);
        googleSearchResultActionsPage.checkEachResultText("Selenide");

    }

    @Attachment(value = "Screenshot", type = "image/png")
    private byte[] makeAndAttachScreenshot() {

        return new byte[0];
    }

    @AfterMethod
    public void makeScreenshot(){
        makeAndAttachScreenshot();
    }
}
