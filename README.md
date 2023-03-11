| <h1>Автоматизация тестирования UI<br>веб-сайта <a href="https://tinkoff.ru/ ">Тинькофф</a></h1> | ![tinkoff.png](images/logos/tinkoff.png) |
| ----------------------------------------------------------------------------------------------- | ---------------------------------------- |

## Содержание

* <a href="#description">Описание</a>

* <a href="#scenarios">Тестовые сценарии</a>

* <a href="#tools">Технологии и инструменты</a>

* <a href="#run">Как запустить тесты</a>

* <a href="#screenshots">Скриншоты и видео</a>

<a id="description"></a>

## Описание

Это тестовый проект по автоматизации тестирования пользовательского интерфейса
веб-сайта <a href="https://tinkoff.ru/ ">Тинькофф</a>.<br>
Он создан для демонстрации моих навыков и способностей построения тестового фреймворка с нуля для дальнейшего
устройства в компанию **Tinkoff**.

В проекте используется самый современный стэк технологий, присутствует интеграция с системами CI/CD и issue-трекерами,
генерируются удобные и понятные отчёты о запуске тестов. 

<a id="scenarios"></a>

## Тестовые сценарии

| №    | <p style="text-align:left">Название</p>                                       | Важность                 |
| ---- | ----------------------------------------------------------------------------- | ------------------------ |
| 1    | :sparkle: Проверка возможности начать оформление дебетовой карты              | :red_square: BLOCKER     |
| 2    | :sparkle: Проверка наличия опроса по подбору тарифа мобильной связи           | :orange_square: CRITICAL |
| 3    | :sparkle: Проверка перехода на открытие ИИС                                   | :red_square: BLOCKER     |
| 4    | :sparkle: Проверка наличия всех страховых продуктов                           | :orange_square: CRITICAL |
| 5    | :sparkle: Проверка наличия ошибки при неверном номере телефона при входе в ЛК | :yellow_square: NORMAL   |

<a id="tools"></a>

## Технологии и инструменты

<p align="center">
<a href="https://www.java.com/"><img src="images/logos/java.svg" width="60" height="60"  alt="Java" title="Java"/></a>
<a href="https://junit.org/junit5/"><img src="images/logos/jUnit5.svg" width="60" height="60"  alt="JUnit5" title="JUnit5"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logos/allureReport.svg" width="60" height="60"  alt="Allure Report" title="Allure Report"/></a>
<a href="https://qameta.io/"><img src="images/logos/allureTestOps.svg" width="60" height="60"  alt="Allure TestOps" title="Allure TestOps"/></a>
<a href="https://gradle.org/"><img src="images/logos/gradle.svg" width="60" height="60"  alt="Gradle" title="Gradle"/></a>
<a href="https://www.jenkins.io/"><img src="images/logos/jenkins.svg" width="60" height="60"  alt="Jenkins CI" title="Jenkins CI"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logos/selenoid.svg" width="60" height="60"  alt="Selenoid" title="Selenoid"/></a>
<a href="https://selenide.org/"><img src="images/logos/selenide.svg" width="60" height="60"  alt="Selenide" title="Selenide"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="images/logos/idea.svg" width="60" height="60"  alt="IntelliJ IDEA" title="IntelliJ IDEA"/></a>
<a href="https://github.com/"><img src="images/logos/gitHub.svg" width="60" height="60"  alt="GitHub" title="GitHub"/></a>
<a href="https://www.atlassian.com/software/jira"><img src="images/logos/jira.svg" width="60" height="60"  alt="Jira" title="Jira"/></a>
<a href="https://telegram.org/"><img src="images/logos/telegram.svg" width="60" height="60"  alt="Telegram" title="Telegram"/></a>
</p>

:eight_spoked_asterisk: Java - язык программирования для написания тестов.
:eight_spoked_asterisk: JUnit5 - фреймворк для запуска автотестов.
:eight_spoked_asterisk: Allure Report - средство визуализации отчётов о тестировании.
:eight_spoked_asterisk: Allure TestOps - система тест менеджмента.
:eight_spoked_asterisk: Gradle - средство автоматизации сборок.
:eight_spoked_asterisk: Jenkins - система CI/CD (Continuous Integration / Continuous Delivery).
:eight_spoked_asterisk: Selenoid - сервер для удалённого запуска автотестов в Docker-контейнерах.
:eight_spoked_asterisk: Selenide - фреймворк для написания автотестов.
:eight_spoked_asterisk: IntelliJ IDEA - среда разработки программного кода.
:eight_spoked_asterisk: GitHub - система удалённого хранения исходного кода.
:eight_spoked_asterisk: Jira - система управления задачами и проектами.
:eight_spoked_asterisk: Telegram Bot - бот для оповещения о результатах тестирования.

<a id="run"></a>

## Как запустить тесты

### Gradle

В командной строке среды разработки IntelliJ IDEA необходимо выполнить следующую команду:

`gradle clean tinkoff_tests`

Также можно запустить тесты с дополнительными параметрами:

**selenoid** - адрес сервера Selenoid
<br>**browser** - название браузера
<br>**version** - версия браузера
<br>**resolution** - разрешение окна браузера

Пример запуска автотестов с дополнительными параметрами:

`gradle clean tinkoff_tests -Dselenoid=https://seleno.id -Dbrowser=chrome -Dversion=100.0 -Dresolution=1920x1080`

### Jenkins

Необходимо перейти <a href="https://jenkins.autotests.cloud/job/17-greycrane-14-tinkoff-tests/">по ссылке</a> и нажать "Собрать с параметрами".<br>
Далее выберите необходимые параметры для запуска автотестов и нажмите на кнопку "Собрать".

<a id="screenshots"></a>

## Скриншоты и видео

После запуска автотестов генерируется простой и понятный отчёт в Allure.

<img src="images/screenshots/allure_report.png" width="640" height="480"  alt="Allure Report" title="Allure Report"/>