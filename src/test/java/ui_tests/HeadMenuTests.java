package ui_tests;

import Pages.HeadMenuPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HeadMenuTests extends TestsBase {

    HeadMenuPage headMenuPage = new HeadMenuPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка логотипа")
    @Test
    public void checkTheLogo() {

        headMenuPage
                .checkLogoVisible()
                .checkLogoFileName("wp-content/themes/greetgo/images/logo.png");
    }

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка Email")
    @Test
    public void checkEmail() {

        headMenuPage
                .checkEmailBlockVisible()
                .checkEmailBlockContent();

    }

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка телефонов")
    @Test
    public void checkPhones() {

        headMenuPage
                .checkPhoneBlockVisible()
                .checkPhoneBlockContent();

    }
}
