package test.examples.pages.google.actions;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import test.examples.pages.google.locators.GoogleSearchLocators;

public class GoogleSearchActions extends GoogleSearchLocators {

    @Step("Заповнення поля пошуку значенням для пошуку.")
    public void fillInputSearch(CharSequence text) {
        inputSearch.sendKeys(text, Keys.ENTER);
    }
}
