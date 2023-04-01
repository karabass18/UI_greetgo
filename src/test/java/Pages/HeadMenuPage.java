package Pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeadMenuPage {

    public HeadMenuPage checkLogoVisible() {
        step("Проверка видимости", () -> {
            $(".logo__image").shouldBe(Condition.visible);
        });
        return this;
    }

    public HeadMenuPage checkLogoFileName(String value) {
        step("Проверка имени файла логотипа", () -> {
            String logoFileName = $(".logo__link img").getAttribute("src");
            assertThat(logoFileName).contains(value);
        });
        return this;
    }

    public HeadMenuPage checkEmailBlockVisible() {
        step("Проверка видимости", () -> {
            $(".header__information", 0).shouldBe(Condition.visible);
        });
        return this;
    }

    public HeadMenuPage checkEmailBlockContent() {
        step("Проверка адреса Email", () -> {
            $(".header-information__email").shouldHave(text("info@greet-go.com"));
        });
        return this;
    }

    public HeadMenuPage checkPhoneBlockVisible() {
        step("Проверка видимости", () -> {
            $(".header-information--phone").shouldBe(Condition.visible);
        });
        return this;
    }

    public HeadMenuPage checkPhoneBlockContent() {
        step("Проверка номеров телефонов", () -> {
            $(".header-information__phone", 0).shouldHave(text("8 (747) 710-10-10"));
            $(".header-information__phone", 1).shouldHave(text("8 (727) 357-33-12"));
        });
        return this;
    }
}
