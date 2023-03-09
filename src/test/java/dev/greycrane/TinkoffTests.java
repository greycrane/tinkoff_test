package dev.greycrane;

import com.codeborne.selenide.logevents.SelenideLogger;
import dev.greycrane.helpers.Attachments;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.SeverityLevel.*;

@Tag("tinkoff")
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

    @Test
    @Owner("szhuravlev")
    @Severity(BLOCKER)
    @Description("Проверка возможности начать оформление дебетовой карты")
    void checkGetDebitCardButton() {
        open("/");
        $(byText("Оформить карту")).click();
        $(byText("Выберите дизайн карты")).shouldBe(visible);
    }

    @Test
    @Owner("szhuravlev")
    @Severity(CRITICAL)
    @Description("Проверка наличия опроса по подбору тарифа мобильной связи")
    void checkMobileTariffSurvey() {
        open("/mobile-operator");
        $(byText("Безлимит от Тинькофф")).shouldBe(visible);
        $(byText("Подобрать оптимальный тариф")).click();
        $(byText("Какой тариф вам подходит?")).shouldBe(visible);
    }

    @Test
    @Owner("szhuravlev")
    @Severity(BLOCKER)
    @Description("Проверка перехода на открытие ИИС")
    void checkInvestmentsPage() {
        open("/invest");
        $(byText("Инвестируйте в ценные бумаги")).shouldBe(visible);
        $(byText("Открыть ИИС")).click();
        $(byText("Счет для инвестирования с возможностью получить +13% через налоговый вычет"))
                .scrollTo()
                .shouldBe(visible);
    }

    @Test
    @Owner("szhuravlev")
    @Severity(CRITICAL)
    @Description("Проверка наличия всех страховых продуктов")
    void checkInsurancePage() {
        open("/insurance");
        $(byText("Страховые продукты Тинькофф")).shouldBe(visible);
        $(byText("Электронное ОСАГО")).shouldBe(visible);
        $(byText("Автострахование КАСКО")).shouldBe(visible);
        $(byText("Страхование для туристов")).shouldBe(visible);
        $(byText("Страхование ипотеки")).shouldBe(visible);
        $(byText("Страхование квартиры")).shouldBe(visible);
        $(byText("Страхование от несчастных случаев")).shouldBe(visible);
    }

    @Test
    @Owner("szhuravlev")
    @Severity(NORMAL)
    @Description("Проверка наличия ошибки при неверном номере телефона при входе в ЛК")
    void checkIncorrectLoginErrorAppears() {
        open("/login");
        $(byText("Вход в Тинькофф")).shouldBe(visible);
        $("#phoneNumber").click();
        $("#phoneNumber").append("5644654754764764");
        $(byText("Продолжить")).click();
        $("#formError").shouldBe(visible);
    }

    @AfterEach
    void addAttachments() {
        Attachments.screenshotAs("Final screenshot");
        Attachments.pageSource();
        Attachments.browserConsoleLogs();
        Attachments.addVideo();
    }
}
