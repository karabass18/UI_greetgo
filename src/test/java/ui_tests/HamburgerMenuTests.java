package ui_tests;

import Pages.HamburgerMenuPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HamburgerMenuTests extends TestsBase {

    HamburgerMenuPage hamburgerMenuPage = new HamburgerMenuPage();

    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка кнопки \"Гамбургер\"")
    @Test
    public void checkHamburgerButton() {
        hamburgerMenuPage
                .checkHamburgerVisible()
                .appearedTheMenuAfterClick()
                .containsTextInTheMenu();
    }


}
