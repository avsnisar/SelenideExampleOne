package test.examples.pages.google.actions;

import io.qameta.allure.Step;
import org.testng.Assert;
import test.examples.pages.google.locators.GoogleSearchResultLocators;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchResultActions extends GoogleSearchResultLocators {

    private int resultsAmount = 0;

    @Step("Визначення кількості рядків з результатами пошуку на сторінці")
    public void countSearchResults() {
        resultsAmount = $$(byXpath(resultTitleH3)).size();
    }

    @Step("Перевірка наявносстсіс ключогово слова в заголовку рядка результатів пошуку")
    public void checkEachResultText(String text) {
        boolean testPassed = false;

        for(int i = 1; i < resultsAmount; i++) {
            if ($(byXpath(resultTitleH3 + "[" + i + "]")).getText().contains(text)) {
                testPassed = true;
                break;
            }
        }

        Assert.assertTrue(testPassed,"Text was not found");
    }
}
