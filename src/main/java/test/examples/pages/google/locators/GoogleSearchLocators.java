package test.examples.pages.google.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
// import static org.openqa.selenium.By.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchLocators {

    protected final SelenideElement inputSearch = $(byXpath("//textarea[@name='q']"));
    protected final SelenideElement selenium = $(By.cssSelector("//*//input[1]"));
    protected final SelenideElement selenium2 = $(byCssSelector("//*//input[1]"));
    protected final SelenideElement xpathOne = $x("//*//textarea[1]");
    protected final ElementsCollection xpathMany = $$x("//*");
}
