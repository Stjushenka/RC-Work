package page.messenger;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getPassword;
import static page.LoginPage.getUsername;


public class IntegrationSettingsAddNumber {

    final String username = getUsername();
    final String password = getPassword();
    final SelenideElement name = $x("//*[text()='wa+amo radistonlinewidgets.amocrm.ru']");
    final SelenideElement save = $(withText("Изменения были успешно сохранены"));

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");

    }

    @Test
    public void shouldAddNumberRetie() {
        name.click();
        $x("//*[text()='Добавить номер телефона']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $x("//*[text()='номер 22']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        save.shouldBe(appear, Duration.ofSeconds(2));

    }


    @Test
    public void shouldAddNumberWA() {
        name.click();
        $x("//*[text()='radist test']").click();
        $x("//*[text()='Добавить номер телефона']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $("[data-value='2']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $("[data-value='13711']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldAddNumberWaba() {

        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        name.click();
        $x("//*[text()='Добавить номер телефона']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $("[data-value='16549']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        save.shouldBe(appear, Duration.ofSeconds(2));

    }


}
