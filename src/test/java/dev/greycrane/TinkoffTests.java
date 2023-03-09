package dev.greycrane;

import com.codeborne.selenide.logevents.SelenideLogger;
import dev.greycrane.helpers.Attachments;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TinkoffTests {
    @BeforeAll
    static void configTests() {
        TestsConfiguration testsConfiguration = new TestsConfiguration();
        testsConfiguration.configureTests();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attachments.screenshotAs("Final screenshot");
        Attachments.pageSource();
        Attachments.browserConsoleLogs();
        Attachments.addVideo();
    }
}
