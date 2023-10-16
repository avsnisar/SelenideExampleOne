package test.rest.assured;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class RestTest {

    @AfterMethod
    public void makeScreenshot() {
        Selenide.screenshot(System.currentTimeMillis()+"step");
    }

    @AfterTest
    public void teadDown() {
        WebDriverRunner.closeWebDriver();
    }

}
