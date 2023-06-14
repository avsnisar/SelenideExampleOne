package test.examples.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;

public class WebDriverConfig {

    @Step
    public void setUp(){
        Configuration.pageLoadTimeout = 20000;
        Configuration.timeout = 20000;
        Configuration.downloadsFolder = "target/build/downloads";
        Configuration.reportsFolder = "target/screenshots";
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("AllureSelenide",new AllureSelenide().screenshots(true).savePageSource(true));
    }
}
