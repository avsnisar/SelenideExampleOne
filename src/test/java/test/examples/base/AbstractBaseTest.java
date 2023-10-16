package test.examples.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import test.examples.config.WebDriverConfig;
import test.examples.pages.google.actions.GoogleSearchActions;
import test.examples.pages.google.actions.GoogleSearchResultActions;
import test.examples.pages.wikipedia.locators.WikipediaSearchLocators;

public abstract class AbstractBaseTest {

    protected final GoogleSearchActions googleSearchActionsPage = new GoogleSearchActions();
    protected final GoogleSearchResultActions googleSearchResultActionsPage = new GoogleSearchResultActions();
    private final WebDriverConfig webDriverConfig = new WebDriverConfig();
    public WikipediaSearchLocators wikipediaSearchLocatorsPage = new WikipediaSearchLocators();

    @BeforeClass
    public void setUp() {
        webDriverConfig.setUp();
    }

    @AfterClass
    public void tearDown() {
        Selenide.closeWebDriver();
        WebDriverRunner.closeWebDriver();
    }
}
