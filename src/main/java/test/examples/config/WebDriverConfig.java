package test.examples.config;

import com.codeborne.selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.google.common.io.Resources;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;

public class WebDriverConfig {

    @Step
    public void setUp(){
        Configuration.pageLoadTimeout = 20000;
//        Configuration.browser = "firefox";
//        System.setProperty("webdriver.chrome.driver", Resources.getResource("chromedriver.exe").getPath());
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"chromedriver.exe");
        Configuration.timeout = 20000;
        Configuration.downloadsFolder = "target/build/downloads";
        Configuration.reportsFolder = "target/screenshots";
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("AllureSelenide",new AllureSelenide().screenshots(true).savePageSource(true));

    }
}
