![logo](media/logo/logo.jpg)
## Проект по тестированию сайта NASA (https://greetgo.ru)

## Содержание:

- [Технологии и инструменты](#технологии-и-инструменты)
- [Что проверяем](#что-проверяем)
- [Запуск тестов](#запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#отчет-о-выполнении-тестов)
- [Пример видео из логов](#пример-видео-из-логов)
- [Отправка отчета в telegram](#отправка-отчета-в-telegram)
<!-- [Интеграция с Allure TestOps и Jira](#интеграция-с-allure-testops-и-jira)-->

## Технологии и инструменты

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
 <a href="https://web.telegram.org/"><img src="media\logo\Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
<!--a href="https://qameta.io/"><img src="media\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO" title="Allure_TO"></a-->
</p>

В проекте автотесты написаны на **Java** с использованием фреймворка для тестирования **Selenide**. Для сборки проекта в среде **IntelliJ IDEA** используется **Gradle**.
**JUnit5** задействован в качестве фреймворка модульного тестирования. Удаленный запуск тестов выполняется из **Jenkins** с использованием **Selenoid** 

Для визуализации результатов тестирования использован **Allure Report**

## Что проверяем

* Проверка шапки сайта:
  - Провека логотипа
  - Проверка блока **email**
  - Проверка блока **телефон**
* Проверка кнопки **"гамбургер"** :
  - Проверка действия по клику
  - Проверка содержимого меню


## Запуск тестов из терминала

### Локальный запуск тестов

```
gradle clean test
```

### Удаленный запуск тестов

```
gradle clean test
-DremoteUrl=${remoteUrl}
```
,где `remoteUrl` url адрес selenoid. В сборкe на Jenkins  `-DremoteUrl="https://user1:1234@selenoid.autotests.cloud/wd/hub" `
      
## Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/C16-karabass18-greetgo/)

#### Главная страница Jenkins

![Jenkins](media/img/Jenkins.jpg)

Для запуска сборки необходимо указать значения параметров и нажать кнопку __Собрать сейчас__.

#### Отчет о выполнении тестов

![Allure1](media/img/Allure1.jpg)

  Чтобы открыть отчет надо кликнуть на [__Allure Report__ ](https://jenkins.autotests.cloud/job/C16-karabass18-greetgo/allure/)
  
  Далее можно посмотреть разную информацию о работе тестов и статистике их прохождения

![Allure2](media/img/Allure2.jpg)

  Например, кликнув по одному из **сьютов** можно подробно посмотреть шаги его выполнения и различные артифакты логирования (текстовые логи, скриншоты, видео)
  

![Allure3](media/img/Allure3.jpg)

#### Пример видео из логов


![Allure-видео](media/img/allure-video.gif)

#### Отправка отчета в telegram

После выполнения сборки в **Jenkins** автоматически отправляется отчет в **telegram**


![telegram](media/img/telegram.jpg)


<!--#### Интеграция с Allure TestOps и Jira

Сборка в **Jenkins** инткгрирована с отчетом в **Allure TestOps**.
Он позволяет следить за ходом выполнения тестов в реальном времени.

![testops3](media/img/testops3.jpg)
![testops1](media/img/testops1.jpg)
![testops2](media/img/testops2.jpg)

Также позволяет осуществить интеграцию с **Jira**

![jira](media/img/jira.jpg)-->
