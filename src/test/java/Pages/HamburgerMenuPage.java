package Pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class HamburgerMenuPage {


    public HamburgerMenuPage checkHamburgerVisible() {
        step("Проверка видимости", () -> {
            $(".humburger").shouldBe(Condition.visible);
        });
        return this;
    }

    public HamburgerMenuPage appearedTheMenuAfterClick() {
        step("Проверка появления меню после клика", () -> {
            $(".navigation").shouldBe(Condition.hidden);
            $(".humburger").click();
            $(".navigation").shouldBe(Condition.visible);
        });
        return this;
    }

    public HamburgerMenuPage containsTextInTheMenu() {
        step("Проверка текста меню", () -> {
            $("#menu-header").shouldHave(text("О нас"), text("Услуги"), text("Решение"), text("Кейсы"),
                    text("Этапы работы"), text("Гарантии"), text("Команда"), text("Отзывы"), text("Контакты"));
            ;
        });
        return this;
    }

}
